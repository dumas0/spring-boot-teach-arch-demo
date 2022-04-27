package com.dumas.sbta.mongodb.dao;

import com.dumas.sbta.mongodb.dataobject.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import org.springframework.util.ReflectionUtils;

import java.beans.Transient;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

/**
 * 利用 MongoTemplate 查询
 *
 * @author dumas
 * @date 2022/04/27 4:31 PM
 */
@Repository
public class UserDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 插入
     *
     * @param entity
     */
    public void insert(UserDO entity) {
        mongoTemplate.insert(entity);
    }

    /**
     * 更新
     *
     * @param entity
     */
    public void updateById(UserDO entity) {
        // 生成 Update 条件
        final Update update = new Update();
        // 反射遍历 entity 对象，将非空字段设置到 Update 中
        ReflectionUtils.doWithFields(entity.getClass(), new ReflectionUtils.FieldCallback() {
            @Override
            public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
                // 排除指定条件
                if ("id".equals(field.getName()) || field.getAnnotation(Transient.class) != null || Modifier.isStatic(field.getModifiers())) {
                    return;
                }
                // 设置字段可反射
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                // 排除字段为空的情况
                if (field.get(entity) == null) {
                    return;
                }
                // 设置更新条件
                update.set(field.getName(), field.get(entity));
            }
        });
        // 防御，避免有业务传递空的 Update 对象
        if (update.getUpdateObject().isEmpty()) {
            return;
        }
        // 执行更新
        mongoTemplate.updateFirst(new Query(Criteria.where("_id").is(entity.getId())), update, UserDO.class);
    }


    /**
     * 删除
     *
     * @param id
     */
    public void deleteById(Integer id) {
        mongoTemplate.remove(new Query(Criteria.where("_id").is(id)), UserDO.class);
    }

    /**
     * 通过ID查询
     *
     * @param id
     * @return
     */
    public UserDO findById(Integer id) {
        return mongoTemplate.findOne(new Query(Criteria.where("_id").is(id)), UserDO.class);
    }

    /**
     * 通过用户名查询
     *
     * @param username
     * @return
     */
    public UserDO findByUsername(String username) {
        return mongoTemplate.findOne(new Query(Criteria.where("username").is(username)), UserDO.class);
    }

    /**
     * 通过ID查询所有
     *
     * @param ids
     * @return
     */
    public List<UserDO> findAllById(List<Integer> ids) {
        return mongoTemplate.find(new Query(Criteria.where("_id").in(ids)), UserDO.class);
    }


}

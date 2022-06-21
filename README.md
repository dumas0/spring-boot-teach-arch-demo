# spring-teach-arch-demo

## 项目介绍
Java Spring 学习归档 demo 项目.

## 目录结构
```
spring-boot-teach-arch-demo
├─sbta-actuator    -- 监控
├─sbta-admin    -- Admin 监控
│   ├─sbta-admin-client     -- Admin 监控客户端
│   ├─sbta-admin-monitor    -- Admin 监控台
│   ├─sbta-admin-server    -- Admin 服务端
├─sbta-cache-lock      -- 缓存锁机制
│   ├─sbta-cache-locallock     -- 本地锁
│   ├─sbta-cache-redislock     -- redis 锁
├─sbta-data-jpa      -- ORM JPA
├─sbta-detailed-configuration      -- 详情配置
├─sbta-exception-handler      -- 异常处理
├─sbta-flyway      -- 数据迁移
├─sbta-jdbc-template      -- jdbc
├─sbta-liquibase      -- liquibase
├─sbta-localdatetime      -- 本地日期格式化
├─sbta-mongodb      -- mongodb
├─sbta-mybatis      -- mongodb
│   ├─sbta-common-mybatis     -- 通用 mybatis
│   ├─sbta-tk-mybatis     -- Tk Mybatis
├─sbta-quick-start    -- 快速开始
├─sbta-rabbitmq    -- rabbitmq
├─sbta-redis    -- redis
│   ├─sbta-redis-cache    -- jedis 缓存
│   ├─sbta-redis-lettuce    -- lettuce 缓存
├─sbta-redislimiter    -- redis 限流
├─sbta-retry    -- 重试策略
├─sbta-schedule    -- 定时任务
│   ├─sbta-schedule-scheduled     -- 定时任务 scdedule
│   ├─sbta-schedule-task   -- 定时任务 task
│   ├─sbta-schedule-timer   -- 定时任务 timer
├─sbta-shiro     -- shiro 权限校验
├─sbta-starter     -- starter 封装
│   ├─swagger-spring-boot-starter     -- swagger 文档封装
├─sbta-swagger     -- swagger 集成
├─sbta-thymeleaf     -- thymeleaf 集成
├─sbta-unit-test     -- 单元测试
├─sbta-validate     -- 参数校验
├─sbta-websocket     -- websocket
├─sbta-parent     -- 根依赖管理
├─resource      -- 资源模块
└─docs      -- 文档模块
```

## 开发环境
- [x] Java 开发工具包 1.8+
- [x] IDE（Eclipse或IntelliJ IDEA）
- [x] 项目管理工具 Maven

## 规约
**开发规范** 和 **分支管理约定** 见内部文档
[git-flow介绍](https://www.git-tower.com/learn/git/ebook/cn/command-line/advanced-topics/git-flow/)
[gitflow分支说明](http://www.ruanyifeng.com/blog/2012/07/git.html)
[gitflow分支总结](https://juejin.cn/post/6844903634006720526)
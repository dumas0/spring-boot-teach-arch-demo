package com.dumas.framework.swagger.properties;

import java.io.Serializable;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/07 10:17
 */
public class DocketProperties implements Serializable {
    private static final long serialVersionUID = 8113495563278668568L;
    private String groupName;
    private String basePackage;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }
}

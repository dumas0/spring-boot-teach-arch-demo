package com.dumas.starter.swagger.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/07 10:11
 */
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties implements Serializable {

    private Boolean enable;
    private ApiInfoProperties apiInfo;
    private DocketProperties docket;

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ApiInfoProperties getApiInfo() {
        return apiInfo;
    }

    public void setApiInfo(ApiInfoProperties apiInfo) {
        this.apiInfo = apiInfo;
    }

    public DocketProperties getDocket() {
        return docket;
    }

    public void setDocket(DocketProperties docket) {
        this.docket = docket;
    }
}

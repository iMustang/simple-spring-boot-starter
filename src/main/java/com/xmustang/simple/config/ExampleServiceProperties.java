package com.xmustang.simple.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ExampleServiceProperties
 *
 * @author xMustang
 * @since 1.0
 */
@ConfigurationProperties("simple.service")
public class ExampleServiceProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}

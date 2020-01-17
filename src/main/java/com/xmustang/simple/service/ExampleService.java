package com.xmustang.simple.service;

/**
 * ExampleService
 * 一个简单的service，将输入字符加前缀、后缀
 *
 * @author xMustang
 * @since 1.0
 */
public class ExampleService {
    private String prefix;
    private String suffix;

    public ExampleService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String wrap(String word) {
        return prefix + word + suffix;
    }
}

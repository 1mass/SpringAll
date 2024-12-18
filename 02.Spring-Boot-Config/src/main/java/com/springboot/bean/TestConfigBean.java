package com.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

// 配置类
@Configuration
// 配置属性，前缀为test
@ConfigurationProperties(prefix="test")
// 配置属性文件路径
@PropertySource("classpath:test.properties")
// 组件
@Component
public class TestConfigBean {
	// 名称
	private String name;
	// 年龄
	private int age;
	// 获取名称
	public String getName() {
		return name;
	}
	// 设置名称
	public void setName(String name) {
		this.name = name;
	}
	// 获取年龄
	public int getAge() {
		return age;
	}
	// 设置年龄
	public void setAge(int age) {
		this.age = age;
	}
	
}

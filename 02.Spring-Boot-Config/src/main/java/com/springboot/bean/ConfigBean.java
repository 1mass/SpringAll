package com.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

// 使用@ConfigurationProperties注解，将配置文件中以mrbird.blog开头的属性映射到该类的属性上
@ConfigurationProperties(prefix="mrbird.blog")
public class ConfigBean {
	// 定义name属性
	private String name;
	// 定义title属性
	private String title;
	// 定义wholeTitle属性
	private String wholeTitle;
	// 获取name属性
	public String getName() {
		return name;
	}
	// 设置name属性
	public void setName(String name) {
		this.name = name;
	}
	// 获取title属性
	public String getTitle() {
		return title;
	}
	// 设置title属性
	public void setTitle(String title) {
		this.title = title;
	}
	// 获取wholeTitle属性
	public String getWholeTitle() {
		return wholeTitle;
	}
	// 设置wholeTitle属性
	public void setWholeTitle(String wholeTitle) {
		this.wholeTitle = wholeTitle;
	}	
	
}

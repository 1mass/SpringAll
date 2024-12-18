package com.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 定义一个名为BlogProperties的类，并使用@Component注解将其声明为一个Spring组件
@Component
public class BlogProperties {
	
	// 使用@Value注解将配置文件中的mrbird.blog.name属性注入到name变量中
	@Value("${mrbird.blog.name}")
	private String name;
	
	// 使用@Value注解将配置文件中的mrbird.blog.title属性注入到title变量中
	@Value("${mrbird.blog.title}")
	private String title;

	// 获取name属性的值
	public String getName() {
		return name;
	}

	// 设置name属性的值
	public void setName(String name) {
		this.name = name;
	}

	// 获取title属性的值
	public String getTitle() {
		return title;
	}

	// 设置title属性的值
	public void setTitle(String title) {
		this.title = title;
	}
	
}

/*
 * Copyright 2002-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lsh.test;


import org.lsh.test.bean.annotation.AnnotationStudent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class TestBean{
//
//	/**
//	 * xml 方式加载
//	 */
//	public static void main(String[] args) {
//		System.setProperty("lsihao","test");
//
//		BeanFactory bf = new TestApplicationContext("test-bean.xml");
//		UserService userService = (UserService) bf.getBean("userService");
//		userService.insert("name2");
//		Student student = (Student)bf.getBean("student");
//		String ll = student.getName();
//		System.out.println(ll);
//	}

	/**
	 * annotation 方式加载
	 */
	public static void main(String[] args) {
		// 创建一个通过注解得到bean的applicationContext
		AnnotationConfigApplicationContext aac = new AnnotationConfigApplicationContext();
		aac.scan("org.lsh.test.bean.annotation");
		aac.refresh();
		AnnotationStudent as = (AnnotationStudent) aac.getBean("annotationStudent");
		System.out.println(as);

	}
}

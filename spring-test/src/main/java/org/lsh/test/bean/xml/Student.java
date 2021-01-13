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
package org.lsh.test.bean.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

import java.io.Serializable;


public  class Student implements Serializable, BeanNameAware, EnvironmentAware, ApplicationContextAware, BeanFactoryAware {


	private static final long serialVersionUID = 1109310432933526392L;
	private String beanName;

	private Environment environment;

	private ApplicationContext applicationContext;

	private String name;

	private Integer age;

	private Teacher teacher;

	private BeanFactory beanFactory;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getName() {
		System.out.println("调用了 getName 方法");
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public void setBeanName(String name) {
			this.beanName =name;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getBeanName() {
		return beanName;
	}

	public Environment getEnvironment() {
		return environment;
	}

	@Override
	public void setEnvironment(Environment environment) {
			this.environment = environment;
	}

	@Override
	public String toString() {
		return "Student{" +
				"beanName='" + beanName + '\'' +
				", environment=" + environment +
				", name='" + name + '\'' +
				", age=" + age +
				", teacher=" + teacher +
				'}';
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(applicationContext);
		this.applicationContext = applicationContext;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(beanFactory);
		this.beanFactory = beanFactory;
	}
}

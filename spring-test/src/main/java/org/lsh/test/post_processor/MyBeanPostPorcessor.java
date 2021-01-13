package org.lsh.test.post_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostPorcessor implements BeanPostProcessor {

	private BeanFactory beanFactory;


	public MyBeanPostPorcessor(BeanFactory factory){
		this.beanFactory = factory;
	}


	/**
	 * bean 创建之前会执行的方法
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("====================== custom bean postprocessor :: before ==========================");
//		System.out.println(bean);
//		System.out.println("====================== custom bean postprocessor :: before ==========================");
		return bean;
	}


	/**
	 * bean 创建之后执行的方法
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("====================== custom bean postprocessor :: after ==========================");
//		System.out.println(bean);
//		System.out.println("====================== custom bean postprocessor :: after ==========================");
		return bean;
	}
}

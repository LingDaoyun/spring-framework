package org.lsh.test.context;

import org.lsh.test.post_processor.MyBeanFactoryPostProcessor;
import org.lsh.test.post_processor.MyBeanPostPorcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext extends ClassPathXmlApplicationContext {


	public TestApplicationContext(String ... configs) {
		super(configs);
	}

	@Override
	protected void initPropertySources(){
		// 这里设置系统启动必须要的Property
		getEnvironment().setRequiredProperties("lsihao");
	}

	/**
	 * 该方法在BeanFactory刚实例化完成，还未初始化完成（未加载BeanDefinition）
	 * @param beanFactory the newly created bean factory for this context
	 */
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		// 设置是否允许 bean 定义信息覆盖 (在工程中有同名bean的情况下)，这个值只在不同的
		// bean信息定义文件中存在冲突时起作用，如果一个定义文件中存在两个同名bean，则直接抛出异常
		beanFactory.setAllowBeanDefinitionOverriding(false);
		// 设置是否自动解决循环依赖
		beanFactory.setAllowCircularReferences(true);
		// 设置自定义的BeanFactoryPostProcessor
		this.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		// 设置自定义的BeanPostProcessor
		beanFactory.addBeanPostProcessor(new MyBeanPostPorcessor(beanFactory));
	}

}

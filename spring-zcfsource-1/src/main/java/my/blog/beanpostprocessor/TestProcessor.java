package my.blog.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author zouchangfu@163.com
 * @version 1.0
 * @date 2019/9/13
 */
//@Component
public class TestProcessor implements BeanPostProcessor ,PriorityOrdered{
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
			System.out.println("BeforeInitialization1");
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("personService")){
			System.out.println("AfterInitialization1");
		}
		//
		return bean;
	}


	@Override
	public int getOrder() {
		return 200;
	}
}

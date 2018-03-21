package com.lanmao.data;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringUtils implements ApplicationContextAware{

  private static ApplicationContext applicationContext;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    SpringUtils.applicationContext =  applicationContext;
  }

  public static <T> T getBean(String beanName, Class<T> clazz) {
    return applicationContext.getBean(beanName, clazz);
  }
  
  public static <T> T getBean(Class<T> cls){
	  return applicationContext.getBean(cls);
  }
}

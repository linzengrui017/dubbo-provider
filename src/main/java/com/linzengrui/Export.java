package com.linzengrui;

import com.alibaba.dubbo.config.spring.ServiceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lzr on 2017/4/8.
 */
@Configuration
public class Export extends DubboBaseConfig{
    @Bean
    public ServiceBean<Person> personProvider(Person person) {
        ServiceBean<Person> serviceBean = new ServiceBean<Person>();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion("myversion");
        serviceBean.setInterface(Person.class.getName());
        serviceBean.setRef(person);
        serviceBean.setTimeout(5000);
        serviceBean.setRetries(3);
        return serviceBean;
    }
}

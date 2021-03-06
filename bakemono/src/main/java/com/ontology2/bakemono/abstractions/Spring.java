package com.ontology2.bakemono.abstractions;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.hadoop.conf.Configuration;
import com.google.common.collect.Lists;

public class Spring {
    
    //
    // this takes the hadoop configuration as an argument because we may eventually use
    // this to add to the path of XML files loaded by Spring
    //
    
    public static ApplicationContext getApplicationContext(Configuration hadoopContext) {
        String[] paths={
                "com/ontology2/bakemono/applicationContext.xml"
        };
        
        return new ClassPathXmlApplicationContext(paths);
    }
}

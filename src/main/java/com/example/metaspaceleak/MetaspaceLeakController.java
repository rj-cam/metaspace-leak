package com.example.metaspaceleak;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@CrossOrigin
@RestController
@Log4j2
public class MetaspaceLeakController implements ApplicationContextAware {

   ApplicationContext applicationContext;
   
   @Override
   public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
      this.applicationContext = applicationContext;
   }

   
   @GetMapping(path = "/test")
   public String test() {
      log.info("[test] executing");
      PrototypeService service = this.applicationContext.getBean(PrototypeService.class);
      service.doSomething();
      return "test executed";
   }
   
}

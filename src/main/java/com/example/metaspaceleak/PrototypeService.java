package com.example.metaspaceleak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Log4j2
public class PrototypeService {

   @Autowired
   PrototypeRepository repository;
   
   public PrototypeService() {
      log.info("[constructor] Instance created. {}, repository = {}", this, repository);
   }   
   
   public void doSomething() {
      log.info("[doSomething] Doing something. {}, repository = {}", this, repository);
      repository.doSomething();
   }
   
}

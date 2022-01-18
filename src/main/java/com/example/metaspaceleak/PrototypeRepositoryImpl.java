package com.example.metaspaceleak;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.log4j.Log4j2;

@Repository
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Log4j2
public class PrototypeRepositoryImpl implements PrototypeRepository {

   public PrototypeRepositoryImpl() {
      log.info("[constructor] Instance created. {}", this);
   }
 
   @Override
   @Transactional(propagation = Propagation.REQUIRED)
   public void doSomething() {
//      List<SmplAcctTypeStbV2> findAll = jpaRepository.findAll();
//      log.info("[doSomething] Doing something. {}, findAll = {}", this, findAll);
      log.info("[doSomething] Doing something. {}", this);
   }

}

# metaspace-leak

## Update

- Not reproducible in newer Spring Boot 2.4.13, 2.5.8 and 2.6.2
- Not reproducible in older Spring Boot 2.1.1

![Spring Boot 2.4.13 image](https://user-images.githubusercontent.com/92868401/149891968-f14a0b34-86ad-4796-a4ec-bc7c5460105f.png)

## Original Description 

Small Spring application to reproduce the metaspace memory leak when using prototype-scoped beans and @Transactional annotation.

The basic application structure is:
  - Singleton Controller 
      - Prototype Service
          - Prototype Repository with `@Transactional`


## How to Reproduce

- Use Postman Runner to hit http://localhost:8080/test multiple times to reproduce the issue.
- Set low maximum heap and metaspace memory to reproduce quicker. Example: `-Xms128M -Xmx250M -XX:MaxMetaspaceSize=80M`
- Loaded classes will keep increasing until the OOM error.
- Tested in Spring Boot 2.4.1 and 2.4.6

![image](https://user-images.githubusercontent.com/92868401/149884824-26988096-35d6-44f8-8040-909cf24ac3fe.png)



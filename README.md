# metaspace-leak

## Description 

Small Spring application to reproduce the metaspace memory leak when using prototype-scoped beans and @Transactional annotation.

The basic application structure is:
  - Singleton Controller 
      - Prototype Service
          - Prototype Repository with `@Transactional`


## Notes

- Use Postman Runner to hit http://localhost:8080/test multiple times to reproduce the issue.
- Set low maximum heap and metaspace memory to reproduce quicker. Example: `-Xms128M -Xmx250M -XX:MaxMetaspaceSize=80M`
- Loaded classes will keep increasing until the OOM error.

![image](https://user-images.githubusercontent.com/92868401/149884824-26988096-35d6-44f8-8040-909cf24ac3fe.png)

# metaspace-leak
Small Spring application to reproduce the metaspace memory leak when using prototype-scoped beans and @Transactional annotation

Use Postman Runner to hit http://localhost:8080/test multiple times to reproduce the issue.

![image](https://user-images.githubusercontent.com/92868401/149884824-26988096-35d6-44f8-8040-909cf24ac3fe.png)

- 获取spring上下文
```java
ApplicationContext context = new FileSystemXmlApplictaionContext("C:/Xxx.xml");
Xxx xxx = context.getBean(Xxx.class);
ApplicationContext context = new ClassPathXmlApplictionContext("Xmm.xml");
ApplicationContext context = new 
```
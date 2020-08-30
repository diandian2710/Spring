##使用注解开发
1.在spring4之后，要只用注解开发，必须要保证aop包导入.
2.使用注解需要导入context的约束，增加注解的支持
```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">
    <!--    开启注解支持-->
    <context:annotation-config/>
</beans>
```
##注解说明
- @Component：组件，放在类上，说明这个类被spring管理了，就是bean. 下面这个4个组件都是相同的功能，将类注入到spring容器中
     1. dao [@Repository]
     2. service[@Service]
     3. controller[@Controller]
     4. pojo[@Component]
- @Value: 相当于```<property name="name" value="XihengWang"/>```



##xml与注解
- xml 更加万能，适用于任何场合，维护简单
- 注解 不是自己类使用不了，维护相对复杂
##xml与注解的最佳实践
- xml用来管理bean
- 注解只负责完成属性的注入
- 我们在使用的过程中，只需要注意一个问题：必须让注解生效，就需要开启注解的支持
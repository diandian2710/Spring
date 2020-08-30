#自动注解配置文件
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
```
#注解说明
- @Autowired:自动装配通过先类型后名字
    如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value="xxxx")
- @Nullable 字段标记了这个注解，说明这个字段可以为Null：
- @Resource：自动装配通过先名字后类型

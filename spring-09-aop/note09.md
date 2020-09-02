##使用Spring实现Aop
使用Aop织入需要导入一个依赖包
```
<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.9.5</version>
    <scope>runtime</scope>
</dependency>

```

方式一：使用Spring的接口[主要SpringAPI接口实现]
方式二：自定义来实现aop[主要是切面定义]
方式三：使用注解实现！
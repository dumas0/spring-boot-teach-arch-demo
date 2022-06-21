# HttpClient 客户端接口请求工具之 Retrofit

## 简介
Retrofit 是适用于 Android 和 Java 且类型安全的 HTTP 客户端工具，在 Github 上已经有 39k+ Star。
其最大的特性的是支持通过接口的方式发起 HTTP 请求，类似于我们用 Feign 调用微服务接口的那种方式
SpringBoot是使用最广泛的Java开发框架，但是Retrofit官方并没有提供专门的Starter。

参考连接：https://github.com/square/retrofit

于是有位老哥就开发了 retrofit-spring-boot-starter，它实现了 Retrofit 与 SpringBoot 框架的快速整合，
并且支持了诸多功能增强，极大简化开发。今天我们将使用这个第三方Starter来操作Retrofit。

参考连接：https://github.com/LianjiaTech/retrofit-spring-boot-starter

## 使用

### 依赖集成
有了第三方Starter的支持，集成 Retrofit 仅需一步，添加如下依赖即可

~~~
<!--Retrofit依赖-->
<dependency>
    <groupId>com.github.lianjiatech</groupId>
    <artifactId>retrofit-spring-boot-starter</artifactId>
    <version>2.3.0</version>
</dependency>
~~~

### 基本使用

https://mp.weixin.qq.com/s/lOif5gesMUzL0zdOSkZ0fg
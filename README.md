# Spring Security博客系列教程

1.  [Spring Security源码分析一：Spring Security 认证过程](https://www.jianshu.com/p/04d107db075d)

2.  [Spring Security源码分析二：Spring Security 授权过程](https://www.jianshu.com/p/b156a7077fec)

3.  [Spring Security源码分析三：Spring Social 实现QQ社交登录](https://www.jianshu.com/p/e87ee7f31a55)

4.  [Spring Security源码分析四：Spring Social 实现微信社交登录]

5.  [Spring Security源码分析五：Spring Security 实现短信登录](https://www.jianshu.com/p/b4827b79a91f)

6.  [Spring Security源码分析六：Spring Social 社交登录源码解析](https://longfeizheng.github.io/2018/01/16/Spring-Security%E6%BA%90%E7%A0%81%E5%88%86%E6%9E%90%E5%85%AD-Spring-Social%E7%A4%BE%E4%BA%A4%E7%99%BB%E5%BD%95%E6%BA%90%E7%A0%81%E8%A7%A3%E6%9E%90/)

7.  [Spring Security源码分析七：Spring Security 记住我](https://www.jianshu.com/p/71907f758ac8)

8.  [Spring Security源码分析八：Spring Security 退出](https://www.jianshu.com/p/a8d69092ad7f)

9.  [Spring Security源码分析九：Spring Security Session管理](https://www.jianshu.com/p/18e5fcc045ed)

10.  [Spring Security源码分析十：初识Spring Security OAuth2](https://www.jianshu.com/p/3bcf6d4c6365)

# 1 启动方式
## 1.1 本地启动
1. `idea` 配置lombok插件,参考[lombok-intellij-plugin](https://github.com/mplushnikov/lombok-intellij-plugin/)
2. 修改`application.yml`配置为`active: dev`
3. 修改`application-dev.yml`中数据源信息(启动会自动初始化数据库信息)
4. 修改`application-dev.yml` 中redis连接信息
5. 社交登录需配置host文件：`127.0.0.1 www.merryyou.cn` 微信`appid`已过期

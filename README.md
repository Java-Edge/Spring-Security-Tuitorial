## 启动方式
### 本地启动
1. `idea` 配置lombok插件,参考[lombok-intellij-plugin](https://github.com/mplushnikov/lombok-intellij-plugin/)
2. 修改`application.yml`配置为`active: dev`
3. 修改`application-dev.yml`中数据源信息(启动会自动初始化数据库信息)
4. 修改`application-dev.yml` 中redis连接信息
5. 社交登录需配置host文件：`127.0.0.1 www.merryyou.cn` 微信`appid`已过期
### Docker启动
1. 安装并启动`Dokcer` 和`Docker-Compose`
2. 打包项目参考：[Spring Boot 2.0 动画Banner](https://longfeizheng.github.io/2018/03/02/Spring-Boot-2.0-%E5%8A%A8%E7%94%BBBanner/#%E9%A1%B9%E7%9B%AE%E6%89%93%E5%8C%85)
3. 切换到项目的根目录运行`F:\projects\logback>docker-compose up -d`

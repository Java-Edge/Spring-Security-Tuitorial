# 1 启动方式
## 1.1 本地启动
1. `idea` 配置lombok插件,参考[lombok-intellij-plugin](https://github.com/mplushnikov/lombok-intellij-plugin/)
2. 修改`application.yml`配置为`active: dev`
3. 修改`application-dev.yml`中数据源信息(启动会自动初始化数据库信息)
4. 修改`application-dev.yml` 中redis连接信息
5. 社交登录需配置host文件：`127.0.0.1 www.merryyou.cn` 微信`appid`已过期

# Quick Start
### 开发
1. 拉取代码

`git clone https://github.com/genein/demo.git`

2. 将代码导入IDE

3. IDE中安装lombok插件

4. 修改`application.yml`中数据源配置（url/username/password）

5. 运行`DemoApplication`

6. 访问`http://localhost/countries`

### 部署
1. 打包

运行`mvn install`生成`demo-0.0.1-SNAPSHOT.jar`

2. 运行

`java -jar demo-0.0.1-SNAPSHOT.jar`

### 参考资料
1. [通用mapper](https://github.com/abel533/Mapper)
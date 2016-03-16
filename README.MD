Python Dubbo Client Demo
=====================================  
服务端通过dubbo的JsonRPC扩展发布provider接口  
客户端通过python-dubbo-client调用，使用Zookeeper自动发现服务功能  
服务可以通过Dubbo admin监控管理，请打开宿主机端口的ip:8080/governance/  
使用 root:root登陆监控台


-------------------------------------

### 使用Docker Compose启动服务  
docker-compose up
会自动下载镜像和编译本地镜像  
如果发现网络过慢，可以通过加速服务事先下载  
zplock/zookeeper:3.4.5  
java:8  
python:2.7  
ubuntu:14.04  
上述镜像

*注：docker使用了host的组网方式，也就是说所有的容器都是在宿主机上面开启端口，避免的网络的复杂配置问题。*


### Licenses
**MIT License**
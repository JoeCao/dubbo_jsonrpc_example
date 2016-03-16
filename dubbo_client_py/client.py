# coding=utf-8
import time

from dubbo_client import ZookeeperRegistry, DubboClient, DubboClientError, ApplicationConfig, MulticastRegistry


__author__ = 'caozupeng'

"""
通过zookeeper发现服务端，然后进行测试调用
"""
if __name__ == '__main__':
    # 等待注册的服务上线
    time.sleep(5)
    config = ApplicationConfig('test_rpclib')
    service_interface = 'com.ofpay.demo.api.UserProvider'
    # 该对象较重，有zookeeper的连接，需要保存使用,“zookeeper”是hostname
    registry = ZookeeperRegistry('127.0.0.1:2181', config)
    # registry = MulticastRegistry('224.5.6.7:1234', config)
    user_provider = DubboClient(service_interface, registry, version='2.0')
    # 调用一千次，打印到输出中
    for i in range(1000):
        try:
            # 获取A003编号的用户信息
            print user_provider.getUser('A003')
            # 获取用户ID为123的用户信息
            print user_provider.getUser(123)
            # 根据给定的一系列条件，json查询字符串查询用户信息
            print user_provider.queryUser(
                {u'age': 18, u'time': 1428463514153, u'sex': u'MAN', u'id': u'A003', u'name': u'zhangsan'})
            # 查询所有用户
            datas = user_provider.queryAll()
            # 将用户的姓名全部打印出来
            for key, user in datas.items():
                print user['name']
            # 返回条件判断
            print user_provider.isLimit('MAN', 'Joe')
            # 使用反射调用provide的方法
            print user_provider('getUser', 'A005')

        except DubboClientError, client_error:
            print client_error
        time.sleep(5)
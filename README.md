#最基本的spring boot结构：boot模块
启动服务后访问：
http://127.0.0.1:28000/boot/

#基本业务功能
欢迎界面
![image](https://github.com/zhchm101/wei/screenshots/welcome.png)

下单并支付
![image](https://github.com/zhchm101/wei/screenshots/add-order-info.png)

业务订单列表
![image](https://github.com/zhchm101/wei/screenshots/order-info-list.png)

支付订单列表
![image](https://github.com/zhchm101/wei/screenshots/pay-info-list.png)

联合查询
![image](https://github.com/zhchm101/wei/screenshots/union.png)

代码结构
![image](https://github.com/zhchm101/wei/screenshots/base-code.png)

业务功能描述：
本示例模拟基本的下单支付功能，分为三大模块：
订单模块：生成业务订单，并调用支付模块进行支付
1. 下单并支付
2. 业务订单查询
3. 业务订单列表
4. 业务订单删除
支付模块：支付渠道配置；支付功能，模拟支付成功、支付失败、支付异常
1. 支付
2. 支付订单查询
3. 支付订单列表
4. 支付订单删除
5. 支付渠道列表(初始化三个支付渠道)
控台界面：纯界面应用，调用各模块接口。
1. 订单模块管理
2. 支付模块管理
3. 监控-联合查询

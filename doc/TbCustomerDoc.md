# TbCustomer管理

## 一、数据字典

| 编号  | 字段名 | 类型  | 是否允许空 | 含义 | 备注 |
| ---- | ----   | ---- |   ---- | ---- |  ---- |
| 0 | id | int(11) unsigned | NO | PRI | ID |
| 1 | name | varchar(128) | NO |  | 姓名 |
| 2 | nickname | varchar(128) | NO |  | 昵称 |
| 3 | age | int(2) unsigned | NO |  | 年龄 |
| 4 | sex | bit(1) | NO |  | 性别 |
| 5 | has_marry | bit(1) | NO |  | 已婚 |
| 6 | phone1 | varchar(64) | NO |  | 电话1 |
| 7 | phone2 | varchar(64) | NO |  | 电话2 |
| 8 | phone3 | varchar(64) | NO |  | 电话3 |
| 9 | wechat | varchar(64) | NO |  | 微信 |
| 10 | qq | varchar(64) | NO |  | QQ |
| 11 | other_contacts1 | varchar(128) | NO |  | 其他联系人1 |
| 12 | other_contacts2 | varchar(128) | NO |  | 其他联系人2 |
| 13 | address | varchar(255) | NO |  | 住址 |
| 14 | company | varchar(128) | NO |  | 公司 |
| 15 | company_address | varchar(255) | NO |  | 公司地址 |
| 16 | occupation | varchar(128) | NO |  | 职业 |
| 17 | salary | varchar(128) | NO |  | 薪资 |
| 18 | remark | varchar(255) | NO |  | 备注 |
| 19 | create_time | datetime | NO |  | 创建时间 |
| 20 | update_time | datetime | NO |  | 修改时间 |

## 二、接口文档

### 1 增加

`POST car/tbCustomers/tbCustomer`

#### 1.1 请求参数

| 参数名  | 类型     | 是否必须 | 位置   | 描述   | 举例           | 备注   |
| ---- | ------ | ---- | ---- | ---- | ------------ | ---- |
| sessionId | string | 是 | header | SessionID | 2ab321c6-8869-4d20-a2d5-35e930e08132 |
| entity | json | 是 | body | 实体类 |  |  |

#### 1.2 响应参数

| 参数名         | 类型     | 是否必须 | 描述          | 备注   |
| ----------- | ------ | ---- | ----------- | ---- |

#### 1.3 请求响应示例

```
POST http://127.0.0.1:8080/car/tbCustomers/tbCustomer
```

(1) request headers

```
sessionId: d56006cc-a698-437c-a580-6fcb8e86cc62
Content-Type: application/json;charset=utf-8
```

(2) request payload

```json
{
  "id": 1,
  "username": "张三",
  "password": "Aa123456",
  "createTime": "2018-12-11 08:20:48",
  "updateTime": "2018-12-11 08:20:48",
  "deleteTime": "2018-12-11 08:20:48",
  "isDelete": 0
}
```

(3) response

```json

```

#### 1.4 异常示例

```json
{
  "errorMessage": "没有权限",
  "errorCode": 14001,
  "instanceId": "car-xyzws"
}
```

#### 1.5 业务错误码

| 错误码   | 描述       | 解决方案   |
| ----- | -------- | ------ |
| 14001 | 没有权限 | 检查该用户的权限 |


<br/><br/>


### 2 删除

`DELETE car/tbCustomers/tbCustomer/{id}`

#### 2.1 请求参数

| 参数名  | 类型     | 是否必须 | 位置   | 描述   | 举例           | 备注   |
| ---- | ------ | ---- | ---- | ---- | ------------ | ---- |
| id   | int | 是    | path | id | 1 |      |
| sessionId | string | 是 | header | SessionID | 2ab321c6-8869-4d20-a2d5-35e930e08132 |

#### 2.2 响应参数

| 参数名         | 类型     | 是否必须 | 描述          | 备注   |
| ----------- | ------ | ---- | ----------- | ---- |

#### 2.3 请求响应示例

```
DELETE http://127.0.0.1:8080/car/tbCustomers/tbCustomer/1
```

(1) request headers

```
sessionId: d56006cc-a698-437c-a580-6fcb8e86cc62
Content-Type: application/json;charset=utf-8
```

(2) request payload

```

```

(3) response

```json

```

#### 2.4 异常示例

```json
{
  "errorMessage": "没有权限",
  "errorCode": 14001,
  "instanceId": "car-xyzws"
}
```

#### 2.5 业务错误码

| 错误码   | 描述       | 解决方案   |
| ----- | -------- | ------ |
| 14001 | 没有权限 | 检查该用户的权限 |


<br/><br/>


### 3 修改

`PUT car/tbCustomers/tbCustomer`

#### 3.1 请求参数

| 参数名  | 类型     | 是否必须 | 位置   | 描述   | 举例           | 备注   |
| ---- | ------ | ---- | ---- | ---- | ------------ | ---- |
| sessionId | string | 是 | header | SessionID | 2ab321c6-8869-4d20-a2d5-35e930e08132 |
| entity | json | 是 | body | 实体类 |  | |

#### 3.2 响应参数

| 参数名         | 类型     | 是否必须 | 描述          | 备注   |
| ----------- | ------ | ---- | ----------- | ---- |

#### 3.3 请求响应示例

```
PUT http://127.0.0.1:8080/car/tbCustomers/tbCustomer
```

(1) request headers

```
sessionId: d56006cc-a698-437c-a580-6fcb8e86cc62
Content-Type: application/json;charset=utf-8
```

(2) request payload

```json
{
  "id": 1,
  "username": "张三",
  "password": "Aa123456",
  "createTime": "2018-12-11 08:20:48",
  "updateTime": "2018-12-11 08:20:48",
  "deleteTime": "2018-12-11 08:20:48",
  "isDelete": 0
}
```

(3) response

```json

```

#### 3.4 异常示例

```json
{
  "errorMessage": "没有权限",
  "errorCode": 14001,
  "instanceId": "car-xyzws"
}
```

#### 3.5 业务错误码

| 错误码   | 描述       | 解决方案   |
| ----- | -------- | ------ |
| 14001 | 没有权限 | 检查该用户的权限 |


<br/><br/>


### 4 通过ID查询

`GET car/tbCustomers/tbCustomer/{id}`

#### 4.1 请求参数

| 参数名      | 类型   | 是否必须 | 位置    | 描述   | 举例   | 备注        |
| -------- | ---- | ---- | ----- | ---- | ---- | --------- |
| id   | int  | 是    | path | ID   |  1   |  |
| sessionId | string | 是 | header | SessionID | 2ab321c6-8869-4d20-a2d5-35e930e08132 |

#### 4.2 响应参数

| 参数名         | 类型     | 是否必须 | 描述          | 备注   |
| ----------- | ------ | ---- | ----------- | ---- |
| id          | int | 是    | ID          |      |
| username      | string | 否    | 用户名     |      |
| password    | string | 否    | 密码      |      |
| createTime      | date | 否    | 创建时间        |      |
| updateTime    | date   | 否    | 修改时间      |      |
| deleteTime    | date   | 否    | 删除时间      |      |
| isDelete    | int   | 否    | 是否删除      |      |

#### 4.3 请求响应示例

```
GET http://127.0.0.1:8080/car/tbCustomers/tbCustomer/1
```

(1) request headers

```
sessionId: d56006cc-a698-437c-a580-6fcb8e86cc62
Content-Type: application/json;charset=utf-8
```

(2) request payload

```

```

(3) response

```json
{
  "id": 1,
  "username": "张三",
  "password": "Aa123456",
  "createTime": "2018-12-11 08:20:48",
  "updateTime": "2018-12-11 08:20:48",
  "deleteTime": "2018-12-11 08:20:48",
  "isDelete": 0
}
```

#### 4.4 异常示例

```json
{
  "errorMessage": "没有权限",
  "errorCode": 14001,
  "instanceId": "car-xyzws"
}
```

#### 4.5 业务错误码

| 错误码   | 描述       | 解决方案   |
| ----- | -------- | ------ |
| 14001 | 没有权限 | 检查该用户的权限 |


<br/><br/>


### 5 查询列表

`GET car/tbCustomers`

#### 5.1 请求参数

| 参数名      | 类型   | 是否必须 | 位置    | 描述   | 举例   | 备注        |
| -------- | ---- | ---- | ----- | ---- | ---- | --------- |
| pageNo   | int  | 否    | query | 页码   | 0    | 从0开始,默认为0 |
| pageSize | int  | 否    | query | 页面大小 | 10   | 默认为10     |
| sessionId | string | 是 | header | SessionID | 2ab321c6-8869-4d20-a2d5-35e930e08132 |

#### 5.2 响应参数

| 参数名         | 类型     | 是否必须 | 描述          | 备注   |
| ----------- | ------ | ---- | ----------- | ---- |
| id          | int | 是    | ID          |      |
| username      | string | 否    | 用户名     |      |
| password    | string | 否    | 密码      |      |
| createTime      | date | 否    | 创建时间        |      |
| updateTime    | date   | 否    | 修改时间      |      |
| deleteTime    | date   | 否    | 删除时间      |      |
| isDelete    | int   | 否    | 是否删除      |      |

#### 5.3 请求响应示例

```
GET http://127.0.0.1:8080/car/tbCustomers
```

(1) request headers

```
sessionId: d56006cc-a698-437c-a580-6fcb8e86cc62
Content-Type: application/json;charset=utf-8
```

(2) request payload

```

```

(3) response

```json
{
  "total": 1,
  "data": [
    {
      "id": 1,
      "username": "张三",
      "password": "Aa123456",
      "createTime": "2018-12-11 08:20:48",
      "updateTime": "2018-12-11 08:20:48",
      "deleteTime": "2018-12-11 08:20:48",
      "isDelete": 0
    }
  ]
}
```

#### 5.4 异常示例

```json
{
  "errorMessage": "没有权限",
  "errorCode": 14001,
  "instanceId": "car-xyzws"
}
```

#### 5.5 业务错误码

| 错误码   | 描述       | 解决方案   |
| ----- | -------- | ------ |
| 14001 | 没有权限 | 检查该用户的权限 |






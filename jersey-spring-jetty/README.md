## Spring+jetty+jersey+mybatis 


## SQL user table

```
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zhaochao', '20', 'zhaochao');
INSERT INTO `user` VALUES ('2', '赵云', '50', 'zhaoyun');
```

## The Main function 

```
com.zhaochao.main.Main
```

## user java -jar  Command


```
Desktop>java -jar jersey-spring-jetty-1.0-SNAPSHOT.jar 80
```

## access url 

```
http://localhost/rest/hello/1
```

## output result

```
{
"createTime": null,
"updateTime": null,
"ids": null,
"id": 1,
"name": "zhaochao",
"age": 20,
"password": "zhaochao"
}
```
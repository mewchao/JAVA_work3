[项目进度]因为12.16才开始真正动手，现在项目位于超级初步阶段，目前已完成订单和货物的查询
[技术栈]      Mybatis
[项目结构]
JAVA_work3
    ├── src
        ├── main
            ├── java
                ├── com  			
                    ├── example
                        ├── mapper
                            ├── GoodMapper.java
                            ├── OrderMapper.java
                        ├── pojo
                            ├── Good.java
                            ├── Order.java
                        ├── utils
                            ├── MybatisUtil.java
            ├── resources
        ├── test       			
    ├── pom.xml
    └── README
[notes]
开发mybatis动态代理时要注意四点开发规范：
1.接口 方法名 == User.xml 中 id 名
2.返回值类型 与 Mapper.xml文件中返回值类型要一致
3.方法的入参类型 与Mapper.xml中入参的类型要一致
4.命名空间 绑定此接口
[bugs]
bug1:只有当数据库表中的字段名称与实体类中的属性名称完全相同，才能直接使用resultType返回类型，后面跟上该实体类的名称。否则一定需要用resultMap进行属性映射，否则得到的数据一直没有匹配的实体类与之对应，返回的结果也自然为空！！！
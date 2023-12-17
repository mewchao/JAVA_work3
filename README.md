## [项目进度]
2023.12.17:  因为12.16才开始真正动手，现在项目位于超级初步阶段，目前已完成订单和货物的增删改查
## [技术栈]      Mybatis

## [项目结构]

```
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
```
## [notes]
### 开发mybatis动态代理时要注意四点开发规范：
* 接口 方法名 == User.xml 中 id 名
* 返回值类型 与 Mapper.xml文件中返回值类型要一致
* 方法的入参类型 与Mapper.xml中入参的类型要一致
* 命名空间 绑定此接口


###   TypeHandler
##### 场景：我在java中使用了datetime类型在数据库中使用了datetime类型不一致我们通过mybatis对数据库的存取都要通过TypeHandler进行类型转换
#### 目前需要保证数据表字段名和属性名保持一致感觉比较麻烦




### Mapper.xml文件中  Select 元素的属性
* id             : 在命名空间中唯一的标识符，可以被用来引用这条语句。对应接口中的某个方法名
* parameterType  : 将会传入这条语句的参数类的完全限定名或别名。这个属性是可选的，因为 MyBatis 可以通过类型处理器（TypeHandler） 推断出具体传入语句的参数，默认值为未设置（unset
* resultType     : 返回的期望类型的类的完全限定名或别名。 注意如果返回的是集合，那应该设置为集合包含的类型，而不是集合本身。可以使用 resultType 或 resultMap，但不能同时使用。
* resultMap      : 外部 resultMap 的命名引用。


## [bugs]
* 只有当数据库表中的字段名称与实体类中的属性名称完全相同，才能直接使用resultType返回类型，后面跟上该实体类的名称。否则一定需要用resultMap进行属性映射，否则得到的数据一直没有匹配的实体类与之对应，返回的结果也自然为空！！！
* Mybaits执行insert语句，执行一次会插入两次，数据库出现两条一模一样的记录:  settings------取消勾选Delegate IDE build/run actions to Maven
* 
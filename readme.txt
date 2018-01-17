mybatis的强大特性之一便是它的动态 SQL
学习了mybatis的常用标签：
	1.if【条件过滤】
	2.where【生成where关键字,并可以去除紧临where的sql关键字,如and,or】
	3.choose when otherwise【条件过滤,类似于java中的switch。只执行一个符合条件的语句】
	4.trim【删除指定字符】
	5.set【同where,生成sql语法中的set关键字,同时可以去除sql语句最后的关键字,如逗号】
	6.foreach【用于迭代接口传入的数组或集合类型的参数】
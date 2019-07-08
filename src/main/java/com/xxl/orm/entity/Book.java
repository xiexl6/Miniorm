package com.xxl.orm.entity;

import com.xxl.orm.annotation.ORMColumn;
import com.xxl.orm.annotation.ORMId;
import com.xxl.orm.annotation.ORMTable;

//实体类:图书
@ORMTable(name = "t_book")
public class Book {
    @ORMId
    @ORMColumn(name = "id")
    private int id; //主键
    @ORMColumn(name="name")
    private String name; //图书名字
    @ORMColumn(name="author")
    private String author; //图书作者
    @ORMColumn(name="price")
    private double price; //图书价格
 }

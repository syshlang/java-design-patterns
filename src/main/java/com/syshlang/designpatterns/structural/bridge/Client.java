/*
 * Copyright (c) 2020.
 * @File: Client.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/10/21 上午11:33
 * @since:
 */

package com.syshlang.designpatterns.structural.bridge;

import com.syshlang.designpatterns.structural.bridge.brand.impl.HuaWeiPhoneBrandImpl;
import com.syshlang.designpatterns.structural.bridge.brand.impl.XiaoMiPhoneBrandImpl;
import com.syshlang.designpatterns.structural.bridge.phone.PhoneBlack;
import com.syshlang.designpatterns.structural.bridge.phone.PhoneRed;
import com.syshlang.designpatterns.structural.bridge.phone.PhoneWhite;

import java.sql.*;

/**
 * The type Client.
 *
 * @author sunys
 */
public class Client {
    /**
     * Bridge test.
     */
    public static void bridgeTest() {
        PhoneRed phoneRed = new PhoneRed(new HuaWeiPhoneBrandImpl());
        phoneRed.call();
        phoneRed.sendMessage();
        phoneRed.goOnline();
        PhoneBlack phoneBlack = new PhoneBlack(new HuaWeiPhoneBrandImpl());
        phoneBlack.call();
        phoneBlack.sendMessage();
        phoneBlack.goOnline();
        PhoneWhite phoneWhite = new PhoneWhite(new XiaoMiPhoneBrandImpl());
        phoneWhite.call();
        phoneWhite.sendMessage();
        phoneWhite.goOnline();
    }

    /**
     * Jdbc test.
     */
    public static void jdbcTest(){
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2. 创建一个连接对象
            Connection conn = DriverManager.getConnection("url","user","password");
            //3. 创建一个sql语句的发送命令对象
            Statement stmt = conn.createStatement();
            // 4. 执行sql,拿到查询的结果集对象
            ResultSet rs = stmt.executeQuery("s");
            //5. 输出结果集的数据
            while(rs.next()){
                System.out.println(rs);
            }
            //6. 关闭连接，命令对象以及结果集。
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

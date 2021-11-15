package com.william.interfaces;

/**
 * 此接口用于描述所有的Mysql数据库信息JavaBean对象。
 *
 * @author WilliamLi
 * @version 1.0
 * @date 10/10/2021 下午6:26
 */
public interface MyDataBase {

    /**
     * 此方法用于获取驱动程序类名。
     *
     * @return 旭东程序类名。
     */
    String getDriver();

    /**
     * 此方法用于获取数据库密码。
     *
     * @return 数据库密码。
     */
    String getPassword();

    /**
     * 此方法用于获取数据库URL链接。
     *
     * @return 数据库URL链接。
     */
    String getUrl();

    /**
     * 此方法用于获取数据库用户名。
     *
     * @return 数据库用户名。
     */
    String getUser();
}

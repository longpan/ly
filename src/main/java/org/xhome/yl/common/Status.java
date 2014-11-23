package org.xhome.yl.common;

/**
 * @author [FeN]July  E-mail: newfenjuly@gmail.com
 * @version 创建时间：2014-5-16 上午10:58:41
 * this class are used to store some status constant
 */
public class Status {

    public static final short SUCCESS = 0;

    public static final short ERROR = 1;

    public static final short NO_REMOVE = 2;

    public static final short NO_DELETE = 3;

    public static final short NO_UPDATE = 4;

    public static final short LOCK = 5;

    public static final short EXISTS = 6;

    public static final short NOT_EXISTS = 7;

    public static final short VERSION_NOT_MATCH = 8;

    public static final short PASSWD_NOT_MATCH = 9;

    public static final short CODE_NOT_MATCH = 10;

    public static final short BLOCKED = 11;

    /**
     * 验证码为空
     */
    public static final short VALIDATE_CODE_EMPTY = 12;

    /**
     * 非法操作
     */
    public static final short INVALID_OPERATION = 13;

}

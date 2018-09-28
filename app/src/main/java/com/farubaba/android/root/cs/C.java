package com.farubaba.android.root.cs;

import android.graphics.BitmapFactory;

import java.nio.charset.Charset;
import java.util.Locale;

/**
 * @author violet
 * @date 2018/3/5 15:07
 */

public final class C {
    public static final class Strings{
        public static final String EMPTY = "";
        public static final String DOT = ".";
        public static final String HEX_COLOR_PREFIX = "#";
        public static final String NEW_LINE_SEPERATOR = "\r\n";
        public static final String LOG_INDEX_SEPERATOR = "-->>";
        /**
         * 分割符
         */
        public static final String DEFAULT_SEPERATOR = "/";
        /**
         * 单位：十
         */
        public static final String UNIT_STR_TEN = "十";
        /**
         * 单位：百
         */
        public static final String UNIT_STR_HUNDRED = "百";
        /**
         * 单位：千
         */
        public static final String UNIT_STR_THOUSAND = "千";
        /**
         * 单位：万
         */
        public static final String UNIT_STR_TEN_THOUSAND = "万";
        /**
         * 单位：十万
         */
        public static final String UNIT_STR_ONE_HUNDRED_THOUSAND = "十万";
        /**
         * 单位：百万
         */
        public static final String UNIT_STR_MILLION = "百万";
        /**
         * 单位：千万
         */
        public static final String UNIT_STR_TEN_MILLION = "千万";
        /**
         * 单位：亿
         */
        public static final String UNIT_STR_ONE_HUNDRED_MILLION = "亿";
        /**
         * 单位：十亿
         */
        public static final String UNIT_STR_BILLION = "十亿";
        /**
         * 单位：百亿
         */
        public static final String UNIT_STR_TEN_BILLION = "百亿";
        /**
         * 单位：千亿
         */
        public static final String UNIT_STR_ONE_HUNDRED_BILLION = "千亿";
        /**
         * 单位：万亿
         */
        public static final String UNIT_STR_TEN_THOUSAND_BILLION = "万亿";
    }

    public static final class UriInfo{

        /**
         * {@link android.content.Intent#putExtra(String, String)} 其中key值得必须以packageName开头，
         *  形如：com.android.contacts.ShowAll
         */
        public static final String PACKAGE_NAME = AppUtil.getPackageName();
        public static final String KEY_SCHEME = PACKAGE_NAME + ".uri_scheme";
        public static final String KEY_HOST = PACKAGE_NAME + ".uri_host";
        public static final String KEY_PORT = PACKAGE_NAME + ".uri_port";
        public static final String KEY_AUTHORITY = PACKAGE_NAME + ".uri_authority";
        public static final String KEY_ENCODED_AUTHORITY = PACKAGE_NAME + ".uri_encodedAuthority";
        public static final String KEY_PATH = PACKAGE_NAME + ".uri_path";
        public static final String KEY_ENCODED_PATH = PACKAGE_NAME + ".uri_encodedPath";
        public static final String KEY_LAST_PATH_SEGEMENT = PACKAGE_NAME + ".uri_lastPathSegement";
        public static final String KEY_QUERY = PACKAGE_NAME + ".uri_query";
        public static final String KEY_ENCODED_QUERY = PACKAGE_NAME + ".uri_encodedQuery";
        public static final String KEY_FRAGMENT = PACKAGE_NAME + ".uri_fragment";
        public static final String KEY_ENCODED_FRAGMENT = PACKAGE_NAME + ".uri_encodedFragment";
    }

    public static final class Integers {
        public static final int ZERO = 0;
        /**
         * 十
         **/
        public static final int TEN = 10;
        /**
         * 百
         **/
        public static final int HUNDRED = 100;
        /**
         * 千
         **/
        public static final int THOUSAND = HUNDRED * 10;
        /**
         * 万
         **/
        public static final int TEN_THOUSAND = THOUSAND * 10;
        /**
         * 十万
         **/
        public static final int ONE_HUNDRED_THOUSAND = THOUSAND * 100;
        /**
         * 百万
         **/
        public static final int MILLION = TEN_THOUSAND * 100;
        /**
         * 千万
         **/
        public static final int TEN_MILLION = MILLION * 10;
        /**
         * 亿
         **/
        public static final int ONE_HUNDRED_MILLION = MILLION * 100;
        /**
         * 十亿
         **/
        public static final int BILLION = ONE_HUNDRED_MILLION * 10;
        /**
         * 百亿
         **/
        public static final int TEN_BILLION = BILLION * 10;
    }

    /**
     * java中的标准：
     * 1.二进制位bit
     * 2.字节byte
     * 3.字节数组byte[]
     * 4.一个字节 (byte[1])等于8bit
     * 5.1024字节（byte[1024]）等于1KB
     * 6.1024*1024字节 (byte[1024 * 1024])等于 1MB
     *
     *
     * 所有数值对应适用于byte[] bytes = new byte[size]
     * 中的size值。
     *
     * 通常使用字节流（inputStream和outputStream）来读写时，使用byte[]的buffer。字节流与字符编码无关。
     * 通常使用字符流（reader和writer）来读写时，使用char[]的buffer。字符流和字符编码有关。
     */
    public static final class SizeUnits{

        public static final int KB = 1024;
        public static final int MB = 1024 * KB;
        /**
         * 借鉴自{@link BitmapFactory#DECODE_BUFFER_SIZE}, 这个私有常量中定义了16KB的缓冲区。
         * 参考《Android移动性能测试》总结：小于8KB的缓冲区，读写图片，文件或将影响性能。
         * 但是当API中获取返回的JSON字符串时，通常不需要缓冲区，一次全部读取到内存都没有问题，因为内容通常很小。
         * 建议只有内容超过1MB时，才需要缓冲区。
         */
        public static final int DEFAULT_BUFFER_SIZE = 16 * KB;

        /**
         * 个人经验：如果在解析JSON文件时，需要使用到buffer，建议使用4 * KB 大小。
         * 或者根据JSON文件内容长度，动态指定buffer大小
         */
        public static final int MIN_BUFFER_SIZE = 8 * KB;

        /**
         * 文件加载时使用的buffer大小
         */
        public static final int FILE_DOWNLOAD_BUFFER_SIZE = 64 * KB;
    }

    public static final class DateTimes{
        /**
         * 默认Locale
         */
        public static final Locale DEFAULT_LOCALE = Locale.CHINA;
        /**
         * 毫秒
         **/
        public static final long TIME_MILLISECOND = 1l;
        /**
         * 秒
         **/
        public static final long TIME_SECOND = TIME_MILLISECOND * 1000;
        /**
         * 分
         **/
        public static final long TIME_MINUTE = TIME_SECOND * 60;
        /**
         * 小时
         **/
        public static final long TIME_HOUR = TIME_MINUTE * 60;
        /**
         * 天
         **/
        public static final long TIME_DAY = TIME_HOUR * 24;
        /**
         * 星期
         **/
        public static final long TIME_WEEK = TIME_DAY * 7;
    }

    /**
     * 金额相关
     */
    public static final class Currency{

    }

    /**
     * 字符集
     */
    public static final class Charsets{
        public static final Charset US_ASCII = Charset.forName("US-ASCII");
        public static final Charset UTF_8 = Charset.forName("UTF-8");
        public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    }

    /**
     * 特殊符号
     */
    public static final class Symbols{
        public static final byte CR = (byte) '\r';
        public static final byte LF = (byte) '\n';
    }

    public static final class Regex{
        public static final String chineseRegex = "^[\u4e00-\u9fa5]*$";
        public static final String character = "^[A-Za-z]+$";
        public static final String numberRegex = "^[0-9]+$";
        public static final String numberAndChar = "[0-9]+[A-Za-z]+";
        public static final String numberAndChineseRegex = "[0-9]+[\u4e00-\u9fa5]+";
        public static final String charAndChineseRegex = "[A-Za-z]+[\u4e00-\u9fa5]+";
        public static final String all = "[0-9]+[\u4e00-\u9fa5]+[A-Za-z]+";
    }
}

package com.jinhou.springboot.utils;

import com.sohu.idcenter.IdWorker;

/**
 * @Auther: liujinhou
 * @Date: 2019/1/21 17:20
 * @Description:
 */
public class SnowflakeUtil {


    /**
     * 参考https://github.com/adyliu/idcenter
     * @param args
     */
    public static void main(String[] args) {

        System.err.println(generateKey(1, 1, 0));


    }


    public static String generateKey(Integer workerId, Integer datacenterid, Integer sequence) {
        return String.valueOf(new IdWorker(1, 1, 0, System.currentTimeMillis() - 3600 * 1000L).getId());

    }

}

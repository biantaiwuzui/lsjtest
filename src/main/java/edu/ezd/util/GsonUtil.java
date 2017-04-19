package edu.ezd.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by JayJay on 2017/4/17.
 */
public class GsonUtil {
    /**
     * Gson工具类全局只要一个就行了
     */
    private static Gson gson;
    //初始化
    static {
        gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
    }
    //返回gson
    public static Gson getGson(){
        if(gson!=null)
            return gson;
        else
            return gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd HH:mm:ss")
                    .create();
    }

    /**
     * 传入集合，对象，或者字符串，转换成json数组
     * @param o
     * @return  返回json数组
     */
    public static String toJson(Object o){
        return gson.toJson(o);
    }

}

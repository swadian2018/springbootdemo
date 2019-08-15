package demo.utils;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Administrator
 * @date 2019/7/9/009 19:42
 * @Version 1.0
 */

public class LogUtils {

    public final static Logger logger = LoggerFactory.getLogger(LogUtils.class);

    public static void info(String msg){
        logger.info(msg);
    }

    public static void info(String msg,Throwable e){
        logger.info(msg,e);
    }

    public static void info(String fomat,Object...arguments){
        logger.info(fomat,toJsonAuguments(arguments));
    }

    private static Object[] toJsonAuguments(Object[] arguments){
        Object[] objects = new Object[arguments.length];
        for(int i = 0 ; i < arguments.length ; i++){
            objects[i] = toJsonArgument(arguments[i]);
        }
        return objects;
    }

    private static String toJsonArgument(Object object){
        if(object instanceof String){
            return (String) object;
        }else{
            return JSON.toJSONString(object);
        }
    }

}

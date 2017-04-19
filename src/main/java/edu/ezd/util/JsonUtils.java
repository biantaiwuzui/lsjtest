package edu.ezd.util;



import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;


import java.util.Date;

/**
 * Controller基类
 */
public class JsonUtils {

    //protected Logger logger = LoggerFactory.getLogger(this.getClass());
    
    protected final static String DATE_FORMATE = "yyyy-MM-dd";
    
    /**
     * 返回服务端处理结果
     * @param obj 服务端输出对象
     * @return 输出处理结果给前段JSON格式数据
     */
	public static String responseResult(Object obj){
		JSONObject jsonObj = null;
		if(obj != null){
		   // logger.info("后端返回对象：{}", obj);
		    JsonConfig jsonConfig = new JsonConfig();
			//将之前写好的自定义JsonDateValueProcessor的格式注册到JsonConfig中
		    jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		   	//将JsonConfig放入JSONObject对象中
		     jsonObj = JSONObject.fromObject(obj, jsonConfig);
		    //logger.info("后端返回数据：" + jsonObj);
		    if(HttpConstants.SERVICE_RESPONSE_SUCCESS_CODE.equals(jsonObj.getString(HttpConstants.SERVICE_RESPONSE_RESULT_FLAG))){
		    	jsonObj.element(HttpConstants.RESPONSE_RESULT_FLAG_ISERROR, false);
		    	jsonObj.element(HttpConstants.SERVICE_RESPONSE_RESULT_MSG, "");
		    }else{
		    	jsonObj.element(HttpConstants.RESPONSE_RESULT_FLAG_ISERROR, true);
		    	String errMsg = jsonObj.getString(HttpConstants.SERVICE_RESPONSE_RESULT_MSG);
		    	jsonObj.element(HttpConstants.SERVICE_RESPONSE_RESULT_MSG, errMsg==null?HttpConstants.SERVICE_RESPONSE_NULL:errMsg);
		    }
		}
		//logger.info("输出结果：{}", jsonObj.toString());
		return jsonObj.toString();
	}
	
	/**
     * 返回成功
     * @param obj 输出对象
     * @return 输出成功的JSON格式数据
     */
	public static String responseSuccess(Object obj){
		JSONObject jsonObj = null;
		if(obj != null){
		    //logger.info("后端返回对象：{}", obj);
		    JsonConfig jsonConfig = new JsonConfig();
		    jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		    jsonObj = JSONObject.fromObject(obj, jsonConfig);
		    //logger.info("后端返回数据：" + jsonObj);
		    //将键/值对放到这个JSONObject对象里面。如果当前value为空(null)，那么如果这个key存在的话，这个key就会移除掉。如果这
			//个key之前有value值，那么此方法会调用accumulate()方法
		    jsonObj.element(HttpConstants.RESPONSE_RESULT_FLAG_ISERROR, false);
		    jsonObj.element(HttpConstants.SERVICE_RESPONSE_RESULT_MSG, "");
		}
		//logger.info("输出结果：{}", jsonObj.toString());
		return jsonObj.toString();
	}

	/**
	 * 返回成功
	 * @param obj 输出对象
	 * @return 输出成功的JSON格式数据
	 */
	public static String responseArraySuccess(Object obj){
		JSONArray jsonObj = null;
		if(obj != null){
			//logger.info("后端返回对象：{}", obj);
			JsonConfig jsonConfig = new JsonConfig();
			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
			jsonObj = JSONArray.fromObject(obj, jsonConfig);
			//logger.info("后端返回数据：" + jsonObj);
		}
		//logger.info("输出结果：{}", jsonObj.toString());
		return jsonObj.toString();
	}
	
	/**
     * 返回成功
     * @param obj 输出对象
     * @return 输出成功的JSON格式数据
     */
	public static String responseSuccess(Object obj, String msg){
		JSONObject jsonObj = null;
		if(obj != null){
		    //logger.info("后端返回对象：{}", obj);
		    JsonConfig jsonConfig = new JsonConfig(); 
		    jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		    jsonObj = JSONObject.fromObject(obj, jsonConfig);
		   // logger.info("后端返回数据：" + jsonObj);
		    jsonObj.element(HttpConstants.RESPONSE_RESULT_FLAG_ISERROR, false);
		    jsonObj.element(HttpConstants.SERVICE_RESPONSE_RESULT_MSG, msg);
		}
		//logger.info("输出结果：{}", jsonObj.toString());
		return jsonObj.toString();
	}
	
	/**
     * 返回失败
     * @param errorMsg 错误信息
     * @return 输出失败的JSON格式数据
     */
    public static String responseFail(String errorMsg){
    	JSONObject jsonObj = new JSONObject();
    	jsonObj.put(HttpConstants.RESPONSE_RESULT_FLAG_ISERROR, true);
    	jsonObj.put(HttpConstants.SERVICE_RESPONSE_RESULT_MSG, errorMsg);
        //logger.info("输出结果：{}", jsonObj.toString());
        return jsonObj.toString();
    }

}

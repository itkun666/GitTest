package com.dtyunxi.test5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Test3 {
	public static void main(String[] args) {
		try {
			//组装json数据
			 JSONObject jsonParam = new JSONObject();  
			 jsonParam.put("userName", "admin");
			 jsonParam.put("id", "1234567890987654");
			
			CloseableHttpClient client = HttpClients.createDefault();
			HttpPost post = new HttpPost("http://localhost:8081/mall/activity/test");
			
			StringEntity entity = new StringEntity(jsonParam.toString(), "UTF-8");
			entity.setContentEncoding("UTF-8");    
			entity.setContentType("application/json"); 
			post.setEntity(entity);
			
			String respContent = null;
			CloseableHttpResponse closeableHttpResponse =client.execute(post);
			
			 if(closeableHttpResponse.getStatusLine().getStatusCode() == 200) {
			 	HttpEntity httpEntity = closeableHttpResponse.getEntity();
			    respContent = EntityUtils.toString(httpEntity,"UTF-8");
		    }
			System.out.println(JSON.toJSONString(respContent));
		
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

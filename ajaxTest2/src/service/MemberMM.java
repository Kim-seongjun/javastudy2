package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class MemberMM {
	HttpServletRequest request;
	HttpServletResponse response;

	public MemberMM(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	public String ajaxTest() {
		Map<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("id", "kim");
		hMap.put("pw", "111");
		hMap.put("age", 20);
		String json = new Gson().toJson(hMap);
		System.out.println("json=" + json);
		return json;
	}

	public String ajaxList() {
		Map<String, Object> hMap1 = new HashMap<String, Object>();
		hMap1.put("id", "sim");
		hMap1.put("pw", "111");
		hMap1.put("age", 25);
		
		Map<String, Object> hMap2 = new HashMap<String, Object>();
		hMap2.put("id", "lee");
		hMap2.put("pw", "111");
		hMap2.put("age", 30);
		
		List<Map<String, Object>> mList = new ArrayList<Map<String, Object>>();
		mList.add(hMap1);
		mList.add(hMap2);
		
		String json = new Gson().toJson(mList);
		System.out.println("json=" + json);
		return json;
	}
}

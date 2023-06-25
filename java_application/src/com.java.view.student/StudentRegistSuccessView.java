package com.java.view.student;

import java.util.HashMap;
import java.util.Map;

import com.java.view.View;

public class StudentRegistSuccessView implements View {

	@Override
	public Map<String, String> view(Map<String, Object> model) throws Exception {
		String controllerURL = "/student/detail";
		
		System.out.println(model.get("stuNum") + "번 학생 등록을 성공했습니다.");
		
		Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put("stuNum", (String)model.get("stuNum"));
		requestMap.put("controllerURL", controllerURL);
		return requestMap;
	}

}

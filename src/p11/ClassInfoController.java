package p11;

import java.util.List;
import java.util.Map;

public class ClassInfoController {

	public List<Map<String,String>> getClassInfoList (Map<String, String> param){
		UserInfoService uiService = new UserInfoService();
		return uiService.getUserInfoList(param);
	}
		
	}
	


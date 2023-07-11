package p11;

import java.util.List;
import java.util.Map;

public class UserInfoService {

	public List<Map<String, String>> getUserInfoList(Map<String, String> param) {
		UserInfoRepository uiRepo = new UserInfoRepository();
		return uiRepo.getUserInfoList(param);
	}
	
	public int inserUserInfo(Map<String,String> userInfo) {
		UserInfoRepository uiRepo = new UserInfoRepository();
		
		return uiRepo.inserUserInfo(userInfo);
		
	}
}






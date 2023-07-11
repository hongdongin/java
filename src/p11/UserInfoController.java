package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoController {

	public List<Map<String, String>> getUserInfoList(Map<String, String> param) {
		UserInfoService uiService = new UserInfoService();
		return uiService.getUserInfoList(param);
	}

	public int insertUserInfo(Map<String, String> userInfo) {
		return 0;
	}

	public int deleteUserInfo(Map<String, String> userInfo) {
		return 0;
	}

	public static void main(String[] args) {

		UserInfoController uicontroller = new UserInfoController();
		Map<String,String> param = new HashMap<>();
		param.put("uiName", "연");
		List<Map<String, String>> userInfoList = uicontroller.getUserInfoList(param);
		System.out.println("번호\t이름\t아이디\t비밀번호");
		for (Map<String, String> UserInfo : userInfoList) {
			System.out.print(UserInfo.get("uiNum") + "\t");
			System.out.print(UserInfo.get("uiName") + "\t");
			System.out.print(UserInfo.get("uiId") + "\t");
			System.out.print(UserInfo.get("uiPwd") + "\t");
		}
		
		param.put("uiName","철수");
		param.put("uiId","cs");
		param.put("uiPwd","123");
		int result = uicontroller.insertUserInfo(param);
		System.out.println("실행 결과 : " + result);
		
		param.put("uiNum","6");
		int result1 = uicontroller.deleteUserInfo(param);
		System.out.println("실행 결과 : " + result1);
	}
}

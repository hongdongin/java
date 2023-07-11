package p10;

import java.util.List;
import java.util.Map;

public class UserInfoView {

	public static UserInfoRepository userInfoRepository = new UserInfoRepository();
	public static void main(String[] args) {
		List<Map<String,String>> userInfos = userInfoRepository.getUserInfos();
		for(Map<String,String> userInfo : userInfos) {
			System.out.println(userInfo);
		}
	}
}

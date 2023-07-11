package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoRepository {

	public List<Map<String,String>> getUserInfos(){
		List<Map<String,String>>  userInfos = new ArrayList<>();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DBCon.getCon();
			String sql = "SELECT * FROM USER_INFO";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String uiId = rs.getString("UI_ID");
				String uiPwd = rs.getString("UI_PWD");
				String uiName = rs.getString("UI_NAME");
				String uiNum = rs.getString("UI_NUM");
				Map<String,String> userInfo = new HashMap<>();
				userInfo.put("uiId", uiId);
				userInfo.put("uiPwd", uiPwd);
				userInfo.put("uiName", uiName);
				userInfo.put("uiNum", uiNum);
				userInfos.add(userInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfos;
	}
}

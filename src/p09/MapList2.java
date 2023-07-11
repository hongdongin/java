package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapList2 {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("name", "홍동인");
		m.put("age", "25");
		m.put("address", "서울");
		m.put("job", "개발자");

		Map<String, String> m1 = new HashMap<>();
		m1.put("name", "홍길동");
		m1.put("age", "37");
		m1.put("address", "양주");
		m1.put("job", "회사원");
		
		Map<String, String> m2 = new HashMap<>();
		m2.put("name", "김철수");
		m2.put("age", "21");
		m2.put("address", "서울");
		m2.put("job", "공무원");

		Map<String, String> m3 = new HashMap<>();
		m3.put("name", "박규태");
		m3.put("age", "28");
		m3.put("address", "의정부");
		m3.put("job", "대학생");

		Map<String, String> m4 = new HashMap<>();
		m4.put("name", "이유리");
		m4.put("age", "30");
		m4.put("address", "안양");
		m4.put("job", "연구원");
		
		
		Map<String, String> m5 = new HashMap<>();
		m5.put("이름", "홍동인");
		m5.put("대학교", "경동대학교");
		m5.put("주소", "양주");
		m5.put("학과", "컴퓨터공학과");
		
		Map<String, String> m6 = new HashMap<>();
		m6.put("이름", "김철수");
		m6.put("대학교", "한양대학교");
		m6.put("주소", "성동구");
		m6.put("학과", "식품영양학과");
		
		Map<String, String> m7 = new HashMap<>();
		m7.put("이름", "이승주");
		m7.put("대학교", "건국대학교");
		m7.put("주소", "광진구");
		m7.put("학과", "영어교육학과");
		
		Map<String, String> m8 = new HashMap<>();
		m8.put("이름", "배기명");
		m8.put("대학교", "서울대학교");
		m8.put("주소", "관악구");
		m8.put("학과", "윤리교육학과");
		
		Map<String, String> m9 = new HashMap<>();
		m9.put("이름", "배기명");
		m9.put("대학교", "홍익대학교");
		m9.put("주소", "마포구");
		m9.put("학과", "화학생명공학과");
	
		List<Map<String,String>> mapList = new ArrayList<>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		mapList.add(m4);
		mapList.add(m5);
		mapList.add(m6);
		mapList.add(m7);
		mapList.add(m8);
		mapList.add(m9);
		
		/*for(int i=0; i<mapList.size();i++) {
			Map<String,String> map = mapList.get(i);*/
		for(Map<String,String> map : mapList) {
			Iterator<String>it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.print(key + " : " + map.get(key) + ",");
			}
			System.out.println();
		}
			
	}
}

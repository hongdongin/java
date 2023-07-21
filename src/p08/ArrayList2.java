
package p08;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {

		
		
		
		
		float[] fls = new float[3];
		fls[0] = 1.1f;
		fls[1] = 22.1f;
		fls[2] = 0.1111f;

		char[] chars = new char[3];
		chars[0] = 'a';
		chars[1] = 'b';
		chars[2] = 'd';

		String[] strs = new String[3];
		strs[0] = "우리";
		strs[1] = "모두";
		strs[2] = "화이팅";
		
		int[] i = new int[3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		
		

		ArrayList<Float> floatList = new ArrayList<Float>();
		System.out.println(floatList.size());
		floatList.add(1.1f);
		
		ArrayList<Character> charList = new ArrayList<Character>();
		System.out.println(charList.size());
		charList.add('a');
		
		ArrayList<String> strList = new ArrayList<String>();
		System.out.println(strList.size());
		strList.add("우리");

		ArrayList<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.size());
		intList.add(1);
	}

}

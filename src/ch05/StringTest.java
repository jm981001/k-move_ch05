package ch05;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "신민철";
		String str2 = "신민철";
		
		if(str1==str2) {
			System.out.println("str1과 str2는 참조 주소가 같음");
		}else {
			System.out.println("str1과 str2는 참조 주소가 다름");
		}
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 문자열이 같음");
		}
		
		
		String str3 =new String("신민철");//new연산자와 클래스의 생성자 메서드를 이용해서 객체 생성
		String str4 =new String("신민철"); //string일때 ==하면 참조 주소 다름  equals일때 문자열 같음
		
		if(str3==str4) {
			System.out.println("str3과 str4는 참조 주소가 같음");
		}else {
			System.out.println("str3과 str4는 참조 주소가 다름");
		}
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 문자열이 같음");
		}
	}

}

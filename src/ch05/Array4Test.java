package ch05;

public class Array4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체를 참조하는 배열
		String[] str = new String[3];//스트링 객체의 주소 3개를 저장하는 배열
		str[0]= "Java";
		str[1]= "Java";
		str[2]= new String("Java");
		//주소값 비교
		System.out.println(str[0]==str[1]);
		System.out.println(str[0]==str[2]);
		System.out.println(str[0].equals(str[2]));
	}

}

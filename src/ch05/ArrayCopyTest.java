package ch05;

public class ArrayCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문으로 배열 복사
		int[] oldArr = {1,2,3};//3개짜리
		int[] newArr = new int[5];//5개짜리
		for(int i=0; i<oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		for(int i=0; i<newArr.length; i++) {
			System.out.print(newArr[i]+" ");
	    }
		System.out.println();
		
		//System.arraycopy() 이용해서 배열 복사
		String[] oldStr = {"java","array","copy"};
		String[] newStr = new String[5];
		System.arraycopy(oldStr, 0, newStr, 0, oldStr.length);//원본 복사할곳 어디서부터 어디할껀지 첫0은 복사를 할 인덱스 번호 
		/*for(int i=0; i<newStr.length; i++) {
			System.out.print(newStr[i]+" ");}*/
		for(String newstr: newStr) {
			System.out.print(newstr+" ");
		}
		

}
}
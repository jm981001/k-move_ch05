package ch05;

import java.util.Scanner;

class Exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum=0;
		int[] scores = null;

		Scanner scanner = new Scanner(System.in);


		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------");
			System.out.println("선택>");

			int selecNo = scanner.nextInt();

			if(selecNo ==1) {
				System.out.println("학생수>");
				studentNum=scanner.nextInt();//숫자 입력 받음
				scores = new int[studentNum];//학생수의 크기로 배열 생성

			}else if(selecNo ==2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>");
					scores[i]=scanner.nextInt();
				}
			}else if(selecNo ==3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>"+scores[i]);
				}
			}else if(selecNo ==4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					max= (max<scores[i])? scores[i] : max;//삼항 연산자
					sum+=scores[i];//누적합계구함
				}
				avg= (double)sum/studentNum;
				System.out.println("최고 점수 :"+ max);
				System.out.println("평균 점수: "+ avg);

			}else if(selecNo ==5) {
				run=false;
			}
		}

		System.out.println("프로그램 종료");
		
	}
}

package ch05;

public class Array3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열 = 배열 속의 배열
		int[][] mathScores= new int [2][3];//2행 3열
		for(int i=0; i<mathScores.length; i++) {
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.println("mathScores["+i+"]["+j+"]="+mathScores[i][j]);//인덱스 확인 위해서
			}
			
		}
		System.out.println();
		
		int[][] englisScores= new int [2][];//열은나중에 입력해도 됨
		englisScores[0]= new int[2];
		englisScores[1]= new int[3];
		for(int i=0; i<englisScores.length; i++) {
			for(int j=0; j<englisScores[i].length; j++) {
				System.out.println("englisScores["+i+"]["+j+"]="+englisScores[i][j]);//인덱스 확인 위해서
			}
			
		}
		System.out.println();
		
		int[][] javaScores= {{95,80},{92,96,80}};//2행 3열
		for(int i=0; i<javaScores.length; i++) {
			for(int j=0; j<javaScores[i].length; j++) {
				System.out.println("javaScores["+i+"]["+j+"]="+javaScores[i][j]);//인덱스 확인 위해서
	        }

        }
}
}
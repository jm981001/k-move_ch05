package ch05;

public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 할때는 중첩for
		int[][] array ={
				{95,86}, //(0.0)(0.1)
				{83,92,96},//(1.0)(1.2)(1.3)
				{78,83,93,87,88}
		};
		
		int sum=0;
		double avg = 0.0;
		int count =0;
		
		/*
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
		        sum+=array[i][j];
		        count++;
	  	}
	    }*/
		//향산된for
		for(int[] arr: array) {
			for (int num :arr){
				sum+=num;
				//count++;
			}
			count +=arr.length;//array.length는 3이 됨 
		}
		
        avg= (double)sum/ count;
		
		System.out.println("sum:"+ sum);
		System.out.println("avg:"+ avg);
		
	}
}

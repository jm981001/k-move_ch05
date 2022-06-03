package ch05;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,5,3,8,2};
		int max = array[0];
		int min = array[0];
		
		for(int i=1; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		
			if(min> array[i]) {
				min= array[i];
			}
		}
		/* 
		 향상된 for
		 for(int num : array){
		    if(max < num){
		        max=num;
		    }
		    if(min > num){
		        min=num;
		 */
		
		
		System.out.println("max:"+max+" min:"+min);
	}

}

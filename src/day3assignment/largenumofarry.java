package day3assignment;

public class largenumofarry {

	public static void main(String[] args) {
		int i;
		int[] array=new int[] {4,67,56,34,21,20 };
		int largenumber=array[0];
		for(i=0;i<array.length;i++)
		{
			if(array[i]>largenumber)
             {
	          largenumber=array[i];
             }
            
		}
		 System.out.println("Largest Number in an array is::"+largenumber);


	}

}

package day3assignment;

public class smallnumofarry {
	public static void main(String[] args) {
		int i;
		int[] array=new int[] {5,7,9,45,67,83,2 };
		int smallnumber=array[0];
		for(i=0;i<array.length;i++)
		{
			if(array[i]<smallnumber)
             {
	          smallnumber=array[i];
             }
            
		}
		 System.out.println("Largest Number in an array is::"+smallnumber);
	}
}

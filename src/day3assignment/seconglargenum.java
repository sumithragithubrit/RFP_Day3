package day3assignment;

public class seconglargenum {

	public static void main(String[] args) {
		int i;
		int[] array=new int[] {23 ,67 ,56, 56, 45, 76 ,31 ,30};
		int n=array.length;
		int highest=Integer.MIN_VALUE;
		int secondhighest=Integer.MIN_VALUE;
		for(i=0;i<n;i++)
		{
			if(array[i]>highest)
			{
				secondhighest=highest;
				highest=array[i];
			}
			if(array[i]<highest && array[i]>secondhighest)
			{
				secondhighest=array[i];
			}
		}
		System.out.println("Second highest number of an array:"+secondhighest);

	}

}

package day3assignment;

public class even {

	public static void main(String[] args) {
		int i;
		int [] array=new int[] {45,68,78,96,46,97,91,75};
		for(i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				System.out.println( array[i]+ " is even");
			}
		}
	}

}

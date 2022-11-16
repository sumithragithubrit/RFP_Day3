package day3assignment;

public class duplicatearray {

	public static void main(String[] args) {
		int i,j;
		int [] array=new int[] {4,6,8,2,6,4,8,1,0,1,5,3};
		System.out.println("Duplicate elements in an array::::::");
		for( i=0;i<=array.length;i++)
		{
			for( j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
					System.out.println(array[j]);
			}
		}
	}

}

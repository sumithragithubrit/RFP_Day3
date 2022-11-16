package day3assignment;

public class sorting {

	public static void main(String[] args) {
		int i,j;
		int[] array=new int[] {5,78,90,43,6,2,2345,21,20,18};
		System.out.println("Sorted Elements are:::::");
		for(i=0;i<array.length;i++)
		{
			for(j=i+1;j<array.length;j++)
			{
				int temp=0;
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			System.out.println(array[i]);
		}

	}

}

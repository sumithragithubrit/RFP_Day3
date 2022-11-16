package day3assignment;

public class frequency {

	public static void main(String[] args) {
		int i,j;
		int[] array=new int[] {5,6,8,6,3,3,3,4,2,9,1,2,2,95,78,65,0};
		int[] arr=new int[array.length];
		int visited=-1;
		for(i=0;i<array.length;i++)
		{
			int count=1;
			for(j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					count++;
					arr[j]=visited;
				}
			}
			if(arr[i]!=visited)
			{
				arr[i]=count;
				
			}
		
		}
		for( i=0;i<arr.length;i++)
		{
			if(arr[i]!=visited)
			{
				System.out.println("frequency of "+array[i]+":"+arr[i]);
			}
		}
		
		

	}

}

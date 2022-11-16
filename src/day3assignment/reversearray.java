package day3assignment;

public class reversearray {

	public static void main(String[] args) {
		int i;
		int[] array=new int[] {2,8,98,6,7};
		System.out.println("original array elements");
		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Reverse array elements");
		for(i=(array.length-1);i>=0;i--)
		{
			System.out.println(array[i]);
		}
	}

}

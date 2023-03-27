
public class GitOmegaOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(" Life is beautiful");
		int[] number = new int [] {55, 3, 67, 99};
		int min = number[0];
		for (int i=0; i<number.length; i++)
		{
			if (number[i]< min)
			min = number[i];
			
			//System.out.println("The min number is : " + min);

		}
		System.out.println("The min number is : " + min);
	}

}

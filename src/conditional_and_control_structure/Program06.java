//6.Print the prime numbers between 2 to 100

package conditional_and_control_structure;

public class Program06 {


	public static void main(String[] args) {
		int count=0;

        for(int i = 2;i < 100; i++)
        {
            for(int j = 2;j < i; j++)
            {
                if(i % j != 0)
                {
                    count++;
                    if(count == i - 2)
                    {
                        System.out.print(i+" ");
                    }
                }
            }
            count = 0;
        }
	}

}

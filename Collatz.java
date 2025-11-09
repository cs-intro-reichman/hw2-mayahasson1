public class Collatz {
    public static void main(String args[]) {
        int N=Integer.parseInt(args[0]);
        String mode= args[1];
        for(int i=1; i<=N; i++)
        {
			int num=i;
            int step=1;
            if(mode.equals("v"))
            {
                System.out.print(num+" ");
            }
            while(num!=1)
            {
                if(num%2==0)
                {
                    num=num/2;
                }
                else
                {
                    num=(num*3)+1;
                }
                step++;
                if(mode.equals("v"))
                {
                    System.out.print(num+" ");
                }

            }
            if (mode.equals("v")) 
            {
                System.out.println("("+step+")");
            }
        }
            System.out.println("Every one of the first "+N+" hailstone sequences reached 1.");
        }
        
    }


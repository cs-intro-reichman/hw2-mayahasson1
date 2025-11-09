
public  class  TestRandom {
    public static void main(String[]  args) {
        int num=Integer.parseInt(args[0]);
        int nTimes=1;
        double less=0;
        double more=0;
        double numR;
        while(nTimes<=num)
        {
            numR=(double)(Math.random());
            if(numR>0.5)
            {
                more++;
            }
            else if(numR<=0.5)
            {
                less++;
            }
            nTimes++;
        }

System.out.println("> 0.5: "+(int)more+" times");
System.out.println("<= 0.5: "+(int)less+" times");
if((less!=0)&&(more!=0))
{
    System.out.println("Ratio: "+(more/less));
}
    }

}

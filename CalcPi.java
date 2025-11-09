public class CalcPi {
    public static void main(String [] args) { 
        int repeat=Integer.parseInt(args[0]);
        double sum=0;
        int i=0;
        while(i<repeat)
        {
            sum=sum+(Math.pow(-1,i)/(2*i+1));
            i++;
        }
        sum=sum*4;
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + sum);
    }
}







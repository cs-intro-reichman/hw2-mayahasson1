public class TimeCalc {
    public static void main(String[] args) {
        String time= args[0];
        int minutesToAdd=Integer.parseInt(args[1]);
        int hours= Integer.parseInt(time.substring(0,2));
        int minutes= Integer.parseInt(time.substring(3,5));
        int totalMin=(hours*60)+minutes+minutesToAdd;
        int totalH= (totalMin/60)%24;
        int newM=totalMin%60;
        if((newM<10)&&(totalH<10))
        {
            System.out.println("0"+totalH+":0"+newM);
        }
            else if(newM<10)
            {
                System.out.println(totalH+":0"+newM);
            }
            else if(totalH<10)
            {
                System.out.println("0"+totalH+":"+newM);
            }
            else
            {
            System.out.println(totalH+":"+newM);
            }    
        }
    }




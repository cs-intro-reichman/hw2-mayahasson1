public class Cheers {
        public static void main(String[] args) {
        String name= args[0];
        String spell="AEFHILMNORSX";
        int time=Integer.parseInt(args[1]);
        int repeat=0;
        int place=0;
        while(place<name.length())
        {
                if(spell.indexOf(name.charAt(place))==-1)
                {
                        System.out.println("Give me a  "+name.charAt(place)+": "+name.charAt(place)+"!");
                        place++;
                }
                else
                {
                        System.out.println("Give me an "+name.charAt(place)+": "+name.charAt(place)+"!");
                        place++;
                }
        }
        System.out.println("What does that spell?");
        while(repeat<time)
        {
                System.out.println(name+"!!!");
                repeat++;
        }


        }
}




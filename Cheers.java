public class Cheers {
        public static void main(String[] args) {
         String name = args[0].toUpperCase(); 
        String spell="AEFHILMNORSX";
        int time=Integer.parseInt(args[1]);
        int repeat=0;
        int place=0;
        while(place<name.length())
        {
                char letter = name.charAt(place);
                if (spell.indexOf(letter) == -1)
                {
                        System.out.println("Give me a  " + letter + ": " + letter + "!");
                        place++;
                }
                else
                {
                        System.out.println("Give me an " + letter + ": " + letter + "!");
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




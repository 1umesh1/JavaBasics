public class Practice {
 //public class LotsOfErrors {
       /* public static void main(String[] args)
        {
        System.out.println("Hello, world!");
          message();
         }*/

        public static void message() {
            System.out.println("This program surely cannot ");
            System.out.println("have any \"errors\" in it");
            //double a = (1 + (3 / 2) – (7 % 3));
            System.out.println("10 plus 20 is " + 10 + 20);
            System.out.print("Hello ");
            System.out.println("World ");
            System.out.print("Java is ");

            int x = 10;
            int y = 5;
            int z = x + y;
            x = z - y;
            y = x + z;
            z = 2 * z;
            System.out.println("x is " + x);
            System.out.println("y is " + y);
            System.out.println("z is " + z);
        }


                public static void mystery(String foo, String bar, String zazz) {
                    System.out.println(zazz + " and " + foo + " like " + bar);
                }
                public static void main(String[] args) {
                    String foo = "peanuts";
                    String bar = "foo";
                    mystery(bar, foo, "John");
                    System.out.println( Math.abs(-122 % 10));

                    System.out.println(makeFancy("JAVA"));
                }

    public static String makeFancy(String s) {
        if (s.length() == 0) {
            return "*";
        }
        return "*" + s.substring(0,1) + makeFancy(s.substring(0, s.length()-1));
    }




            }














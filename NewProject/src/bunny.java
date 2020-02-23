/*We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
 */

public class bunny {

    public static void main (String[] args)
    {
        int n=10;
        System.out.print(bunnyEars2(n));

    }
    public static int bunnyEars2(int bunnies)
    {int num=0;
    if (bunnies ==0){return 0;}

        if (bunnies % 2==0 ){ num =3;}
        else {num =2;}
        return (num + bunnyEars2(bunnies-1));


    }

}

/*
We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.


triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
*/


public class triangleblock {
    public static void main (String[] args)
    {
        int n=10;
        for(int i=0;i<=n;i++) {
            System.out.println(triangle(i));
        }
    }
    public static int triangle(int rows) {
        int num = rows;
        if (rows==0) {return 0;}

        return num+triangle(rows-1);
    }





}

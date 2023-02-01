import java.util.*;
class Area
{
    public static void main(String args[])
    {
        double A,B,C,S,Area;
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        S=(A+B+C)/2;
        Area=Math.sqrt(S*(S-A)*(S-B)*(S-C));
        System.out.format("%.2f",Area);
    }
}
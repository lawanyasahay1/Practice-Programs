import java.util.*;
public class Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double p,r,t,si=0;
        System.out.println("Enter principal,rate and interest:");
        p = in.nextDouble();
        r = in.nextDouble();
        t = in.nextDouble();
        si = (p*r*t)/100;
        System.out.println("Simple Interest:" +si);
    }
}

import java.util.Scanner;

public class AreaPeriVol {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter 1 for Area, 2 for Perimeter, 3 for Volume:" );
            int choice = in.nextInt ();
       
        switch(choice)
        {
            
            case 1:
            {
                float r=0,a=0,c=0,b=0,h=0,d1=0,d2=0;
                System.out.println ( "Enter a Radius, Side a, Base b, Side c, Height h, diagonal1 d1, diagonal2 d2:" );
                r = in.nextFloat ( );
                a =in.nextFloat ();
                c =in.nextFloat ();
                b =in.nextFloat ();
                h =in.nextFloat ();
                d1 =in.nextFloat ();
                d2 =in.nextFloat ();

                float circle = (float) (Math.PI*r*r);
                float rect = a*c;
                float triangle = (float) 0.5 * h*b;
                float isostri = (float) Math.sqrt ( (a*a)-((c*c)/(2*2)) );
                float isostriheight = (float) 0.5*b*h;
                float parallelogram = b*h;
                float rhombus = (float) 0.5*d1*d2;
                float equitri = (float) (Math.sqrt ( 3 )/4) * a *a ;
                double csa =  ((float) 2*Math.PI*r*h);
                double tsa = 6 * a * a;
                System.out.println ( "Area: Area Of Circle:" +circle+" Area Of Triangle: "+triangle+" Area Of Rectangle: "+rect+" Area Of Isosceles Triangle: "+isostri+" Area of an Isosceles Triangle with height: "+isostriheight+" Area Of Parallelogram: "+parallelogram+" Area Of Rhombus: "+rhombus+" Area Of Equilateral Triangle :"+equitri+" CSA of a cylinder: "+csa+ " TSA of a cube: "+tsa);
                break;
            }
            case 2:
            {
                float r=0,s=0,a=0,b=0,l=0,w=0;
                System.out.println ( "Enter radius r,side s,side a,side b, Length l, width w: " );
                r = in.nextFloat ();
                s = in.nextFloat ();
                a = in.nextFloat ();
                b = in.nextFloat ();
                l = in.nextFloat ();
                w = in.nextFloat ();
                float circumference = (float) ((float) 2*Math.PI*r);
                float equitri = 3*s;
                float parallelogram = 2*(a+b);
                float rect = 2*(l+w);
                float square = 4*s;
                float rhombus = 4*s;
                System.out.println ( "Perimeter Of Circle: "+circumference+" Perimeter Of Equilateral Triangle: "+equitri+" Perimeter of parallelogram: "+parallelogram+" Perimeter of a rectangle: "+rect+" Perimeter of square: "+square+"Perimeter of a rhombus: "+rhombus);
                break;
            }
            case 3:
            {
                float r=0,h=0,b=0;
                System.out.println ( "Enter a Radius, Height h, Base b:" );
                r =in.nextFloat ();
                h =in.nextFloat ();
                b =in.nextFloat ();
                float cone = (float) (((double) 1 /3)*Math.PI*r*r*h);
                float prism = b*h;
                float cylinder = (float) (Math.PI*r*r*h);
                float sphere = (float) (((double) 4 /3)*Math.PI*r*r*r);
                float pyramid = (((float) 1 /3)*b*h);
                System.out.println ( "Perimeter Of Cone: "+cone+" Perimeter Of Prism: "+prism+" Perimeter of Sphere: "+sphere+" Perimeter of a cylinder: "+cylinder+" Perimeter of pyramid: "+pyramid);
                break;
            }
            default:
            {
                System.out.println("Invalid entry");
            }
            
        }
    }
}

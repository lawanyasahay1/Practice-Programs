public class Shadowing {
    public static void main ( String[] args ) {
        int a=20;
        int b=10;

        { int c;
          c =89;
        }

        System.out.println ( a );
    }


}

package First;

public class Another {
    int a=1;
    protected Another(int x){

        a=x;
    }

    public static void main(String [] args)  {
        System.out.println("Calling another");
        System.out.println("Added Another line");
        Another an = new Another(150);
        System.out.println(an.a);
    }

}

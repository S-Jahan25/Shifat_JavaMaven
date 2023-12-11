package javaPackages.opperator;

public class RelationalOperators {
    // > ,<,>=,<=, == , != . these will not going to return a value. these will give only true or false

    int a = 15; // static variable
    int b = 7;  // static variable

    public void relational(){


        boolean result1 = a>b;
        System.out.println(result1);

        boolean result2 = a<b;
        System.out.println(result2);

        boolean result3 = a>=b; // greater than or equal
        System.out.println(result3);

        boolean result4 = a<=b; // less than or equal
        System.out.println(result4);

        boolean result5 = a==b; // means equal
        System.out.println(result5);

        boolean result6 = a!=b; // != not equal
        System.out.println(result6);
    }

    public static void main(String[] args) {
       // RelationalOperators obj = new RelationalOperators();
        //Obj.Relational();
    }

}

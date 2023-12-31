package javaPackages.constructionDemo;

public class ConstructionPractice {
/*
    Constructor is a special method  that has / share the same name as class
 */
   public String name;
   public int id;
   public int batch;
   public String location;

    public ConstructionPractice( String name, int id, int batch){   // not use any void  with local parameter variable inside.
      /*
       here creating connection with global and local .
       local name, id, batch and global are same
       Marging together local assigned to global
       */

       this.name = name;
        this.id= id;
        this.batch= batch;

    }
     public ConstructionPractice(String location){
        this.location = location;
     }


    public static void main(String[] args) {
        ConstructionPractice obj1 = new ConstructionPractice("shifat",87,76);
      //  obj1.name = "Shifat";
      //  obj1.id = 980;
      //  obj1.batch = 8;


        System.out.println(obj1.name);
        System.out.println(obj1.id);
        System.out.println(obj1.batch);

        System.out.println("--------------------");

        ConstructionPractice obj2 = new ConstructionPractice("safa",65,98);

      //  obj1.name = "Jahan";
     //   obj1.id = 80;
     //   obj1.batch = 4;


        System.out.println(obj1.name);
        System.out.println(obj1.id);
        System.out.println(obj1.batch);

        System.out.println("---------------");
        ConstructionPractice obj3 = new ConstructionPractice("opu",76,323);

      //  obj1.name = "safa";
     //   obj1.id = 7;
     //   obj1.batch = 5;


        System.out.println(obj1.name);
        System.out.println(obj1.id);
        System.out.println(obj1.batch);

        ConstructionPractice obj4 = new ConstructionPractice("Florida");
        System.out.println(obj4.location);


    }
}

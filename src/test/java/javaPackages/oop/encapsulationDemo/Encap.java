package javaPackages.oop.encapsulationDemo;

public class Encap {

    // creating getter and setter methood.. these are public...plain old java obj.
    // by doing getter and setter method privet can be accessible.


    private int ssn;
     public int getSsn(){
         return ssn;
     }
     public void setSsn(int ssn){
         this.ssn = ssn;
     }
}

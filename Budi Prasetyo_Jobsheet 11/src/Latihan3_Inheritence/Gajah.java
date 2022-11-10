package Latihan3_Inheritence;

public class Gajah extends Hewan {
    public static void testClassMethod(){
        System.out.println("The Class Method in Hewan");
    }
    
    public void testInstanceMethod(){
        System.out.println("The Instance Method in Hewan");
    }

    public static void main(String[]args){
        Hewan myHewan = new Hewan();
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
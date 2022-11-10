package Latihan2_Inheritence;

public class Employ extends Person {
    private String noKaryawan;

    public Employ(String noKaryawan, String name, int age) {
        super(name, age);
        this.noKaryawan = noKaryawan;
        //TODO Auto-generated constructor stub
    }

    public void info(){
        System.out.println("No. Karyawan :"+ this.noKaryawan);
        super.info();
    }
    
}

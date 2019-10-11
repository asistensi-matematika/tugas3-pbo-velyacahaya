package tugaskedua;

import java.util.Scanner;

public class persamaanliniermain {

    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        persamaanlinier testi = new persamaanlinier();
        
        System.out.print("Input : ");
        
        testi.setA(test.nextDouble());
        testi.getA();
        
        testi.setB(test.nextDouble());
        testi.getA();
        
        testi.setC(test.nextDouble());
        testi.getC();
        
        testi.setD(test.nextDouble());
        testi.getD();
        
        testi.setE(test.nextDouble());
        testi.getE();
        
        testi.setF(test.nextDouble());
        testi.getF();
        
        System.out.println(" ");
        System.out.println("Output : ");
        System.out.println("Sitem Persamaannya : ");
        System.out.println(testi.getA()+"x + "+testi.getB()+"y = "+testi.getE());
        System.out.println(testi.getC()+"x + "+testi.getD()+"y = "+testi.getF());
        System.out.println("Hasilnya : ");
        System.out.println("x = " + testi.nilaiX()+ ", y = "+ testi.nilaiY());
        
        System.out.println(testi.status());
    }    
}

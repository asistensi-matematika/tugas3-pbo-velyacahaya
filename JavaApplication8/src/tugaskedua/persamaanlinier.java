package tugaskedua;

public class persamaanlinier {
    private double a,b,c,d,e,f;
    
    public persamaanlinier(){
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
    }
    public persamaanlinier(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double nilaiX (){
        return (e*d - b*f)/(a*d-b*c);
    }
    
    public double nilaiY (){
        return (a*f-e*c)/(a*d-b*c);
    }
    
    public double cekSolusi(){
        return a*d - b*c;
    }
    
    public boolean isSalah(){
        return cekSolusi()== 0;
    }
    
    public String status(){
        if(isSalah()){
            return "NO SOLUTION";
        }
        else
            return "THERE'S SOLUTION";
    }
}

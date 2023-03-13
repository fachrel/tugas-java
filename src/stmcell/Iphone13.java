package stmcell;

public class Iphone13 extends Iphone{
    private int ram = 8;
    
    public int getRam(){
        return this.ram;
    }
    
    public void setRam(int ram){
        this.ram = ram;
    }
    
    //    kencang karna hp muahal
    @Override
    void hidup() {
        System.out.println("hp hidup dengan loading 5 detik");
    }

    @Override
    void mati() {
        System.out.println("hp mati dengan loading 2 detik");
    }
}

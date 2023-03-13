package stmcell;

public class XiaomiS2 extends Xiaomi{
    private int ram = 2;
    
    public int getRam(){
        return this.ram;
    }
    
    public void setRam(int ram){
        this.ram = ram;
    }

    //    lama karna hp murah
    @Override
    void hidup() {
        System.out.println("hp hidup dengan loading 15 detik");
    }

    @Override
    void mati() {
        System.out.println("hp mati dengan loading 20 detik");
    }
    
    
    
}

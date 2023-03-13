package stmcell;

public class HandPhone {
    private int layar;
    private String prosesor;
    private int internal;
    
    public int getLayar(){
        return this.layar;
    }
    
    public void setLayar(int layar){
        this.layar = layar;
    }
    
    public String getProsesor(){
        return this.prosesor;
    }
    
    public void setProsesor(String prosesor){
        this.prosesor = prosesor;
    }
    
    public int getInternal(){
        return this.internal;
    }
    
    public void setInternal(int internal){
        this.internal = internal;
    }
    void hidup(){
        System.out.println("hp hidup dengan loading 10 detik");
    }
    
    void mati(){
        System.out.println("hp mati dengan loading 10 detik");
    }
}

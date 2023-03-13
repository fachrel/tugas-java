package stmcell;

public class STMCell {

    public static void main(String[] args) {
        Iphone13 IpongFachrel = new Iphone13();
        XiaomiS2 KentangBagas = new XiaomiS2();
        
        IpongFachrel.setLayar(100);
        setSpec(IpongFachrel, 20, "intel",876);
        ingfo(IpongFachrel);
        
    }
    
    static void setSpec(HandPhone args, int layar, String prosesor, int internal){
        args.setLayar(layar);
        args.setProsesor(prosesor);
        args.setInternal(internal);
    }
    static void ingfo(HandPhone args) {
        System.out.println(args.getLayar());
        System.out.println(args.getProsesor());
        System.out.println(args.getInternal());
    }
    
}

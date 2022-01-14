package kalkulatorbr;

public class BR_Silinder {
    private static int x;
    private static int r;
    private static int t;
    private static double luas;
    private static double volume;
    public static int luasPermukaan()
    {
        System.out.println("Hitung Luas Permukaan Silinder");
        System.out.print(">> Jari-Jari : ");
        r = Main.in.nextInt();
        
        System.out.print(">> Tinggi : ");
        t = Main.in.nextInt();
        
        luas = (2 * Math.PI * r * (r + t));
        System.out.println("Luas Permukaan Silinder : " + luas);
        return x;
    }
    public static int volume()
    {
        System.out.println("Hitung Volume Silinder");
        System.out.print(">> Jari-Jari : ");
        r = Main.in.nextInt();
        
        System.out.print(">> Tinggi : ");
        t = Main.in.nextInt();

        volume = (Math.PI * Math.pow(r,2) * t);
        System.out.println("Volume Silinder : " + volume);
        return x;
    }
}

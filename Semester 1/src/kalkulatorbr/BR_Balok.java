package kalkulatorbr;

public class BR_Balok 
{
    private static int x;
    private static int p;
    private static int l;
    private static int t;
    private static int luas;
    private static int volume;
    public static int luasPermukaan()
    {
        System.out.println("Hitung Luas Permukaan Balok");
        System.out.print(">> Panjang : ");
        p = Main.in.nextInt();

        System.out.print(">> Lebar : ");
        l = Main.in.nextInt();
        
        System.out.print(">> Tinggi : ");
        t = Main.in.nextInt();

        luas = (2*(p*l + p*t + l*t));
        System.out.println("Luas Permukaan Balok : " + luas);
        return x; 
    }
    public static int volume()
    {
        System.out.println("Hitung Volume Balok");
        System.out.print(">> Panjang : ");
        p = Main.in.nextInt();

        System.out.print(">> Lebar : ");
        l = Main.in.nextInt();
        
        System.out.print(">> Tinggi : ");
        t = Main.in.nextInt();

        volume = (p*l*t);
        System.out.println("Volume Balok : " + volume);
        return x;
    }
}

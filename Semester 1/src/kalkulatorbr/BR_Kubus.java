package kalkulatorbr;

public class BR_Kubus
{
    private static int x;
    private static int s;
    private static int luas;
    private static int volume;
    public static int luasPermukaan()
    {
        System.out.println("Hitung Luas Permukaan Kubus");
        System.out.print(">> Sisi : ");
        s = Main.in.nextInt();
        luas = (6*s*s);
        System.out.println("Luas Permukaan Kubus : " + luas);
        return x;
    }
    public static int volume()
    {
        System.out.println("Hitung Volume Kubus");
        System.out.print(">> Sisi : ");
        s = Main.in.nextInt();
        volume = (s*s*s);
        System.out.println("Volume Kubus : " + volume);
        return x;
    }
} 

    


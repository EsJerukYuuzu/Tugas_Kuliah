package kalkulatorbr;

public class BR_Bola 
{
    private static int x;
    private static int r;
    private static double luas;
    private static double volume;
    public static int luasPermukaan()
    {
        System.out.println("Hitung Luas Permukaan Bola");
        System.out.print(">> Jari-Jari : ");
        r = Main.in.nextInt();

        luas = (Math.PI * Math.pow(r,2) * 4);
        System.out.println("Luas Permukaan Bola : " + luas);
        return x;
    }
    public static int volume()
    {
        System.out.println("Hitung Volume Bola");
        System.out.print(">> Jari-Jari : ");
        r = Main.in.nextInt();

        volume = (Math.PI * Math.pow(r,3) * 4/3);
        System.out.println("Volume Bola : " + volume);
        return x;
    }
}

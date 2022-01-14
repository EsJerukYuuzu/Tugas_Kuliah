package kalkulatorbr;

public class Feature 
{
    public void loopFeature()
    {
        int op1 , op2;

        do
        {
            Menu opening1 = new Menu();
            Menu opening2 = new Menu();

            opening1.loopMenu1();
            System.out.print("Input : ");
            op1 = Main.in.nextInt();
            switch(op1)
            {
                case 1 :
                {
                    
                    opening2.loopMenu2();
                    System.out.print("Input : ");
                    op2 = Main.in.nextInt();
                    switch(op2)
                    {
                        case 1 : 
                        {
                            BR_Kubus.luasPermukaan();
                            break;
                        }
                        case 2 : 
                        {
                            BR_Kubus.volume();
                            break;
                        }
                        default : 
                        {
                            System.out.println("\n" +
                                               "ERROR\n" +
                                               "Kesalahan dalam Menginput");
                        } 
                    }
                    break;
                }
                case 2 :
                {
                    opening2.loopMenu2();
                    System.out.print("Input : ");
                    op2 = Main.in.nextInt();
                    switch(op2)
                    {
                        case 1 : 
                        {
                            BR_Balok.luasPermukaan();
                            break;
                        }
                        case 2 : 
                        {
                            BR_Balok.volume();
                            break;
                        }
                        default : 
                        {
                            System.out.println("\n" +
                                               "ERROR\n" +
                                               "Kesalahan dalam Menginput");
                        } 
                    }
                    break;
                }
                    case 3 :
                {
                    opening2.loopMenu2();
                    System.out.print("Input : ");
                    op2 = Main.in.nextInt();
                    switch(op2)
                    {
                        case 1 : 
                        {
                            BR_Bola.luasPermukaan();
                            break;
                        }
                        case 2 : 
                        {
                            BR_Bola.volume();
                            break;
                        }
                        default : 
                        {
                            System.out.println("\n" +
                                               "ERROR\n" +
                                               "Kesalahan dalam Menginput");
                        } 
                    }
                    break;
                }
                case 4 :
                {
                    opening2.loopMenu2();
                    System.out.print("Input : ");
                    op2 = Main.in.nextInt();
                    switch(op2)
                    {
                        case 1 : 
                        {
                            BR_Silinder.luasPermukaan();
                            break;
                        }
                        case 2 : 
                        {
                            BR_Silinder.volume();
                            break;
                        }
                        default : 
                        {
                            System.out.println("\n" +
                                               "ERROR\n" +
                                               "Kesalahan dalam Menginput");
                        } 
                    }
                    break;
                }
                case 5 : 
                {
                    break;
                }    
                default : 
                {
                    System.out.println("\n" +
                                       "ERROR\n" +
                                       "Kesalahan dalam Menginput");
                }                       
            }
        } while(op1 == 1 || op1 == 2 || op1 == 3 || op1 == 4);
    }
}

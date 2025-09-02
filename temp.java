import java.util.*;
{
    public class temperature convert
    {
    //convert celsius to fahrenheit public static double celsius to fahrenheit(double c)
    {
      return(c*9/5)+32;
    }
    //convert celsius to kelvin public static double celcius to kelvin(double c)
    {
      return c+273.15;
    }
    //convert fahrenheit to celcius public static double fahrenheit to celcius(double f)
    {
        return(f-32)*5/9;
    }
    // convert fahrenheit to kelvin public static double fahrenheit to kelvin(double f)
    {
        return(f-32)*5/9+273.15;
    // convert kelvin to celcius public double kelvin to celcius(double k)
    {
        return(k-273.15)*9/5+32;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
           System.out.println("\n=== temperature convert===");
           System.out.println("1.celcius to fahernheit");
           System.out.println("2.celcius to kelvin");
           System.out.println("3.fahreheit to celcius");
           System.out.println("4.fahrenheit to kelvin");
           System.out.println("5.kelvin to celcius");
           System.out.println("6.kelvin to fahernheit");
           System.out.println("7.exit");
           System.out.println("enter your choice:");
           int choice=sc,nextint();
           double temp;
           switch(choice)
           {
            case 1:
            System.out.println("enter temperature in celcius:");
               temp=sc.nextdoble();

               System.out.println("fahrneheit:+celcius to celcius:");
               tem=sc.nextdouble();

           System.out.println("fahrenheit:"+celcius to kelvin(temp));
               break;
               case 2:
                System.out.println("enter temperature in celcius:")
                temp=sc nextdouble();
              System.out.println("kelvin:"+celcius to kelvin(temp));
                break;
                case 3:
                System.out.println("enter temperature in fahrenheit");
                temp=sc.nextdouble();

            System.out.println("celcius"+fahernheit to celcius(temp));
            break;
               case 4:
            system.out.println("enter temperature in fahrenheit")
            temp=sc.nextdouble();

            System.out.println("kelvin"+fahernheit to kelvin(temp)); 
        break;
              case 5:
           System.out.println("enter temperature in kelvin");
           temp=sc.nextdouble(); 
           break;
             case 6:
           System.out.println("enter temperature in kelvin");
            temp=sc.nextdouble(); 
             
             System.out.println("fahernheit"+kelvin to fahernheit(tmp));
             break;
            case 6; 
             System.out.println("exiting...thank you");
                 sc.close();
                 return;
                 default:
            System.println("invalid choice! please try again");
           }
        }
    } 
}  


        
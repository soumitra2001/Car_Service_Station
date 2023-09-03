import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String,CarService> service=new HashMap<>();
        service.put("BS01",
                new CarService("BS01","Basic Servicing",2000,4000,5000));
        service.put("EF01",
                new CarService("EF01","Engine Fixing",5000,8000,10000));
        service.put("CF01",
                new CarService("CF01","Clutch Fixing",2000,4000,6000));
        service.put("BF01",
                new CarService("BF01","Brake Fixing",1000,1500,2500));
        service.put("GF01",
                new CarService("GF01","Gear Fixing",3000,6000,8000));

        System.out.print("Enter the Car Name: ");
        String carName=sc.next();
        System.out.print("No of Service Provide: ");
        int n=sc.nextInt();
        String[] codes=new String[n];
        System.out.print("Enter the provided services: ");
        for(int i=0;i<n;i++)codes[i]=sc.next();
        int totalBill=0,price=0;
        System.out.println("------------------------------------------");
        for(String code:codes){
            CarService obj=service.get(code);
            if(carName.equals("Hatchback"))price=obj.price_for_Hatchback;
            else if(carName.equals("Sedan"))price=obj.price_for_Sedan;
            else price=obj.price_for_SUV;
            System.out.println("  Charges for "+obj.service_type+"- ₹"+price);
            totalBill+=price;
        }
        System.out.println("------------------------------------------");
        System.out.println("  Total Bill- ₹"+totalBill);
        System.out.println("------------------------------------------");
        if(totalBill>=10000)System.out.println("Note: A complimentary cleaning will be provided at free of cost.");
    }
}

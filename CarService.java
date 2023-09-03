public class CarService {
    public String service_code;

    public String service_type;

    public Integer price_for_Hatchback;

    public Integer price_for_Sedan;

    public Integer price_for_SUV;

    CarService(String service_code,String service_type,Integer hatPrice,Integer sedPrice,Integer suvPrice){
        this.service_code=service_code;this.service_type=service_type;
        this.price_for_Hatchback=hatPrice;this.price_for_Sedan=sedPrice;
        this.price_for_SUV=suvPrice;
    }

}

import java.net.Socket;
import java.nio.channels.Pipe.SourceChannel;

public class Mahindra {
    public static void main(String[] args) {
        String brand="Mahindra Thar";
        float ratingoutof5=4.5f;
        String Des="The Mahindra Thar is a lifestyle off-road SUV. It combines strong road presence with a punchy engine, smooth transmission and some serious off-road capability";
        float minvalue=11.50f;
        float maxvalue=17.62f;
        
        //emicalculate
        int emipermonth= 31036;
        float intrest=9.8f;
        short months=48;
        
        //specifications
        String engine="1497 cc- 2184 cc";
        String power="116.93-150.19 bhp";
        Byte seatingcapacity=4;
        String groundclearance="226 mm";

        System.out.println("===============");
        System.out.println("Brand = "+brand);
        System.out.println("Rating = "+ratingoutof5);
        System.out.println("Description = "+Des);
        System.out.println("On-road Price = "+ minvalue + "-" + maxvalue);
        System.out.println("===============");
        System.out.println("EMI per month = "+ emipermonth);
        System.out.println("Intrest = "+ intrest);
        System.out.println("Duration = "+ months);
        System.out.println("===============");
        System.out.println("Engine Capacity = "+ engine);
        System.out.println("Power Speed = "+ power);
        System.out.println("Seating Capacity = "+ seatingcapacity);
        System.out.println("Ground Clearance = "+ groundclearance);
    }
    
}

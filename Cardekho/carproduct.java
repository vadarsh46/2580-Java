package Cardekho;

public class carproduct {
     public static void main(String[] args) {
        car HyundaiCar = new car();
        HyundaiCar.carBrand = "Hyundai";
        HyundaiCar.carModel = "Creta";
        HyundaiCar.carPrice = 13.61710;
        HyundaiCar.carColor = "White";
        HyundaiCar.carOffer = 5.0;
        HyundaiCar.carRating=4.3f;
        HyundaiCar.downPayment=136000;
        HyundaiCar.loanPeriodYears=4;
        HyundaiCar.interestRate=9.8f;
        System.out.println("================ HYUNDAI CRETA ================");
        HyundaiCar.displayinfo();
        HyundaiCar.displayCarInfoPage();
                  
        HyundaiCar.calculateEMI();
    }
}
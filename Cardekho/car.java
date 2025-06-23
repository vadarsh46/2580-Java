package Cardekho;

public class car {
    String carBrand;
    String carModel;
    double carPrice;
    String carColor;
    double carOffer;
    float carRating;
    double downPayment;
    double interestRate;
    int loanPeriodYears;
    

    public void displayinfo(){
        System.out.println("Car Brand :"+carBrand);
        System.out.println("Car model:"+carModel);
        System.out.println("Car price:"+carPrice);
    }

      public void displayCarInfoPage(){
        System.out.println("Car Brand: "+carBrand);
        System.out.println("Car Model: "+carModel);
        System.out.println("Car Price: "+carPrice);
        System.out.println("Car Colour: "+carColor);
        System.out.println("Car Offer: "+carOffer);
        System.out.println("Car Rating for 5: "+carRating);

    }
    public void calculateEMI() {
        double onRoadPrice = carPrice * 100000; // Converting lakhs to rupees
        double loanAmount = onRoadPrice - downPayment;
        double annualInterestRate = interestRate;
        double monthlyInterestRate = annualInterestRate / (12 * 100); // from percent to decimal
        int totalMonths = loanPeriodYears * 12;

        double emi = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalMonths)) /
                     (Math.pow(1 + monthlyInterestRate, totalMonths) - 1);

        double totalPayable = emi * totalMonths;
         System.out.println("\n=========== EMI DETAILS ===========");
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + annualInterestRate + "%");
        System.out.println("Loan Tenure: " + loanPeriodYears + " years");
        System.out.printf("Monthly EMI: %.2f\n", emi);
        System.out.printf("Total Payable Amount: %.2f\n", totalPayable);
    }
}
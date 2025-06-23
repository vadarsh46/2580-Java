public class Salesopportunities {
    public static void main(String[] args) {
        int opportunityId = 5428;
        String productOrService = "Java Plan";
        double dealValue = 24000.75;
        String stage = "In Process";
        String expected_closedate = "10/10/2026";
        float estimated_value = 85000.54f;
        String created_by = "Adarsh";
        boolean isClosed = false;

        //Output

        System.out.println("=== Sales Opportunity ===");
        System.out.println("Opportunity ID: " + opportunityId);
        System.out.println("Product/Service: " + productOrService);
        System.out.println("Deal Value: $" + dealValue);
        System.out.println("Stage: " + stage);
        System.out.println("expected_closedate : " + expected_closedate);
        System.out.println("Estimated value : " + estimated_value);
        System.out.println("Created_By : " + created_by);
        System.out.println("Is Closed: " + isClosed);
    }
}
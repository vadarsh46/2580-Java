public class Supporttickets {
    public static void main(String[] args) {
        String CustomerName="Shiva";
        String Customer_Email="shiva5@gmail.com";
        int customerid=89458;
        short tickectNumber=25;
        String issue="Having some isue regarding network"  ;
        String issue_RaisedDate="20/06/25";
        boolean isIssueCleared = true;

          //Output


        System.out.println("\n=== Support tickets ===");
        System.out.println("CustomerName: " + CustomerName);
        System.out.println("Customer_Email: " + Customer_Email);
        System.out.println("Customer ID: " + customerid);
        System.out.println("tickectNumber : " + tickectNumber);
        System.out.println("what is the issue: " +  issue);
        System.out.println("issue_RaisedDate: " + issue_RaisedDate);
        System.out.println("is the issue is cleared?: " + isIssueCleared);
    }
}

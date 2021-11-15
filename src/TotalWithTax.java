public class TotalWithTax {

    public static void main(String[] args)
    {
        //Declare the variables and the constant.
        double TAXRATE = 0.0825;
        double price = 52.75;
        double tax = TAXRATE*price;
        double total = price + tax;
        System.out.println(tax);
         tax = 4.351875000000001;
        System.out.println(price + tax);
        total = 57.101875;
        System.out.println("Price: $" + price);
        System.out.println("Sales Tax: $" + tax );
        System.out.println("Total: $" + total);
        //Make the calculations and assign
        //the results to the appropriate variables.


        //Print the results.
    }
}

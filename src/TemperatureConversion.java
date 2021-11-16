public class TemperatureConversion {

    public static void main(String[] args) {

        // Create a variable of the appropriate type and initialize to to 78 degrees
        int farenheit = 78;

        // Create a second variable and write an expression to convert the value above to Celsius
        double conversion = farenheit-32 * 9/5.49;
        System.out.println(conversion);

        // Display the results to the user:
        // ex. 212 degrees F is 100 degrees C
        System.out.println(farenheit + " degrees Fahrenheit is " + conversion +  " degrees Celsius ");



    }
}

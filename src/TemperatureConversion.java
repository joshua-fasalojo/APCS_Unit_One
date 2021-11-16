public class TemperatureConversion {

    public static void main(String[] args) {

        // Create a variable of the appropriate type and initialize to to 78 degrees
        int farenheit = 78;

        // Create a second variable and write an expression to convert the value above to Celsius
        double conversion = 78-32;
        System.out.println(conversion);
        System.out.println(conversion/1.8);

        // Display the results to the user:
        // ex. 212 degrees F is 100 degrees C
        System.out.println(farenheit + " degrees Fahrenheit is " + conversion/1.8 +  " degrees Celsius ");



    }
}

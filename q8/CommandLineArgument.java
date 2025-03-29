public class CommandLineArgument{
    public static void main(String[] args) {
        try{
            if(args.length <2){
                throw new ArrayIndexOutOfBoundsException("Only one argument provided. Please provide two arguments.");
            }

            int num1= Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int result =  num1 / num2;
            System.out.println("Result of "+num1 + "/"+num2+" is: "+result);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Usage: java CommandLineArgumentHandler <number1> <number2>");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (NumberFormatException e) {
                System.out.println("Error: Please enter valid integers as arguments.");
            }
        }
    }
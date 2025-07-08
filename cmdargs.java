class cmdargs {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = a / b;
            System.out.println("result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide two numbers as arguments.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Arguments must be integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }
}

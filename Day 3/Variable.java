class Variable {
    public static void main(String args[]) {
        // Declaring and initializing the variables
        long hoursWorked = 50;
        double payRate = 40.0, taxRate = 0.10, taxPayable;
        System.out.println("Hours Worked: " + hoursWorked);
        // Performing operations on variables
        System.out.println("Payment Amount: " + (hoursWorked * payRate));
        taxPayable = hoursWorked * payRate * taxRate;
        System.out.println("Tax Payable: " + taxPayable);
    }
}

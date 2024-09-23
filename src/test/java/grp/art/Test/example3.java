package grp.art.Test;

// Define the example3 class with a constructor
public class example3 {

    int empid;
    String empname;
    int exp;
    double salary;

    // Constructor to initialize the properties
    public example3(String empname, int exp, double salary, int empid) {
        this.empid = empid;
        this.salary = salary;
        this.empname = empname;
        this.exp = exp;  // Initialize exp as well
    }

    // Optionally, you can add a toString method for easy printing
    @Override
    public String toString() {
        return "Employee ID: " + empid + ", Name: " + empname + ", Experience: " + exp + " years, Salary: " + salary;
    }


// Define the main class with the main method
    public static void main(String[] args) {
        // Create an instance of example3
        example3 emp = new example3("rama", 4, 1234.55, 1001);

        // Print the employee details
        System.out.println(emp);
    }
}


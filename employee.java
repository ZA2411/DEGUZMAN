public class employee{
   
    private String name;
    private int age;
    protected double salary;

    public employee(String name, int age, double salary) {
         this.name = name;
         this.age = age;
         this.salary = salary;
    }


    public String getName() {
        return this.name;
    }
   public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    } 

    public void raiseSalary() {
        this. salary = this.salary * 1.2; 
     }

    public static void main (String[] args) {
      employee emp = new employee("alexCruz", 19, 5000);
    System.out.println("Name:" + emp.getName());
      System.out.println("Age:" + emp.getAge());
      System.out.println("Salary:" + emp.getSalary());
      
    emp.raiseSalary();

    System.out.println("New Salary" + emp.getSalary());

    }
}
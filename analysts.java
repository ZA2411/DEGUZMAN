public  class Analysts extends employee {
    
public void analysts(String name, double salary, int age) {
    super(name, salary, age);
}
public double getAnnualBonus() {
    return super.salary * .05; 
}


}

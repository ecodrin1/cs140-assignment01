package assignment01;
public class Employee{
  private Company company;
  private double salary;
  private Person person;
  public Employee(Company business, double sal,Person user){
    company=business;
    salary=sal;
    person=user;
    person.getHistory()[2]= this;
  }
  public Company getCompany(){
    return company;
  }
  public double getSalary(){
    return salary;
  }
  public Person getPerson(){
    return person;
  }
  public void setSalary(double newSal){
    this.salary= newSal;
  }
}

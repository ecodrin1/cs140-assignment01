package assignment01;
public class UniversityStudent{
  private University university;
  private Person person;
  public UniversityStudent(University college, Person user){
    university=college;
    person=user;
    person.getHistory()[1]= this;
  }
  public University getUniversity(){
    return university;
  }
  public Person getPerson(){
    return person;
  }
  public Employee getAJob(Company comp, double startingSalary){
    return new Employee(comp, startingSalary, person);
  }
}

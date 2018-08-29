package assignment01;
public class HighSchoolStudent{
  private HighSchool highSchool;
  private Person person;
  public HighSchoolStudent(HighSchool hs,Person user){
    highSchool=hs;
    person=user;
    person.getHistory()[0]= this;
  }
  public HighSchool getHighschool(){
    return highSchool;
  }
  public Person getPerson(){
    return person;
  }
  public UniversityStudent goToUniversity(University univ){
    return new UniversityStudent(univ,person);
  }
}

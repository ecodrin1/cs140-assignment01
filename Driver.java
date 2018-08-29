package assignment01;
public class Driver{
  public static void main(String[] args){
    Person p1= new Person("April",1 , 4, 1997);
    Person p2= new Person("Brandon", 7, 12, 1991);
    Person p3= new Person("Candace", 21, 2, 1993);
    Person p4= new Person("Damian", 27, 8, 1977);
    HighSchool hs1= new HighSchool("Brooklyn Tech");
    HighSchool hs2= new HighSchool("Boys and Girls HS");
    HighSchool hs3= new HighSchool("Banneker HS");
    HighSchoolStudent hss1= new HighSchoolStudent(hs1, p1);
    HighSchoolStudent hss2= new HighSchoolStudent(hs2, p2);
    HighSchoolStudent hss3= new HighSchoolStudent(hs3, p3);
    University u1= new University("Miami University", "Miami, FL");
    University u2= new University("Cornell University", "Ithaca, NY");
    UniversityStudent us1= hss1.goToUniversity(u1);
    UniversityStudent us2= hss2.goToUniversity(u2);
    Company c1= new Company("Amazon Inc.", "Seattle, WA");
    Employee e1= us1.getAJob(c1, 103995);
    p1.printHistory();
    System.out.println("----------------");
    p2.printHistory();
    System.out.println("----------------");
    p3.printHistory();
    System.out.println("----------------");
    p4.printHistory();
  }
}

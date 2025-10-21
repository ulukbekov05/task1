//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        University university1 = new University();
        university1.setUni_name("peaksoft");
        university1.setCity("bishkek");
        university1.setCount_student(133);

        University university2 = new University();
        university2.setUni_name("MANAS");
        university2.setCity("bishkek");
        university2.setCount_student(789);

        University university3 = new University();
        university3.setUni_name("bgy");
        university3.setCity("bishkek");
        university3.setCount_student(123);

        University[] universities = {university1, university2, university3};
        for (University uni : universities){
            System.out.println(uni);
        }
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< CAR >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        Car car1 = new Car();
        car1.setCar_name("stinger");
        car1.setCompony("hyndiy");
        car1.setColor("blake");
        car1.setPrice(150000);

        Car car2 = new Car();
        car2.setCar_name("k5");
        car2.setCompony("KIA");
        car2.setColor("blake");
        car2.setPrice(190000);


        Car[]  cars   = {car1,   car2};
        for (Car MASH: cars){
           System.out.println(MASH);
       }

    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<SCHOOL>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

       School school = new School();
       school.setName("№5 гимназия");
       school.setCity("Osh");
       school.setStudentCount(489);

        School school2 = new School();
        school2.setName("№3 гимназия");
        school2.setCity("bishkek");
        school2.setStudentCount(479);

        School school3 = new School();
        school3.setName("№№12 мектеп");
        school3.setCity("bishkek");
        school3.setStudentCount(1000);

        School[] schools = {school, school2, school3};
        for (School sch : schools){
            System.out.println(sch);
        }

    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<PERSON>>>>>>>>>>>>>>>>>>>>>>>>>>");

     Person person = new Person();
     person.setName("muhamad");
     person.setAge(16);
     person.setProfession("IT");

        Person person2 = new Person();
        person2.setName("nursultan");
        person2.setAge(16);
        person2.setProfession("IT");

        Person[] people = {person2, person};

        for (Person f: people){
            System.out.println(f);
        }












        





    }
}
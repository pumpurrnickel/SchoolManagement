import java.util.List;
import java.util.ArrayList;

public class SchoolManagement {
    public static void main(String[] args) {

         Teacher anya = new Teacher(1, "Anya", 500);
         Teacher yor = new Teacher(2, "Yor", 700);
         Teacher loid = new Teacher(3, "Loid", 600);

         List<Teacher> teacherList = new ArrayList<>();
         teacherList.add(anya);
         teacherList.add(yor);
         teacherList.add(loid);

         Student miku = new Student(1, "Miku", 4);
         Student gumi = new Student(2, "Gumi", 12);
         Student kaito = new Student(3, "Kaito", 5);

         List<Student> studentList = new ArrayList<>();

         studentList.add(miku);
         studentList.add(gumi);
         studentList.add(kaito);

         School eden = new School(teacherList, studentList);

         Teacher henderson = new Teacher(6, "Henderson", 900);
         eden.addTeachers(henderson);

         miku.payFees(5000);
         gumi.payFees(6000);
         System.out.println("Eden College of Degenerates has earned a total of " + eden.getTotalMoneyEarned() + " dollaroonies.");

         System.out.println("---Making School Pay salary---");
         yor.receiveSalary(yor.getSalary());
         System.out.println("Eden College has given a salary to " + yor.getName() +
         " and now has " + eden.getTotalMoneyEarned());

         henderson.receiveSalary(henderson.getSalary());
         System.out.println("Eden College has given a salary to " + henderson.getName() +
         " and now has " + eden.getTotalMoneyEarned());

         System.out.println(gumi);
         loid.receiveSalary(loid.getSalary());
         System.out.println(loid);
    }
}

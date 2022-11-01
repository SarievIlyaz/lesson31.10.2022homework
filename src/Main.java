import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.name="Ilim";
//        student.surname="Shabdanov";
//        student.age=18;
//        System.out.println(student.name+" "+student.surname+" "+student.age);
//        student.getInfo();
//        student.addStudent();
//        student.deleteStudent();
//
//        Student student1=new Student();
//        student1.name="Baiysh";
//        student1.surname="Orozaliev";
//        student1.age=19;
//        System.out.println(student.name+" "+student.surname+" "+student.age);
//        student1.getInfo();


//        Telefon telefon = new Telefon();
//        telefon.name="Samsung";
//        telefon.model="Note-22";
//        telefon.baasy=20000;
//        System.out.println(telefon.name+" "+telefon.model+" "+telefon.baasy);

//        Scanner scanner = new Scanner(System.in);
//        Programmer programmer = new Programmer();
//        programmer.name=scanner.nextLine();
//        programmer.surname=scanner.nextLine();
//        programmer.age=scanner.nextInt();
//        System.out.println("Name: "+programmer.name+"\nSurname: "+
//                programmer.surname+"\nDate of birth: "+programmer.getAge1());
//        programmer.getAge();

        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        triangle.a = scanner.nextInt();
        triangle.b = scanner.nextInt();
        triangle.c = scanner.nextInt();
        triangle.area();

    }
}
package Program;

import Classes.Student;
import Classes.StudentGroupList;
import Classes.StudentGroupMap;
import Classes.StudentGroupSet;
import interfeaces.IGroup;

import java.util.Scanner;

public class Main {
    public static int menu(){
        System.out.println("select a choice:");
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. List");
        System.out.println("2. Map");
        System.out.println("3. Set");
        System.out.println("4. Exit");
        do{
            System.out.print("your choice : ");
            choice=scanner.nextInt();
        }while(choice<1||choice>4);
        return choice;
    }
    public static int subMenu(){
        System.out.println("select a choice:");
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. add student");
        System.out.println("2. Remove student");
        System.out.println("4. List students");
        System.out.println("5. add mark to a student");
        System.out.println("6. Calculate a student score");
        System.out.println("7. previous menu");
        do{
            System.out.print("your choice : ");
            choice=scanner.nextInt();
        }while(choice<1||choice>7);
        return choice;
    }

    public static void main(String[] args) {



        IGroup group=new StudentGroupList();
        int choice,subChoice;
        do{
            choice=menu();
            switch (choice) {
                case 1:
                    group=new StudentGroupList();
                    break;
                    case 2:
                    group=new StudentGroupMap();
                    break;
                    case 3:
                    group=new StudentGroupSet();
                    break;
                case 4:
                    System.exit(0);
            }
            do{
                subChoice=subMenu();
                switch (subChoice) {
                    case 1:
                        Student student = new Student();
                        //initialize the student properties
                        student.getStudentInfo();
                        group.addStudent(student);
                        break;
                    case 2:
                        break;
                }
            }while(subChoice!=7);
        }while(choice!=0);

    }
}
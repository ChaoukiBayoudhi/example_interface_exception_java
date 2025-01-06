package Classes;

import Exceptions.StudentException;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Student {
    @NonNull
    private int id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private String groupName;
    private List<Mark> marks=new ArrayList<>();

    public void getStudentInfo(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("id ? ");
            id=scanner.nextInt();
            System.out.println("name ?");
            String name= scanner.nextLine();
            if(name.isEmpty()||name.isBlank())
                throw new StudentException("Invalid name the name is required");
            System.out.println("email ?");
            email= scanner.next();
            if(!(email.contains("@")&&!email.contains(".")))
                throw new StudentException("Invalid email: The email must contains @ and the dot.");
            System.out.println("group name ?");
            groupName= scanner.next();
        }catch(StudentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();//to get more information about the exception (execution trace)
        }
    }
}

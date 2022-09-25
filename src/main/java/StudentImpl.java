import java.util.Random;

public class StudentImpl implements Student
{

    private String firstName = "rfthdfhdfjfghjghj first name";

    private int age = 12;

    public int getAge() {
        return age;
    }

    private String getLabel() {
        return "myBranch";
    }

    @Override
    public String getStudentName() {
        Random random =new Random();
        random.doubles();
        return null;
    }
}

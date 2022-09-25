import java.util.Random;

public class StudentImpl implements Student
{

    private int age = 12;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentImpl() {
    }

    @Override
    public String getStudentName() {
        Random random =new Random();
        random.doubles();
        return null;
    }
}

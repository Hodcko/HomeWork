import java.security.SecureRandom;
import java.util.List;

public class University {
    private List<Student> allStudents;
    private String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public List<Student> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(List<Student> allStudents) {
        this.allStudents = allStudents;
    }

    public String randomName( int lenth ){
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder( lenth );
        for( int i = 0; i < lenth; i++)
            sb.append( symbols.charAt( random.nextInt(symbols.length()) ) );
        return sb.toString();
    }

}

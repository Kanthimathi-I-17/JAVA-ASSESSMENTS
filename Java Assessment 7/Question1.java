import java.util.regex.Pattern;

final class finalClass extends Exception{
    final String panCardNo = "ABC1234567";

}

public class Question1 {
    public static void main(String[] args){
        try {
            String regex = "[A-Z]{3}[0-9]{7}";
            Pattern p = Pattern.compile(regex);
            finalClass f =new finalClass();
            throw new finalClass();


        }
        catch (finalClass e){
            System.out.println("The PAN card format is wrong");
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Name {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name please:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        if (count(name) > -1){
            System.out.println(name + " => " + count(name));
        }
        else {
            System.out.println("Incorrect Name");
        }

    }

    public static int count (String name) {
        if (name.length() >= 1){
            int sum = 0;

            for (int i=0; i<name.length(); i++)
            {
                if (name.charAt(i) >= 97 && name.charAt(i) <= 122){
                    sum += name.charAt(i) - 96;
                    continue;
                }
                if (name.charAt(i) >= 65 && name.charAt(i) <= 90){
                    sum+=name.charAt(i)-64;
                    continue;
                }
                if( !Character.isWhitespace(name.charAt(i)) && name.charAt(i) != '`' && name.charAt(i) != '´')
                {
                    return -1;
                }
            }
            return sum;
        }
        else {
            return -1;
        }
    }
}

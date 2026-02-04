
import java.util.stream.IntStream;

public class StudentAThirdChange {
    public String wordRepet(String words){
        StringBuilder sb = new StringBuilder(words);
        IntStream.range(0, 2).forEach(n -> sb.append(" ").append(words));
        return sb.toString();
    }
}

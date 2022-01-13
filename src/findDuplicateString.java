import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.testng.Assert.assertTrue;

public class findDuplicateString {

    String[] values;

    public void init(String[] data) {
        values = data;
    }

    private String[] duplicatedCharacters() {
        String[] resp = new String[values.length];
        String[] tmp = new String[values.length];

        for (int i = 0; i < values.length; i++) {
            if (findValueAlreadyInArray(tmp,values[i])) {
                resp[i] = values[i];
            }else{
                tmp[i] = values[i];
            }
        }

        return resp;
    }

    private boolean findValueAlreadyInArray(String[] finder, String value) {
        for (String s : finder) {
            if (Objects.equals(s, value)) {
                return true;
            }
        }

        return false;
    }

    @Test
    public void testArrayValueWith2() {
        String[] data = new String[]{"A", "B", "A"};
       findDuplicateString fds = new findDuplicateString();
       fds.init(data);
        System.out.print(Arrays.toString(fds.duplicatedCharacters()));
       assertTrue(true);
    }
}

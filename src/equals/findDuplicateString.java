package equals;

import java.util.Objects;

public class
findDuplicateString {

    String[] values;

    public findDuplicateString(String[] data) {
        this.values = data;
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
}

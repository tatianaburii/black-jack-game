package dto;

import java.util.Locale;
import java.util.ResourceBundle;

public class Bundle {
    public static ResourceBundle getBundle(Locale locale){
        return ResourceBundle.getBundle("res", locale);
    }
}

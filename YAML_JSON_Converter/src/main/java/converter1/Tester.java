package converter1;
import converter1.Converter;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Tester {


    public static void main(String[] args)throws IOException, URISyntaxException {
        Converter converter = new Converter();
         String path2 = new File(Tester.class.getProtectionDomain().getCodeSource().getLocation()
                .toURI()).getPath();
        System.out.println(path2);
//        String path = "/Users/tetyanaburii/Desktop/MyFirstProject/YAML_JSON_Converter/src/main/java/tester";
//        converter.getFilePath(path);
    }

}

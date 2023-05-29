package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCopyApp {

    public static void main(String[] args) {
        byte[] imgBytes;

        Path sourcePath = Paths.get("C:/tmp/Protective_thermal_Appia.jpg");
        Path targetFile = Paths.get("C:/tmp/Protective_thermal_Appia2.jpg");

        try {
            imgBytes = Files.readAllBytes(sourcePath);
            Files.write(targetFile, imgBytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package JacksonManualParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JacksonManualExample {
    private JsonNode rootJSON;

    public JacksonManualExample(String fileName){

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            rootJSON = objectMapper.readTree(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean getSuccess(){return rootJSON.path("success").asBoolean();}
}

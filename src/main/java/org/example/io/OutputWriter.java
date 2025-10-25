package org.example.io;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.MSTResult;
import java.io.File;

public class OutputWriter {
    public static void saveResult(String path, MSTResult prim, MSTResult kruskal) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        var output = new Object() {
            public MSTResult primResult = prim;
            public MSTResult kruskalResult = kruskal;
        };
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path), output);
    }
}

package com.softserve.education.lib;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Saver {
    public static Path createFile(String filename, String header, String charset) throws IOException {
        Path file = Paths.get(filename);
        List<String> lines = Arrays.asList(header);
        Files.write(file, lines, Charset.forName(charset));
        return file;
    }

    public static void save(Path file, Object o) {
        try {
            Files.write(file, (o.toString() + "\n").getBytes(), StandardOpenOption.APPEND);
            System.out.println(o.toString());
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

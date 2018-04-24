package com.softserve.education.lib;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Filer {
    public static Path createFile(String filename, String header, String charset) throws IOException {
        Path file = Paths.get(filename);
        List<String> lines = Collections.singletonList(header);
        Files.write(file, lines, Charset.forName(charset));
        return file;
    }
}

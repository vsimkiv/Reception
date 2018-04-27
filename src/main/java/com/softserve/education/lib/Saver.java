package com.softserve.education.lib;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Saver {
    public static void save(Path file, Object o) {
        try {
            Files.write(file, (o.toString() + "\n").getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

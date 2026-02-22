package com.example.oppsconcept.OppsToEnumExamples.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithReaderTest {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while((line = reader.readLine()) != null);
            System.out.println(line);
        } catch ( IOException e){
            System.out.println("IOEXCEPTIONCAUGHT" + e.getMessage());
        }
    }
}

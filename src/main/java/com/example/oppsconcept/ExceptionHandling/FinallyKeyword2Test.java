package com.example.oppsconcept.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyKeyword2Test {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("IOS EXception Found " + e.getMessage());
        } finally {
            try{
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e){
                System.out.println("Error Closing Reader " + e.getMessage());
            }
        }
    }
}

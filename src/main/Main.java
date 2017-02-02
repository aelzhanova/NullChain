package main;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static String inputFilePath = ".//src//files//nullChain.txt";
    public static String outputFilePath = ".//src//files//nullChainLength.txt";

    public static void main(String[] args) throws IOException {

        try(FileWriter writer = new FileWriter(outputFilePath, false))
        {
            NullChain nullChain = new NullChain();
            int nullChainLength = nullChain.NullChainLength(inputFilePath);
            System.out.println(nullChainLength);
            writer.write(Integer.toString(nullChainLength));
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}

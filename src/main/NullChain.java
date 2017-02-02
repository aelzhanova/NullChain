package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NullChain {

    public int NullChainLength(String filePath)
    {
        int k = 0;
        int max=0;
        try(FileReader reader = new FileReader(filePath))
        {
            // читаем посимвольно

            int c;
            while((c=reader.read())!=-1){
                char s = (char)c;
                if (s =='0')
                {
                    k = k+1;
                }
                else
                {
                    if (k > max)
                    {
                        max = k;
                    }
                    k = 0;
                }
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return max;
    }
}

package com.stevelinz.sales.impl;

import com.stevelinz.sales.iface.ISale;
import com.stevelinz.sales.iface.ISalesInput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileInput implements ISalesInput {
    public FileInput() {}

    @Override
    public List<ISale> getSales() {
        try {
            return fileDisplay();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

   public List<ISale> fileDisplay() throws IOException {
       // variable declaration
       int ch = 0;

       // check if File exists or not
       FileReader fr=null;
       try
       {
           fr = new FileReader("sales.txt");
       }
       catch (FileNotFoundException fe)
       {
           System.out.println("File not found");
       }

       // read from FileReader till the end of file
       while (true) {
           try {
               if ((ch = fr.read()) == -1) break;
           } catch (IOException e) {
               e.printStackTrace();
           }
           System.out.print((char)ch);
       }

       // close the file
       fr.close();
       return null;
   }

}


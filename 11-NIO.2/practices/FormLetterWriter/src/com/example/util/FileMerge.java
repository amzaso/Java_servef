package com.example.util;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.CREATE;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileMerge {

    private Path form;
    private Path list;
    private String nameToken = "<NAME>";
    private Pattern p = Pattern.compile(nameToken);
    private List<String> formLetter;
    private List<String> customLetter;
    private List<String> nameList;
    private int matchStringIndex;

    public FileMerge(Path form, Path list) {
        this.form = form;
        this.list = list;
    }

    // This method takes the form and merges it with the list
    // It generates new files with the names from the list
    public void writeMergedForms() throws IOException {
        // Your code to complete this method goes here
        Charset cs = Charset.defaultCharset();
        formLetter = Files.readAllLines(form, cs);
        nameList = Files.readAllLines(list, cs);

        for (String name:nameList){
            customLetter = new ArrayList<String>();
            String[] partes = name.split(" ");
            String nomfich = "";
            nomfich += partes[0];
            for (int i = 1; i<partes.length; i++)
            {
                nomfich += "_"+partes[i];
            }
            nomfich += ".txt";
            
            Path raiz = form.subpath (0, form.getNameCount()-1);
            Path sub = Paths.get("/");
            
            sub = sub.resolve(raiz);
            for (String linea:formLetter){
                if (hasToken(linea))
                {
                    linea = mergeName(linea, name);
                }
                customLetter.add(linea);
            }
            Files.write(sub.resolve(nomfich), customLetter, cs, CREATE);
            System.out.println("Creado fichero: "+nomfich);
        }
    }

    // Produce a new string in the letter that replaces the token with the name
    private String mergeName(String form, String name) {
        Matcher m = p.matcher(form);
        return (m.replaceFirst(name));
    }

    // Determine if the String has the token
    private boolean hasToken(String s) {
        Matcher m = p.matcher(s);
        return m.find();
    }
}
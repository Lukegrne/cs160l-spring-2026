package edu.sdsu.cs160l.university.lab6.course;

import java.util.*;

public class CS150 implements Course{
    private CS150(){}

    public static CS150 getInstance(){
        //TODO make this singleton
        return null;
    }
    @Override
    public String courseName() {
        return "CS150";
    }

    @Override
    public List<String> courseDescription() {
        return Arrays.asList("Java Programming", "ZyBooks");
    }

    @Override
    public Set<String> prerequisites() {
        return new HashSet<>();
    }
}

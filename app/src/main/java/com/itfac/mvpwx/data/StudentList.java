package com.itfac.mvpwx.data;

/*
 * Created by Kasunka Gallage on 2020-06-28,
 */

import java.util.ArrayList;

public class StudentList {

    private static final StudentList ourInstance = new StudentList();


    private ArrayList<String> studentsList = new ArrayList<>();

    public static StudentList getInstance() {
        return ourInstance;
    }

    private StudentList() {
        studentsList.add("Sahan Thiranjaya");
        studentsList.add("Amila");
        studentsList.add("Asanka");
        studentsList.add("SChamini Premathilaka");
        studentsList.add("Chamodi Kavindaya");
    }

    public ArrayList<String> getStudentsList (){
        return studentsList;
    }

    public void addName(String name){
        studentsList.add(name);
    }

}

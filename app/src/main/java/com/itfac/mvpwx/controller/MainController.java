package com.itfac.mvpwx.controller;

/*
 * Created by Kasunka Gallage on 2020-06-28,
 */

import com.itfac.mvpwx.data.StudentList;

public class MainController {


    public String showGreetings(String enteredName){
        StudentList.getInstance().addName(enteredName);

        String manipulatedText = "Hello " + enteredName +"!";
        return manipulatedText;
    }
}

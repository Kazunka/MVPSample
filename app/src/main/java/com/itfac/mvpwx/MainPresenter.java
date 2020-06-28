package com.itfac.mvpwx;

/*
 * Created by Kasunka Gallage on 2020-06-28,
 */

import com.itfac.mvpwx.data.StudentList;

import java.util.ArrayList;

public class MainPresenter {

    private final MainView mainView ;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        showStudentList();
    }


    public void showGreetings(String enteredName){
        StudentList.getInstance().addName(enteredName);


        String manipulatedText = "Hello " + enteredName +"!";
        mainView.setManipulatedText(manipulatedText);

        showStudentList();
    }

    private void showStudentList() {

        ArrayList<String> stringArrayList = StudentList.getInstance().getStudentsList();

        String listOfStudents = "";

        for (String student : stringArrayList){
            listOfStudents = listOfStudents + student +"\n";
        }

       mainView.setStudentList(listOfStudents);
    }
}

package com.itfac.mvpwx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.itfac.mvpwx.controller.MainController;
import com.itfac.mvpwx.data.StudentList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sampleButton;
    private TextView studentName;
    private TextView studentListTxt;

    private EditText inputName;

    private MainController mainController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainController = new MainController();

        initViews();
        initActions();

        showStidentList();
    }

    private void initViews(){
        sampleButton = findViewById(R.id.sample_button);
        studentName = findViewById(R.id.sample_text);
        studentListTxt = findViewById(R.id.student_list);
        inputName = findViewById(R.id.input_edt);
    }

    private void initActions(){
        sampleButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String nameSting = inputName.getText().toString();
        String manipulatedText = mainController.showGreetings(nameSting);
        studentName.setText(manipulatedText);
        showStidentList();
    }

    private void showStidentList(){
        ArrayList<String> stringArrayList = StudentList.getInstance().getStudentsList();


        String listOfStudents = "";

        for (String student : stringArrayList){
            listOfStudents = listOfStudents + student +"\n";
        }

        studentListTxt.setText(listOfStudents);
    }
}

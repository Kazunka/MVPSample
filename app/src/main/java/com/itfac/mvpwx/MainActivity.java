package com.itfac.mvpwx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener, MainView {

    private Button sampleButton;
    private TextView studentName;
    private TextView studentListTxt;

    private EditText inputName;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initViews();
        initActions();

        presenter = new MainPresenter(this);
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
        presenter.showGreetings(nameSting);
    }

    @Override
    public void setManipulatedText(String manipulatedText) {
        studentName.setText(manipulatedText);
    }

    @Override
    public void setStudentList(String studentList) {
        studentListTxt.setText(studentList);
    }
}

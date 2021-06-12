package com.example.bioapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.hardware.input.InputManager;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.bioapp.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binder;

    private EditText type_hobby;
    private TextView added_hobby;
    private Button button;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        type_hobby = findViewById(R.id.type_hobby);
        added_hobby= findViewById(R.id.added_hobby);
        button= findViewById(R.id.button);


//        binder = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        binder.invalidateAll();

        binder = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binder.invalidateAll();

        

    }


    public void show_added_hobby(View view) {

        added_hobby.setText(type_hobby.getText().toString().trim());
        type_hobby.setVisibility(View.VISIBLE );

//
//        binder.typeHobby.setText(String.format("New Hobby%s: ",binder.addedHobby.getText().toString().trim()));
//        binder .addedHobby.setVisibility(View.VISIBLE);


//        show_added_hobby.setText(String.format("New Hobby%s: ", add_hobby.getText().toString().trim()));
//        show_added_hobby.setVisibility(View.VISIBLE);
//        InputMethodManager manage_Keyboard = (InputMethodManager) getSystemService(this. INPUT_METHOD_SERVICE);
//        manage_Keyboard.hideSoftInputFromWindow(view.getWindowToken(), 0);


//        binder.addHobby.setText(String.format(String.format("New Hobby %s :", add_hobby.getText().toString().trim())));
//        binder.addHobby.setVisibility(View.VISIBLE);
//        InputMethodManager manage_keyboard = (InputMethodManager) getSystemService(this.INPUT_METHOD_SERVICE);
//        manage_keyboard.hideSoftInputFromWindow(view.getWindowToken(),0);


    }
}
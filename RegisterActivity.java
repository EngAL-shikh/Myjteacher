package com.example.myteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText user,fname,lname,level,mail,password;
    Button register;
    Databeas db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        user=findViewById(R.id.input_name);
        fname=findViewById(R.id.input_firstname);
        lname=findViewById(R.id.input_lastname);
        level=findViewById(R.id.input_Educational_level);
        mail=findViewById(R.id.input_email);
        password=findViewById(R.id.input_password);
        register=findViewById(R.id.signup);


        db=new Databeas(this);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=user.getText().toString();
                String Fname=fname.getText().toString();
                String Lname=lname.getText().toString();
                String Educational=level.getText().toString();
                String email=mail.getText().toString();
                String Password=password.getText().toString();
                if (username.equals("")||Fname.equals("")||Lname.equals("")||Educational.equals("")||email.equals("")||Password.equals("")){
                    Toast.makeText(RegisterActivity.this, "Fields are empty", Toast.LENGTH_SHORT).show();
                }else {
                    Boolean chkemail=db.chkemail(email);
                    if (chkemail) {
                        Boolean insert = db.insert(username, Fname, Lname, Educational, email, Password);
                        if (insert)
                            Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(getApplicationContext(), Educational_level_activity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(RegisterActivity.this, "Email Already exists", Toast.LENGTH_SHORT).show();
                    }
                }
                Toast.makeText(RegisterActivity.this, "Pass", Toast.LENGTH_SHORT).show();

            }
        });



    }

}
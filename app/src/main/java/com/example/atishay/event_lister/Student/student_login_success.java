package com.example.atishay.event_lister.Student;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.atishay.event_lister.Config;
import com.example.atishay.event_lister.Events_list_student.Event_lister_Activity;
import com.example.atishay.event_lister.Login;
import com.example.atishay.event_lister.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class student_login_success extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.event_card);
        imageButton=findViewById(R.id.logout);

        // this is for the events listing
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Event_lister_Activity.class);
                startActivity(intent);
            }
        });

        //to logout
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Config.clearSharedPreferences(getApplicationContext());
                Config.finishAllOpenNewActivity(getApplicationContext(), new Login());
            }
        });
    }
}

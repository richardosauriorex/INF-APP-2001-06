package mx.unam.PassList;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    public EditText Name;
    public EditText LastName;
    public EditText LastMotherName;
    public EditText Email;
    public EditText Password;
    public Button BtnSend;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //Objects
        Name = (EditText)findViewById(R.id.Name);
        LastName = (EditText)findViewById(R.id.LastName);
        LastMotherName = (EditText)findViewById(R.id.LastMotherName);
        Email = (EditText)findViewById(R.id.Email);
        Password = (EditText)findViewById(R.id.Password);
        BtnSend = (Button)findViewById(R.id.Send);
        //Start function onClick BtnSend
        BtnSend.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {

            }
        });
        //End function
    }
}

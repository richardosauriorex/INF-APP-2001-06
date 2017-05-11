package mx.unam.PassList;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//Intent intent = new Intent(MainActivity.this, SaludoActivity.class);
   //     Bundle Paquete = new Bundle();
     //   Paquete.putString("NOMBRE", txtNombre.getText().toString());
       // intent.putExtras(Paquete);
       // startActivity(intent);
public class Login extends AppCompatActivity {
     public EditText Email;
     public EditText Password;
     public Button BtnSend;
     public TextView Register;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_login);
         //Objects
         Email = (EditText) findViewById(R.id.Email);
         Password = (EditText) findViewById(R.id.Password);
         BtnSend = (Button) findViewById(R.id.Send);
         Register = (TextView) findViewById(R.id.Register);
         //start btnSend click listener function
         BtnSend.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {

             }
         });
         //end function
         //start btnSend click listener function
         Register.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
                 Intent intent = new Intent(Login.this, Register.class);
                 startActivity(intent);
             }
         });
         //end function

     }
 }



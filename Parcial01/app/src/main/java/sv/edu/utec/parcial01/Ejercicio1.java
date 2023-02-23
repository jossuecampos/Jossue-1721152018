package sv.edu.utec.parcial01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Ejercicio1 extends AppCompatActivity {
    EditText txtUser, txtPassword;
    Button btnIniciarSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        txtUser= findViewById(R.id.txtUser);
        txtPassword=findViewById(R.id.txtPassword);
        btnIniciarSesion=findViewById(R.id.btnIniciarSesion);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inicio_de_sesion();
            }
        });
    }
    public void inicio_de_sesion(){
        String usuario,Contra;
        usuario=txtUser.getText().toString();
        Contra=txtPassword.getText().toString();
        if (usuario.equals("parcialETps1") && Contra.equals("p4rC14l#tp$")){
            Intent intentar= new Intent();
            intentar=new Intent(this,LoginExitoso.class);
            startActivity(intentar);
        }else{
            Toast.makeText(this,"Contraseña y usuario no son correctos",Toast.LENGTH_SHORT).show();
        }
    }
}
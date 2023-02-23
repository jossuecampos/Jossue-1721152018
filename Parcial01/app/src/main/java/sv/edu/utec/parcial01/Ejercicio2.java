package sv.edu.utec.parcial01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ejercicio2 extends AppCompatActivity {
    EditText Peso,Estatura;
    Button btnCalcular;
    TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        Peso=findViewById(R.id.txtpeso);
        Estatura=findViewById(R.id.txtEstatura);
        btnCalcular=findViewById(R.id.btnCalcular);
        mensaje=findViewById(R.id.txtviedatos);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IMC();
            }
        });
    }
    public void IMC(){
        try {
            Double peso,estatura,IMC;
            String msj="";
            peso=Double.parseDouble(Peso.getText().toString());
            estatura=Double.parseDouble(Estatura.getText().toString());
            IMC=peso/(estatura*estatura);
            if (IMC<10.5){
                msj="Criticamente bajo de peso";
            } else if (IMC>=10.5 && IMC<15.9) {
                msj="Severamente bajo de peso";
            }else if (IMC>=15.9 && IMC<18.5) {
                msj="Bajo de peso";
            }else if (IMC>=18.5 && IMC<25) {
                msj="Normal";
            }else if (IMC>=25 && IMC<30) {
                msj="Sobrepeso";
            }else if (IMC>=30 && IMC<35) {
                msj="Obesidad Clase 1: Moderadamente obeso";
            }else if (IMC>=35 && IMC<40) {
                msj="Obesidad Clase 2: Severamente Obeso";
            } else if (IMC>50) {
                msj="Obesidad clase 3: Criticamente obeso";
            }
            mensaje.setText(""+msj);
        }
        catch(Exception ex){
            Toast.makeText(this,"ingrese un numero",Toast.LENGTH_SHORT).show();
        }
    }
}
package sv.edu.utec.parcial01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button boton1, boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantallas("Ejercicio1");
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantallas("Ejercicio2");
            }
        });
    }

    public void pantallas(String msj) {
        Intent intentar = new Intent();
        if (msj.equals("Ejercicio1")) {
            intentar = new Intent(this, Ejercicio1.class);
        } else if (msj.equals("Ejercicio2")) {
            intentar = new Intent(this, Ejercicio2.class);
        }
        startActivity(intentar);
    }
}
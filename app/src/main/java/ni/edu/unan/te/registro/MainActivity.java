package ni.edu.unan.te.registro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String valores[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        final TextView tvNombreC= (TextView) findViewById(R.id.tvNombreCompleto);
        final TextView tvTelefono= (TextView) findViewById(R.id.tvTelefono);
        final TextView tvEmail= (TextView) findViewById(R.id.tvEmail);
        final TextView tvDescricion= (TextView) findViewById(R.id.tvDescripcion);
        final DatePicker dpFechaNac= (DatePicker) findViewById(R.id.dpFecha);
        Button btnSiguient = (Button) findViewById(R.id.btnNext);




        btnSiguient.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this,Confirmacion.class);
                i.putExtra("nombre",tvNombreC.getText().toString());
                i.putExtra("fechaNac",dpFechaNac.getDayOfMonth()+"- "+dpFechaNac.getMonth()+"- "+dpFechaNac.getYear());
                i.putExtra("tel",tvTelefono.getText().toString());
                i.putExtra("mail",tvEmail.getText().toString());
                i.putExtra("desc",tvDescricion.getText().toString());

                startActivity(i);
            }
        });



    }
}

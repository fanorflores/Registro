package ni.edu.unan.te.registro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirmacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        Bundle val = getIntent().getExtras();

        TextView tvNombreC= (TextView) findViewById(R.id.tvNombreconf);
        TextView tvTelefono= (TextView) findViewById(R.id.tvTelefonoConf);
        TextView tvEmail= (TextView) findViewById(R.id.tvEmailConf);
        TextView tvDescricion= (TextView) findViewById(R.id.tvDescripcionConf);
        TextView tvFEchaNac= (TextView) findViewById(R.id.tvFechaConf);

        tvNombreC.setText(val.getString("nombre"));
        tvTelefono.setText(val.getString("tel"));
        tvEmail.setText(val.getString("mail"));
        tvDescricion.setText(val.getString("desc"));
        tvFEchaNac.setText(val.getString("fechaNac"));

        Button btnEditar = (Button) findViewById(R.id.btnEditar);

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Confirmacion.super.onBackPressed();
            }
        });

    }
}

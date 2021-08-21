package br.com.johne.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameEd;
    private EditText phoneEd;
    private EditText mailEd;
    private CheckBox mailCb;
    private RadioButton genderMaleRb;
    private RadioButton genderFemaleRb;
    private EditText cityEd;
    private Spinner statesSp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEd = findViewById(R.id.nameEd);
        phoneEd = findViewById(R.id.phoneEd);
        mailEd = findViewById(R.id.mailEd);
        mailCb = findViewById(R.id.mailCb);
        genderMaleRb = findViewById(R.id.genderMaleRb);
        genderFemaleRb = findViewById(R.id.genderFemaleRb);
        cityEd = findViewById(R.id.cityEd);
        statesSp = findViewById(R.id.statesSp);

        Button saveBt = findViewById(R.id.saveBt);
        saveBt.setOnClickListener(view -> {
            Formulario form = new Formulario(nameEd.getText().toString(),
                    phoneEd.getText().toString(),
                    mailEd.getText().toString(),
                    true,
                    genderMaleRb.isChecked() ? genderMaleRb.getText().toString() : genderFemaleRb.getText().toString(),
                    cityEd.getText().toString(),
                    ((TextView) statesSp.getSelectedView()).getText().toString() );

            Toast.makeText(getApplicationContext(), form.toString(), Toast.LENGTH_LONG).show();
        });
    }

}
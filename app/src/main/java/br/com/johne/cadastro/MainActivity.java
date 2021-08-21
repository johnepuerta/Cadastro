package br.com.johne.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameEd;
    private EditText phoneEd;
    private EditText mailEd;
    private CheckBox mailCb;
    private RadioGroup radioGroup;
    private RadioButton genderMaleRb;
    private RadioButton genderFemaleRb;
    private EditText cityEd;
    private Spinner statesSp;
    private Button saveBt;
    private Button clearBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEd = findViewById(R.id.nameEd);
        phoneEd = findViewById(R.id.phoneEd);
        mailEd = findViewById(R.id.mailEd);
        mailCb = findViewById(R.id.mailCb);
        radioGroup = findViewById(R.id.radioGroup);
        genderMaleRb = findViewById(R.id.genderMaleRb);
        genderFemaleRb = findViewById(R.id.genderFemaleRb);
        cityEd = findViewById(R.id.cityEd);
        statesSp = findViewById(R.id.statesSp);

        saveBt = findViewById(R.id.saveBt);
        clearBt = findViewById(R.id.cleanBt);

        saveBt.setOnClickListener(click -> {
            Formulario form = new Formulario(nameEd.getText().toString(),
                    phoneEd.getText().toString(),
                    mailEd.getText().toString(),
                    mailCb.isChecked(),
                    genderMaleRb.isChecked() ? genderMaleRb.getText().toString() : genderFemaleRb.getText().toString(),
                    cityEd.getText().toString(),
                    ((TextView) statesSp.getSelectedView()).getText().toString() );

            Toast.makeText(getApplicationContext(), form.toString(), Toast.LENGTH_LONG).show();
        });

        clearBt.setOnClickListener(click -> {
            nameEd.setText("");
            phoneEd.setText("");
            mailEd.setText("");
            mailCb.setChecked(false);
            radioGroup.check(genderMaleRb.getId());
            cityEd.setText("");
            statesSp.setSelection(0);
            nameEd.requestFocus();
        });
    }

}
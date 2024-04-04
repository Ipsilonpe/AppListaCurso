package devandroid.yp.applistacurso.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import devandroid.yp.applistacurso.R;
import devandroid.yp.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


            pessoa = new Pessoa();
            pessoa.setPrimeiroNome("Yuri");
            pessoa.setSobreNome("Paranhos");
            pessoa.setCursoDesejado("Android");
            pessoa.setTelefoneContato("61999999999");

            

    }
}
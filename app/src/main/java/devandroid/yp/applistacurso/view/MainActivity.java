package devandroid.yp.applistacurso.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import devandroid.yp.applistacurso.R;
import devandroid.yp.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;
    String dadosPessoa;
    String dadosOutraPessoa;

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

            outraPessoa = new Pessoa();
            outraPessoa.setPrimeiroNome("Clara");
            outraPessoa.setSobreNome("de Neve");
            outraPessoa.setCursoDesejado("java");
            outraPessoa.setTelefoneContato("61888888888");

            dadosPessoa = "Primeiro Nome: ";
            dadosPessoa += pessoa.getPrimeiroNome();
            dadosPessoa += " Sobrenome: ";
            dadosPessoa += pessoa.getSobreNome();
            dadosPessoa += " Curso Desejado: ";
            dadosPessoa += pessoa.getCursoDesejado();
            dadosPessoa += " Telefone de contato: ";
            dadosPessoa += pessoa.getTelefoneContato();

            dadosOutraPessoa =  "Primeiro Nome: ";
            dadosOutraPessoa += outraPessoa.getPrimeiroNome();
            dadosOutraPessoa += " Sobrenome: ";
            dadosOutraPessoa += outraPessoa.getSobreNome();
            dadosOutraPessoa += " Curso Desejado: ";
            dadosOutraPessoa += outraPessoa.getCursoDesejado();
            dadosOutraPessoa += " Telefone de Contato: ";
            dadosOutraPessoa += outraPessoa.getTelefoneContato();

            int parada = 0;


    }
}
package br.usjt.ads20.calculadoramvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.usjt.ads20.calculadoramvc.Model.Calculadora;

public class MainActivity extends AppCompatActivity {
    private EditText valor1, valor2, operador, resultado;
    private Calculadora model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        operador = findViewById(R.id.operador);
        resultado = findViewById(R.id.resultado);
        model = new Calculadora();


    }

    public void calcular(View view) {
        double pValor1 = Double.parseDouble(valor1.getText().toString());
        double pValor2 = Double.parseDouble(valor2.getText().toString());
        String op = operador.getText().toString();
        model.setValor1(pValor1);
        model.setValor2(pValor2);
        model.setOperador(op);
        model.calculo();
        double pResultado = model.getResultado();
        resultado.setText(pResultado+"");
    }
}
package br.usjt.ads20.calculadoramvc.Model;

public class Calculadora {
    double valor1, valor2, resultado;
    String operador;

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public void calculo(){
        switch (operador){
            case "+": resultado = valor1+valor2; break;
            case "-": resultado = valor1-valor2; break;
            case "*": resultado = valor1*valor2; break;
            case "/":
                if (valor2==0){
                    resultado = Double.NaN;
                    } else {
                    resultado = valor1/valor2;
                } break;
            default:resultado = Double.NaN;

        }

    }

}

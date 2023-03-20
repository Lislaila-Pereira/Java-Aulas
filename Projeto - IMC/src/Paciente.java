public class Paciente {
    double peso;
    double altura;
    
    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    private double calcularIMC() {
        double IMC = peso / (altura * altura);
        return IMC;
    }

    public String Diagnostico(){
        double IMC = calcularIMC();
        String diagnostico;
        if (IMC < 16) {
            diagnostico = "Baixo peso muito grave";
        } else if (IMC < 16.99) {
            diagnostico = "Baixo peso grave";
        } else if (IMC < 18.49) {
            diagnostico = "Baixo peso";
        } else if (IMC < 24.99) {
            diagnostico = "Peso normal";
        } else if (IMC < 29.99) {
            diagnostico = "Sobrepeso";
        } else if (IMC < 34.99) {
            diagnostico = "Obesidade grau I";
        } else if (IMC < 39.99) {
            diagnostico = "Obesidade grau II";
        } else {
            diagnostico = "Obesidade grau III (obesidade mórbida)";
        };
        return diagnostico;
    }
}

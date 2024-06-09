package control;

public class CalculadoraImc {

    public String calcularImc(double peso, double altura, int idade, String sexo) {
        double imc = peso / (altura * altura);
        String categoriaImc = "";

        if (idade >= 20 && idade <= 65) {
            if (imc < 16) {
                categoriaImc = "Baixo peso muito grave";
            } else if (imc >= 16 && imc < 17) {
                categoriaImc = "Baixo peso grave";
            } else if (imc >= 17 && imc < 18.5) {
                categoriaImc = "Baixo peso";
            } else if (imc >= 18.5 && imc < 25) {
                categoriaImc = "Peso normal";
            } else if (imc >= 25 && imc < 30) {
                categoriaImc = "Sobrepeso";
            } else if (imc >= 30 && imc < 35) {
                categoriaImc = "Obesidade grau I";
            } else if (imc >= 35 && imc <= 40) {
                categoriaImc = "Obesidade grau II";
            } else {
                categoriaImc = "Obesidade grau III (obesidade mórbida)";
            }
        } else if (idade > 65) {
            if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 21.9) {
                    categoriaImc = "Baixo peso";
                } else if (imc >= 21.9 && imc <= 27) {
                    categoriaImc = "Peso normal";
                } else if (imc > 27 && imc <= 32) {
                    categoriaImc = "Sobrepeso";
                } else if (imc > 32 && imc <= 37) {
                    categoriaImc = "Obesidade grau I";
                } else if (imc > 37 && imc < 42) {
                    categoriaImc = "Obesidade grau II";
                } else {
                    categoriaImc = "Obesidade grau III (obesidade mórbida)";
                }
            } else {
                if (imc < 21.9) {
                    categoriaImc = "Baixo peso";
                } else if (imc >= 21.9 && imc <= 27) {
                    categoriaImc = "Peso normal";
                } else if (imc > 27 && imc <= 30) {
                    categoriaImc = "Sobrepeso";
                } else if (imc > 30 && imc <= 35) {
                    categoriaImc = "Obesidade grau I";
                } else if (imc > 35 && imc < 40) {
                    categoriaImc = "Obesidade grau II";
                } else {
                    categoriaImc = "Obesidade grau III (obesidade mórbida)";
                }
            }
        } else {
            double[][] percentisMeninos = {
                    {17.6, 18.2, 19.0}, // 2 anos
                    {18.3, 19.0, 19.8}, // 4 anos
                    {19.4, 20.5, 21.7}, // 6 anos
                    {20.8, 22.6, 23.8}, // 8 anos
                    {22.8, 25.1, 26.8}, // 10 anos
                    {24.7, 27.2, 29.1}  // 12 anos
            };

            double[][] percentisMeninas = {
                    {17.3, 18.0, 18.7}, // 2 anos
                    {17.8, 18.9, 19.6}, // 4 anos
                    {18.7, 20.8, 21.9}, // 6 anos
                    {19.9, 23.0, 24.4}, // 8 anos
                    {21.8, 25.4, 27.0}, // 10 anos
                    {23.6, 27.7, 29.4}  // 12 anos
            };

            int indiceIdade;
            switch (idade) {
                case 2:  indiceIdade = 0; break;
                case 4:  indiceIdade = 1; break;
                case 6:  indiceIdade = 2; break;
                case 8:  indiceIdade = 3; break;
                case 10: indiceIdade = 4; break;
                case 12: indiceIdade = 5; break;
                default: return "Idade não suportada.";
            }

            double[] percentis = sexo.equalsIgnoreCase("masculino")
                    ? percentisMeninos[indiceIdade]
                    : percentisMeninas[indiceIdade];

            if (imc < percentis[0]) {
                categoriaImc = "Baixo peso";
            } else if (imc >= percentis[0] && imc < percentis[1]) {
                categoriaImc = "Peso normal";
            } else if (imc >= percentis[1] && imc < percentis[2]) {
                categoriaImc = "Sobrepeso";
            } else {
                categoriaImc = "Obesidade";
            }
        }

        return categoriaImc;
    }

    public static void main(String[] args) {
        CalculadoraImc calculadora = new CalculadoraImc();
        System.out.println(calculadora.calcularImc(18, 1.2, 8, "masculino"));  // Exemplo para um menino de 8 anos
        System.out.println(calculadora.calcularImc(22, 1.4, 10, "feminino")); // Exemplo para uma menina de 10 anos
    }
}

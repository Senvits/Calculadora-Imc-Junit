//Feito por Alex Alves
package control;

public class CalculadoraImc {

	//Assinatura de método padrão para o trabalho
	public String calcularImc(double altura, double peso, String sexo, int idade, boolean gravida) {
	//Calculo do IMC
		double imc;
		imc = peso / (altura * altura);
		System.out.println(imc);
		//Adultos (idade entre 20 e 65)
		if ((idade > 14) && (idade <65) && gravida == false) {
			if (imc < 16 ) {
				return "Baixo peso muito grave";
			} else if ((imc >= 16) && (imc <= 16.99)) {
				return "Baixo peso grave";
			} else if ((imc >= 17) && (imc <= 18.49)) {
				return "Baixo peso";
			} else if ((imc >= 18.50) && (imc <= 24.99)) {
				return "Peso normal";
			} else if ((imc >= 25) && (imc <= 29.99)) {
				return "Sobrepeso";
			} else if ((imc >= 30) && (imc <= 34.99)) {
				return "Obesidade grau I";
			} else if ((imc >= 35) && (imc <= 39.99)) {
				return "Obesidade grau II";
			} else if (imc >=40) {
				return "Obesidade grau III";
			}
		
		}
		//Idosos (acima de 65 anos do sexo Feminino
		if ((idade >=65) && sexo.equals("F")) {
			if (imc < 22) {
				return "Baixo peso";
			} else if ((imc >= 22) && (imc <= 26.99)) {
				return "Peso normal";
			} else if ((imc >= 27) && (imc <= 31.99)) {
				return "Sobrepeso";
			} else if ((imc >=32) && (imc <= 36.99)) {
				return "Obesidade grau I";
			} else if ((imc >=37) && (imc <= 42)) {
				return "Obesidade grau II";
			} else if (imc > 42) {
				return "Obesidade grau III";
			}
		}
		//Idosos (acima de 65 anos do sexo Masculino
		if ((idade >65) && sexo.equals("M")) {
			if (imc < 22) {
				return "Baixo peso";
			} else if ((imc >= 22) && (imc <= 26.99)) {
				return "Peso normal";
			} else if ((imc >= 27) && (imc <= 29.99)) {
				return "Sobrepeso";
			} else if ((imc >=30) && (imc <= 34.99)) {
				return "Obesidade grau I";
			} else if ((imc >=35) && (imc <= 40)) {
				return "Obesidade grau II";
			} else if (imc > 40) {
				return "Obesidade grau III";
			}
		
		}
		//Crianças do sexo masculino
		if ((idade == 2) && sexo.equals("M")) {
			if (imc <= 12) {
				return "Baixo peso";
			} else if ((imc >= 12.1) && (imc <= 14)) {
				return "Peso normal";
			} else if ((imc > 14) && (imc <= 15)) {
				return "Sobrepeso";
			} else if (imc > 15) {
				return "Obesidade";
			}
		}
		if ((idade == 4) && sexo.equals("M")) {
			if (imc <= 13.7) {
				return "Baixo peso";
			} else if ((imc >= 13.8) && (imc <= 15.8)) {
				return "Peso normal";
			} else if ((imc > 15.8) && (imc <= 16)) {
				return "Sobrepeso";
			} else if (imc > 16) {
				return "Obesidade";
			}
		}
		if ((idade == 6) && sexo.equals("M")) {
			if (imc <= 14.4) {
				return "Baixo peso";
			} else if ((imc >= 14.5) && (imc <= 16.6)) {
				return "Peso normal";
			} else if ((imc > 16.6) && (imc <= 18)) {
				return "Sobrepeso";
			} else if (imc > 18) {
				return "Obesidade";
			}
		}
		if ((idade == 8) && sexo.equals("M")) {
			if (imc <= 15.5) {
				return "Baixo peso";
			} else if ((imc >= 15.6) && (imc <= 16.6)) {
				return "Peso normal";
			} else if ((imc > 16.7) && (imc <= 20.3)) {
				return "Sobrepeso";
			} else if (imc > 20.3) {
				return "Obesidade";
			}
		}
		if ((idade == 10) && sexo.equals("M")) {
			if (imc <= 16.6) {
				return "Baixo peso";
			} else if ((imc >= 16.7) && (imc <= 19.6)) {
				return "Peso normal";
			} else if ((imc > 19.6) && (imc <= 22.5)) {
				return "Sobrepeso";
			} else if (imc > 22.5) {
				return "Obesidade";
			}
		}
		if ((idade == 12) && sexo.equals("M")) {
			if (imc <= 17.7) {
				return "Baixo peso";
			} else if ((imc >= 17.7) && (imc <= 22.6)) {
				return "Peso normal";
			} else if ((imc > 22.6) && (imc <= 24.7)) {
				return "Sobrepeso";
			} else if (imc > 24.7) {
				return "Obesidade";
			}
		}
		if ((idade == 14) && sexo.equals("M")) {
			if (imc <= 19.1) {
				return "Baixo peso";
			} else if ((imc >= 19.2) && (imc <= 22.7)) {
				return "Peso normal";
			} else if ((imc > 22.7) && (imc <= 26.9)) {
				return "Sobrepeso";
			} else if (imc > 26.9) {
				return "Obesidade";
			}
		}
		//Crianças do sexo feminino (de 2 a 14 anos)
		if ((idade == 2) && sexo.equals("F")) {
			if (imc <= 12) {
				return "Baixo peso";
			} else if ((imc >= 12.1) && (imc <= 14)) {
				return "Peso normal";
			} else if ((imc > 14) && (imc <= 15)) {
				return "Sobrepeso";
			} else if (imc > 15) {
				return "Obesidade";
			}
		}
		if ((idade == 4) && sexo.equals("F")) {
			if (imc <= 13.7) {
				return "Baixo peso";
			} else if ((imc >= 13.8) && (imc <= 15.8)) {
				return "Peso normal";
			} else if ((imc > 15.8) && (imc <= 16)) {
				return "Sobrepeso";
			} else if (imc > 16) {
				return "Obesidade";
			}
		}
		if ((idade == 6) && sexo.equals("F")) {
			if (imc <= 14.2) {
				return "Baixo peso";
			} else if ((imc >= 14.3) && (imc <= 16.1)) {
				return "Peso normal";
			} else if ((imc > 16.1) && (imc <= 17.4)) {
				return "Sobrepeso";
			} else if (imc > 17.4) {
				return "Obesidade";
			}
		}
		if ((idade == 8) && sexo.equals("F")) {
			if (imc <= 15.5) {
				return "Baixo peso";
			} else if ((imc >= 15.6) && (imc <= 16.6)) {
				return "Peso normal";
			} else if ((imc > 16.7) && (imc <= 20.3)) {
				return "Sobrepeso";
			} else if (imc > 20.3) {
				return "Obesidade";
			}
		}
		if ((idade == 10) && sexo.equals("F")) {
			if (imc <= 16.6) {
				return "Baixo peso";
			} else if ((imc >= 16.7) && (imc <= 19.6)) {
				return "Peso normal";
			} else if ((imc > 19.6) && (imc <= 22.5)) {
				return "Sobrepeso";
			} else if (imc > 22.5) {
				return "Obesidade";
			}
		}
		if ((idade == 12) && sexo.equals("F")) {
			if (imc <= 17.7) {
				return "Baixo peso";
			} else if ((imc >= 17.7) && (imc <= 22.6)) {
				return "Peso normal";
			} else if ((imc > 22.6) && (imc <= 24.7)) {
				return "Sobrepeso";
			} else if (imc > 24.7) {
				return "Obesidade";
			}
		}
		if ((idade == 14) && sexo.equals("F")) {
			if (imc <= 19.2) {
				return "Baixo peso";
			} else if ((imc >= 19.3) && (imc <= 23.8)) {
				return "Peso normal";
			} else if ((imc > 23.8) && (imc <= 27.9)) {
				return "Sobrepeso";
			} else if (imc > 27.9) {
				return "Obesidade";
			}
		}
		//Mulheres gravidas
		if ((idade >= 14) && ((idade <= 65)) && sexo.equals("F") && gravida == true) {
			if (imc <= 18.5) {
				return "Baixo peso";
			} else if ((imc >= 18.5) && (imc <= 24.9)) {
				return "Peso normal";
			} else if ((imc >= 25) && (imc <= 29.9)) {
				return "Sobrepeso";
			} else if (imc > 29.9) {
				return "Obesidade";
			}
		}
			
		return sexo;	
	}
}

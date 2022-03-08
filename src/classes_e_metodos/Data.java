package classes_e_metodos;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(int pardia, int parmes, int parano) {
		dia = pardia;
		mes = parmes;
		ano = parano;
	}
	
	Data() {
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d", dia, mes, ano);
	}
	
	int somar(int a, int b) {
		return a + b;
	}
}

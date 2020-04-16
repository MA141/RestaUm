
public class table {
	pice[][] tabela=new pice[7][7];

	
	void create() {
		for (int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				tabela[i][j] = new pice();
				if (i>=2 && i<=4) {
					tabela[i][j].valido=true;
					tabela[i][j].preenchido=true;
				}
				else {
					if(j>=2 && j<=4) {
						tabela[i][j].valido=true;
						tabela[i][j].preenchido=true;
					}
					else {
						tabela[i][j].valido=false;
						tabela[i][j].preenchido=false;
					}
				}
			}
		}
		tabela[3][3].preenchido=false; //posicao central
	}
	
	void mostra() {
		int cont=7;
		for (int i=0; i<7; i++) {
			System.out.print(cont+" ");
			cont--;
			for(int j=0; j<7; j++) {
				if(tabela[i][j].valido==true) {
					if(tabela[i][j].preenchido==true) {
						System.out.print("1 ");
					}
					else {
						System.out.print("- ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
		System.out.println("  a b c d e f g ");
		System.out.println("");
	}
	
	
	void processa(String command) {
		System.out.println("Source: "+command.split(":")[0]);
		System.out.println("Target: "+command.split(":")[1]);
		tabela[6-(((int)(command.charAt(1)))-49)][((int)(command.charAt(0)))-97].preenchido=false;
		tabela[6-(((int)(command.charAt(4)))-49)][((int)(command.charAt(3)))-97].preenchido=true;
		if(((int)(command.charAt(1)))==((int)(command.charAt(4)))){//se os numeros sao iguais i.e. se a movimentacao foi na mesma linha
			if(((int)(command.charAt(0)))>((int)(command.charAt(3)))) {//se a peca se moveu da esquerda para a direita
				tabela[6-(((int)(command.charAt(4)))-49)][((int)(command.charAt(3)))-96].preenchido=false;
			}
			else {
				tabela[6-(((int)(command.charAt(1)))-49)][((int)(command.charAt(0)))-96].preenchido=false;
			}
		}
		else {
			if(((int)(command.charAt(1)))>((int)(command.charAt(4)))) {//se a peca se moveu de cima para baixo
				tabela[7-(((int)(command.charAt(1)))-49)][((int)(command.charAt(0)))-97].preenchido=false;
			}
			else {
				tabela[7-(((int)(command.charAt(4)))-49)][((int)(command.charAt(3)))-97].preenchido=false;
			}
		}
		
	}
	
	void processaTudo(String[] vet){
		int i = 0, size=vet.length;
		for(i = 0; i < size ; i++) {
			processa(vet[i]);
			mostra();
		}
	}

}

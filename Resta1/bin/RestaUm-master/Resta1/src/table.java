
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
	}
	
	
	void processa() {
		///Pega duas posicoes, verifica se a pos inicial e a final sao validas (a inicial tem pe�a e a final n�o, e se no meio delas tem pe�a) e depois tira da inicial, coloca na final, e tira a do meio.
	}
	/*
	boolean isValid(String com) { //com=command
		//If comando valido, i.e.:
		//Pos inicial preenchida, final vazia, do meio preenchida, distancia de 1 casa
		if(tabela[int(com[0]-98)][int(com[1])].valido && tabela[int(com[0]-98)][int(com[1])].preenchido && tabela[int(com[3]-98)][int(com[4])].valido && tabela[int(com[3]-98)][int(com[4])]..preenchido==false) {
			if //posicao do meio.preenchida==true e a distancia eh 1.
		}
		//Pos eh acessada vendo as posicoes de com, tipo, tabela[int(com[0])-98][int(com[1]])
		
				return true;
			//else
				return false;
		//else
		return false;
	}
	*/
	

}
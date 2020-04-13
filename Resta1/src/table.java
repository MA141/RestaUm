
public class table {
	int[][] tabela=new int[7][7];
	int cont=7;
	
	
	void mostra() {
		for (int i=0; i<7; i++) {
			System.out.print(cont+" ");
			cont--;
			for(int j=0; j<7; j++) {
				if (i>=2 && i<=4) {
					System.out.print("1 ");
				}
				else {
					if(j>=2 && j<=4) {
						System.out.print("1 ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			System.out.print("\n");
		}
		System.out.println(" a b c d e f g ");
	}
	
	
	void processa() {
		///Pega duas posicoes, verifica se a pos inicial e a final sao validas (a inicial tem peça e a final não, e se no meio delas tem peça) e depois tira da inicial, coloca na final, e tira a do meio.
	}
	
	
	public static void main(String[] args) {
		table tab=new table();
		tab.mostra();
		
	}

}

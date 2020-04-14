
public class themain {
	public static void main(String[] args) {
		table tab=new table();
		tab.create();
		
		System.out.println("Tabuleiro inicial:");
		tab.mostra();
		
		CSVReader test = new CSVReader();
		test.setDataSource("_SEU_DIRETORIO_\\Resta1\\teste1.csv");
		String commands[] = test.requestCommands();
			
		tab.processaTudo(commands);
		
	}

}

package s3;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import static javax.swing.JOptionPane.*;

public class s3_1 {
	public static void main(String [] args) {
		String s = showInputDialog(null,"Qual o nome de filme a consultar?");
		int linha = Integer.parseInt(s);
		try {
			String nome = s3_1_filmes.consultar(linha);
			showMessageDialog(null,nome);
		}
		catch(s3_exception e) {
			showMessageDialog(null,"Posição não existe");
		}
		catch(Exception e) {
			showMessageDialog(null,"Filme não encontrado");
		}
	}
}

class s3_1_filmes{
	public static String consultar(int indice) throws Exception, s3_exception {
		Path arquivo = Paths.get("filmes.txt");
		String nomesFilmes [];
		nomesFilmes = Files.readAllLines(arquivo).toArray(new String[0]);
		if(indice > nomesFilmes.length) {
			throw new s3_exception();
		}
		return nomesFilmes[indice];
	}
}

package s3;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import static javax.swing.JOptionPane.*;

public class s3 {
	public static void main (String args[]){
		Path arquivo = Paths.get("livros.txt");
		String [] livros;
		try{
			livros = Files.readAllLines(arquivo).toArray(new String[0]);
			String s = showInputDialog("Número do livro: ");
			int i = Integer.parseInt(s);
			showMessageDialog(null,livros[i-1]);
		}
		catch(IOException e){
			showMessageDialog(null,"Arquivo não encontrado");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			showMessageDialog(null,"Livro não encontrado");
		}

	}
}

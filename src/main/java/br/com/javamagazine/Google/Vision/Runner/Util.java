package br.com.javamagazine.Google.Vision.Runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Util {

	public static ArrayList<String> pegaEvidenciasMobilePj() {

		ArrayList<File> arrayTestes = new ArrayList<File>();
		File dir = new File(".\\evidencias\\MPJ\\failure\\");
		File[] todosArquivos = dir.listFiles();
		ArrayList<File> arrayImagens = new ArrayList<File>();
		ArrayList<String> todosCaminhos = new ArrayList<String>();
		
		for (int i = 0; i < todosArquivos.length; i++) {
			if(todosArquivos[i].isDirectory()) {
				arrayTestes.add(todosArquivos[i].getAbsoluteFile());
				
			}
		}
		
		for (int i = 0; i < arrayTestes.size(); i++) {
			File[] todosArquivos2 = arrayTestes.get(i).listFiles();
			for(int j = 0; j < todosArquivos2.length; j++) {
				arrayImagens.add(todosArquivos2[j]);
			}

		}
		
		for (int i = 0; i < arrayImagens.size(); i++) {
			File CaminhoImagemFile = arrayImagens.get(i);
			String CaminhoImagemString = CaminhoImagemFile.getAbsolutePath();
			todosCaminhos.add(CaminhoImagemString);
			
		}		
		
		return todosCaminhos;
	}
	
	public static ArrayList<String> pegaEvidenciasInternetBankingPj() {
		
		File dir = new File(".\\evidencias\\IBPJ");
		File[] arquivoBase = dir.listFiles();
		File caminhoFinalAmbiente;
		File caminhoFinalAnalisar;
		File caminhoFinalMassa;
	
		ArrayList<String> todosCaminhos = new ArrayList<String>();
		
		for(int i = 0; i < arquivoBase.length; i++) {
			
			String caminho = arquivoBase[i].getAbsolutePath();
			if (caminho.contains("EVT_AUTOMACAO")) {
				caminhoFinalAmbiente = new File(arquivoBase[i].getAbsolutePath() + "\\EVT_ERRO\\ambiente");
				caminhoFinalAnalisar = new File(arquivoBase[i].getAbsolutePath() + "\\EVT_ERRO\\analisar");
				caminhoFinalMassa = new File(arquivoBase[i].getAbsolutePath() + "\\EVT_ERRO\\Massa de dados");
				
				File[] todosArquivosAmbiente = caminhoFinalAmbiente.listFiles();
				File[] todosArquivosAnalisar = caminhoFinalAnalisar.listFiles();
				File[] todosArquivosMassa =  caminhoFinalMassa.listFiles();
				
				for(int j = 0; j < todosArquivosAmbiente.length; j++) {
					todosCaminhos.add(todosArquivosAmbiente[j].getAbsolutePath());
				}
				
				for(int j = 0; j < todosArquivosAnalisar.length; j++) {
					todosCaminhos.add(todosArquivosAnalisar[j].getAbsolutePath());
				}
				
				for(int j = 0; j < todosArquivosMassa.length; j++) {
					todosCaminhos.add(todosArquivosMassa[j].getAbsolutePath());
				}

				break;
			}
			
		}

		return todosCaminhos;
		
		
	}
	
	public static ArrayList<String> pegaEvidenciasInternetBankingPf() {
		
		File dir = new File(".\\evidencias\\IBPF");
		File[] arquivoBase = dir.listFiles();
	
		ArrayList<String> todosCaminhos = new ArrayList<String>();
		
		for(int i = 0; i < arquivoBase.length; i++) {

			File[] todosArquivosAmbiente = arquivoBase[i].listFiles();
			
			for(int j = 0; j < todosArquivosAmbiente.length; j++) {
				todosCaminhos.add(todosArquivosAmbiente[j].getAbsolutePath());
			}
		}
		return todosCaminhos;	
	}
	
	public static ArrayList<String> pegaEvidenciasMobilePf() {

		ArrayList<File> arrayTestes = new ArrayList<File>();
		File dir = new File(".\\evidencias\\MPF\\failure\\");
		File[] todosArquivos = dir.listFiles();
		ArrayList<File> arrayImagens = new ArrayList<File>();
		ArrayList<String> todosCaminhos = new ArrayList<String>();
		
		for (int i = 0; i < todosArquivos.length; i++) {
			if(todosArquivos[i].isDirectory()) {
				arrayTestes.add(todosArquivos[i].getAbsoluteFile());
			}
		}
		
		for (int i = 0; i < arrayTestes.size(); i++) {
			File[] todosArquivos2 = arrayTestes.get(i).listFiles();
			for(int j = 0; j < todosArquivos2.length; j++) {
				arrayImagens.add(todosArquivos2[j]);
			}

		}
		
		for (int i = 0; i < arrayImagens.size(); i++) {
			File CaminhoImagemFile = arrayImagens.get(i);
			String CaminhoImagemString = CaminhoImagemFile.getAbsolutePath();
			todosCaminhos.add(CaminhoImagemString);
		}
		
		return todosCaminhos;
	}
	
	

}

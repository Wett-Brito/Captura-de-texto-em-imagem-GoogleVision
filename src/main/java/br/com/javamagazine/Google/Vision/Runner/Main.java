package br.com.javamagazine.Google.Vision.Runner;

import java.util.Properties;

import br.com.javamagazine.Google.Vision.Controller.ConfigProperties;

public class Main 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	Properties config = ConfigProperties.getConfig();
    	
    	String ambiente = config.getProperty("Ambiente");

    	if(ambiente.equals("IBPJ")) {
    		
        	for(String filePath : Util.pegaEvidenciasInternetBankingPj()) {
		   		
        		String mensagem = GoogleVisionAPI.detectText(filePath);
        		
        		System.out.println("Imagem: " + filePath + " ----------------------\n" + mensagem);
        		
        	}
    	}
    	
    	if(ambiente.equals("MPJ")) {
    		
        	for(String filePath : Util.pegaEvidenciasMobilePj()) {
		   		
        		String mensagem = GoogleVisionAPI.detectText(filePath);
        		
        		System.out.println("Imagem: " + filePath + " ----------------------\n" + mensagem);
        		
        	}
    	}
    	
    	if(ambiente.equals("IBPF")) {
    		
        	for(String filePath : Util.pegaEvidenciasInternetBankingPf()) {
		   		
        		String mensagem = GoogleVisionAPI.detectText(filePath);
        		
        		System.out.println("Imagem: " + filePath + " ----------------------\n" + mensagem);
        		
        	}
    	}
    	
    	if(ambiente.equals("MPF")) {
    		
        	for(String filePath : Util.pegaEvidenciasMobilePf()) {
		   		
        		String mensagem = GoogleVisionAPI.detectText(filePath);
        		
        		System.out.println("Imagem: " + filePath + " ----------------------\\n" + mensagem);
        		
        	}
    	}
    	

    }
}

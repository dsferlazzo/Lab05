package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class AnagrammiRicorsione {
	
	List<String> parole = new ArrayList<String>();
	
	public List<String> anagramma(String s ) {
		anagrammaRicorsione("", 0, s);
		return parole;
		
	}
	
	private void anagrammaRicorsione(String parziale, int livello, String rimanenti) {
		
		if(rimanenti.length()==0)		//CASO TERMINALE
		{
			if(!parole.contains(parziale))		//NEL CASO DI LETTERE RIPETUTE PRESENTI NELLA PAROLA INIZIALE
				parole.add(parziale);	//AGGIUNGO LE PAROLE ALLA SOLUZIONE
			return;
		}
		
		//CASO NORMALE
		
		for(int i = 0;i<rimanenti.length();i++)
			anagrammaRicorsione(parziale+rimanenti.charAt(i), livello+1, rimanenti.substring(0,i)+rimanenti.substring(i+1));
		
		
	}

}

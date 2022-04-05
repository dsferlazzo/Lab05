package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.anagrammi.db.AnagrammaDAO;

public class Model {
	
	AnagrammiRicorsione ar;
	AnagrammaDAO anagrammaDAO;
	
	public Model() {
		this.ar = new AnagrammiRicorsione();
		this.anagrammaDAO = new AnagrammaDAO();
	}

	
	
	
	
	public List<String> getAnagrammi(String parola){
		return ar.anagramma(parola);
	}
	
	public StatoParole getParoleCorrette(List<String> parole){
		List<String> paroleCorrette = new ArrayList<String>();
		List<String> paroleErrate = new ArrayList<String>();
		for(String s : parole)
		{
			if(anagrammaDAO.isCorrect(s))
				paroleCorrette.add(s);
			else paroleErrate.add(s);
				
		}
		StatoParole sp = new StatoParole(paroleCorrette, paroleErrate);
		return sp;
	}

}

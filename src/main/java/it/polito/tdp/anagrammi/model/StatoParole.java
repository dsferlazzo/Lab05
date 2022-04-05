package it.polito.tdp.anagrammi.model;

import java.util.List;

public class StatoParole {
	
	List<String> paroleCorrette;
	List<String> paroleErrate;
	
	
	public StatoParole(List<String> paroleCorrette, List<String> paroleErrate) {
		this.paroleCorrette = paroleCorrette;
		this.paroleErrate = paroleErrate;
	}


	public List<String> getParoleCorrette() {
		return paroleCorrette;
	}


	public void setParoleCorrette(List<String> paroleCorrette) {
		this.paroleCorrette = paroleCorrette;
	}


	public List<String> getParoleErrate() {
		return paroleErrate;
	}


	public void setParoleErrate(List<String> paroleErrate) {
		this.paroleErrate = paroleErrate;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paroleCorrette == null) ? 0 : paroleCorrette.hashCode());
		result = prime * result + ((paroleErrate == null) ? 0 : paroleErrate.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatoParole other = (StatoParole) obj;
		if (paroleCorrette == null) {
			if (other.paroleCorrette != null)
				return false;
		} else if (!paroleCorrette.equals(other.paroleCorrette))
			return false;
		if (paroleErrate == null) {
			if (other.paroleErrate != null)
				return false;
		} else if (!paroleErrate.equals(other.paroleErrate))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "StatoParole [paroleCorrette=" + paroleCorrette + ", paroleErrate=" + paroleErrate + "]";
	}
	
	
	
	

}

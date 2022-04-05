package it.polito.tdp.anagrammi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;



public class AnagrammaDAO {
	Connection conn;		//per evitare l'errore tooManyConnections, non faccio la getConnection() nel metodo, ma direttamente nel costruttore
	
	public AnagrammaDAO(){
		conn = DBConnect.getConnection();
	}
	
	/**
	 * Ritorna true se la parola inserita è corretta (presente nel dizionario), altrimenti ritorna false
	 * @param anagramma
	 * @return
	 */
	public boolean isCorrect(String anagramma) {
		
		final String sql = "SELECT * "
				+ "FROM parola "
				+ "WHERE nome = ?";

		try {
			//Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, anagramma);

			ResultSet rs = st.executeQuery();
			
			if(rs.next())
				return true;
			else return false;
			
			
		} catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
	}

}

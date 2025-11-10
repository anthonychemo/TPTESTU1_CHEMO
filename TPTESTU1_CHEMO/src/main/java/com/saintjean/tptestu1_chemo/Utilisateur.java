package com.saintjean.tptestu1_chemo;

import java.util.ArrayList;

public class Utilisateur {
	
	    private int id;
	    private String nom;
	    private int age;
	    private String email;
	    private String telephone;
	    private String ville;
	    private double soldePersonnel;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getTelephone() {
			return telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public String getVille() {
			return ville;
		}
		public void setVille(String ville) {
			this.ville = ville;
		}
		public double getSoldePersonnel() {
			return soldePersonnel;
		}
		public void setSoldePersonnel(double soldePersonnel) {
			this.soldePersonnel = soldePersonnel;
		}
		
		
		
		public Utilisateur(int id, String nom, int age, String email, String telephone, String ville,
				double soldePersonnel) {
			super();
			this.id = id;
			this.nom = nom;
			this.age = age;
			this.email = email;
			this.telephone = telephone;
			this.ville = ville;
			this.soldePersonnel = soldePersonnel;
		}



		public static ArrayList<Utilisateur> users = new ArrayList<>();
	    
		public static void ajouter(Utilisateur user) throws EmailInvalidException {
	        if (!user.getEmail().matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
	            throw new EmailInvalidException("Adresse e-mail invalide !");
	        }
	        users.add(user);
	    }

	    public static void supprimer(int id) throws SuppressionInvalidException {
	        boolean removed = users.removeIf(u -> u.getId() == id);
	        if (!removed) {
	            throw new SuppressionInvalidException("Utilisateur introuvable !");
	        }
	    }

	    public static ArrayList<Utilisateur> lister() {
	        return users;
	    }

	    public static Utilisateur afficher(int id) throws SuppressionInvalidException {
	        return users.stream()
	                .filter(u -> u.getId() == id)
	                .findFirst()
	                .orElseThrow(() -> new SuppressionInvalidException("Utilisateur introuvable !"));
	    }

}

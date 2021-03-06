package fr.igacha.heritage.persistence;

import javax.persistence.*;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_BIS")
public class Objet {
	@Id
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id_conteneur")
	private Conteneur conteneur;
	
	private String nom;
	
	private int poid;
	
	private String Type;
	
	
	public Objet() {
	}
}

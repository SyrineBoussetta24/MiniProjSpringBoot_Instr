package com.syrine.demo.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Instrument {
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idInstrument;
	private String nomInstrument;
	private Double prixInstrument;
	private Date dateCreation;
	
	
	@ManyToOne
	private Type type ;
	
	/*@OneToOne 
	private Image image;*/
	
	@OneToMany(mappedBy = "instrument", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Image> images;


	private String imagePath;

	public Instrument(String nomInstrument, Double prixInstrument, Date dateCreation) {
		super();
		this.nomInstrument = nomInstrument;
		this.prixInstrument = prixInstrument;
		this.dateCreation = dateCreation;
	}

	

}

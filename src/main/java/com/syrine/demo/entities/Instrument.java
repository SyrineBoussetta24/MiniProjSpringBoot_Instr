package com.syrine.demo.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

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
	
	public Instrument() {
	super();
	}
	public Instrument(String nomInstrument, Double prixInstrument, Date dateCreation) {
	super();
	this.nomInstrument = nomInstrument;
	this.prixInstrument = prixInstrument;
	this.dateCreation = dateCreation;
	}
	public Long getIdInstrument() {
		return idInstrument;
		}
		public void setIdInstrument(Long idInstrument) {
		this.idInstrument = idInstrument;
		}
		public String getNomInstrument() {
		return nomInstrument;
		}
		public void setNomInstrument(String nomInstrument) {
		this.nomInstrument = nomInstrument;
		}
		public Double getPrixInstrument() {
		return prixInstrument;
		}
		public void setPrixInstrument(Double prixInstrument) {
		this.prixInstrument = prixInstrument;
		}
		public Date getDateCreation() {
		return dateCreation;
		}
		public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
		}
		@Override
		public String toString() {
		return "Instrument [idInstrument=" + idInstrument + ", nomInstrument=" +
		nomInstrument + ", prixInstrument=" + prixInstrument
		+ ", dateCreation=" + dateCreation + "]";
		}
		public Type getType() {
			return type;
		}
		public void setType(Type type) {
			this.type = type;
		}
}

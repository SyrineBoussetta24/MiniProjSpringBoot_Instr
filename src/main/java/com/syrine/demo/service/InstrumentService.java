package com.syrine.demo.service;

import java.util.List;


import com.syrine.demo.entities.Instrument;
import com.syrine.demo.entities.Type;

public interface InstrumentService {
	Instrument saveInstrument(Instrument i);
	Instrument updateInstrument(Instrument i);
	void deleteInstrument(Instrument i);
	void deleteInstrumentById(Long id);
	Instrument getInstrument(Long id);
	List<Instrument> getAllInstruments();
	
	List<Instrument> findByNomInstrument(String nom);
	List<Instrument> findByNomInstrumentContains(String nom);
	List<Instrument> findByNomPrix (String nom, Double prix);
	List<Instrument> findByType (Type  categorie);
	List<Instrument> findByTypeIdTyp(Long id);
	List<Instrument> findByOrderByNomInstrumentAsc();
	List<Instrument> trierInstrumentsNomsPrix();

}

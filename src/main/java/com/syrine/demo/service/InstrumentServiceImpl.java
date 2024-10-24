package com.syrine.demo.service;

import com.syrine.demo.entities.Instrument;
import com.syrine.demo.entities.Type;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syrine.demo.repos.ImageRepository;
import com.syrine.demo.repos.InstrumentRepository;

@Service
public class InstrumentServiceImpl implements InstrumentService{
	@Autowired
	InstrumentRepository InstrumentRepository;
	
	@Autowired
	ImageRepository imageRepository ;
	@Override
	public Instrument saveInstrument(Instrument i) {
	return InstrumentRepository.save(i);
	}
	
	/*@Override
	public Instrument updateInstrument(Instrument i) {
	return InstrumentRepository.save(i);
	} */
	@Override
	public Instrument updateInstrument(Instrument newInstrument) {
	    // Get the existing instrument with its images
	    Instrument existingInstrument = InstrumentRepository.findById(newInstrument.getIdInstrument())
	            .orElseThrow(() -> new RuntimeException("Instrument not found"));

	    // Preserve the existing images
	    newInstrument.setImages(existingInstrument.getImages());

	    // Save the updated instrument with preserved images
	    return InstrumentRepository.save(newInstrument);
	}
	@Override
	public void deleteInstrument(Instrument i) {
		InstrumentRepository.delete(i);
	}
	 @Override
	public void deleteInstrumentById(Long id) {
		 Instrument i = getInstrument(id);
		 //suuprimer l'image avant de supprimer l'instrument
		try {
		Files.delete(Paths.get(System.getProperty("user.home")+"/images/"+i.getImagePath()));
		} catch (IOException e) {
		e.printStackTrace();
		}
		InstrumentRepository.deleteById(id);
	}
	@Override
	public Instrument getInstrument(Long id) {
	return InstrumentRepository.findById(id).get();
	}
	@Override
	public List<Instrument> getAllInstruments() {
	return InstrumentRepository.findAll();
	}
	@Override
	public List<Instrument> findByNomInstrument(String nom) {
		return InstrumentRepository.findByNomInstrument(nom);
	}
	@Override
	public List<Instrument> findByNomInstrumentContains(String nom) {
		return InstrumentRepository.findByNomInstrumentContains(nom);

	}
	@Override
	public List<Instrument> findByNomPrix(String nom, Double prix) {
		return InstrumentRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Instrument> findByType(Type type) {
		return InstrumentRepository.findByType(type);

	}
	@Override
	public List<Instrument> findByTypeIdTyp(Long id) {
		return InstrumentRepository.findByTypeIdTyp(id);

	}
	@Override
	public List<Instrument> findByOrderByNomInstrumentAsc() {
		return InstrumentRepository.findByOrderByNomInstrumentAsc();

	}
	@Override
	public List<Instrument> trierInstrumentsNomsPrix() {
		return InstrumentRepository.trierInstrumentsNomsPrix();

		
	}
}

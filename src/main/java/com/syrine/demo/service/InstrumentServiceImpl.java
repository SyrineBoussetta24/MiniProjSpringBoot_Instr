package com.syrine.demo.service;

import com.syrine.demo.entities.Instrument;
import com.syrine.demo.entities.Type;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syrine.demo.repos.InstrumentRepository;

@Service
public class InstrumentServiceImpl implements InstrumentService{
	@Autowired
	InstrumentRepository InstrumentRepository;
	
	
	@Override
	public Instrument saveInstrument(Instrument i) {
	return InstrumentRepository.save(i);
	}
	@Override
	public Instrument updateInstrument(Instrument i) {
	return InstrumentRepository.save(i);
	}
	@Override
	public void deleteInstrument(Instrument i) {
		InstrumentRepository.delete(i);
	}
	 @Override
	public void deleteInstrumentById(Long id) {
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

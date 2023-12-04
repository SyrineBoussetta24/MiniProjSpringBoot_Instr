package com.syrine.demo.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.syrine.demo.entities.Instrument;
import com.syrine.demo.service.InstrumentService;
@RestController
@RequestMapping("/api")
@CrossOrigin

public class InstrumentRESTController {
	@Autowired
	InstrumentService InstrumentService;
	
	
	@RequestMapping(path="all",method = RequestMethod.GET)
	public List<Instrument> getAllInstruments() {
		return InstrumentService.getAllInstruments();
	}
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public Instrument getProduitById(@PathVariable("id") Long id) {
		return InstrumentService.getInstrument(id);
	}
	@RequestMapping(path="/addintr",method = RequestMethod.POST)
	public Instrument createProduit(@RequestBody Instrument instrument) {
	return InstrumentService.saveInstrument(instrument);
	}
	@RequestMapping(path="/updateintr",method = RequestMethod.PUT)
	public Instrument updateInstrument(@RequestBody Instrument instrument) {
	return InstrumentService.updateInstrument(instrument);
	}
	@RequestMapping(value="/delintr/{id}",method = RequestMethod.DELETE)
	public void deleteInstrument(@PathVariable("id") Long id)
	{
		InstrumentService.deleteInstrumentById(id);
	}
	
	@RequestMapping(value="/intrstyp/{idTyp}",method = RequestMethod.GET)
	public List<Instrument> getInstrumentsByTypId(@PathVariable("idTyp") Long idTyp) {
	return InstrumentService.findByTypeIdTyp(idTyp);
	}
	
}
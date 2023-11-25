package com.syrine.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.syrine.demo.entities.Instrument;
import com.syrine.demo.entities.Type;
import com.syrine.demo.repos.InstrumentRepository;
@SpringBootTest
class InstrumentsApplicationTests {
	@Autowired
	private InstrumentRepository InstrumentRepository;
	@Test
	public void testCreateInstrument() {
	Instrument intr = new Instrument("luth",1500.00,new Date());
	InstrumentRepository.save(intr);
	}
	
	@Test
	public void testFindInstrument()
	{
		Instrument i = InstrumentRepository.findById(1L).get();
	System.out.println(i);
	}
	@Test
	public void testUpdateInstrument()
	{
	Instrument i = InstrumentRepository.findById(1L).get();
	i.setPrixInstrument(1000.0);
	InstrumentRepository.save(i);
	}
	@Test
	public void testDeleteInstrument()
	{
		InstrumentRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousInstruments()
	{
	List<Instrument> intrs = InstrumentRepository.findAll();
	for (Instrument i : intrs)
	{
	System.out.println(i);
	}
	}
	@Test
	public void testFindByNomInstrument()
	{
	List<Instrument> intrs = InstrumentRepository.findByNomInstrument("violon");
	for (Instrument i : intrs)
	{
	System.out.println(i);
	}
	}
	@Test
	public void testFindByNomInstrumentContains ()
	{
	List<Instrument> intrs=InstrumentRepository.findByNomInstrumentContains("luth");
	for (Instrument i : intrs)
	{
	System.out.println(i);
	} }
	@Test
	public void testfindByNomPrix()
	{
	List<Instrument> intrs = InstrumentRepository.findByNomPrix("luth", 1200.0);
	for (Instrument i : intrs)
	{
	System.out.println(i);
	}
	}
	@Test
	public void testfindByType()
	{
		Type typ = new Type();
		typ.setIdTyp(1L);
	List<Instrument> intrs = InstrumentRepository.findByType(typ);
	for (Instrument i : intrs)
	{
	System.out.println(i);
	}
	}
	@Test
	public void findByTypeIdTyp()
	{
	List<Instrument> intrs = InstrumentRepository.findByTypeIdTyp(1L);
	for (Instrument i : intrs)
	{
	System.out.println(i);
	}
	 }
	
	@Test
	public void findByOrderByNomInstrumentAsc()
	{
	List<Instrument> intrs =
			InstrumentRepository.findByOrderByNomInstrumentAsc();
	for (Instrument i : intrs)
	{
	System.out.println(i);
	}
	}
	@Test
	public void trierInstrumentsNomsPrix()
	{
	List<Instrument> intrs = InstrumentRepository.trierInstrumentsNomsPrix();
	for (Instrument i : intrs)
	{
	System.out.println(i);
	}
	}

}

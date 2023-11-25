package com.syrine.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomIntr", types = { Instrument.class })
public interface InstrumentProjection {
	public String getNomInstrument();

}

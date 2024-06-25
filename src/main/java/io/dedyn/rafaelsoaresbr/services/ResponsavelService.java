package io.dedyn.rafaelsoaresbr.services;

import org.springframework.stereotype.Service;

import io.dedyn.rafaelsoaresbr.data.ResponsavelRepository;

@Service
public class ResponsavelService {
	
	private final ResponsavelRepository repository;

    public ResponsavelService(ResponsavelRepository repository) {
        this.repository = repository;
    }

}

package io.dedyn.rafaelsoaresbr.services;

import org.springframework.stereotype.Service;

import io.dedyn.rafaelsoaresbr.data.AlunoRepository;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

}

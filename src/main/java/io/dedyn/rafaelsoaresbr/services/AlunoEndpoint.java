package io.dedyn.rafaelsoaresbr.services;

import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.Endpoint;
import com.vaadin.hilla.crud.CrudRepositoryService;

import io.dedyn.rafaelsoaresbr.data.Aluno;
import io.dedyn.rafaelsoaresbr.data.AlunoRepository;
import jakarta.annotation.security.RolesAllowed;

@Endpoint
@BrowserCallable
@RolesAllowed("ADMIN")
public class AlunoEndpoint extends CrudRepositoryService<Aluno, Long, AlunoRepository>  {

}

package io.dedyn.rafaelsoaresbr.services;

import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.Endpoint;
import com.vaadin.hilla.crud.CrudRepositoryService;

import io.dedyn.rafaelsoaresbr.data.Escola;
import io.dedyn.rafaelsoaresbr.data.EscolaRepository;
import jakarta.annotation.security.RolesAllowed;

@Endpoint
@BrowserCallable
@RolesAllowed("ADMIN")
public class EscolaEndpoint  extends CrudRepositoryService<Escola, Long, EscolaRepository>  {

}

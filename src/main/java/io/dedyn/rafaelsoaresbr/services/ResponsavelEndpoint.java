package io.dedyn.rafaelsoaresbr.services;

import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.Endpoint;
import com.vaadin.hilla.crud.CrudRepositoryService;

import io.dedyn.rafaelsoaresbr.data.Responsavel;
import io.dedyn.rafaelsoaresbr.data.ResponsavelRepository;
import jakarta.annotation.security.RolesAllowed;

@Endpoint
@BrowserCallable
@RolesAllowed("ADMIN")
public class ResponsavelEndpoint extends CrudRepositoryService<Responsavel, Long, ResponsavelRepository> {

}

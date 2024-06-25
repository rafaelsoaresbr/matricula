package io.dedyn.rafaelsoaresbr.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EscolaRepository extends JpaRepository<Escola, Long>, JpaSpecificationExecutor<Escola> {

}

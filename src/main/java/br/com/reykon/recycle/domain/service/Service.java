package br.com.reykon.recycle.domain.service;

import java.util.Optional;

public interface Service<E, D> {

    Optional<E> findById(Long id);
    void save(D user);

}

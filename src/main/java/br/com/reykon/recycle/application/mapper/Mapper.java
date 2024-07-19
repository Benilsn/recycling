package br.com.reykon.recycle.application.mapper;

public interface Mapper <E, D> {

    E toEntity(D dto);
    D toDto(E dto);

}

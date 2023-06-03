package org.klozevitz.easybot_test.model;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IDaoDB<E> {
    E save(E e);
    @Transactional
    E update(E e);
    List<E> findAll();
    E findById(int id);
    boolean isPresent(int serial);
}

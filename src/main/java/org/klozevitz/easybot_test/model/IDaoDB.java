package org.klozevitz.easybot_test.model;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IDaoDB<E> {
    E save(E e);
    E update(E e);
    List<E> findAll();
    E findById(int id);
    boolean isPresent(int serial);
}

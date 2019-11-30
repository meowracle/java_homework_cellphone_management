package com.codegym.services;

import com.codegym.models.Category;
import com.codegym.models.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PhoneService {
    Page<Phone> findAll(Pageable pageable);

    Phone findById(Long id);

    void save (Phone phone);

    void remove (Long id);

    Iterable<Phone> findAllByCategory(Category category);

    Page<Phone> findAllByNameContaining(String name, Pageable pageable);
}

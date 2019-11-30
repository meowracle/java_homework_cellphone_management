package com.codegym.repositories;

import com.codegym.models.Category;
import com.codegym.models.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PhoneRepository extends PagingAndSortingRepository<Phone, Long> {
    Iterable<Phone> findAllByCategory(Category category);

    Page<Phone> findAllByNameContaining(String name, Pageable pageable);
}

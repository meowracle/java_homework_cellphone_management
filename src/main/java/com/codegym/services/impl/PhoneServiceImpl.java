package com.codegym.services.impl;

import com.codegym.models.Category;
import com.codegym.models.Phone;
import com.codegym.repositories.PhoneRepository;
import com.codegym.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneRepository phoneRepository;


    @Override
    public Page<Phone> findAll(Pageable pageable) {
        return phoneRepository.findAll(pageable);
    }

    @Override
    public Phone findById(Long id) {
        return phoneRepository.findOne(id);
    }

    @Override
    public void save(Phone phone) {
        phoneRepository.save(phone);
    }

    @Override
    public void remove(Long id) {
        phoneRepository.delete(id);
    }

    @Override
    public Iterable<Phone> findAllByCategory(Category category) {
        return phoneRepository.findAllByCategory(category);
    }

    @Override
    public Page<Phone> findAllByNameContaining(String name, Pageable pageable) {
        return phoneRepository.findAllByNameContaining(name, pageable);
    }
}

package com.farukgenc.boilerplate.springboot.items.service;

import com.farukgenc.boilerplate.springboot.model.Item;

import java.util.Optional;


public interface ItemsService {
    Item findByTitle(String title);

    Optional<Item> findById(Long id);
}

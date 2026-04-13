package com.farukgenc.boilerplate.springboot.items.service;

import com.farukgenc.boilerplate.springboot.repository.ItemRepository;


import com.farukgenc.boilerplate.springboot.model.Item;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ItemsServiceImpl implements ItemsService {

    private final ItemRepository itemRepository;

    @Override
    public Item findByTitle(String title) {
        return itemRepository.findByTitle(title);
    }

    @Override
    public Optional<Item> findById(Long id) {
        return itemRepository.findById(id);
    }
}

package com.farukgenc.boilerplate.springboot.controller;

import com.farukgenc.boilerplate.springboot.model.Item;
import com.farukgenc.boilerplate.springboot.items.service.ItemsService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ItemsController {

	private final ItemsService itemsService;

	@GetMapping("/items")
	@Operation(tags = "Items", description = "Get all items")
	public ResponseEntity<Item> getAllItems() {

		Item itemsResponse = itemsService.findByTitle("test");
		return ResponseEntity.status(200).body(itemsResponse);
	}

}

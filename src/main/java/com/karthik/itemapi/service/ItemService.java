package com.karthik.itemapi.service;

import com.karthik.itemapi.dto.ItemRequest;
import com.karthik.itemapi.dto.ItemResponse;
import com.karthik.itemapi.model.Item;
import com.karthik.itemapi.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private Long currentId = 1L;

    public ItemResponse addItem(ItemRequest request) {

        Item item = new Item(
                currentId++,
                request.getName(),
                request.getDescription(),
                request.getPrice(),
                LocalDateTime.now()
        );

        items.add(item);

        return mapToResponse(item);
    }

    public ItemResponse getItemById(Long id) {

        Item item = items.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst()
                .orElseThrow(() ->
                        new ResourceNotFoundException("Item not found with id: " + id));

        return mapToResponse(item);
    }

    private ItemResponse mapToResponse(Item item) {
        return new ItemResponse(
                item.getId(),
                item.getName(),
                item.getDescription(),
                item.getPrice(),
                item.getCreatedAt()
        );
    }
}
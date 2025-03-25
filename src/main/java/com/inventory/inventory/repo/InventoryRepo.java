package com.inventory.inventory.repo;

import com.inventory.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Inventory,Integer> {
}

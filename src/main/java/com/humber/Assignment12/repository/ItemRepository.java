package com.humber.Assignment12.repository;

import com.humber.Assignment12.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    @Query("SELECT i FROM Item i WHERE i.brand = :brand AND i.yearOfCreation = :year")
    List<Item> findByBrandAndYear(@Param("brand") String brand, @Param("year") int year);
}

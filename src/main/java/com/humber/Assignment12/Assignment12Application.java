package com.humber.Assignment12;

import com.humber.Assignment12.model.Brand;
import com.humber.Assignment12.model.Item;
import com.humber.Assignment12.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Arrays;

@SpringBootApplication
public class Assignment12Application implements CommandLineRunner {

    @Autowired
    private ItemRepository itemRepository;

    public static void main(String[] args) {
        SpringApplication.run(Assignment12Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Populate the database with some initial items
        Item item1 = new Item();
        item1.setName("T-Shirt");
        item1.setBrand(Brand.DIOR);
        item1.setYearOfCreation(2022);
        item1.setPrice(new BigDecimal("1999"));

        Item item2 = new Item();
        item2.setName("Jeans");
        item2.setBrand(Brand.STONE_ISLAND);
        item2.setYearOfCreation(2022);
        item2.setPrice(new BigDecimal("4999"));

        Item item3 = new Item();
        item3.setName("Jacket");
        item3.setBrand(Brand.BALENCIAGA);
        item3.setYearOfCreation(2022);
        item3.setPrice(new BigDecimal("8999"));

        Item item4 = new Item();
        item4.setName("Shoes 222");
        item4.setBrand(Brand.BALENCIAGA);
        item4.setYearOfCreation(2022);
        item4.setPrice(new BigDecimal("1286.40"));

        Item item5 = new Item();
        item5.setName("Hat 570");
        item5.setBrand(Brand.DIOR);
        item5.setYearOfCreation(2022);
        item5.setPrice(new BigDecimal("1528.31"));

        Item item6 = new Item();
        item6.setName("Shoes 362");
        item6.setBrand(Brand.DIOR);
        item6.setYearOfCreation(2024);
        item6.setPrice(new BigDecimal("1126.00"));

        Item item7 = new Item();
        item7.setName("Jacket 342");
        item7.setBrand(Brand.BALENCIAGA);
        item7.setYearOfCreation(2024);
        item7.setPrice(new BigDecimal("1491.74"));

        Item item8 = new Item();
        item8.setName("Sweater 517");
        item8.setBrand(Brand.STONE_ISLAND);
        item8.setYearOfCreation(2024);
        item8.setPrice(new BigDecimal("1062.62"));

        Item item9 = new Item();
        item9.setName("Hat 975");
        item9.setBrand(Brand.DIOR);
        item9.setYearOfCreation(2022);
        item9.setPrice(new BigDecimal("1563.34"));

        Item item10 = new Item();
        item10.setName("Pants 234");
        item10.setBrand(Brand.DIOR);
        item10.setYearOfCreation(2022);
        item10.setPrice(new BigDecimal("1317.33"));

        Item item11 = new Item();
        item11.setName("Shoes 949");
        item11.setBrand(Brand.DIOR);
        item11.setYearOfCreation(2022);
        item11.setPrice(new BigDecimal("1327.81"));

        Item item12 = new Item();
        item12.setName("Sweater 178");
        item12.setBrand(Brand.STONE_ISLAND);
        item12.setYearOfCreation(2022);
        item12.setPrice(new BigDecimal("1787.88"));

        Item item13 = new Item();
        item13.setName("Jacket 836");
        item13.setBrand(Brand.STONE_ISLAND);
        item13.setYearOfCreation(2023);
        item13.setPrice(new BigDecimal("1308.76"));

        Item item14 = new Item();
        item14.setName("T-shirt 348");
        item14.setBrand(Brand.BALENCIAGA);
        item14.setYearOfCreation(2024);
        item14.setPrice(new BigDecimal("1754.76"));

        Item item15 = new Item();
        item15.setName("Hat 184");
        item15.setBrand(Brand.STONE_ISLAND);
        item15.setYearOfCreation(2022);
        item15.setPrice(new BigDecimal("1031.45"));

        itemRepository.saveAll(Arrays.asList(item1, item2, item3,item4, item5, item6, item7, item8, item9, item10, item11, item12, item13, item14, item15));
    }
}

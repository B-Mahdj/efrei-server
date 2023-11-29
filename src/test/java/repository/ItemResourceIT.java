package fr.efrei.repository;

import fr.efrei.domain.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestPropertySource(
        locations = "classpath:application-test.properties")
public class ItemResourceIT {
    @Autowired
    private ItemRepository itemRepository;

//    @Test
//    @Transactional
//    void createItem() throws Exception {
//        System.out.println(itemRepository.findAll());
//        int databaseSizeBeforeCreate = itemRepository.findAll().size();
//        assertThat(databaseSizeBeforeCreate).isEqualTo(0);
//
//        List<Item> itemList = itemRepository.findAll();
//        assertThat(itemList).hasSize(databaseSizeBeforeCreate + 1);
//    }
}
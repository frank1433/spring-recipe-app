package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @author frank
 * @create 2020-12-24
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class CategoryRepositoryIT {
    @Autowired
    CategoryRepository categoryRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByDescription() {
        Optional<Category> categoryOptional=categoryRepository.findByDescription("Fast Food");
        assertEquals("Fast Food", categoryOptional.get().getDescription());
    }
}
package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.eq;

/**
 * @author frank
 * @create 2020-12-24
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class RecipeRepositoryIT {
    @Autowired
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByDescription() {
        Optional<Recipe> recipeOptional=recipeRepository.findByDescription("mamamia");
        assertEquals("mamamia", recipeOptional.get().getDescription());
    }
    @Test
    public void findBySource() {
        Optional<Recipe> recipeOptional=recipeRepository.findBySource("from china");
        assertEquals("from china", recipeOptional.get().getSource());
    }
}
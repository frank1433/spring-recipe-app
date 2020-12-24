package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author frank
 * @create 2020-12-24
 */
public class NotesTest {
    Notes notes;

    @Before
    public void setUp() throws Exception {
        notes=new Notes();
    }

    @Test
    public void setId() {
        Long idValue=4L;
        notes.setId(idValue);
        assertEquals(idValue, notes.getId());
    }

    @Test
    public void setRecipe() {
    }

    @Test
    public void setRecipeNotes() {
    }
}
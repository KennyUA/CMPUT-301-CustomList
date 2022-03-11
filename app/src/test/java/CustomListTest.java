import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NS"));
        assertEquals(list.getCount(),listSize+1);
    }

    @Test
    public void testHasCity(){
        list.addCity(new City("Vancouver", "British Columbia"));
        assertTrue(list.hasCity(new City("Vancouver", "British Columbia")));
    }

    @Test
    public void testDelete(){
        City city = new City("Quebec City", "Quebec");
        list.addCity(city);
        list.delete(city);
        assertFalse(list.hasCity(city));
    }


    @Test
    public void testCountCities() {
        City city = new City("Coquitlam", "British Columbia");
        assertEquals(1,list.countCities());
    } 
}

package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findWhiskeyByYear() {
		List<Whisky> whiskiesFound = whiskyRepository.findByYear(2020);
		assertEquals(1, whiskiesFound.size());
	}

	@Test
	public void findDistilleryByRegion(){
		List<Distillery> distilleriesFound = distilleryRepository.findByRegion("Lowland");
		assertEquals(2, distilleriesFound.size());
	}

//	@Test
//	public void findWhiskeyFromDistilleryAge(){
//		Whisky whisk
//		List<Whisky> whiskiesFound = whiskyRepository.findByDistilleriesAge()
//	}

}

package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Weather;
import com.example.demo.repository.WeatherRepository;


@Service
public class WeatherService {
	@Autowired
	 public WeatherRepository werepo;
		
	 //posting information
	 public Weather saveInfo(Weather ol)
	 {
	  return werepo.save(ol);
	 }
		
	 //getting information
	 public List<Weather> getDet()
	 {
	  return werepo.findAll();
	 }
		
	 //updating information
	 public Weather updateInfo(Weather se)
	 {
	  return werepo.saveAndFlush(se);
	 }
		
	 //deleting information
	 public void deleteDetails(int no)
	 {
		 werepo.deleteById(no);
	 }
	 public Weather getDetails(int id)
	 {
	 	return werepo.findById(id).get();
	 }
}

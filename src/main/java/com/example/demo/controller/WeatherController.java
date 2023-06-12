package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Weather;
import com.example.demo.service.WeatherService;


@RestController
@CrossOrigin("http://localhost:3000")
public class WeatherController {
	@Autowired
	 public WeatherService weser;
		
	 @PostMapping("/saveWeather")
		
	 public Weather saveInfo(@RequestBody Weather w)
	 {
	  return weser.saveInfo(w);
	 }
		
	 @GetMapping("/getWeather")
	 public List<Weather> getDetails()
	 {
	  return weser.getDet();
	 }
		
	 @PutMapping("/updateWeather")
	 public Weather updateDetails(@RequestBody Weather no)
	 {
	  return weser.updateInfo(no);
	 }
		
	 //PathVariable
	 @DeleteMapping("/deleteWeather/{no}")
	 public String deleteDetails(@PathVariable("no") int no)
	 {
	   weser.deleteDetails(no);
	   return "Deleted";
	 }
	 @GetMapping("/getweather/{id}")
		public Weather getDetails(@PathVariable int id)
		{
			return weser.getDetails(id);
		}
}

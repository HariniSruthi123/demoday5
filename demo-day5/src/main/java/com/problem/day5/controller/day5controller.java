package com.problem.day5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.problem.day5.entity.Day5entity;
import com.problem.day5service.Day5service;

public class day5controller {



@RestController
public class Day5controller {
	@Autowired
	Day5service service;
	
	@PostMapping("addstudent")
	public Day5entity adds(@RequestBody Day5entity ss) {
		return service.saveinfo(ss);
	}
	@PostMapping("addnstudent")
	public List<Day5entity> addndetails(@RequestBody List<Day5entity> ss){
		return service.savedetails(ss);
	}
	
	@GetMapping("showdetails")
	public List<Day5entity> show(){
		return service.showinfo();
		
	}
	//show by id
	@GetMapping("showdetbyid/{id}")
		public Optional<Day5entity> showid(@PathVariable int id){
			return service.showbyid(id);
		}
	
	@PutMapping("update")
	public Day5entity modify(@RequestBody Day5entity ss ) {
		return service.changeinfo(ss);
	}
	@PutMapping("updatebyid/{id}")
	public String modifybyid(@PathVariable int id, @RequestBody Day5entity ss) {
		return service.updateinfobyid(id,ss);
	}
	@DeleteMapping("deletedetail")
		public String del(@RequestBody Day5entity ss) {
			service.deleteinfo(ss);
			return "Deleted successfully";
		}
	
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id) {
		service.deleteid(id);
	}
	
	@DeleteMapping("delparamid")
	public void deletemyparamid (@RequestParam int id) {
		service.deletepid(id);
	}}
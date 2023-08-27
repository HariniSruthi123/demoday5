package com.problem.day5service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.craddle.Studententity.Studententity;
import com.example.craddle.Studentrepository.Studentrepository;
import com.problem.day5.entity.Day5entity;

@Service
public class Day5service {

	@Autowired
	Studentrepository repository;
	
	public Studententity saveinfo(Studententity ss) {
		return repository.save(ss);
	}
	public List<Studententity> savedetails(List<Studententity> ss){
		return (List<Studententity>)sr.saveAll(ss);
	}
	public List<Studententity> showinfo(){
		return repository.findAll();
	}
	public Optional<Studententity> showinfo(int id){
		return repository.findById(id);
	}
	//get by id
	public Optional<Studententity> showbyid(int id){
		return repository.findById(id);
	}
	public Studententity changeinfo(Studententity ss) {
		return repository.saveAndFlush(ss);
	}
	
	public String updateinfobyid(int id,Day5entity ss) {
		repository.saveAndFlush(ss);
		if(repository.existsById(id)) {
			return "UPDATED";
		}
		else {
			return "Enter valid id";
		}
	}
	public void deleteinfo(Studententity ss) {
		repository.delete(ss);
	}
	
	public void deleteid(int id) {
		repository.deleteById(id);
	}
	
	public void deletepid(int id) {
		repository.deleteById(id);
	}
}
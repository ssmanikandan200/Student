package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StaffDao {
	@Autowired
	StaffRepo sr;

	public String addInfo(StaffEntity se) {
		sr.save(se);
		return "data added";
	}

	public String updateInfo(StaffEntity se) {
		sr.save(se);
		return "data updated";
	}

	public String deleteInfo(int id) {
		sr.deleteById(id);
		return "data deleted";
	}

	public Optional<StaffEntity> getAll(int id) {
		return sr.findById(id);
	}

	public List<StaffEntity> getAll() {
		return sr.findAll();
	}
}

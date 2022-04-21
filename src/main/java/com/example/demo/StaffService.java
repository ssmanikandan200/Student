package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
	@Autowired
	StaffDao sd;

	public String addInfo(StaffEntity se) {
		return sd.addInfo(se);
	}

	public String updateInfo(StaffEntity se) {
		return sd.updateInfo(se);
	}

	public String deleteInfo(int id) {
		return sd.deleteInfo(id);
	}

	public Optional<StaffEntity> getAll(int id) {
		return sd.getAll(id);
	}

	public List<StaffEntity> getAll() {
		return sd.getAll();
	}
}

package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StaffController {
	@Autowired
	StaffService ss;

	@PostMapping(value = "/addInfo")

	public String addInfo(@RequestBody StaffEntity se) {
		return ss.addInfo(se);
	}

	@PutMapping(value = "/updateInfo")
	public String updateInfo(@RequestBody StaffEntity se) {
		return ss.updateInfo(se);
	}

	@DeleteMapping(value = "/deleteInfo/{id}")
	public String deleteInfo(@PathVariable int id) {
		return ss.deleteInfo(id);

	}

	@GetMapping(value = "/getInfo/{id}")

	public Optional<StaffEntity> getAll(@PathVariable int id) {
		return ss.getAll(id);

	}

	public List<StaffEntity> getAll() {
		return ss.getAll();
	}
}

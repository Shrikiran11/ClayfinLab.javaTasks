package com.example.demo;
import java.util.*;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	@Autowired
	private HomeService hashMapService;
	
	@GetMapping("/getAll")
	public HashMap<Integer,String> getAll() {
		HashMap<Integer,String> hashMap = hashMapService.getAll();
		 return hashMap;
	}
}

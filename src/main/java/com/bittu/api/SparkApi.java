package com.bittu.api;

import java.io.IOException;
import java.util.List;

import com.bittu.service.impl.WordCountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bittu.model.Word;
import com.bittu.service.WordCountService;

@RestController
public class SparkApi {

	@Autowired
	private WordCountService wordCountService;
	private WordCountServiceImpl service;

	@GetMapping("/wordcount")
	public List<Word> wordCountList() throws IOException {
		return this.wordCountService.getCount();
	}

	@GetMapping("/hello")
	public String hello() throws IOException {
		return this.service.sayHello();
	}

}

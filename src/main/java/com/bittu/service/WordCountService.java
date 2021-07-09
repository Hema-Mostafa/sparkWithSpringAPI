package com.bittu.service;

import java.io.IOException;
import java.util.List;

import com.bittu.model.Word;

public interface WordCountService {

	public List<Word> getCount() throws IOException;
//	public String sayHello() throws IOException;
}

package com.myphotos.demo.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotoController 
{
	@RequestMapping("/api/photos")
	public Iterable<Photo> getAll()
	{
		
	}
}

package com.myphotos.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.myphotos.demo.model.Photo;

@Service("mainPhotoService")
public class DbPhotoService implements IPhotoService 
{
	
	public DbPhotoService() {}
	
	@Override
	public Iterable<Photo> getAll()
	{
		return new ArrayList<Photo>();
	}
	
	@Override
	public Optional<Photo> getById(int id)
	{
		return Optional.empty();
	}
	
	@Override
	public Photo create(Photo photo)
	{
		return null;
	}
	
	@Override
	public Optional<Photo> update(int id, Photo photo)
	{
		return Optional.empty();
	}
	
	@Override
	public Boolean delete(int id)
	{
		return false;
	}
}


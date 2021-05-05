package com.project.interfaces;

import java.util.List;

import com.project.entity.SampleUser;

public interface ISampleUserDAO {
	public boolean insertUser(SampleUser user);
	public List<SampleUser> getAllUsers();
	public SampleUser getSampleUserByID(int userID);
	public boolean removeUser(int userID);
//	public boolean updateUser(SampleUser user);
}



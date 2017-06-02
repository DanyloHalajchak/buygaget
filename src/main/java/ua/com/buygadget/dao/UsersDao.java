package ua.com.buygadget.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ua.com.buygadget.entity.Color;
import ua.com.buygadget.entity.User;

@Repository
public interface UsersDao extends JpaRepository <User, Integer>{


	
}

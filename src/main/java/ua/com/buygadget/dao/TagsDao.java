package ua.com.buygadget.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ua.com.buygadget.entity.Color;
import ua.com.buygadget.entity.Tag;
@Repository
public interface TagsDao extends JpaRepository <Tag, Integer>{

}

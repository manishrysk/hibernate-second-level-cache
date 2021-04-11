package com.devtalkers.hibernate2levelcache.repository;

import com.devtalkers.hibernate2levelcache.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {


}

package com.gokart.GokartAPI.Repo;

import com.gokart.GokartAPI.Models.Kart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KartRepo extends JpaRepository<Kart,Long> {
}

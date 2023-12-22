package com.dao;

import com.entity.Constellations;

import java.util.List;

public interface ConstellationDao {
    List<Constellations> getAll(String sql);
}

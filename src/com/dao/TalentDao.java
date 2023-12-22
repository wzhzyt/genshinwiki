package com.dao;
import com.entity.Talents;
import java.util.List;

public interface TalentDao {
    List<Talents> getAll(String sql);
}

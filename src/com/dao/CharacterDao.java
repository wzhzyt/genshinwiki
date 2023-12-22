package com.dao;
import com.entity.Character;
import java.util.List;
public interface CharacterDao {
    List<Character> getAll(String sql);
    List<Character> search(String sql);
}

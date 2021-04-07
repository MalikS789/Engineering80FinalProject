package com.sparta.eng80.onetoonetracker.repositories;

import com.sparta.eng80.onetoonetracker.entities.GroupEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupRepository extends CrudRepository<GroupEntity, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM stream_group WHERE group_name = ?")
    Optional<GroupEntity> findByName(String name);

}

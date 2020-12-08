package com.example.gymmanager.repos;

import com.example.gymmanager.models.Schedule;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ScheduleRepository extends CrudRepository<Schedule, Integer> {

    List<Schedule> findByMemberNameContaining(String searchQuery);

}

package com.example.gymmanager.repos;

import com.example.gymmanager.models.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Integer> {

}

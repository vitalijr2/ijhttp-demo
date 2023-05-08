package io.gitlab.r2.ijhttpdemo.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundsRepository extends CrudRepository<Funds, Integer> {

}

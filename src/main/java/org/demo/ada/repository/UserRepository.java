package org.demo.ada.repository;

import org.demo.ada.domain.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AppUser, Long> {
}

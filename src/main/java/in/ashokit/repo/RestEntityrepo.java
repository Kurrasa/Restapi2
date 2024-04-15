package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.RestEntity;

@Repository
public interface RestEntityrepo extends JpaRepository<RestEntity, Integer> {

}

package ru.vlapin.experiments.arch04demo.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.vlapin.experiments.arch04demo.model.Cat;

@RepositoryRestResource
public interface CatRepository extends JpaRepository<Cat, UUID> {
}

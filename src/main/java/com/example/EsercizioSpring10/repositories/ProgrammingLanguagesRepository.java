package com.example.EsercizioSpring10.repositories;

import com.example.EsercizioSpring10.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource (path =   "repo-prog-languages", collectionResourceRel = "languages", itemResourceRel = "language")
public interface ProgrammingLanguagesRepository extends JpaRepository<ProgrammingLanguage,Long> {
}
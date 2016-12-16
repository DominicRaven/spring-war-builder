package uk.gov.metoffice.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uk.gov.metoffice.domain.Person;

/**
 * Created by dominic.raven on 16/12/2016.
 */
@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepo extends PagingAndSortingRepository<Person, Integer>{

    Person findPersonByName(String name);

}

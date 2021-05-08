package com.example.SpringTaskList.model;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 *
 * @author marcin
 */
//edycja sciezki adresu url, zmiana opisu / nazwy "obiektu" w przesylanych pakietach
//@RepositoryRestResource(path = "mytasks", collectionResourceRel = "mytasks")
@RepositoryRestResource
interface TaskRepository extends JpaRepository<Task, Integer> {

    @Override
    //wylaczenie metody delete http, nie mozna usuwac przy pomocy taska
    @RestResource(exported = false)
    public void delete(Task task);

    @Override
    @RestResource(exported = false)
    //jw, nie mozna usuwac przy pomocy id
    public void deleteById(Integer id);
    
    //wyszukiwanie taskow, ktore zostaly wykonane, pod jaka nazwa ma sie
    //znajdowac w opisie akcji hateoas link do zasobow skonczonych taskow
    @RestResource(path = "donetasks", rel = "donetasks")
    List<Task> findByDone(@Param("isdone") boolean done);
    
}

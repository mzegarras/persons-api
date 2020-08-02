package net.msonic.versioning.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonsController {


    @GetMapping(value = "/{id}",headers ="X-API-Version=1")
    public PersonV1 getPersonV1(@PathVariable("id") long id){

        PersonV1 personV1 = new PersonV1();
        personV1.setId(id);
        personV1.setName("Manuel");

        return personV1;

    }

    @GetMapping(value = "/{id}",headers ="X-API-Version=2")
    public PersonV2 getPersonV2(@PathVariable("id") long id){
        PersonV2 personV2 = new PersonV2();
        personV2.setId(id);
        personV2.setName("Manuel");
        personV2.setAge(350);
        return personV2;
    }

}

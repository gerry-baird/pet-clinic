package com.gerry.petclinic.services;

import com.gerry.petclinic.model.Owner;

import java.util.List;
//Some comment
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);

}

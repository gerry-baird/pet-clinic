package com.gerry.petclinic.services.map;

import com.gerry.petclinic.model.Speciality;
import com.gerry.petclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

package com.example.jpamappingrelations.serviceiml;

import com.example.jpamappingrelations.model.Laptop;
import com.example.jpamappingrelations.repository.LaptopRepository;
import com.example.jpamappingrelations.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LapTopSerivceImp implements LaptopService {

    @Autowired
    LaptopRepository laptopRepository;

    @Override
    public Laptop get(Integer id) {
        return laptopRepository.getOne(id);
    }

    @Override
    public void saveLaptop(Laptop laptop) {
        laptopRepository.save(laptop);
    }
}

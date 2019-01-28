package com.example.jpamappingrelations.service;

import com.example.jpamappingrelations.model.Laptop;

public interface LaptopService {
    public Laptop get(Integer id);

    public void saveLaptop(Laptop laptop);
}

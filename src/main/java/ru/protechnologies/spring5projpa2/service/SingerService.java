/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.protechnologies.spring5projpa2.service;

import java.util.List;
import ru.protechnologies.spring5projpa2.entities.Singer;

/**
 *
 * @author hitman
 */
public interface SingerService {
    
    List<Singer> findAll();
    List<Singer> findAllWithAlbum();
    Singer findById(Long id);
    Singer save(Singer singer);
    void delete(Singer singer);
    public List<Singer> findAllByNativeQuery();
}

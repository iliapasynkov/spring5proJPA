/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.protechnologies.spring5projpa2.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.protechnologies.spring5projpa2.view.SingerSummary;

/**
 *
 * @author hitman
 */
@Service("singerSummaryService")
@Repository
@Transactional
public class SingerSummaryServiceImpl implements SingerSummaryService {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @Override
    public List<SingerSummary> findAll() {
        List<SingerSummary> result = em.createQuery(
                "select new ru.protechnologies.spring5projpa2.view.SingerSummary("
                + "s.firstName, s.lastName, a.title) from Singer s "
                + "left join s.albums a "
                + "where a.releaseDate=(select max(a2.releaseDate)"
                + "from Album a2 where a2.singer.id = s.id)",
                SingerSummary.class
        ).getResultList();
        return result;
    }

}

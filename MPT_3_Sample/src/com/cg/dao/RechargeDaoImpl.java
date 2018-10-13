package com.cg.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.bean.Recharge;

@Repository
@Transactional
public class RechargeDaoImpl implements IRechargeDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public int addRechargeDetails(Recharge rech) {
		em.persist(rech);
		System.out.println(rech.getRechargeId());
		return rech.getRechargeId();
	}

	@Override
	public ArrayList<Recharge> getAllRechargeInfo() {
		Query qry=em.createNamedQuery("getAllRecharge");
		return (ArrayList<Recharge>) qry.getResultList();
	}

}

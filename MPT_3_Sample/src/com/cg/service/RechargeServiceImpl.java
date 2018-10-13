package com.cg.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Recharge;
import com.cg.dao.IRechargeDao;

@Service
public class RechargeServiceImpl implements IRechargeService{

	
	@Autowired
	IRechargeDao rdao;
	
	@Override
	public int addRechargeDetails(Recharge rech) {
		int b=rdao.addRechargeDetails(rech);
		return b;
	}

	@Override
	public ArrayList<Recharge> getAllRechargeInfo() {
		return rdao.getAllRechargeInfo();
	}

}

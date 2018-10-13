package com.cg.dao;

import java.util.ArrayList;

import com.cg.bean.Recharge;

public interface IRechargeDao {

	int addRechargeDetails(Recharge rech);

	ArrayList<Recharge> getAllRechargeInfo();

}

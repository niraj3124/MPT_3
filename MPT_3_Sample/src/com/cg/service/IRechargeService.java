package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.Recharge;

public interface IRechargeService {

	int addRechargeDetails(Recharge rech);

	ArrayList<Recharge> getAllRechargeInfo();

}

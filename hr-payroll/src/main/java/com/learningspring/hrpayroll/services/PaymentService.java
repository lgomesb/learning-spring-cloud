package com.learningspring.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningspring.hrpayroll.entities.Payment;
import com.learningspring.hrpayroll.entities.Worker;
import com.learningspring.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
//	@Value("${hr-worker.host}")
//	private String workerHost;
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment( long workerId, int days ) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}

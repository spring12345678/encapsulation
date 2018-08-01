package com.spring.Encapsulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.model.BillSummary;

@SpringBootApplication
public class EncapsulationApplication {

	public static void main(String[] args) {
		Double grandTotal;
		BillSummary bb = new BillSummary();
		bb.setSubTotal(1500.00);
		bb.setVatAmt(50.00);
		bb.setPkgChargeAmt(1200.00);
		bb.setDelChargeAmt(120.00);
		bb.setPromoAmt(1500.00);
		grandTotal = (bb.getSubTotal()) - (bb.getPromoAmt())
				+ (bb.getVatAmt() + bb.getDelChargeAmt() + bb.getPkgChargeAmt());
		System.out.println(grandTotal);
		SpringApplication.run(EncapsulationApplication.class, args);

	}

}

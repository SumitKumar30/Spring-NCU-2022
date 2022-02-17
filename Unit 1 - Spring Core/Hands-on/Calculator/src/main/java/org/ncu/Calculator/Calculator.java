package org.ncu.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	MathService add;
	MathService sub;
	MathService mul;
	MathService div;

	@Autowired
	public Calculator(@Qualifier("additionService")MathService add, @Qualifier("subtractionService")MathService sub, @Qualifier("multiplicationService")MathService mul, @Qualifier("divisionService")MathService div) {
		this.add = add;
		this.sub = sub;
		this.mul = mul;
		this.div = div;
	}
	
	
	public void compute(String op, int x, int y) {
		if(op.equals("add")) {
			add.operate(x, y);
		}else if(op.equals("sub")) {
			sub.operate(x, y);
		}
		else if(op.equals("mul")) {
			mul.operate(x, y);
		}
		else if(op.equals("div")) {
			div.operate(x, y);
		}
		else {
			throw new RuntimeException(op+" is not a valid operation!!");
		}
	}
}

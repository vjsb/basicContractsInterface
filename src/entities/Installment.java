package entities;

import java.sql.Date;

public class Installment {

	private Date dueDate;
	private Double amount;
	
	public Installment(Date dueDate, Double amount) {
		super();
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	
	
}

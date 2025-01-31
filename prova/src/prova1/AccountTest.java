package prova1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testDepositAmount() {
		try {
	    	myAccount.withdrawAmount(2300);
	    } catch(Exception e){
        	System.err.println(e.getMessage());
            System.out.println("Error al retirar");
	    }
	}

	@Test
	void testWithdrawAmount() {
		try {
	    	 System.out.println("Ingrés al compte");
	    	 myAccount.depositAmount(1695);
	    } catch(Exception e){
	    	 System.err.println(e.getMessage());
	         System.out.println("Error en l'ingrés");
	    }
	}

}

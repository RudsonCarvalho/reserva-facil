package br.com.cvc.rf.domain.tax;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Test;

import br.com.cvc.rf.domain.Account;
import br.com.cvc.rf.domain.Transfer;

public class TransferTaxTest {

	Account from = new Account(null, null, null);
	Account to = new Account(null, null, null);

	@Test
	public void testSameDay() throws Exception {

		Transfer transfer = new Transfer(from, to, 1000d, Calendar.getInstance().getTime());

		double value = TransferTax.sameDay().applyTax(transfer);

		assertTrue(33d == value);
	}

	@Test
	public void testUntilTenDays() throws Exception {

		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, 5);

		Transfer transfer = new Transfer(from, to, 1000d, date.getTime());

		double value = TransferTax.untilTenDays().applyTax(transfer);

		assertTrue(60d == value);
	}

	@Test
	public void testUntilTenDays2() throws Exception {

		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, 6);

		Transfer transfer = new Transfer(from, to, 1000d, date.getTime());

		double value = TransferTax.untilTenDays().applyTax(transfer);

		assertTrue(72d == value);
	}

	@Test
	public void testUpToTwentyDays() throws Exception {

		Calendar date = Calendar.getInstance();

		date.add(Calendar.DAY_OF_MONTH, 15);

		Transfer transfer = new Transfer(from, to, 1000d, date.getTime());

		double value = TransferTax.upToTwentyDays().applyTax(transfer);

		assertTrue(80d == value);
	}

	@Test
	public void testUpToThirtyDays() throws Exception {

		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, 25);

		Transfer transfer = new Transfer(from, to, 1000d, date.getTime());

		double value = TransferTax.upToThirtyDays().applyTax(transfer);

		assertTrue(60d == value);
	}

	@Test
	public void testUpToFortyDays() throws Exception {

		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, 35);

		Transfer transfer = new Transfer(from, to, 1000d, date.getTime());

		double value = TransferTax.upToFortyDays().applyTax(transfer);

		assertTrue(40d == value);
	}

	@Test
	public void testOverFortyDays() throws Exception {

		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, 45);

		Transfer transfer = new Transfer(from, to, 100001d, date.getTime());

		double value = TransferTax.overFortyDays().applyTax(transfer);

		assertTrue(2000.02d == value);
	}
	
	@Test
	public void testOverFortyDays2() throws Exception {

		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, 45);

		Transfer transfer = new Transfer(from, to, 100000.00d, date.getTime());

		double value = TransferTax.overFortyDays().applyTax(transfer);

		assertTrue(0d == value);
	}
}
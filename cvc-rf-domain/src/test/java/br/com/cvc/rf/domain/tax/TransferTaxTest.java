package br.com.cvc.rf.domain.tax;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import br.com.cvc.rf.domain.Account;
import br.com.cvc.rf.domain.Transfer;

public class TransferTaxTest {

	Account account1 = new Account(null, null, null);
	Account account2 = new Account(null, null, null);

	@Test
	public void testSameDay() throws Exception {

		Transfer transfer = new Transfer(account1, account2, 1000d, Calendar.getInstance().getTime());

		
		TransferTax result = ReflectionTestUtils.invokeMethod(TransferTax.class, "sameDay");

		double value = result.applyTax(transfer);

		assertTrue(33d == value);
	}

	@Test
	public void testUntilTenDays() throws Exception {

		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, 5);

		Transfer transfer = new Transfer(account1, account2, 1000d, date.getTime());

		TransferTax result = ReflectionTestUtils.invokeMethod(TransferTax.class, "untilTenDays");

		double value = result.applyTax(transfer);

		assertTrue(60d == value);
	}

	@Test
	public void testUntilTenDays2() throws Exception {

		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, 6);

		Transfer transfer = new Transfer(account1, account2, 1000d, date.getTime());

		TransferTax result = ReflectionTestUtils.invokeMethod(TransferTax.class, "untilTenDays");

		double value = result.applyTax(transfer);

		assertTrue(72d == value);
	}

	@Test
	public void testUpToTwentyDays() throws Exception {

		Calendar date = Calendar.getInstance();

		date.add(Calendar.DAY_OF_MONTH, 15);

		Transfer transfer = new Transfer(account1, account2, 1000d, date.getTime());

		TransferTax result = ReflectionTestUtils.invokeMethod(TransferTax.class, "upToTwentyDays");

		double value = result.applyTax(transfer);

		assertTrue(80d == value);
	}

	@Test
	public void testUpToThirtyDays() throws Exception {

		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, 25);

		Transfer transfer = new Transfer(account1, account2, 1000d, date.getTime());

		TransferTax result = ReflectionTestUtils.invokeMethod(TransferTax.class, "upToThirtyDays");

		double value = result.applyTax(transfer);

		assertTrue(60d == value);
	}

	@Test
	public void testUpToFortyDays() throws Exception {

		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, 35);

		Transfer transfer = new Transfer(account1, account2, 1000d, date.getTime());

		TransferTax result = ReflectionTestUtils.invokeMethod(TransferTax.class, "upToFortyDays");

		double value = result.applyTax(transfer);

		assertTrue(40d == value);
	}

	@Test
	public void testOverFortyDays() throws Exception {

		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, 45);

		Transfer transfer = new Transfer(account1, account2, 100001d, date.getTime());

		TransferTax result = ReflectionTestUtils.invokeMethod(TransferTax.class, "overFortyDays");

		double value = result.applyTax(transfer);

		assertTrue(2000.02d == value);
	}
	
	@Test
	public void testOverFortyDays2() throws Exception {

		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, 45);

		Transfer transfer = new Transfer(account1, account2, 100000.00d, date.getTime());

		TransferTax result = ReflectionTestUtils.invokeMethod(TransferTax.class, "overFortyDays");

		double value = result.applyTax(transfer);

		assertTrue(0d == value);
	}
}
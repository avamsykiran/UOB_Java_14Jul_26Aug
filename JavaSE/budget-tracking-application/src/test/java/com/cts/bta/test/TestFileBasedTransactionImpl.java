package com.cts.bta.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cts.bta.dao.FileBasedTransactionDaoImpl;
import com.cts.bta.exception.BTAException;
import com.cts.bta.model.Transaction;
import com.cts.bta.model.TransactionType;

public class TestFileBasedTransactionImpl {

	public static final String DATA_FILE_NAME = "./txns.data";

	private Map<Long, Transaction> testData;

	private FileBasedTransactionDaoImpl dao;

	@BeforeEach
	void setUp() throws FileNotFoundException, IOException, BTAException {

		testData = new TreeMap<Long, Transaction>();
		testData.put(1L, new Transaction(1L, "Salary", 55000.0, TransactionType.INCOME, LocalDate.now()));
		testData.put(2L, new Transaction(2L, "Salary", 2500.0, TransactionType.EXPENCE, LocalDate.now()));
		testData.put(3L, new Transaction(3L, "Salary", 2500.0, TransactionType.EXPENCE, LocalDate.now()));

		File file = new File(DATA_FILE_NAME);
		ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(file));
		fout.writeObject(this.testData);

		dao = new FileBasedTransactionDaoImpl();
	}

	@AfterEach
	void cleanUp() {
		File file = new File(DATA_FILE_NAME);
		file.delete();
		this.testData = null;
		this.dao = null;
	}

	@Test
	@DisplayName("getAll should return a list having three records")
	void testGetAll() throws BTAException {
		Transaction[] actual = dao.getAll().toArray(new Transaction[] {});
		Transaction[] expected = testData.values().toArray(new Transaction[] {});
		assertArrayEquals(expected, actual);
	}

	@Test
	@DisplayName("add should return the same transaction that is passed")
	void testAdd() throws BTAException {

		Transaction txn = new Transaction(null, "Birthday Party", 2500.0, TransactionType.EXPENCE, LocalDate.now());
		Transaction actual = dao.add(txn);

		assertAll(() -> assertEquals(actual.getTxnId(), 4L), () -> assertEquals(txn.getHeader(), actual.getHeader()),
				() -> assertEquals(txn.getType(), actual.getType()),
				() -> assertEquals(txn.getAmount(), actual.getAmount()),
				() -> assertEquals(txn.getTxnDate(), actual.getTxnDate()),
				() -> assertSame(dao.getAll().get(3), actual));
	}

	@Test
	@DisplayName("delete should delete the record given the id")
	void testDeleteById() throws BTAException {
		dao.deleteById(2);
		assertNull(dao.getById(2));
	}
}

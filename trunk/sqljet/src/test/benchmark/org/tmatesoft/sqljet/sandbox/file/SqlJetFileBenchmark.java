package org.tmatesoft.sqljet.sandbox.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SqlJetFileBenchmark {

	private static final int files = 60000;

	final private Random random = new Random();

	final private byte[] data;
	final private ByteBuffer buffer;

	private File file;

	public SqlJetFileBenchmark() {
		data = new byte[1024];
		random.nextBytes(data);
		buffer = ByteBuffer.wrap(data);
	}

	@Before
	public void setUp() throws Exception {
		file = File.createTempFile("test", "tmp", new File("./"));
	}

	@After
	public void tearDown() throws Exception {
		file.delete();
	}

	private void print(String s) {
		System.out.print(s);
	}

	@Test
	public void test() throws Exception {
		print("for " + files + " files:\n\n");
		with(1);
		with(10);
		with(100);
		with(1000);
	}

	private void with(int arg) throws Exception {
		for (String name : calls.keySet()) {
			time(name, arg, calls.get(name));
		}
	}

	private void time(String name, int arg, Call action) throws Exception {
		print(name + "(" + arg + "kb)");
		long start = System.currentTimeMillis();
		for (int i = 0; i < files; i++) {
			action.call(arg);
			file.delete();
		}
		long end = System.currentTimeMillis();
		print("  " + (end - start) + " ms\n");
	}

	private interface Call {
		void call(int arg) throws Exception;
	}

	private Map<String, Call> calls = new LinkedHashMap<String, Call>();
	{
		calls.put("fos", new Call() {
			public void call(int arg) throws Exception {
				fos(arg);
			}
		});
		calls.put("raf", new Call() {
			public void call(int arg) throws Exception {
				raf(arg);
			}
		});
		calls.put("rafChannel", new Call() {
			public void call(int arg) throws Exception {
				rafChannel(arg);
			}
		});
		calls.put("rafChannelOnce", new Call() {
			public void call(int arg) throws Exception {
				rafChannelOnce(arg);
			}
		});
	}

	private void fos(int arg) throws Exception {
		final FileOutputStream fos = new FileOutputStream(file);
		try {
			for (int i = 0; i < arg; i++) {
				fos.write(data);
			}
		} finally {
			fos.close();
		}
	}

	private void raf(int arg) throws Exception {
		final RandomAccessFile raf = new RandomAccessFile(file, "rw");
		try {
			for (int i = 0; i < arg; i++) {
				raf.write(data);
			}
		} finally {
			raf.close();
		}
	}

	private void rafChannel(int arg) throws Exception {
		final RandomAccessFile raf = new RandomAccessFile(file, "rw");
		try {
			for (int i = 0; i < arg; i++) {
				buffer.clear();
				raf.getChannel().write(buffer);
			}
		} finally {
			raf.close();
		}
	}

	private void rafChannelOnce(int arg) throws Exception {
		final RandomAccessFile raf = new RandomAccessFile(file, "rw");
		try {
			final FileChannel channel = raf.getChannel();
			for (int i = 0; i < arg; i++) {
				buffer.clear();
				channel.write(buffer);
			}
		} finally {
			raf.close();
		}
	}

}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

public class TryAndCatch {
	public void handlingSomeoneElsesException(){
		BufferedReader bufferedReader = new BufferedReader(Reader.nullReader());
		try {
			bufferedReader.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void passingTheBuckForHandlingSomeoneElsesException() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(Reader.nullReader());
			bufferedReader.read();
	}

	public void throwingAnException(int numberOfExamples) {
		if (numberOfExamples < 0) {
			throw new IllegalArgumentException();
		}
	}

	public void throwingCustomException(int numberOfExamples) {
		if (numberOfExamples < 0) {
			throw new NumberOfExamplesIsNegativeException();
		}
	}

	public void swallowingAnException() {
		try {
			methodThatThrowsImportantException();
		} catch (BillsImportantException e) {
			e.printStackTrace();
		}
	}

	private void methodThatThrowsImportantException() throws BillsImportantException {
		throw new BillsImportantException();
	}
}

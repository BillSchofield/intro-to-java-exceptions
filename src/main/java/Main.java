import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		TryAndCatch tryAndCatch = new TryAndCatch();
		tryAndCatch.handlingSomeoneElsesException();
		tryAndCatch.passingTheBuckForHandlingSomeoneElsesException();
		tryAndCatch.throwingAnException(-1);
		tryAndCatch.throwingCustomException(-1);
		tryAndCatch.swallowingAnException();
	}
}

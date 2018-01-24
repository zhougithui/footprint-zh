package zh.footprint.zmy.optimisticlock.exception;

public class OptimisticLockingException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	public OptimisticLockingException(String message) {
		super(message);
	}
}

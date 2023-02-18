package db;

public class DbIntegrityExcepction extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public DbIntegrityExcepction (String msg) {
		super(msg);
	}
}

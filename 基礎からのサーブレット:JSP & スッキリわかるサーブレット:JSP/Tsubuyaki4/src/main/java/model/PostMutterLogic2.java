package model;

public class PostMutterLogic2 {
	public void execute(Mutter mutter) {
		MuttersDAO dao = new MuttersDAO();
		dao.create(mutter);
	}
}

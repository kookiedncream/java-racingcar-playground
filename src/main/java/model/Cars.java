package model;


public class Cars {
	public static final String WHITE_SPACE = " ";
	public static final String NONE_SPACE = "";
	public static final String COMMA = ",";
	private Members members;

	public Cars(String words) {
		this.members = getMembers(words);
	}

	private Members getMembers(String words) {
		Members members = new Members();

		String[] split = words.replace(WHITE_SPACE, NONE_SPACE)
				.split(COMMA);

		for (String s : split) {
			members.add(new Car(s));
		}

		return members;
	}

	public int size() {
		return members.size();
	}
}

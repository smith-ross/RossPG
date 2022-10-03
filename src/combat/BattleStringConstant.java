package combat;

public enum BattleStringConstant {
	TURN_START_MSG("%s's Turn!〚 ❤️ 【%d/%d】 | 🔮 【%d/%d】 〛");
	
	private String val;
	BattleStringConstant(String val) {
		this.val = val;
	}
	public String getValue() {
		return this.val;
	}
	
}

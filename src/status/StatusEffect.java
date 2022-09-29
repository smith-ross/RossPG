package status;

public class StatusEffect {
	private StatusEffectType type;
	private StatusEffectSeverity severity;
	
	public StatusEffect(StatusEffectType type, StatusEffectSeverity severity) {
		this.type = type;
		this.severity = severity;
	}
	
	public void applyEffect() {
		System.out.println("Nothing happened!");
	}
	
}

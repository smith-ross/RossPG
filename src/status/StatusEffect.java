package status;

public abstract class StatusEffect {
	private StatusEffectType type;
	private StatusEffectSeverity severity;
	
	public StatusEffect(StatusEffectType type, StatusEffectSeverity severity) {
		this.type = type;
		this.severity = severity;
	}
	
	public abstract void applyEffect();
	
}

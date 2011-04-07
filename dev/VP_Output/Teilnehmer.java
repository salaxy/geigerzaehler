import java.util.ArrayList;

public class Teilnehmer {
	private boolean _gespielt;
	private String _position;
	private boolean _alsStimmfuehrer;
	private boolean _alsErsatz;
	private ArrayList<Wunsch> _wuensche = new ArrayList<Wunsch>();
	private Hauptinstrument _hauptinstrument;
	private ArrayList<AngestellterMusiker> _teilnehmer = new ArrayList<AngestellterMusiker>();
	private Dienst _dienste;

	public Teilnehmer() {
		throw new UnsupportedOperationException();
	}

	public Teilnehmer(AngestellterMusiker aAngMusiker) {
		throw new UnsupportedOperationException();
	}

	public void teilEin(AngestellterMusiker aAngMusiker, Dienst aDienst) {
		throw new UnsupportedOperationException();
	}
}
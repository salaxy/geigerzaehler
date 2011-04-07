import java.util.ArrayList;

public class Dienst {
	private String _name;
	private Time _beginn;
	private ENUM_Time _tageszeit;
	private Time _dauer;
	private String _bemerkung;
	private Diensttyp _diensttyp;
	private ArrayList<Teilnehmer> _teilnehmer = new ArrayList<Teilnehmer>();
	private Besetzung _besetzung;

	public void gibtPunkte() {
		throw new UnsupportedOperationException();
	}
}
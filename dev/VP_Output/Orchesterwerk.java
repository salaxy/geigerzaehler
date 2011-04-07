import java.util.ArrayList;

public class Orchesterwerk {
	private String _name;
	private ENUM _typ;
	private String _komponist;
	private Time _dauer;
	private boolean _noten;
	private ArrayList<Besetzung> _besetzungen = new ArrayList<Besetzung>();
}
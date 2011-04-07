import java.util.ArrayList;

public class Besetzung {
	private ENUM _typ;
	private ArrayList<Dienst> _dienste = new ArrayList<Dienst>();
	private Dirigent _dirigent;
	private ArrayList<Hauptinstrument> _hauptinstrumente = new ArrayList<Hauptinstrument>();
	private ArrayList<Schlagwerkinstrument> _schlagwerkintrumente = new ArrayList<Schlagwerkinstrument>();
	private ArrayList<Sonderinstrument> _sonderinstrumente = new ArrayList<Sonderinstrument>();
	private Orchesterwerk _orchesterwerk;
}
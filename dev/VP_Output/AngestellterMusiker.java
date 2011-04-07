import java.util.ArrayList;

public class AngestellterMusiker extends Musiker {
	private Date _gebDatum;
	private String _gebOrt;
	private String _bankverbindung;
	private Date _anstellungsdatum;
	private boolean _solist;
	private boolean _stimmfuehrer;
	private Object _bild;
	private Teilnehmer _angMusiker;
	private ArrayList<Instrument> _instrumente = new ArrayList<Instrument>();
	private ArrayList<Substitut> _substituten = new ArrayList<Substitut>();
	private ArrayList<Punktekonto> _punktekonto = new ArrayList<Punktekonto>();
	private Stimmgruppe _stimmgruppen;
}
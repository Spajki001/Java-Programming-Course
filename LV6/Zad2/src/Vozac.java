public class Vozac extends Zaposlenik {

    public Vozac(String id, String ime, String prezime) {
        super(id, ime, prezime);
    }

    @Override
    public void radi() {
        System.out.println("Vozim");
    }

}
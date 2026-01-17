package controleMachine2023;

public class Duree {
	private int totalSeconds;
	


	
	public Duree() {
		this.totalSeconds = 0;
	}

	
	public Duree(int secondes) {
		if (secondes>86399 || secondes<0)
			throw new IllegalArgumentException("error");
		this.totalSeconds = secondes;
	}
	


	public Duree (int heure,int minute,int secondes) {
	
	if (secondes>59 || minute>59 || heure >23 || secondes<0 || minute<0 || heure<0) {
		throw new IllegalArgumentException("error");
	}
	this.totalSeconds=heure*3600 + minute*60 + secondes;
	}


	public int getTotalSeconds() {
		return this.totalSeconds;
	}


	
	public int heure () {
		int heure= this.totalSeconds/3600;
		return heure;
	}


	public int minute () {
		int resteSecondes = this.totalSeconds % 3600;
		int minute = resteSecondes / 60;
		
		return minute;
	}
	
	public int seconde () {
		int resteSecondes = this.totalSeconds % 3600;
		int seconde = resteSecondes%60;
		
		return seconde;
	}
	
	
	
	public Duree ajouterSecondes (int secondes ) {
		
		Duree d = new Duree (this.totalSeconds+secondes);
		return d;
		
	}
	
	
	
	public String toString () {
		
		return "la durée entrée est : " + this.heure() + " heures " + this.minute() + " minutes " + this.seconde() + " secondes." ;
	}
	








	public static void main(String[] args) {
		Duree d = new Duree(7200);
		boolean hey = !false;
System.out.print(hey);
	}

}

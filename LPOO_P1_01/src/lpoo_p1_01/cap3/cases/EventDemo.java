package lpoo_p1_01.cap3.cases;

import java.util.Scanner;

public class EventDemo {
	private static Scanner in = new Scanner(System.in);

	public static int solicitud() {

		System.out.println("Introduzca cuantas personas asistiran: ");
		int invitados = in.nextInt();

		return invitados;
	}

	public static String getEventNumber() {

		System.out.println("Introduzca el numero de evento : ");
		in.nextLine();
		String eventNumber = in.nextLine();

		return eventNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event evento = new Event();
		evento.setNumberOfGuestsForEvent(solicitud());
		evento.setEventNumber(getEventNumber());
		new CarlysEventPriceWithMethods().display();
		System.out.println(evento.toString()); 
	}

}

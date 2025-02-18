public class Event {

	private String eventID;
	private String eventName;
	private String dateTime;
	private String venue;
	private double price;
	private int availableSeats;
	private String genre;
	private int numberOfTickets;

	public Event() {
		// TODO - implement Event.Event
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param eventID
	 * @param eventName
	 * @param dateTime
	 * @param venue
	 * @param price
	 * @param genre
	 * @param numberOFTickets
	 */
	public Event(String eventID, String eventName, String dateTime, String venue, double price, String genre, int numberOFTickets) {
		// TODO - implement Event.Event
		throw new UnsupportedOperationException();
	}

	public String getDateTime() {
		return this.dateTime;
	}

	/**
	 * 
	 * @param dateTime
	 */
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getEventID() {
		return this.eventID;
	}

	/**
	 * 
	 * @param eventID
	 */
	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	public String getEventName() {
		return this.eventName;
	}

	/**
	 * 
	 * @param eventName
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getVenue() {
		return this.venue;
	}

	/**
	 * 
	 * @param venue
	 */
	public void setVenue(String venue) {
		this.venue = venue;
	}

	public double getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public String getGenre() {
		return this.genre;
	}

	/**
	 * 
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getNumberOfTickets() {
		return this.numberOfTickets;
	}

	/**
	 * 
	 * @param numberOfTickets
	 */
	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}


	/**
	 * 
	 * @param eventID
	 */
	public String viewEventDetails(String eventID) {
		// TODO - implement Event.viewEventDetails
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param availableSeats
	 */
	public String checkAvailability(int availableSeats) {
		// TODO - implement Event.checkAvailability
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numberOfTickets
	 * @param eventName
	 */
	public String bookTicket(int numberOfTickets, String eventName) {
		// TODO - implement Event.bookTicket
		throw new UnsupportedOperationException();
	}

}
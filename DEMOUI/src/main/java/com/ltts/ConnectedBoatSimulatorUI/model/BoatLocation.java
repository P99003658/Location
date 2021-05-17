package com.ltts.ConnectedBoatSimulatorUI.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BoatLocation {
	
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private int locationid;
    private String boatid;
    private double latitude;
	private double longitude;
	private int altitude;
	private String heading;
    private String timestamp;
	
	public BoatLocation() {
		super();
	}

	public int getLocationid() {
		return locationid;
	}

	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}

	public String getBoatid() {
		return boatid;
	}

	public void setBoatid(String boatid) {
		this.boatid = boatid;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Main [locationid=" + locationid + ", boatid=" + boatid + ", latitude=" + latitude + ", longitude="
				+ longitude + ", altitude=" + altitude + ", heading=" + heading + ", timestamp=" + timestamp + "]";
	}
}

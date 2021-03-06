package fr.ingesup.vroumvroum.ws.models.events;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name="event_ride")
public class EventRide {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="nb_votes")
	private int nbVotes;
	
	@ManyToOne
	@JoinColumn(name="event_id")
	@JsonIgnore
	private Event event;
	
	@ManyToOne
	@JoinColumn(name="ride_id")
	private Ride ride;
}

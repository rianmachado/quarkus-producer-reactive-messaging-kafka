package rian.demo.kafka;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PlayedMovie {

	public int id;
	public long duration;

	public PlayedMovie(int id, long duration) {
		this.id = id;
		this.duration = duration;
	}
}

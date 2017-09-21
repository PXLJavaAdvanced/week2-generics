package be.pxl.generics.opdracht2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeamRankingTest {

	@Test
	public void testThreePointsForGameWon() {
		Team<SoccerPlayer> ourTeam = new Team<>("OurTeam");
		ourTeam.matchResult(null, 9, 5);
		assertEquals(3, ourTeam.ranking());
	}
	
	@Test
	public void testOnePointForGameTied() {
		Team<SoccerPlayer> ourTeam = new Team<>("OurTeam");
		ourTeam.matchResult(null, 5, 5);
		assertEquals(1, ourTeam.ranking());
	}
	
	@Test
	public void testZeroPointsForGameLost() {
		Team<SoccerPlayer> ourTeam = new Team<>("OurTeam");
		ourTeam.matchResult(null, 5, 9);
		assertEquals(0, ourTeam.ranking());
	}
	
	
	@Test
	public void testPointsAreCorrectlyAdded() {
		Team<SoccerPlayer> ourTeam = new Team<>("OurTeam");
		ourTeam.matchResult(null, 9, 5);
		ourTeam.matchResult(null, 9, 5);
		ourTeam.matchResult(null, 5, 5);
		ourTeam.matchResult(null, 5, 5);
		assertEquals(8, ourTeam.ranking());
	}
	
	
}

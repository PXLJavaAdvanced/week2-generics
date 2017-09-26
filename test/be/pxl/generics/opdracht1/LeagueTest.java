package be.pxl.generics.opdracht1;

public class LeagueTest {
	
	public static void main(String[] args) {
		Team<SoccerPlayer> ourTeam = new Team<>("OurTeam");
		Team<SoccerPlayer> opponentTeam = new Team<>("OpponentTeam");
		Team<SoccerPlayer> otherOpponentTeam = new Team<>("OOT");
		League<SoccerPlayer> soccerLeague = new League<>();
		soccerLeague.addTeam(ourTeam);
		soccerLeague.addTeam(opponentTeam);
		soccerLeague.addTeam(otherOpponentTeam);
		ourTeam.matchResult(opponentTeam, 9, 5);
		ourTeam.matchResult(otherOpponentTeam, 5, 9);
		otherOpponentTeam.matchResult(opponentTeam, 5, 5);
		soccerLeague.printTeams();
	}
	
}

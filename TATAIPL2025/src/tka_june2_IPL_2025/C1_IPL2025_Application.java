package tka_june2_IPL_2025;

import java.util.List;

public class C1_IPL2025_Application {
	public static void main(String[] args) { // UI - Front for Client
		C3_PlayerController pc = null;
		List<C2_Player> playerList = null;
		C2_Player player = null;
		String msg = null;
		
		System.out.println("**** Welcome to IPL 2025 ****");
		
		System.out.println("All Players List : ");
		pc = new C3_PlayerController();
		playerList = pc.getPlayersList();
		playerList.forEach(System.out::println);
		
		System.out.println("\n1. Player Details by ID: ");
		player = pc.getPlayersById(11);
		System.out.println(player);
		
		System.out.println("\n2. Player Details by Name: ");
		player = pc.getPlayersByName("SHAMI");
		System.out.println(player);
		
		System.out.println("\n3. Player Details by TeamName: ");
		playerList = pc.getPlayersByTeamName("RCB");
		playerList.forEach(System.out::println);
		
		System.out.println("\n4. Player Details of Batsman : ");
		playerList = pc.getPlayersByRole("Batsman");
		playerList.forEach(System.out::println);
		
		System.out.println("\n5. Player Details of Bowlers : ");
		playerList = pc.getPlayersByRole("Bowler");
		playerList.forEach(System.out::println);
		
		System.out.println("\n6. Player Details Highest TotalRuns : ");
		player = pc.getPlayersByHighRuns();
		System.out.println(player);
		
		System.out.println("\n7. Player Details Highest Wickets : ");
		player = pc.getPlayersByHighWickets();
		System.out.println(player);
		
		System.out.println("\n8. Player Details Highest Catches : ");
		
		System.out.println("\n9. Insert Player : ");
		C2_Player newPlayer = new C2_Player(13, "ABD", "Batsman", 147, 6, "RCB", 47);
//		msg = pc.insertNewPlayers(newPlayer);
//		System.out.println(msg);

		System.out.println("\n10. Update Player Team Name : ");
		msg = pc.updatePlayerTeam("HARDIK", "MI");
		System.out.println(msg);
		
		System.out.println("\n11. Update Player TotalRuns : ");
		msg = pc.updatePlayerRuns("AXAR", 50);
		System.out.println(msg);
		
		System.out.println("\n12. Delete Player : ");
		msg = pc.deletePlayer("GILL");
		System.out.println(msg);
		
	}
}

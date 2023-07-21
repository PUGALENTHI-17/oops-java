import java.util.Scanner;

class tennis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPoints = Integer.parseInt(scanner.nextLine());
        String winners = scanner.nextLine();
        
        int gamesA = 0;
        int gamesB = 0;
        int setsA = 0;
        int setsB = 0;
        int currentSet = 1;
        
        for (int point = 0; point < totalPoints; point++) {
            char winner = winners.charAt(point);
            
            if (winner == 'A') {
                if (gamesA == 40 && gamesB == 40) {
                    gamesA = 45; // Advantage A
                } else if (gamesA == 45) {
                    gamesA = 0;
                    gamesB = 0; // A wins the game
                    setsA++;
                } else if (gamesA < 40) {
                    gamesA += 15;
                }
            } else if (winner == 'B') {
                if (gamesA == 40 && gamesB == 40) {
                    gamesB = 45; // Advantage B
                } else if (gamesB == 45) {
                    gamesA = 0;
                    gamesB = 0; // B wins the game
                    setsB++;
                } else if (gamesB < 40) {
                    gamesB += 15;
                }
            }
            
            if (currentSet < 3) {
                if (gamesA == 6 && gamesB < 5) {
                    setsA++;
                    gamesA = 0;
                    gamesB = 0;
                    currentSet++;
                } else if (gamesB == 6 && gamesA < 5) {
                    setsB++;
                    gamesA = 0;
                    gamesB = 0;
                    currentSet++;
                } else if (gamesA == 6 && gamesB == 6) {
                    // Tiebreaker for set 3
                    int pointsA = 0;
                    int pointsB = 0;
                    for (int i = point + 1; i < totalPoints; i++) {
                        if (winners.charAt(i) == 'A') {
                            pointsA++;
                        } else if (winners.charAt(i) == 'B') {
                            pointsB++;
                        }
                        
                        if (pointsA >= 7 && pointsA - pointsB >= 2) {
                            setsA++;
                            gamesA = 0;
                            gamesB = 0;
                            currentSet++;
                            point = i;
                            break;
                        } else if (pointsB >= 7 && pointsB - pointsA >= 2) {
                            setsB++;
                            gamesA = 0;
                            gamesB = 0;
                            currentSet++;
                            point = i;
                            break;
                        }
                    }
                }
            } else {
                if (gamesA - gamesB >= 2 && gamesA >= 6) {
                    setsA++;
                    gamesA = 0;
                    gamesB = 0;
                } else if (gamesB - gamesA >= 2 && gamesB >= 6) {
                    setsB++;
                    gamesA = 0;
                    gamesB = 0;
                }
            }
        }
        
        System.out.println(setsA + "-" + setsB + ", " + gamesA + "-" + gamesB);
        
        if (setsA > setsB && setsA > 1) {
            System.out.println("A is the winner");
        } else if (setsB > setsA && setsB > 1) {
            System.out.println("B is the winner");
        } else {
            System.out.println("Match is in progress");
        }
    }
}
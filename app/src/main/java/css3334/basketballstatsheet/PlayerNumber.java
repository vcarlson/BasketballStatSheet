package css3334.basketballstatsheet;

public class PlayerNumber {
    private String playerNumber;
    private int points;
    private int rebounds;
    private int assists;
    private int blocks;
    private int steals;
    private int turnovers;

    public PlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
        this.points = 0;
        this.assists = 0;
        this.rebounds = 0;
        this.blocks = 0;
        this.steals = 0;
        this.turnovers = 0;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public int getPoints() {
        return points;
    }

    public int getAssists() {
        return assists;
    }

    public int getRebounds() {
        return rebounds;
    }

    public int getBlocks() {
        return blocks;
    }

    public int getSteals() {
        return steals;
    }

    public int getTurnovers() {
        return turnovers;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public void addAssists(int assists) {
        this.assists += assists;
    }

    public void addRebounds(int rebounds) {
        this.rebounds += rebounds;
    }

    public void addBlocks(int blocks) {
        this.blocks += blocks;
    }

    public void addSteals(int steals) {
        this.steals += steals;
    }

    public void addTurnovers(int turnovers) {
        this.turnovers += turnovers;
    }
}

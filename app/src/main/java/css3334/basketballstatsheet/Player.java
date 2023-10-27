package css3334.basketballstatsheet;

public class Player {
    private int playerNumber;
    private int points;
    private int rebounds;
    private int assists;
    private int blocks;
    private int steals;
    private int turnovers;

    public Player() {
        this.playerNumber = 0;
        this.points = 0;
        this.assists = 0;
        this.rebounds = 0;
        this.blocks = 0;
        this.steals = 0;
        this.turnovers = 0;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public Integer getPoints() {
        return points;
    }

    public Integer getAssists() {
        return assists;
    }

    public Integer getRebounds() {
        return rebounds;
    }

    public Integer getBlocks() {
        return blocks;
    }

    public Integer getSteals() {
        return steals;
    }

    public Integer getTurnovers() {
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

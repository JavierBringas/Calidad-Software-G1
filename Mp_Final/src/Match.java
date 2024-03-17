import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

public class Match implements Serializable {
    private Character_App defiant;
    private int goldBet;
    private int rounds;
    private boolean minionsLeft;
    private Character_App defied;
    private Character_App winner;
    private LocalDateTime date;

    public Character_App getDefiant() {
        return defiant;
    }

    public void setDefiant(Character defiant) {
        this.defiant = defiant;
    }

    public int getGoldBet() {
        return goldBet;
    }

    public void setGoldBet(int goldBet) {
        this.goldBet = goldBet;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isMinionsLeft() {
        return minionsLeft;
    }

    public void setMinionsLeft(boolean minionsLeft) {
        this.minionsLeft = minionsLeft;
    }

    public Character_App getDefied() {
        return defied;
    }

    public void setDefied(Character defied) {
        this.defied = defied;
    }

    public Character_App getWinner() {
        return winner;
    }

    public void setWinner(Character winner) {
        this.winner = winner;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}

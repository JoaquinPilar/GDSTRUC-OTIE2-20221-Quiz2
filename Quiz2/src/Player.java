
import java.util.Objects;

// This is the player class

public record Player(int id, String name, int level) {

    @Override
    public String toString() {
        return "Player {" +
                "ID = " + id +
                ", Name = " + name +
                ", Level = " + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && level == player.level && Objects.equals(name, player.name);
    }

}
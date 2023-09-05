import java.util.HashMap;
import java.util.Set;

public class MapOfHashmatique {

    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Midnight Reverie", "In the stillness of the night, dreams come alive.");
        trackList.put("Ephemeral Echoes", "Fading whispers in the breeze, carried away by time.");
        trackList.put("Solitary Serenade", "Alone beneath the moon's soft glow, I sing a song for myself.");
        trackList.put("Labyrinth of Memories", "Lost within the corridors of my mind, I search for fragments of the past.");
        trackList.put("Aurora's Embrace", "Bathed in colors of the dawn, hope finds its way to me.");
        trackList.put("Eternal Skies", "Under the vast expanse of ever-changing heavens, our destinies intertwine.");

        System.out.println("--- Lyrics after getting the key of Eternal Skies: ---");
        String track = trackList.get("Eternal Skies");
        System.out.println(track);

        System.out.println("--- List of Title and Lyrics: ---");
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println("Song Title: " + key);
            System.out.println("Lyrics: " + trackList.get(key));
        }
    }
}
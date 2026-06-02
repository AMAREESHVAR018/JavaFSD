public class CommunityEvent {
    String name;
    String venue;

    CommunityEvent(String name, String venue) {
        this.name = name;
        this.venue = venue;
    }

    void display() {
        System.out.println("Event: " + name + ", Venue: " + venue);
    }

    public static void main(String[] args) {
        CommunityEvent event = new CommunityEvent("Music Festival", "Community Hall");
        event.display();
    }
}
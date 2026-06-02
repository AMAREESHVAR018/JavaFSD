class Ex17_CommunityEvent {
    String name;
    String venue;

    Ex17_CommunityEvent(String name, String venue) {
        this.name = name;
        this.venue = venue;
    }

    void display() {
        System.out.println("Ex32_Event: " + name + ", Venue: " + venue);
    }

    public static void main(String[] args) {
        Ex17_CommunityEvent event = new Ex17_CommunityEvent("Music Festival", "Community Hall");
        event.display();
    }
}



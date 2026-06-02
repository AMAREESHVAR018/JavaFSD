package com.community.jdbc;

public class JdbcCrudDemo {
    public static void main(String[] args) {
        EventDao dao = new EventDao();
        int eventId = dao.insertEventAndReturnId(new Event(0, "Community Workshop", "Learning"));
        if (eventId != -1) {
            dao.updateCategory(eventId, "Education");
        }

        for (Event event : dao.findAll()) {
            System.out.println(event.getId() + " " + event.getName() + " " + event.getCategory());
        }
    }
}
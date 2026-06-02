package com.community.jdbc;
class Ex32_JdbcCrudDemo {
    public static void main(String[] args) {
        Ex32_EventDao dao = new Ex32_EventDao();
        int eventId = dao.insertEventAndReturnId(new Ex32_Event(0, "Community Workshop", "Learning"));
        if (eventId != -1) {
            dao.updateCategory(eventId, "Education");
        }

        for (Ex32_Event event : dao.findAll()) {
            System.out.println(event.getId() + " " + event.getName() + " " + event.getCategory());
        }
    }
}




class Ex19_EventRegistration implements Ex19_Registerable {
    @Override
    public void register() {
        System.out.println("Registered for Workshop");
    }

    public static void main(String[] args) {
        Ex19_EventRegistration registration = new Ex19_EventRegistration();
        registration.register();
    }
}



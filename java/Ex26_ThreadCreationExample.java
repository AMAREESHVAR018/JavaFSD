class Ex26_ThreadCreationExample extends Thread {
    @Override
    public void run() {
        System.out.println("Ex32_Event reminder thread running");
    }

    public static void main(String[] args) {
        Ex26_ThreadCreationExample thread = new Ex26_ThreadCreationExample();
        thread.start();
    }
}



public class WelcomeToTheCity {
    public static String sayHello(String[] name, String city, String state){
        return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);
    }

        public static void main(String[] args) {
                System.out.println(sayHello(new String[]  {"John", "Dow"}, "Phoenix", "Arizona"));
            }
}

// Hello, John Smith! Welcome to Phoenix, Arizona!
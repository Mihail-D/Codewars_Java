class Dalmatians_SquashTheBugs {
    static String howManyDalmations(int number) {
        return number <= 10 ? "Hardly any" :
                number <= 50 ? "More than a handful!" :
                        number == 101 ? "101 DALMATIANS!!!" : "Woah that's a lot of dogs!";
    }

    public static void main(String[] args) {
        System.out.println(howManyDalmations(26));
    }
}

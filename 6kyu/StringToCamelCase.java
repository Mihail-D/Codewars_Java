public class StringToCamelCase {

    static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("[-_]");

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i].substring(0,1).toUpperCase()).append(arr[i].substring(1));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the_Stealth_Warrior"));
        System.out.println(toCamelCase("The-Stealth_Warrior"));
        System.out.println(toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields"));
    }
}

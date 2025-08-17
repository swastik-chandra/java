public class LearningIf {
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "vivek";
        System.out.println("before if ");
        if (isMale) {
            System.out.println("Mr." + name);

        } else {
            System.out.println("Ms." + name);


        }
        System.out.println("after if");

        boolean isSeniorCitizen = true;
        boolean isAnAdult = false;
        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        } else {
            if (isAnAdult) {
                System.out.println("hello Adult");
            } else {
                System.out.println("Hello Child ");

            }

        }
    }
}
package edu.kit.programming.assignment1.e;


public class FinalProgrammingScore {

    public static void main(String[] args) {
        int grade = 17;
        float min;
        float max;

        switch (grade) {
            case 50:
                min = 0;
                max = 19.5f;
                break;
            case 40:
                min = 20;
                max = 21.5f;
                break;
            case 37:
                min = 22;
                max = 23.5f;
                break;
            case 33:
                min = 24;
                max = 25.5f;
                break;
            case 30:
                min = 26;
                max = 27.5f;
                break;
            case 27:
                min = 28;
                max = 29.5f;
                break;
            case 23:
                min = 30;
                max = 31.5f;
                break;
            case 20:
                min = 32;
                max = 33.5f;
                break;
            case 17:
                min = 34;
                max = 35.5f;
                break;
            case 13:
                min = 36;
                max = 37.5f;
                break;
            case 10:
                min = 38;
                max = 40;
                break;
            default:
                throw new AssertionError();
        }

        System.out.printf("Wertebereich: %.1f - %.1f%n", min, max);
    }

}

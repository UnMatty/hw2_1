package ru.matprojects.stc31.hw2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        do {
            System.out.println("Please choose execution mode from 0 to 3: ");
            String buf = scanner.nextLine();

            try {
                int i = Integer.parseInt(buf);
                if (i < 0 || i > 3) {
                    System.out.println("wrong mode! available mode from 0 to 3");
                    continue;
                }

                switch (i) {
                    case 0:
                        System.out.println("Hello, World!");
                        break;
                    case 1:
                        getNPE();
                        break;
                    case 2:
                        getArrayIndexException();
                        break;
                    case 3:
                        getMyException();
                        break;
                    default:
                        System.out.println("wrong mode! available mode from 0 to 3");
                        continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("you need to enter number from 0 to 3");
                continue;
            } catch (Exception e) {
                throw e;
            }

            check = true;
        } while (!check);
    }

    /**
     * try to get NPE
     */
    private static void getNPE() {
        String test = null;
        if (test.equals("234")) {
            System.out.println("WOW!");
        }
    }

    /**
     * try to get ArrayIndexOutOfBoundsException
     */
    private static void getArrayIndexException() {
        int[] mas = {1, 2, 3};
        System.out.println(mas[4]);
    }

    /**
     * try to get NumberFormatException
     */
    private static void getMyException() throws Exception {
        throw new Exception("My Best Exception");
    }
}

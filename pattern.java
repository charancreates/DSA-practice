public class pattern {

    private void printPatternLabel(int patternNumber) {
        System.out.println("Pattern " + patternNumber);
        System.out.println();
    }

    public void pattern1() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public void pattern4() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    public void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void pattern6() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    public void pattern10(int n) {
        // pattern2();
        // pattern5(n - 1);
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            int num = (i % 2 == 0) ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num = 1 - num;
            }
            System.out.println();
        }
    }

    public void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(0);
            }
            for (int j = 2; j <= n - i; j++) {
                System.out.print(0);
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();

        }
    }

    public void pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    public void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            char c = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(c++);
            }
            System.out.println();
        }
    }

    public void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char c = 'A'; c < 'A' + n - i; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public void pattern16(int n) {
        char c = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
            c++;
        }
    }

    public void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            char c = 'A';
            int breakpoint = (2 * i + 1) / 2;

            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(c);
                if (j <= breakpoint) {
                    c++;
                } else {
                    c--;
                }
            }
            System.out.println();
        }
    }

    public void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char c = (char) ('E' - i); c <= 'E'; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public void pattern19(int n) {
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        int initspace = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= initspace; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
            initspace -= 2;
        }
    }

    public void pattern20(int n) {
        int initspace = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= initspace; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
            initspace -= 2;
        }
        for (int i = 1; i < n; i++) {
            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void pattern21(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*");
                } else if (j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        pattern p = new pattern();

        int n = 5;

        p.printPatternLabel(1);
        p.pattern1();
        System.out.println();

        p.printPatternLabel(2);
        p.pattern2();
        System.out.println();

        p.printPatternLabel(3);
        p.pattern3();
        System.out.println();

        p.printPatternLabel(4);
        p.pattern4();
        System.out.println();

        p.printPatternLabel(5);
        p.pattern5(n);
        System.out.println();

        p.printPatternLabel(6);
        p.pattern6();
        System.out.println();

        p.printPatternLabel(7);
        p.pattern7(n);
        System.out.println();

        p.printPatternLabel(8);
        p.pattern8(n);
        System.out.println();

        p.printPatternLabel(9);
        p.pattern9(n);
        System.out.println();

        p.printPatternLabel(10);
        p.pattern10(n);
        System.out.println();

        p.printPatternLabel(11);
        p.pattern11(n);
        System.out.println();

        p.printPatternLabel(12);
        p.pattern12(n);
        System.out.println();

        p.printPatternLabel(13);
        p.pattern13(n);
        System.out.println();

        p.printPatternLabel(14);
        p.pattern14(n);
        System.out.println();

        p.printPatternLabel(15);
        p.pattern15(n);
        System.out.println();

        p.printPatternLabel(16);
        p.pattern16(n);
        System.out.println();

        p.printPatternLabel(17);
        p.pattern17(n);
        System.out.println();

        p.printPatternLabel(18);
        p.pattern18(n);
        System.out.println();

        p.printPatternLabel(19);
        p.pattern19(n);
        System.out.println();

        p.printPatternLabel(20);
        p.pattern20(n);
        System.out.println();

        p.printPatternLabel(21);
        p.pattern21(n);
        System.out.println();

        p.printPatternLabel(22);
        p.pattern22(n);
    }
}

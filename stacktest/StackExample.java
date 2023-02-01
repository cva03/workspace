package stacktest;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;
public class StackExample {
        private Stack<SelectedOptions> backStack = new Stack<SelectedOptions>();

        public static void main(String args[]) {
            StackExample stackExample = new StackExample();
            stackExample.start();
        }

        private void start() {
            int choice;
            backStack.push(new SelectedOptions(0, 0));
            print(0, 0);
            do {
                Scanner input = new Scanner(System.in);
                System.out.println();
                System.out.println("Enter your option : ");
                choice = input.nextInt();
                if (choice == 9) {
                    backStack.pop();

                    if (backStack.isEmpty()) {
                        break;
                    }
                } else {
                    backStack.push(new SelectedOptions(backStack.peek().level + 1, choice));
                }
                SelectedOptions top = backStack.peek();
                print(top.level, top.choice);

            } while (choice != 0);
            System.out.println("Thank you for visiting our website...");

        }

        private void print(int level, int choice) {
            for (String choiceString : getChoices(level, choice)) {
                System.out.println(choiceString);
            }
        }

        // We can use HashMap instead of ArrayList also
        // we can use Database/Files/Json String/XML String/etc.. instead of Enum for
        // data storage
        ArrayList<String> getChoices(int level, int choice) {
            ArrayList<String> choiceList = new ArrayList<String>();
            if (level == 0) {
                choiceList.add(Level0.OPTION_1.toString());
                choiceList.add(Level0.OPTION_2.toString());
                choiceList.add(Level0.OPTION_3.toString());
                choiceList.add(Level0.OPTION_4.toString());
                choiceList.add(Level0.OPTION_5.toString());
            } else if (level == 1) {
                switch (choice) {
                    case 1:
                        choiceList.add(Level1_1.OPTION_1.toString());
                        choiceList.add(Level1_1.OPTION_2.toString());
                        choiceList.add(Level1_1.OPTION_3.toString());
                        choiceList.add(Level1_1.OPTION_4.toString());
                        choiceList.add(Level1_1.OPTION_5.toString());
                        choiceList.add(Level1_1.OPTION_6.toString());
                        break;
                    case 2:
                        choiceList.add(Level1_2.OPTION_1.toString());
                        choiceList.add(Level1_2.OPTION_2.toString());
                        choiceList.add(Level1_2.OPTION_3.toString());
                        choiceList.add(Level1_2.OPTION_4.toString());
                        break;
                }
            } else if (level == 2) {
                switch (choice) {
                    case 1:
                        choiceList.add(Level2_1_Recharge.OPTION_1.toString());
                        choiceList.add(Level2_1_Recharge.OPTION_2.toString());
                        choiceList.add(Level2_1_Recharge.OPTION_3.toString());
                        choiceList.add(Level2_1_Recharge.OPTION_4.toString());
                        break;
                    case 2:
                        choiceList.add(Level2_2_CallerTune.OPTION_1.toString());
                        choiceList.add(Level2_2_CallerTune.OPTION_2.toString());
                        choiceList.add(Level2_2_CallerTune.OPTION_3.toString());
                        choiceList.add(Level2_2_CallerTune.OPTION_4.toString());
                        choiceList.add(Level2_2_CallerTune.OPTION_5.toString());
                        choiceList.add(Level2_2_CallerTune.OPTION_6.toString());
                        break;
                    case 3:
                        choiceList.add(Level2_3_DTH.OPTION_1.toString());
                        choiceList.add(Level2_3_DTH.OPTION_2.toString());
                        choiceList.add(Level2_3_DTH.OPTION_3.toString());
                        choiceList.add(Level2_3_DTH.OPTION_4.toString());
                        choiceList.add(Level2_3_DTH.OPTION_5.toString());
                        break;
                    case 4:
                        choiceList.add(Level2_4_NewOffers.OPTION_1.toString());
                        choiceList.add(Level2_4_NewOffers.OPTION_2.toString());
                        choiceList.add(Level2_4_NewOffers.OPTION_3.toString());
                        choiceList.add(Level2_4_NewOffers.OPTION_4.toString());
                        choiceList.add(Level2_4_NewOffers.OPTION_5.toString());
                        choiceList.add(Level2_4_NewOffers.OPTION_6.toString());
                        break;
                }
            } else if (level == 3) {
                System.out.println("Your Option set Sucessfully");
                System.out.println("9-Back");
                System.out.println("0-Exit");
            }

            return choiceList;
        }

        public static class SelectedOptions {
            private int level;
            private int choice;

            SelectedOptions(int level, int choice) {
                this.level = level;
                this.choice = choice;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getChoice() {
                return choice;
            }

            public void setChoice(int choice) {
                this.choice = choice;
            }

        }

        public enum Level0 {
            OPTION_1("1.English"), OPTION_2("2.Tamil"), OPTION_3("3.Hindi"), OPTION_4("4.Telugu"), OPTION_5("0-Exit");

            private final String text;

            Level0(final String text) {
                this.text = text;
            }

            public String toString() {
                return text;
            }
        }

        public enum Level1_1 {
            OPTION_1("1.Rechare"), OPTION_2("2.Caller_Tune"), OPTION_3("3.DTH"), OPTION_4("4.New Offers"),
            OPTION_5("9-Back"), OPTION_6("0.Exit");

            private final String text;

            Level1_1(final String text) {
                this.text = text;
            }

            public String toString() {
                return text;
            }
        }

        public enum Level1_2 {
            OPTION_1("1.à®°à¯€à®œà®¾à®°à¯à®šà¯"), OPTION_2("2.à®•à®¾à®²à®°à¯ à®Ÿà®¿à®¯à¯à®©à¯"), OPTION_3("3.à®Ÿà®¿à®Ÿà®¿à®Žà®šà¯"), OPTION_4("4.à®ªà¯à®¤à®¿à®¯ à®†à®ƒà®ªà®°à¯");

            private final String text;

            Level1_2(final String text) {
                this.text = text;
            }

            public String toString() {
                return text;
            }
        }

        public enum Level2_1_Recharge {
            OPTION_1("1.Rechare through Airtel Payments Bank Account"), OPTION_2("2.Coupon Recharge"), OPTION_3("9.Back"),
            OPTION_4("0.Exit");

            private final String text;

            Level2_1_Recharge(final String text) {
                this.text = text;
            }

            public String toString() {
                return text;
            }
        }

        public enum Level2_2_CallerTune {
            OPTION_1("1.Arabic Kuthu"), OPTION_2("2.Mudhal Nee Mudivu Nee"), OPTION_3("3.Naaga Vera Maari"),
            OPTION_4("4.Two Two Two"), OPTION_5("9.Back"), OPTION_6("0-Exit");

            private final String text;

            Level2_2_CallerTune(final String text) {
                this.text = text;
            }

            public String toString() {
                return text;
            }
        }

        public enum Level2_3_DTH {
            OPTION_1("1.Airtel DTH HD Plan Rs.251=49Channels+30D"), OPTION_2("2.Airtel DTH â‚¹ 285 Pack = 68 Channels+30D"),
            OPTION_3("3.Airtel DTH â‚¹ 252 Pack = 78 Channels+30D"), OPTION_4("9.Back"), OPTION_5("0.Exit"),;

            private final String text;

            Level2_3_DTH(final String text) {
                this.text = text;
            }

            public String toString() {
                return text;
            }
        }

        public enum Level2_4_NewOffers {
            OPTION_1("1.265=UL call+1GB/D,28D"), OPTION_2("2.479=UL call+1.5GB/D,56D"),
            OPTION_3("3.299=UL call+1.5GB/D28D"), OPTION_4("4.549=UL call+25GB/D,56D"), OPTION_5("9.Back"),
            OPTION_6("0.Exit");

            private final String text;

            Level2_4_NewOffers(final String text) {
                this.text = text;
            }

            public String toString() {
                return text;
            }
        }
    }


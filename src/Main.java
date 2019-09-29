import com.sun.jdi.event.StepEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pin = sc.nextLine();
        List<String> pins = new ArrayList<>();
        int size = pin.length();
        char[] pinChar = pin.toCharArray();

        if (size == 8) {
            for (String q : nidNum(pinChar[0])) {
                for (String w : nidNum(pinChar[1])) {
                    for (String e : nidNum(pinChar[2])) {
                        for (String r : nidNum(pinChar[3])) {
                            for (String t : nidNum(pinChar[4])) {
                                for (String y : nidNum(pinChar[5])) {
                                    for (String u : nidNum(pinChar[6])) {
                                        for (String i : nidNum(pinChar[7])) {
                                            String rezult = q + w + e + r + t + y + u + i + "";
                                            pins.add(rezult);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (size == 7) {
            for (String q : nidNum(pinChar[0])) {
                for (String w : nidNum(pinChar[1])) {
                    for (String e : nidNum(pinChar[2])) {
                        for (String r : nidNum(pinChar[3])) {
                            for (String t : nidNum(pinChar[4])) {
                                for (String y : nidNum(pinChar[5])) {
                                    for (String u : nidNum(pinChar[6])) {
                                        String rezult = q + w + e + r + t + y + u + "";
                                        pins.add(rezult);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (size == 6) {
            for (String q : nidNum(pinChar[0])) {
                for (String w : nidNum(pinChar[1])) {
                    for (String e : nidNum(pinChar[2])) {
                        for (String r : nidNum(pinChar[3])) {
                            for (String t : nidNum(pinChar[4])) {
                                for (String y : nidNum(pinChar[5])) {
                                    String rezult = q + w + e + r + t + y + "";
                                    pins.add(rezult);
                                }
                            }
                        }
                    }
                }
            }
        } else if (size == 5) {
            for (String q : nidNum(pinChar[0])) {
                for (String w : nidNum(pinChar[1])) {
                    for (String e : nidNum(pinChar[2])) {
                        for (String r : nidNum(pinChar[3])) {
                            for (String t : nidNum(pinChar[4])) {
                                String rezult = q + w + e + r + t + "";
                                pins.add(rezult);
                            }
                        }
                    }
                }
            }
        } else if (size == 4) {
            for (String q : nidNum(pinChar[0])) {
                for (String w : nidNum(pinChar[1])) {
                    for (String e : nidNum(pinChar[2])) {
                        for (String r : nidNum(pinChar[3])) {
                            String rezult = q + w + e + r + "";
                            pins.add(rezult);

                        }
                    }
                }
            }
        } else if (size == 3) {
            for (String q : nidNum(pinChar[0])) {
                for (String w : nidNum(pinChar[1])) {
                    for (String e : nidNum(pinChar[2])) {
                        String rezult = q + w + e + "";
                        pins.add(rezult);
                    }
                }
            }
        } else if (size == 2) {
            for (String q : nidNum(pinChar[0])) {
                for (String w : nidNum(pinChar[1])) {
                    String rezult = q + w + "";
                    pins.add(rezult);

                }
            }
        } else if (size == 1) {
            for (String q : nidNum(pinChar[0])) {
                String rezult = q + "";
                pins.add(rezult);
            }
        }
        Collections.sort(pins);
        for (int i = 0; i < pins.size(); i++) {
            if (i == 0) {
                System.out.print(pins.get(i));
            } else {
                System.out.print("," + pins.get(i));
            }

        }
    }



    static final String[] num1 = new String[]{"1","2","4"};
    static final String[] num2 = new String[]{"1","2","3","5"};
    static final String[] num3 = new String[]{"2","3","6"};
    static final String[] num4 = new String[]{"1","4","5","7"};
    static final String[] num5 = new String[]{"2","4","5","6","8"};
    static final String[] num6 = new String[]{"3","5","6","9"};
    static final String[] num7 = new String[]{"4","7","8"};
    static final String[] num8 = new String[]{"5","7","8","9","0"};
    static final String[] num9 = new String[]{"6","8","9"};
    static final String[] num0 = new String[]{"0","8"};

    private static String[] nidNum(char r ){
        String s = r + "";
        int i = Integer.parseInt(s);
        if( i == 9){
            return num9;
        }else if(i == 1){
            return num1;
        }else if(i == 2){
            return num2;
        }else if(i == 3){
            return num3;
        }else if(i == 4){
            return num4;
        }else if(i == 5){
            return num5;
        }else if(i == 6){
            return num6;
        }else if(i == 7){
            return num7;
        }else if(i == 8){
            return num8;
        }else {
            return num0;
        }
    }

}

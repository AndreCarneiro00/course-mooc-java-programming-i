import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Grades {
    private ArrayList<Integer> grades;
    public Grades() {
        this.grades = new ArrayList<Integer>();
    };

    public void promptForGrades() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            Integer number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            if (number < 0 || number > 100) {
                continue;
            }

            grades.add(number);
        }

        System.out.println("Point average (all): " + calculateAllAverage());

        double passingAverage = calculatePassingAverage();
        System.out.println("Point average (passing): " + (passingAverage == 0.0 ? "-" : Double.toString(passingAverage)));
        System.out.println("Pass percentage: " + calculatePassingPercentage());
        printDistribution();
    }

    public double calculateAllAverage() {
        int sum = 0;
        for (int number : grades) {
            sum += number;
        }

        return 1.0 * sum / grades.size();
    }

    public double calculatePassingAverage() {
        int sum = 0;
        int size = grades.size();
        for (int number : grades) {
            if (number < 50) {
                size -= 1;
                continue;
            }
            sum += number;
        }

        if (size == 0) {
            return 0;
        }

        return 1.0 * sum / size;
    }

    public double calculatePassingPercentage() {
        int passingCount = 0;
        for (int number : grades) {
            if (number >= 50) {
                passingCount += 1;
            }
        }

        return 1.0 * passingCount / grades.size() * 100;
    }

    public void printDistribution() {
        Map<Integer, Integer> distributionMap = new HashMap<>();
        distributionMap.put(0, 0);
        distributionMap.put(1, 0);
        distributionMap.put(2, 0);
        distributionMap.put(3, 0);
        distributionMap.put(4, 0);
        distributionMap.put(5, 0);

        for (int number : grades) {
            if (number < 50) {
                distributionMap.put(0, 
                    distributionMap.get(0) + 1
                );
            } else if (number < 60) {
                distributionMap.put(1, 
                    distributionMap.get(1) + 1
                );
            } else if (number < 70) {
                distributionMap.put(2, 
                    distributionMap.get(2) + 1
                );
            } else if (number < 80) {
                distributionMap.put(3, 
                    distributionMap.get(3) + 1
                );
            } else if (number < 90) {
                distributionMap.put(4, 
                    distributionMap.get(4) + 1
                );
            } else if (number >= 90) {
                distributionMap.put(5, 
                    distributionMap.get(5) + 1
                );
            }
        }

        System.out.println("Grade distribution:");
        distributionMap.forEach((k, v) -> {
            System.out.println(k + ": " + "*".repeat(v));
        });
    }
}

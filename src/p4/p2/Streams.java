package p4.p2;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * @Author changwenhu
 * @Date 2017/10/11
 * @Blog https://jetbrains.org.cn/
 * @Description ${todo}
 */
public class Streams {
    public static void main(String[] args) {
        Collection<Task> tasks = Arrays.asList(
                new Task(Status.OPEN, 5),
                new Task(Status.OPEN, 13),
                new Task(Status.CLOSED, 8)
        );


        int sum = tasks.stream()
//                .filter(task -> task.getStatus().equals(Status.OPEN))
                .mapToInt(Task::getPoints).reduce(0, Integer::sum);
//                .sum();
        System.out.println(sum);


        // Calculate total points of all tasks
        final double totalPoints = tasks
                .stream()
                .parallel()
                .map(task -> task.getPoints()) // or map( Task::getPoints )
                .reduce(0, Integer::sum); //0 是起始值

        System.out.println("Total points (all tasks): " + totalPoints);


        int sumValue = Stream.of(2, 1, 3, 4).reduce(5, Integer::sum);

        System.out.println(sumValue);


    }

    ;

    private enum Status {
        OPEN, CLOSED
    }

    private static final class Task {
        private final Status status;
        private final Integer points;

        Task(final Status status, final Integer points) {
            this.status = status;
            this.points = points;
        }

        public Integer getPoints() {
            return points;
        }

        public Status getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return String.format("[%s, %d]", status, points);
        }
    }
}

package src;

//public class TryCatchPerformanceTest {
//    public static void main(String[] args) {
//        long startTime = System.nanoTime();
//
//        for (int i = 0; i < 1000000; i++) {
//            try {
//                int result = i / 1; // 예외 발생하지 않음
//            } catch (ArithmeticException e) {
//                // 이 블록은 실행되지 않음
//            }
//        }
//
//        long endTime = System.nanoTime();
//        long duration = endTime - startTime;
//
//        System.out.println("Time taken (no exception): " + duration + " ns");
//
//        long startTime2 = System.nanoTime();
//
//        for (int i = 0; i < 1000000; i++) { // 예외 발생 시 반복 횟수를 줄임
//            try {
//                int result = i / 0; // ArithmeticException 발생
//            } catch (ArithmeticException e) {
//                // 예외 처리
//            }
//        }
//
//        long endTime2 = System.nanoTime();
//        long duration2 = endTime2 - startTime2;
//
//        System.out.println("Time taken (with exception): " + duration2 + " ns");
//    }
//}

public class TryCatchPerformanceTest {
    public static void main(String[] args) {
        final int iterations = 1000;
        final int loopCount = 1000000;

        // 첫 번째 테스트: 예외가 발생하지 않는 경우
        long totalDurationNoException = 0;
        for (int j = 0; j < iterations; j++) {
            long startTime = System.nanoTime();

            for (int i = 0; i < loopCount; i++) {
                try {
                    int result = i / 1; // 예외 발생하지 않음
                } catch (ArithmeticException e) {
                    // 이 블록은 실행되지 않음
                }
            }

            long endTime = System.nanoTime();
            long duration = endTime - startTime;
//            System.out.println(duration);
            totalDurationNoException += duration;
        }
        long averageDurationNoException = totalDurationNoException / iterations;
        System.out.println("Average time taken (no exception): " + averageDurationNoException + " ns");

        // 두 번째 테스트: 예외가 발생하는 경우
        long totalDurationWithException = 0;
        for (int j = 0; j < iterations; j++) {
            long startTime2 = System.nanoTime();

            for (int i = 0; i < loopCount; i++) {
                try {
                    int result = i / 0; // ArithmeticException 발생
                } catch (ArithmeticException e) {
                    // 예외 처리
                }
            }

            long endTime2 = System.nanoTime();
            long duration2 = endTime2 - startTime2;
//            System.out.println(duration2);
            totalDurationWithException += duration2;
        }
        long averageDurationWithException = totalDurationWithException / iterations;
        System.out.println("Average time taken (with exception): " + averageDurationWithException + " ns");
    }
}
package ch02;

import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		 // 학생 수와 과목 수
        int numStudents = 5;
        int numSubjects = 3;

        // 학생들의 이름을 저장할 배열
        String[] studentNames = new String[numStudents];

        // 학생들의 점수를 저장할 2차원 배열
        int[][] scores = new int[numStudents][numSubjects];

        // Scanner 객체를 사용해 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 과목명 배열
        String[] subjects = {"국어", "영어", "수학"};

        // 학생 이름과 점수 입력 받기
        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1) + "번째 학생의 이름을 입력하세요: ");
            studentNames[i] = scanner.nextLine();

            System.out.println(studentNames[i] + "의 점수를 입력하세요:");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
            scanner.nextLine();  // 다음 입력을 위해 버퍼 비우기
        }

        // 각 학생의 총점 및 출력
        System.out.println("\n학생들의 총점:");
        for (int i = 0; i < numStudents; i++) {
            int studentTotal = 0;
            for (int j = 0; j < numSubjects; j++) {
                studentTotal += scores[i][j];
            }
            System.out.println(studentNames[i] + "의 총점: " + studentTotal);
        }

        // 과목별 총점 및 평균 계산 및 출력
        System.out.println("\n과목별 총점 및 평균:");
        for (int j = 0; j < numSubjects; j++) {
            int subjectTotal = 0;
            for (int i = 0; i < numStudents; i++) {
                subjectTotal += scores[i][j];
            }
            double subjectAverage = (double) subjectTotal / numStudents;
            System.out.println(subjects[j] + "의 총점: " + subjectTotal + ", 평균: " + subjectAverage);
        }

        scanner.close();

	}

}



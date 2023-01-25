package jp.ac.uryukyu.ie.e225720;

import java.util.*;

public class QMaker {
    QList qList = new QList();
    public int Select_Answer;

    public void quizList() {
        qList.shuffleQ_Array();
        for (int i = 0; i < qList.questions.length; i++) {
            qList.remove(i);
            qList.Select_Array.add(qList.answer[qList.Q_ArrayIndex.indexOf(qList.Q_ArrayShuffle.get(i))]);
            qList.shuffleA_Array();
            for (int p = 0; p < 3; p++) {
                qList.Select_Array.add(qList.A_Array.get(p));
            }
            qList.shuffle_Select_Array();
            qList.move(i);
            System.out.println(i + 1 + "問目");
            System.out.println(qList.Q_ArrayShuffle.get(i));
            for (int j = 0; j < 4; j++) {
                System.out.println(j + 1 + "," + qList.Select_Array.get(j));
            }
            try {
                Scanner scanner = new Scanner(System.in);
                Select_Answer = scanner.nextInt();
            } catch (InputMismatchException e1) {
            } catch (IndexOutOfBoundsException e2) {
            }
            int num_Ans = qList.Select_Array
                    .indexOf(qList.answer[qList.Q_ArrayIndex.indexOf(qList.Q_ArrayShuffle.get(i))]);
            if (num_Ans + 1 == Select_Answer) {
                System.out.println("正解！！");
                qList.count++;
            } else if (0 < Select_Answer && Select_Answer < 5) {
                System.out.println("残念！！不正解");
                String Ans = qList.answer[qList.Q_ArrayIndex.indexOf(qList.Q_ArrayShuffle.get(i))];
                System.out.println("正解は" + (num_Ans + 1) + "の" + Ans);
            } else {
                System.out.println("１〜４を出力してください");
                i--;
            }
            Select_Answer = 0;
            qList.Select_Array.clear();
        }
        System.out.println("当てた回数: " + qList.count + "問/" + qList.Q_ArrayIndex.size() + "問中");
        System.out.println("正答率 " + (qList.count / qList.Q_ArrayIndex.size()) * 100 + "%");
    }
}

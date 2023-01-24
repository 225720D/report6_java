package jp.ac.uryukyu.ie.e225720;

import java.util.*;
import org.w3c.dom.TypeInfo;
import java.util.Collection;

public class QMaker {
    QList qList = new QList();
    QComparison qComparison = new QComparison();

    public void quizList() {
        qList.shuffleQ_Array();

        for (int i = 0; i < qList.questions.length; i++) {
            qList.remove(i);
            qList.select(i);
            qList.move(i);
            System.out.println("");
            System.out.println(i + 1 + "問目");
            System.out.println(qList.Q_ArrayShuffle.get(i));
            for (int j = 0; j < 4; j++) {
                System.out.println(j + 1 + "," + qList.Select_Array.get(j));
            }
            // System.out.print(qList.Q_ArrayShuffle);
            // System.out.println(" ");
            // System.out.print(qList.A_Array);
            // System.out.println(" ");
            // System.out.print(qList.Select_Array);
            qList.solve(i);
            qList.Select_Array.clear();
        }
    }
}

// System.out.println("問題.HWANGは恋愛経験豊富ですか？");
// System.out.println("1.いいえ");
// System.out.println("2.いいえ");
// System.out.println("3.いいえ");
// System.out.println("4.いいえ");
// sc.nextLine();

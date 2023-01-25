package jp.ac.uryukyu.ie.e225720;

import java.util.*;

public class Qstart {
    Scanner scanner = new Scanner(System.in);
    QList qList = new QList();

    /**
     * 問題内容表示
     */
    public void start() {
        System.out.println(qList.subject + "の問題です");
        System.out.println("計" + qList.Q_ArrayShuffle.size() + "問あります");
        scanner.nextLine();

    }
}

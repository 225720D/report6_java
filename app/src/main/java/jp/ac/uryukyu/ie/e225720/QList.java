package jp.ac.uryukyu.ie.e225720;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QList {
    QComparison qComparison = new QComparison();
    /**
     * 科目、問題集,答えのリスト
     * ＋シャッフルに使うリスト
     */
    public double count = 0;
    public String subject = "英語";
    public String[] questions = { "cat", "dog", "bat", "eagle", "lion", "tiger", "bird", "rabbit" };
    public ArrayList<String> Q_ArrayShuffle = new ArrayList(Arrays.asList(questions));

    void shuffleQ_Array() {
        Collections.shuffle(Q_ArrayShuffle);
    }

    public ArrayList<String> Q_ArrayIndex = new ArrayList(Arrays.asList(questions));
    public String[] answer = { "ねこ", "イッヌ", "コウモリ", "鷹", "シーサー", "虎", "鳥", "うさぎ" };
    public ArrayList<String> A_Array = new ArrayList(Arrays.asList(answer));

    void shuffleA_Array() {
        Collections.shuffle(A_Array);
    }

    public ArrayList<String> Select_Array = new ArrayList();

    void shuffle_Select_Array() {
        Collections.shuffle(Select_Array);
    }

    void remove(int i) {
        String remove_answer;
        remove_answer = answer[Q_ArrayIndex.indexOf(Q_ArrayShuffle.get(i))];
        A_Array.remove(remove_answer);
    }

    void move(int i) {
        String remove_answer;
        remove_answer = answer[Q_ArrayIndex.indexOf(Q_ArrayShuffle.get(i))];
        A_Array.add(remove_answer);
    }
}

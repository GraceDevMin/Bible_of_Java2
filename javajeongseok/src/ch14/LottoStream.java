package ch14;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LottoStream {

	public static void main(String[] args) {
		IntStream intStream = new Random().ints(1, 46);		// 1~45������ ����(46�� ���Ծȵ�)
		Stream<String> lottoStream = intStream.distinct().limit(6).sorted()
										.mapToObj(i -> i+",");	//������ ���ڿ��� ��ȯ[
		lottoStream.forEach(System.out::println);
	}

}

package ch14;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LottoStream {

	public static void main(String[] args) {
		IntStream intStream = new Random().ints(1, 46);		// 1~45사이의 정수(46은 포함안됨)
		Stream<String> lottoStream = intStream.distinct().limit(6).sorted()
										.mapToObj(i -> i+",");	//정수를 문자열로 변환[
		lottoStream.forEach(System.out::println);
	}

}

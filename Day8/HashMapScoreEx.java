package Day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	public static void main(String[] args) {
		// 사용자 이름과 점수를 기록하는 HAshMap 컬렉션 생성
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();

		// 5개의 점수 저장
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);

		System.out.println("HashMap의 요소 개수 : " + javaScore.size());

		// 점수 출력
		Set<String> keys = javaScore.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + ":" + score);
		}
	}
}

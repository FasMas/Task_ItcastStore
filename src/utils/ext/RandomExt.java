package task_itcaststore.utils.ext;

import java.util.Random;

/**
 * 随机类的拓展类
 * @noinspection unused, WeakerAccess
 */
public class RandomExt {

	public static Random random = new Random();


	public static int range(int min, int max) {
		if(min > max)
			throw new IllegalArgumentException();

		return min + random.nextInt(max - min);
	}

	public static int range(int max) {
		return random.nextInt(max);
	}

	public static float range(float min, float max, int bit) {
		if(bit < 0 || bit > 20)
			throw new IllegalArgumentException();

		float bitValue = (float) Math.pow((double) 10, (double) bit);
		return range((int) (min * bitValue), (int) (max * bitValue)) / bitValue;
	}


	public static float range(float max, int bit) {
		float bitValue = (float) Math.pow((double) 10, (double) bit);
		return range((int) (max * bitValue)) / bitValue;
	}


	public static int delta(int num, int sub, int add) {
		int randomDelta = range(sub + add);
		return num - sub + randomDelta;
	}

	public static int delta(int num, int delta) {
		return delta(num, delta, delta);
	}


	public static float delta(float num, float sub, float add, int bit) {
		if(bit < 0 || bit > 20)
			throw new IllegalArgumentException();

		float bitValue = (float) Math.pow((double) 10, (double) bit);
		return delta((int) (num * bitValue), (int) (sub * bitValue), (int) (add * bitValue)) / bitValue;
	}

	public static float delta(float num, float delta, int bit) {
		return delta(num, delta, delta, bit);
	}
}

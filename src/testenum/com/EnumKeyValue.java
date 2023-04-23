package testenum.com;

import java.security.KeyException;
import java.security.PublicKey;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class EnumKeyValue {

	public enum TestKeyValue {

		ACTIVE("Active", 1), IN_ACTIVE("In Active", 2), Test("Mango Kg", 500);

		private final String key;
		private final Integer value;

		TestKeyValue(String key, Integer value) {
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public Integer getValue() {
			return value;
		}
	}

	public static void main(String[] args) {
		System.out.println(TestKeyValue.ACTIVE.getValue());
		System.out.println(TestKeyValue.ACTIVE.getKey());

		System.out.println(TestKeyValue.IN_ACTIVE.getValue());
		System.out.println(TestKeyValue.IN_ACTIVE.getKey());

		System.out.println(TestKeyValue.Test.getValue());
		System.out.println(TestKeyValue.Test.getKey());
	}

}

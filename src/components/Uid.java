package components;

import java.util.UUID;

public class Uid {

	public static void main(String[] args) {
		int uniqueId=(int)(System.currentTimeMillis() & 0xfffffff);
		//UUID uid=UUID.randomUUID();
		System.out.println("Unique ID is "+uniqueId);
	}

}

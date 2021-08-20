package com;

public class TestExc {
	public static void main(String[] args) {
		String str = "Get Client Location Summary API failed : Cannot construct instance of `com.crunchtime.connexui.dto.Pos` (although at least one Creator exists): no String-argument constructor/factory method to deserialize from String value ('statusCode')\n" +
				" at [Source: (String)\"[\n" +
				"    \"statusCode\": 200,\n" +
				"    \"statusMessage\": \"Success\",    \n" +
				"    \"body\": [\n" +
				"        {\"loc_name\": \"location : 0178\", \"loc_display_name\": \"location : 0178 (000016)\", \"loc_id\": 178}, \n" +
				"        {\"loc_name\": \"location : 0179\", \"loc_display_name\": \"location : 0179 (000231)\", \"loc_id\": 179}, \n" +
				"        {\"loc_name\": \"location : \", \"loc_display_name\": \"location : 0180 (000245)\", \"loc_id\": 180}\n" +
				"    ]\n" +
				"]\"; line: 2, column: 5] (through reference chain: java.lang.Object[][0])";

		if(str.contains("Get Client Location Summary API failed")){
			System.out.println("Hello");
		}else{
			System.out.println("Hi");
		}
	}
}

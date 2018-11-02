package com.dtyunxi.test5;

public class Test2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("now(),now(),");
		String createPerson = "admin";

		String tenantId = String.valueOf(1);
		if (tenantId == null || "0".equals(tenantId)) {
			tenantId = "#tenantId";
		}

		if (false) {
			sb.append("''").append(createPerson).append("''").append(",").append(tenantId).append(",''").append(createPerson).append("'',#'{'objList[{0}].dr'}'");
		} else {
			sb.append("'").append(createPerson).append("'").append(",").append(tenantId).append(",'").append(createPerson).append("',#{dr}");
		}

		 sb.toString();
	}

}

package Company;

public class manager extends employee {
		private String position; // ��å

		// �Ű����� 4���� ���� ������
		public manager(String empNo, String name, String part, String position) {
		//	setEmpNo(empNo);
		//	setName(name);
		//	setPart(part);
			super(empNo,name,part);
			this.position = position;
		}

		// �����ڿ��� �߰��Ǵ� ������ ��� ���ڿ��� ����
		public String addStr() {
			String result = "";
			result += "��å : " + position + "\n";
			return result;
		}
	}


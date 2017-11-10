package layout;

import java.awt.*;
class BorderLayoutTest1 extends Frame 
{
	public BorderLayoutTest1(String str) 
	{
		super(str);
		setLayout(new BorderLayout());
		add("North", new Button("����"));
		add("West", new Button("����"));
		add("East", new Button("����"));
		add("Center", new Button("�߾�"));
		add("South", new Button("����"));

		setSize(200,200);
		setVisible(true);
	}
}

public class MainB{
	public static void main(String[] args) {
		new BorderLayoutTest1("BorderLayout ����");
	}
}

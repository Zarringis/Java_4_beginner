package zarringis;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

public class Main {

    public static void main(String[] args) {
	long a = 29667567;
	int b = (int) a;
	short c = (short) a;
	byte d = (byte) a;
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);

	double ab = 567.75903;
	int ac = (int)Math.round(ab);
	System.out.println(ac);

	double ba = 3287657.5671;
	float bb = (float) ba;
	short bc = (short) ba;
	System.out.println(bb);
	System.out.println(bc);

    int ca = 37;
    char cb = (char)(ca);
	System.out.println(ca);
	System.out.println();

	byte w = 120;
	short x=w;
	int y=w;
	long z=w;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);

	int wx = 578;
	double wy=wx;
	System.out.println(wy);

	short xw = 256;
	float xx=xw;
	double xy=xw;
	System.out.println(xx);
	System.out.println(xy);

	char yw = 'f';
	int yx = yw;
	System.out.println(yx);
        }
}

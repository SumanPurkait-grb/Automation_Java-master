package Package;

class OtherPackage {
	OtherPackage() {
		corejavapackage.Java_13_Protection p = new corejavapackage.Java_13_Protection();
		System.out.println("other package constructor");
		// class or package only
		System.out.println("default n = " + p.n);// default
		// class only
		System.out.println("private n_pri = " + p.n_pri);// private
		// class, subclass or package only
		System.out.println("protected n_pro = " + p.n_pro);
		System.out.println("public n_pub = " + p.n_pub);
	}
}

// int n = 1;
// private int n_pri = 2;
// protected int n_pro = 3;
// public int n_pub = 4;
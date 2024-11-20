package ch02.interfaceInheritanceEx01;

public class InterfaceImpMain {

	public static void main(String[] args) {

		InterfaceImp imp = new InterfaceImp();

		ParentInterfaceA pa = imp;
		pa.parentMethodA();
		// pa.parentMethodB();
		System.out.println();

		ParentInterfaceB pb = imp;
		// pb.parentMethodA();
		pb.parentMethodB();
		System.out.println();

		ChildInterface ci = imp;
		ci.parentMethodA();
		ci.parentMethodB();
		ci.childMethod();
	}
}
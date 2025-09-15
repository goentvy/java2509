package example.interfaceseal;

public sealed interface InterfaceA permits InterfaceB {
	void methodA();
}

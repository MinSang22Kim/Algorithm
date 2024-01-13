package PolyAssignment;

public interface ListInterface<E> {
	public void add(String coef, String expo);

	public void addPoly(Polynomial<E> p1, Polynomial<E> p2);

	public void printPoly();
}

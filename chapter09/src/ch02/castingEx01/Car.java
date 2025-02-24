package ch02.castingEx01;

public interface Car {}

//Car 구현클래스
class Truck implements Car{}

//구현클래스 Truck의 자식클래스 
class DumpTruck extends Truck{}

//Car 구현클래스
class Bus implements Car{}

//구현클래스 Bus의 자식클래스
class ExpressBus extends Bus{}
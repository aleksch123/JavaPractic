package pattern.builder;

public interface CarBuilder {

    // ���� 1
    public CarBuilder fixChassis();

    // ���� 2
    public CarBuilder fixBody();

    // ���� 3
    public CarBuilder paint();

    // ���� 4

    public CarBuilder fixInterior();

    // ������ ����������

    public Car build();
}

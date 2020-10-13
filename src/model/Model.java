package model;

public class Model {
    private int[] numers;
    private int first;
    private int second;
    private int money;
    private int age;
    private String nameSurname;

    public int[] getNumers() {
        return numers;
    }

    public void setNumers(int[] numers) {
        this.numers = numers;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    @Override
    public String toString() {
        return "Your stat's" +
                "money=" + money +
                ", nameSurname='" + nameSurname
                ;
    }
}

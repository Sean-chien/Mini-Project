package week5;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Contact {
    private int id;
    private String name;
    private String city;
    private String mobile;
    private String work;
    private String home;

    public Contact(int id,String name, String city, String mobile, String work, String home){
        this.id = id;
        this.name = name;
        this.city = city;
        this.mobile = mobile;
        this.work = work;
        this.home = home;

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getHome() {
        return home;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mobile);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", work='" + work + '\'' +
                ", home='" + home + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

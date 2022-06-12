package ru.bigint.webapp.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ru.bigint.webapp.data.entity.user.Role;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "channels")
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "address")
    private String address;

    @Column(name = "name")
    private String name;

    @Column(name = "followers")
    private Integer followersCount;

    @Column(name = "age")
    private Integer age;

    @Column(name = "regyear")
    private Integer regyear;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(
            name = "channel_category",
            joinColumns = @JoinColumn(name = "channel_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id")
    )
    @JsonIgnore
    private List<Category> categories;

    public Channel() {
    }

    public Channel(String address, String name, Integer followersCount, Integer age, Integer regyear, List<Category> categories) {
        this.address = address;
        this.name = name;
        this.followersCount = followersCount;
        this.age = age;
        this.regyear = regyear;
        this.categories = categories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getRegyear() {
        return regyear;
    }

    public void setRegyear(Integer regyear) {
        this.regyear = regyear;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
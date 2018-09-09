package pattern.creational.builder.inner;

/**
 * Created by sharp on 2018/9/9.
 */
public class Usr {

    private String name;
    private String gender;
    private String address;
    private int age;
    private int height;
    private int weight;

    private Usr(Builder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.address = builder.address;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }

    public static class Builder{
        private String name;
        private String gender;
        private String address;
        private int age;
        private int height;
        private int weight;



        public Builder setName(String name) {
            this.name = name;
            return this;
        }



        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }



        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }



        public Builder setAge(int age) {
            this.age = age;
            return this;
        }



        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }



        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }



        public Usr build(){
            return new Usr(this);
        }

    }


}

package src;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public static void main(String[] args) {
        ProfilePrint p = new ProfilePrint();
        p.isMarried = true;
        p.setAge((byte) 1);
        p.setName("John");

        System.out.println(p.getAge());
        System.out.println(p.getName());
        System.out.println(p.isMarried());
    }

    public void setAge (byte age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public byte getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return isMarried;
    }
}

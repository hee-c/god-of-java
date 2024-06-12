package c.service;

import java.lang.reflect.Member;

public interface MemberManager {

    public boolean addMember(Member member);
    public boolean removeMember(String name, String phone);
    public default boolean updateMember(Member member) {
        return false;
    }
}

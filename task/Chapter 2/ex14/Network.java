import java.util.ArrayList;

public class Network {
    private ArrayList<Member> members;
    Network myFace = new Network();
    Network.Member fred = myFace.enroll("fred");

    public class Member { // Класс Member является внутренним
        private String name;
        private ArrayList<Member> friends;
        public Member(String name) {
            this.name = name;
            friends = new ArrayList<>() ;
        }
        public void leave() {
            members.remove(this);
        }
    }

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }
}

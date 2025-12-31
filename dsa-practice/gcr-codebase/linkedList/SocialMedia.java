class SocialMedia {

    class Friend {
        int id;
        Friend next;
    }

    class User {
        int userId;
        String name;
        Friend friends;
        User next;
    }
}

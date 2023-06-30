package com.akanksha.Builder;

public class Main {
    public static void main(String[] args) {
//       User user= new User.UserBuilder().setUserId("asdd").setUserName("akanksha").setEmailId("asdfgh").build();
//        System.out.println(user);
//         User user2=User.UserBuilder.builder().setUserId("123").setEmailId("aaddewgwyf").setUserName("etty").build();
//        System.out.println(user2);

        URLBuilder userBuilder= new URLBuilder.Builder().protocol("http").hostName("localhost8080").port("8080").pathParam("coaching").build();
        System.out.println(userBuilder);

        URLBuilder.Builder builder=new URLBuilder.Builder();
        URLBuilder builder1=builder.protocol("https").hostName("uiooio").port("9090").pathParam("gdqd").queryParam("hsgqjd").build();
       System.out.print(builder1.toString() );
    }
}

public class Main {
    public static void main(String[] args) {
        Cow cow1=new Cow(150, 7,"F","Ala-Bash",12);
        Cow cow2=new Cow(145,8,"F", "Konur", 14);
        Cow cow3=new Cow(165,6,"F","Kara",9);
        Cow cow4=new Cow(158, 5,"F","Ala-Bash",12);
        Cow cow5=new Cow(149,9,"F", "Konur", 14);
        Cow cow6=new Cow(166,5,"F","Muyuz",9);
        Cow[] cows={cow1,cow2,cow3,cow4,cow5};
        Cow[] cow={cow6};

        Sheep sheep1=new Sheep(55, 5,"F","Ak koi",3 );
        Sheep sheep2=new Sheep(50,3,"F", "Kara koi", 4);
        Sheep sheep3=new Sheep(59,4,"M","Ak koi",5);
        Sheep sheep4=new Sheep(60,4,"M","Kochkor",6);
        Sheep[] sheep={sheep1,sheep2,sheep3};
        Sheep[] SHEEP={sheep4};

        Horse horse1=new Horse(200,5,"M","Tulpar","Turkmen");
        Horse horse2=new Horse(250,6,"M","Arhiles","Arab");
        Horse horse3=new Horse(215,7,"M","Jorgo","Golshtin");
        Horse[] horses={horse1,horse2};
        Horse[] horse={horse3};

         Farm farm1=new Farm("Too-Jayloo","Asan",cows,sheep,horses);
         Farm farm2=new Farm("Ak-Say","Uson",cow,SHEEP,horse);

         Farm[] farms={farm1};
        for (Farm farm : farms) {
            System.out.println("In first farm has: " +farm.toString());
        }
        Farm[] farms1={farm2};
        for (Farm farm : farms1) {
            System.out.println("In second farm has: "+ farm.toString());
        }

    }
}
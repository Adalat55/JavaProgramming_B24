package day13_if_statements;

public class Weather {
    public static void main(String[] args) {
        /*
        sunny, rainy, windy, snowy, foggy, cloudy
         */
        String weather = "Windy";
        if (weather.equals("sunny")){
            System.out.println("its nice, go outside ride a bike, code java");
        }else if(weather.equals("rainy")){
            System.out.println("stay home, drink some tea, code java");}
        else if(weather.equals("windy") || weather.equals("Windy")){
            System.out.println("fly a kite and code java");
        }else if(weather.equals("snowy")){
            System.out.println("go skiing");
        }else{
            System.out.println("not a valid weather type, but code java anyway");
        }

    }
}

package day17;

import java.util.Scanner;

public class ReplitHTTP {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int status = input.nextInt();
        /*
        200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable
         */
        switch(status){
            case 201:
                System.out.println("Created");break;
            case 202:
                System.out.println("Accepted");break;
            case 301:
                System.out.println("Moved Permanently");break;
            case 303:
                System.out.println("See Other");break;
            case 304:
                System.out.println("Not Modified");break;
            case 307:
                System.out.println("Temporary Redirect");break;
            case 400:
                System.out.println("Bad Request");break;
            case 401:
                System.out.println("Unauthorized");break;
            case 403:
                System.out.println("Forbidden");break;
            case 404:
                System.out.println("Not Found");break;
            case 410:
                System.out.println("Gone");break;
            case 500:
                System.out.println("Internal Server Error");break;
            case 503:
                System.out.println("Service Unavailable");break;
            default:
                System.out.println("Invalid status code!");
        }
    }
}

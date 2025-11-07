public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String OTime = ""; // will be used for final output
        String OHours = ""; // used to show hours output
        String OMinutes = ""; // used to show minutes output


        int Thours = 0; // total hours
        int TMinutes = 0; // total minutes
        int NHours = 0; // natural hours, between 0-12
        int NMinutes = 0; // natural mintues between 0-59

        String Time = args[0];
        int MinutesToAdd = Integer.parseInt(args[1]);

        int HTime = Integer.parseInt(Time.substring(0, 2));
        int MTime = Integer.parseInt(Time.substring(3, 5));


        TMinutes = (HTime * 60) + MTime + MinutesToAdd; // calculate total time in minutes
        Thours = TMinutes / 60; // extract the total hours from the total minutes
        NHours = Thours % 24; // extract the natural hours 
        NMinutes = TMinutes - (Thours * 60); // extract the natura; minutes

        // check if natural hours is less than 10 than add 0 to string output
        if (NHours < 10) {
            OHours = "0" + NHours;
        } 
        else {
            OHours = "" + NHours;
        }

        // check if natural minutes is less than 10 than add 0 to string output
        if (NMinutes < 10){
            OMinutes = "0" + NMinutes; 
        } else {
            OMinutes = "" + NMinutes;
        }

        OTime = String.format("%s:%s", OHours, OMinutes);
        System.out.println(OTime);
        
    }
}

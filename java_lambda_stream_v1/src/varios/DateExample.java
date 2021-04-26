package varios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class DateExample {

    public static void convertirHoraAFechaCompleta () throws ParseException {
        Date timestamp = Calendar.getInstance(TimeZone.getTimeZone("America/Santiago")).getTime();

        System.out.println("timestamp " + timestamp);
        //TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        String start_time = "14:50";
        String normalPattern = "dd.MM.yyyy";
        int ejecutarDentroXminutos = 140;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(normalPattern);
        //se guarda la fecha actual con el formato indicado anteriormente y se almacena en una nueva variable
        String presentDate = LocalDate.now().format(dateTimeFormatter);
        System.out.println("Probando funcion " + presentDate);
        //conversion fecha a una con dia mes y año
        String fullDate = start_time + " " + presentDate;
        DateFormat dateFormat = new SimpleDateFormat("HH:mm dd.MM.yyyy");
        Date startTime = dateFormat.parse(fullDate);//aca tengo la fecha donde admmon no ejecutara el masivo
        System.out.println("start time full " + startTime);
        /*parte dos sumar o ver la hora de termino*/
        Date endTime = Date.from(startTime.toInstant().plus(ejecutarDentroXminutos,ChronoUnit.MINUTES));

        System.out.println("End time --> " + endTime);

        /*ahora la hora actual*/

        Date presentTimehahaha = Date.from(Instant.now());

        System.out.println("hora ahora --> " + presentTimehahaha);

        /* validacion para ver si esta en el rango de hora definido no se ejecuta */
        if(presentTimehahaha.after(startTime) && presentTimehahaha.before(endTime)){
            System.out.println("No ejecutar masivo");
        }


    }


    public static void funcReal() throws ParseException {

        String start_time = "16:00";
        /**/

        final String SHUTDOWN_KEY = "shutdown";
        final String START_TIME_KEY = "start_time";
        final String RUN_AGAIN_IN = "runAgainIn";
        final String UTC_SUBSTRACT_KEY = "utc_substract";
        final String PATTERN_DATE = "HH:mm dd.MM.yyyy";
        final String PATTERN_HOUR = "HH:mm";

        String normalPattern = "dd.MM.yyyy";
        final int ejecutarDentroXminutos = 140;
        final String timeZone = "America/Santiago";
        DateFormat dateFormat = new SimpleDateFormat(PATTERN_DATE);
        //dia actual
        Date presentTimeHahahaha = Calendar.getInstance(TimeZone.getTimeZone(timeZone)).getTime();
        //start date
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(normalPattern);
        String fullDate = start_time + " " + LocalDate.now(ZoneId.of(timeZone)).format(dateTimeFormatter);
        Date startTime = dateFormat.parse(fullDate);
        //Date endsTime = dateFormat.parse( myInfo.getExtraArgs().getJSONObject(SHUTDOWN_KEY).getString(END_TIME_KEY));
        Date endsTime = Date.from(startTime.toInstant().plus(ejecutarDentroXminutos,ChronoUnit.MINUTES));

        //se verifica si esta en el rango de hoarios en el que se solicito que admmon no se ejecute
        if(presentTimeHahahaha.after(startTime) && presentTimeHahahaha.before(endsTime)){
            System.out.println("return false");
        }
    }


    public static void main(String[] args) throws ParseException {

        //convertirHoraAFechaCompleta();
        funcReal();
        /*String time1 = "10:00";
        String time2 = "12:30";
        Map<String, String> mapHours = new HashMap<>();

        mapHours.put("01", "01");
        mapHours.put("02", "02");
        mapHours.put("03", "03");
        mapHours.put("04", "04");
        mapHours.put("05", "05");
        mapHours.put("06", "06");
        mapHours.put("07", "07");
        mapHours.put("08", "08");
        mapHours.put("09", "09");
        mapHours.put("10", "10");
        mapHours.put("11", "11");
        mapHours.put("12", "12");
        mapHours.put("13", "01");
        mapHours.put("14", "02");
        mapHours.put("15", "03");
        mapHours.put("16", "04");
        mapHours.put("17", "05");
        mapHours.put("18", "06");
        mapHours.put("19", "07");
        mapHours.put("20", "08");
        mapHours.put("21", "09");
        mapHours.put("22", "10");
        mapHours.put("23", "11");
        mapHours.put("00", "12");



        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date date1 = format.parse(time1);
        Date date2 = format.parse(time2);
        long difference = date2.getTime() - date1.getTime();
        long minutosPlus = TimeUnit.MILLISECONDS.toMinutes(difference);
        System.out.println("Date --> " + minutosPlus  );

        System.out.println("asdasdas");
        //
        Date date = Date.from(Instant.now().plus(150, ChronoUnit.MINUTES));
        System.out.println("Date plus --> : " + date);


        //metodo para cambiar la zona horaria
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        Calendar tzCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        Calendar tzCal2 = Calendar.getInstance();
        System.out.println("calendar -> " + tzCal2.getTime());
        //System.out.println("zona horaria " + tzCal.toInstant()getTimeZone().getID());
        System.out.println("Con calendar " + tzCal.getTime());

        //formato de la fecha que se quiere
        DateFormat dateFormat = new SimpleDateFormat("HH:mm dd.MM.yyyy");
        //fecha actual a la cual se le puede restar alguna cantidad de horas de ser necesario
        Date datePlus = Date.from(Instant.now().minus(0, ChronoUnit.HOURS));
        System.out.println("Date: " + datePlus);
        //fecha original enviada desde la configuracion
        String originalStartDate = "16:07";
        //patron normal de la fecha actual
        String normalPattern = "dd.MM.yyyy";
        //Se crea un objeto con la fecha actual del tipo DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(normalPattern);
        //se guarda la fecha actual con el formato indicado anteriormente y se almacena en una nueva variable
        String presentDate = LocalDate.now().format(dateTimeFormatter);
        //se juntan la hora enviada desde la aplicacion y se convina con la fecha actual
        String fullPattern = originalStartDate + " " + presentDate;
        //se transforma a fecha actual
        Date startTime = dateFormat.parse(fullPattern);
        //Date startTime = Date.from( "16:07");
        System.out.println("Start time: " + startTime);
        Date endsTime = dateFormat.parse( "18:08 20.04.2021");
        System.out.println("Full pattern " + fullPattern);


        String fullDate = originalStartDate + " " + presentDate;

        System.out.println("localDate --> " + fullDate);

        System.out.println("Ends time: " + endsTime);
        if(date.after(startTime) && date.before(endsTime)){
            System.out.println("No ejecutar masivo");
        }*/

    }
}

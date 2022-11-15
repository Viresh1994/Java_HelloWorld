package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        String message = "Hello, World";
        log.debug(message + "will Be Printed on Debug");
        log.info(message + "will Be Printed on info");
        log.warn(message + "will Be Printed on Warn");
        log.error(message + "will Be Printed on Error");
        log.fatal(message + "will Be Printed on Fatal");
        log.info("Appending string: {}.", message);

        System.out.println(message);



    }
}
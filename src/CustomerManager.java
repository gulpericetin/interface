public class CustomerManager {
    private Logger[] loggers;
    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }


    public void add(Customer customer){
        System.out.println("Müşteri eklendi : " + customer.getFirstName());
//        for (Logger logger:loggers){
//            logger.log(customer.getFirstName());
//        }

        Utils.runLoggers(loggers, customer.getFirstName());
        //this.loggers.log(customer.getFirstName());
        /*DatabaseLogger logger =new DatabaseLogger(); //katı bağlılık
        logger.log(customer.getFirstName()+"veritabanına loglandı");*/
    }
    public void delete(Customer customer){
        System.out.println("Müşteri silindi" + customer.getFirstName());
//        for (Logger logger:loggers){
//            logger.log(customer.getFirstName());
//        }
        Utils.runLoggers(loggers, customer.getFirstName());
    }
}

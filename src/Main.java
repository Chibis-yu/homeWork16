public class Main {
    public static void main(String[] args) {
        Bicycle orlenok = new Bicycle("Орленок");
        Car kia = new Car("KIA RIO");
        Car volvo = new Car("Volvo xs90");
        Truck gazel = new Truck("Газель Соболь");
        Truck man = new Truck("MAN", 8);

        Transport[] transports = {
                orlenok,
                kia,
                volvo,
                gazel,
                man
        };
        ServiceStation serviceStation = new ServiceStation();
        for(Transport transport : transports) {
            serviceStation.check(transport);
        }
    }
}
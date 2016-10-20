package spring.basic.services;

public class ClientService {
    private static ClientService clientService = new ClientService();

    public ClientService() {
        System.out.println("Instantiation with a static factory method");
    }

    public static ClientService createInstance() {
        return clientService;
    }
}

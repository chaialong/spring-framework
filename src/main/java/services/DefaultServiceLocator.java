package services;

public class DefaultServiceLocator {
    private static ClientService clientService = new ClientService();

    private DefaultServiceLocator() {
    }

    public ClientService createClientServiceInstance(){
        return clientService;
    }
}

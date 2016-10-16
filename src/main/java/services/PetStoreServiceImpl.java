package services;

import dao.JpaAccountDao;
import dao.JpaItemDao;

public class PetStoreServiceImpl implements PetStoreService {
    private JpaAccountDao accountDao;
    private JpaItemDao itemDao;

    public JpaAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public JpaItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }

}

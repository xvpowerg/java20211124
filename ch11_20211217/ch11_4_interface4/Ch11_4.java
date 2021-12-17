package ch11_20211217.ch11_4_interface4;
public class Ch11_4 {
    
    public static void main(String[] args) {
       
     UserDao  userDao =   DbFactory.newUserDao(DbFactory.PGSQL);
     userDao.delete();
     userDao.insert();
     userDao.query();
     userDao.update();
        
    }
    
}

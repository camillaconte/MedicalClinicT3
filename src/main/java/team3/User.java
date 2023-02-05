package team3;

public abstract class User {

     String name;
     String surname;
     String fiscalCode;
     Address address;
     String phoneNumber;
     int age;


    public User(String name,String surname,String fiscalCode,Address address,String phoneNumber,int age) {
         this.name = name;
         this.surname=surname;
         this.fiscalCode=fiscalCode;
         this.address=address;
         this.phoneNumber=phoneNumber;
         this.age=age;

     }
    public abstract void getUserDetails();
     //public void getUserDetail(){
    //System.out.println(name+ " " + surname +" " + " "+fiscalCode+ " " + address +
      //    " "+ phoneNumber+ " "+ age);
     //}

  /* public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }
*/
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fiscalCode='" + fiscalCode + '\'' +
                ", address=" + address +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age ;
    }

    };





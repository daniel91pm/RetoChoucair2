package model;

import org.springframework.core.SpringVersion;

public class RegisterData {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strCity;
    private String strPostalCode;
    private String strPassword;


    public String getStrPassword() {return strPassword;    }

    public void setStrPassword(String strPassword) {this.strPassword = strPassword;    }

    public String getStrCity() {return strCity;    }

    public void setStrCity(String strCity) {this.strCity = strCity;   }

    public String getStrPostalCode() {return strPostalCode;    }

    public void setStrPostalCode(String strPostalCode) {this.strPostalCode = strPostalCode;    }

        public String getStrName() {return strName;    }

    public void setStrName(String strName) {this.strName = strName;    }

    public String getStrLastName() {return strLastName;    }

    public void setStrLastName(String strLastName) {this.strLastName = strLastName;    }

    public String getStrEmail() { return strEmail;    }

    public void setStrEmail(String strEmail) {this.strEmail = strEmail;    }

    public String getStrBirthMonth() {return strBirthMonth;    }

    public void setStrBirthMonth(String strBirthMonth) {this.strBirthMonth = strBirthMonth;    }

    public String getStrBirthDay() {return strBirthDay;    }

    public void setStrBirthDay(String strBirthDay) {this.strBirthDay = strBirthDay;    }

    public String getStrBirthYear() {return strBirthYear;    }

    public void setStrBirthYear(String strBirthYear) {this.strBirthYear = strBirthYear;    }


}

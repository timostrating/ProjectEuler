/// CREDITS TO https://stackoverflow.com/a/53310256

//
// ORIGINALY Created by NSC on 11/7/18.
//
#include <string>
#ifndef AC1_INFINT_H
#define AC1_INFINT_H


class InfInt {
    std::string strValue;
    bool sign = 0;

public:

    InfInt();
    InfInt(const std::string&);
    InfInt(long int);
    InfInt operator=(long int);
    explicit operator int() const;

    std::string getStrValue() const;
    bool getSign() const;
    InfInt operator+(const InfInt&) const;
    InfInt operator-(const InfInt&) const;
    InfInt operator*(const InfInt&) const;
    InfInt operator/(const InfInt&) const;
    InfInt operator%(const InfInt&) const;

    bool operator<(const InfInt&) const;
    bool operator>(const InfInt&) const;
    bool operator<=(const InfInt&) const;
    bool operator>=(const InfInt&) const;
    bool operator==(const InfInt&) const;

    void operator*=(const InfInt&);
    void operator/=(const InfInt&);
    void operator+=(const InfInt&);
    void operator-=(const InfInt&);
    void operator++();
    void operator--();


    //BitWise
    InfInt operator&(const InfInt&) const;
    InfInt operator<<(const InfInt&) const;
    InfInt operator>>(const InfInt& a) const;
    void operator<<=(const InfInt&);
    void operator>>=(const InfInt&);
    void operator&=(const InfInt&);
    InfInt operator^(const InfInt&) const;
    InfInt operator|(const InfInt&) const;


    unsigned long length() const;
    std::string align(const unsigned long) const;
    void initFromBinary(const std::string);



private:

    std::string getBinary() const;

    std::string subtract(const InfInt&) const;
    std::string add(const InfInt&) const;
    void setSign(const bool);
    InfInt alignLeft(const unsigned long) const;

};

std::ostream& operator<<(std::ostream& os, const InfInt&);


#endif //AC1_INFINT_H
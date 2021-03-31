package com.franktran.lc;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class PhoneFormatter implements Formatter<PhoneDTO> {

    @Override
    public PhoneDTO parse(String text, Locale locale) throws ParseException {
        String[] phoneParts = text.split("-");
        return new PhoneDTO(phoneParts[0], phoneParts[1]);
    }

    @Override
    public String print(PhoneDTO phoneDTO, Locale locale) {
        return String.format("%s-%s", phoneDTO.getCountryCode(), phoneDTO.getPhoneNumber());
    }
}

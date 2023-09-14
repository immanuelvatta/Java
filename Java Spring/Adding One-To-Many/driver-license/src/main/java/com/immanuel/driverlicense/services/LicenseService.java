package com.immanuel.driverlicense.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immanuel.driverlicense.models.License;
import com.immanuel.driverlicense.repositories.LicenseRepository;
import com.immanuel.driverlicense.utils.Utilities;

@Service
public class LicenseService {

    @Autowired
    LicenseRepository licenseRepository;

    Utilities utilities = new Utilities();

    public void addLicense(License license) {
        license.setNumber(utilities.randomString());
        licenseRepository.save(license);

    }
}
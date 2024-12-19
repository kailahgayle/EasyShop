package org.yearup.controllers;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import org.yearup.models.Profile;

import org.yearup.data.ProfileDao;



@RestController

@RequestMapping("profile")

@CrossOrigin

public class ProfileController {



    private final ProfileDao profileDao;



    @Autowired

    public ProfileController(ProfileDao profileDao) {

        this.profileDao = profileDao;

    }



    @GetMapping

    public Profile getProfile(@RequestParam int userId) {

        // Fetch profile by userId

        return profileDao.getByUserId(userId);

    }



    @PutMapping

    public void updateProfile(@RequestBody Profile profile) {

        // Update profile details

        profileDao.update(profile);

    }

}

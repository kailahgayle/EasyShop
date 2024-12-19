package org.yearup.data;



import org.yearup.models.Profile;



public interface ProfileDao

{

    Profile create(Profile profile);

    // Updates for user profile

    Profile getByUserId(int userId); // Method to fetch a profile by user ID

    Profile update(Profile profile); // Method to update an existing profile

}

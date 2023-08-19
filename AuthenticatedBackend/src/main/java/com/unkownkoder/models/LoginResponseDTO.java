package com.unkownkoder.models;

public class LoginResponseDTO {
    private ApplicationUser user;
    private String jwt;
    private String userType; // "jobseeker" or "recruiter"
    public LoginResponseDTO(){
        super();
    }

   

    public LoginResponseDTO(ApplicationUser user, String jwt, String userType) {
		super();
		this.user = user;
		this.jwt = jwt;
		this.userType = userType;
	}



	public ApplicationUser getUser(){
        return this.user;
    }

    public void setUser(ApplicationUser user){
        this.user = user;
    }

    public String getJwt(){
        return this.jwt;
    }

    public void setJwt(String jwt){
        this.jwt = jwt;
    }

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}

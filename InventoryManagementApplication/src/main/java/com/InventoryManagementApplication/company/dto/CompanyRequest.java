    package com.InventoryManagementApplication.company.dto;

    import jakarta.validation.constraints.Email;
    import jakarta.validation.constraints.NotBlank;
    import jakarta.validation.constraints.Size;

    public class CompanyRequest {

        @NotBlank
        private String code;

        @NotBlank
        private String legalName;

        @NotBlank
        private String displayName;
        @Email
        private String email;
        private String phone;
        private String gstNumber;
        private String panNumber;

        private String addressLine1;
        private String addressLine2;
        private String city;
        private String state;
        private String postalCode;

        @NotBlank
        private String country;

        @NotBlank
        @Size(min = 3, max = 3)
        private String currency;
        @NotBlank
        private String timezone;
        private String logoUrl;

        public  String getCode() {
            return code;
        }

        public void setCode( String code) {
            this.code = code;
        }

        public String getLegalName() {
            return legalName;
        }

        public void setLegalName( String legalName) {
            this.legalName = legalName;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName( String displayName) {
            this.displayName = displayName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getGstNumber() {
            return gstNumber;
        }

        public void setGstNumber(String gstNumber) {
            this.gstNumber = gstNumber;
        }

        public String getPanNumber() {
            return panNumber;
        }

        public void setPanNumber(String panNumber) {
            this.panNumber = panNumber;
        }

        public String getAddressLine1() {
            return addressLine1;
        }

        public void setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
        }

        public String getAddressLine2() {
            return addressLine2;
        }

        public void setAddressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry( String country) {
            this.country = country;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public  String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public String getLogoUrl() {
            return logoUrl;
        }

        public void setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
        }
    }
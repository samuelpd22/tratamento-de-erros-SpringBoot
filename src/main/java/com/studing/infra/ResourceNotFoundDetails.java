package com.studing.infra;

public class ResourceNotFoundDetails {
    private String title;
    private int status;
    private String details;
    private String devMessage;

    private ResourceNotFoundDetails(){

    }

    public String getTitle() {
        return title;
    }

    public int getStatus() {
        return status;
    }

    public String getDetails() {
        return details;
    }

    public String getDevMessage() {
        return devMessage;
    }

    public static final class ResourceNotFoundDetailsBuilder {
        private String title;
        private int status;
        private String details;
        private String devMessage;

        private ResourceNotFoundDetailsBuilder() {
        }

        public static ResourceNotFoundDetailsBuilder newBuilder() {

            return new ResourceNotFoundDetailsBuilder();
        }

        public ResourceNotFoundDetailsBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ResourceNotFoundDetailsBuilder status(int status) {
            this.status = status;
            return this;
        }

        public ResourceNotFoundDetailsBuilder details(String details) {
            this.details = details;
            return this;
        }

        public ResourceNotFoundDetailsBuilder devMessage(String devMessage) {
            this.devMessage = devMessage;
            return this;
        }

        public ResourceNotFoundDetails build() {
            ResourceNotFoundDetails resourceNotFoundDetails = new ResourceNotFoundDetails();
            resourceNotFoundDetails.devMessage = this.devMessage;
            resourceNotFoundDetails.status = this.status;
            resourceNotFoundDetails.title = this.title;
            resourceNotFoundDetails.details = this.details;
            return resourceNotFoundDetails;
        }
    }
}

package com.akanksha.Builder;

public class URLBuilder {

    private String protocol;
    private String hostName;
    private String port;
    private String pathParam;
    private String queryParam;

    public URLBuilder(Builder builder) {
        this.hostName=builder.hostName;
        this.pathParam=builder.pathParam;
        this.port=builder.port;
        this.queryParam=builder.queryParam;
        this.protocol=builder.protocol;
    }

    @Override
    public String toString() {
        return "URLBuilder{" +
                "protocol='" + protocol + '\'' +
                ", hostName='" + hostName + '\'' +
                ", port='" + port + '\'' +
                ", pathParam='" + pathParam + '\'' +
                ", queryParam='" + queryParam + '\'' +
                '}';
    }

    public static class Builder{
        private String protocol;
        private String hostName;
        private String port;
        private String pathParam;
        private String queryParam;

        public Builder protocol(String protocol) {
            this.protocol=protocol;
            return this;
        }

        public Builder hostName(String hostName) {
            this.hostName=hostName;
            return this;
        }

        public Builder port(String port) {
            this.port=port;
            return this;
        }

        public Builder pathParam(String pathParam ) {
            this.pathParam=pathParam;
            return this;
        }

        public Builder queryParam(String queryParam) {
            this.queryParam=queryParam;
            return this;
        }

        public URLBuilder build(){
            return new URLBuilder(this);
        }
    }
}

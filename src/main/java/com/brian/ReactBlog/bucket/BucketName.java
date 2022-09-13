package com.brian.ReactBlog.bucket;

public enum BucketName {

        PROFILE_IMAGE("bcblog");

        private final String bucketName;

        BucketName(String bucketName) {
            this.bucketName = bucketName;
        }

        public String getBucketName() {
            return bucketName;
        }
}

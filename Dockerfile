# Use the official Jenkins LTS image as the base image
FROM jenkins/jenkins:2.6-lts-jdk17

# Switch to root user to perform installations
USER root

# Install necessary packages and dependencies
RUN apt-get update && \
    apt-get install -y 

# Switch back to the Jenkins user
USER jenkins

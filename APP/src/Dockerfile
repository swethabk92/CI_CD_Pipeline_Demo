# Use an official Python runtime as the base image
FROM python:3.9-alpine

# Set the working directory in the container
WORKDIR C:\Users\shrvn\OneDrive\Documents\CI-CD demo


# Copy the required files to the container
COPY requirements.txt .

# Install the required libraries
RUN pip install -r requirements.txt

# Set the command to run when the container starts
CMD ["python","app.py"]

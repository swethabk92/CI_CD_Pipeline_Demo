# Use an official Python runtime as the base image
FROM python:3.9-slim-buster

# Set the working directory in the container
WORKDIR C:\Users\Sai teja\PycharmProjects\pythonProject\venv\APP


# Copy the required files to the container
COPY . .

# Install the required libraries
RUN pip install -r requirements.txt

# Set the command to run when the container starts
CMD ["python", "main.py","app.py"]

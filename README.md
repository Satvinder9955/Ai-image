# Ai-image
This repository contains the source code for a Single-Page image generator Application built using Spring Boot (backend) and Vite (frontend). The application allows users to generate images  real-time by leveraging  OpenAI's image generation model.
## Features
- **Text-to-Image Generation**: Users can provide text prompts to generate images based on OpenAI's image generation model.
- **Downloadable Images**: Generated images can be downloaded to the user's device.
- **Real-time Processing**: Immediate feedback and image generation through OpenAI API.

  ## Technologies
### Backend
- Spring Boot: Backend API for processing audio and interacting with Azure OpenAI.
-  OpenAI: Provides the transcription service.
### Frontend
- Vite: Fast frontend development environment.
- React: UI framework for creating a responsive and simple user interface.
## Prerequisites
- Java 17 or higher installed.
- Node.js installed (with npm or Yarn).
- OpenAI API key.
## Setup
### Backend (Spring boot)
Clone the repository:
 ```
 git clone https://github.com/Satvinder9955/Ai-image.git
  ```
navigate to the backend directory
```
cd imagechat-backend
```
Update the application.properties file with your OpenAI API key:
```
.openai.api.key=your_openai_api_key
```
Run the project to check if the key works

### Frontend (vite)
navigate to the backend directory
 ```
cd TrancribeNow-frontend
  ```
install the dependencies
```
npm install
```
Start the development server:
```
npm run dev
```
---

## Deployment

To deploy the application:

1. **Backend**: 
   - Package the Spring Boot application using Maven:
     ```bash
     ./mvnw clean package
     ```
   - Deploy the generated `.jar` file on a server or cloud platform (e.g., AWS, Heroku).

2. **Frontend**:
   - Build the frontend:
     ```bash
     npm run build
     ```
   - Deploy the built frontend files (in the `dist` folder) to any static hosting service .

---

## Contributing

Feel free to contribute by opening a pull request:

1. Fork the repository.
2. Create a new branch for your feature:
   ```bash
   git checkout -b feature-name

3. Commit your changes:
   ```
   git commit -m "Add feature"
   ```
4. Push to the branch:
   ```
   git push origin feature-name
   ```
5. open a pull request


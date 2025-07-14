# Getting Started with Create React App

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

## Available Scripts

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in your browser.

The page will reload when you make changes.\
You may also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `npm run build`

Builds the app for production to the `build` folder.\
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.\
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `npm run reject`

**Note: this is a one-way operation. Once you `eject`, you can't go back!**

If you aren't satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you're on your own.

You don't have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn't feel obligated to use this feature. However we understand that this tool wouldn't be useful if you couldn't customize it when you are ready for it.

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

### Code Splitting

This section has moved here: [https://facebook.github.io/create-react-app/docs/code-splitting](https://facebook.github.io/create-react-app/docs/code-splitting)

### Analyzing the Bundle Size

This section has moved here: [https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size](https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size)

### Making a Progressive Web App

This section has moved here: [https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app](https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app)

### Advanced Configuration

This section has moved here: [https://facebook.github.io/create-react-app/docs/advanced-configuration](https://facebook.github.io/create-react-app/docs/advanced-configuration)

### Tech Stack
Frontend: React.js

Backend: Spring Boot

### Deployment:

Frontend: Netlify

Backend: Railway

Database: H2 (in-memory, for development)
### DeployLinks

Front End- [melodic-vacherin-1d310a.netlify.app

Back End- (brynk-cms-production.up.railway.app)

### `npm run build` fails to minify

This section has moved here: [https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify](https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify)
### Dependencies
Frontend
React 18+

Axios (for API calls)

Backend
Spring Boot 3.x

Spring Web

H2 Database (for in-memory storage)



### 🗃️ Database Configuration
Type: In-memory H2 database

No additional setup required

Data will reset on server restart

H2 console (optional): Accessible at /h2-console if enabled in application.properties

## 🗃️ Database Schema

The application uses a simple table to store heading content.

### Java Entity (`Heading.java`)
```java
@Entity
public class Heading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
}


✅ Add this to the README or submit as a separate file called `heading-schema.md`.

---

### ✅ 4. **API Documentation**

- **Status:** ✅ Already included in tabular format
  - Method: GET / POST ✔
  - Endpoint: `/api/heading` ✔
  - Descriptions ✔

🔁 Bonus (Optional): You can expand this like below:

```markdown
## 📑 API Documentation

### GET `/api/heading`

- **Description:** Fetch the latest heading
- **Response Format:**
```json
{
  "id": 1,
  "text": "Welcome to Brynk CMS!"
}
---
POST /api/heading
Description: Update heading text

Request Body:

json
Copy
Edit
---
```
{
  "text": "New Heading Here"
}

✅ Consider adding this for extra clarity.

---

### ✅ 5. **Deployment Instructions**

- **Status:** ✅ Included
  - Netlify: frontend deployment
  - Railway: backend deployment
  - Local instructions (npm / maven) ✔

---

### ✅ 6. **Working Link**

- ✅ Included:
  - Frontend: [https://melodic-vacherin-1d310a.netlify.app](https://melodic-vacherin-1d310a.netlify.app)
  - Backend: [https://brynk-cms-backend-production.up.railway.app](https://brynk-cms-backend-production.up.railway.app)

---

### ✅ 7. **Clear Code**

- **Status:** ✅ Yes
  - Folders are organized
  - Variable names are meaningful
  - Errors are logged
  - Can be improved by adding **inline comments** if needed

✅ Good to go.

---

### ✅ 8. **Adherence to Instructions**

- ✔ Followed assignment flow
- ✔ All parts are covered (only DB schema was pending, now added)
- ✔ Project works as expected

---

### ✅ Final Checklist Summary:

| Item                             | Status |
|----------------------------------|--------|
| Source Code                      | ✅     |
| README with Setup + APIs         | ✅     |
| Database Schema                  | ✅     |
| API Documentation (Detailed)     | ✅     |
| Deployment Instructions          | ✅     |
| Live Link                        | ✅     |
| Clean & Commented Code           | ✅     |
| Follows All Instructions         | ✅     |

---



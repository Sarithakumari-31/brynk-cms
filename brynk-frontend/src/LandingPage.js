import React, { useEffect, useState } from "react";
import axios from "axios";
import './LandingPage.css';

const LandingPage = () => {
    const [heading, setHeading] = useState("");

    // ✅ Paste this entire useEffect block inside the component
    useEffect(() => {
        const fetchHeading = () => {
            axios
                .get("http://localhost:8080/api/heading")
                .then((res) => setHeading(res.data.text || ""))
                .catch((err) => console.error("Error:", err));
        };

        fetchHeading(); // fetch once when component mounts

        const interval = setInterval(fetchHeading, 2000); // fetch every 2 seconds

        return () => clearInterval(interval); // clean up on unmount
    }, []);

    return (
        <div className="landing-wrapper">
            <div className="landing-content">
                <h1 className="landing-heading">{heading}</h1>
                <p className="landing-subtext">
                    Accelerate your commercial growth and streamline operations with our powerful AI solutions.
                </p>
                <button className="landing-button">Request a Demo</button>
            </div>
        </div>
    );
};


export default LandingPage;
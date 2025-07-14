import React, { useState } from "react";
import axios from "axios";
import './AdminPage.css';


const AdminPage = () => {
    const [text, setText] = useState("");
    const [editable, setEditable] = useState(true);
    const [success, setSuccess] = useState(false);

    const handleSave = async () => {
        try {
            await axios.post("https://brynk-cms-production.up.railway.app/api/heading", { text });
            setSuccess(true);
            setEditable(false);
        } catch (error) {
            console.error("Error saving heading:", error);
        }
    };

    const handleEdit = () => {
        setEditable(true);
        setSuccess(false);
    };

    return (
        <div className="admin-wrapper">
            <div className="admin-box">
                <div className="admin-row">
                    <div className="admin-label">Heading</div>
                    <textarea
                        className="admin-input"
                        rows={3}
                        value={text}
                        onChange={(e) => setText(e.target.value)}
                        disabled={!editable}
                    />
                </div>
                <div className="admin-buttons">
                    <button className="admin-button edit" onClick={handleEdit}>
                        Edit
                    </button>
                    <button className="admin-button save" onClick={handleSave}>
                        Save
                    </button>
                </div>
                {success && (
                    <p className="success-message">Heading updated successfully!</p>
                )}
            </div>
        </div>

    );

};

export default AdminPage;

import { Link } from "react-router-dom";
import { LOGO_URL } from "../utils/constant";
import { useState } from "react";
const Header = () => {
  const [btnForLogInAndOut, setBtnForLogInAndOut] = useState("LogIn");
  return (
    <div className="header">
      <div className="logo-container">
        <img className="logo" src={LOGO_URL} alt="Food Ordering Logo" />
      </div>
      <div className="nav-links">
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/about">About Us</Link>
          </li>
          <li>
            <Link to="/contact">Contact Us</Link>
          </li>
          <li>Cart</li>
          <button
            className="login-btn"
            onClick={() => {
              btnForLogInAndOut === "LogIn"
                ? setBtnForLogInAndOut((btn) => (btn = "LogOut"))
                : setBtnForLogInAndOut((btn) => (btn = "LogIn"));
            }}
          >
            {btnForLogInAndOut}
          </button>
        </ul>
      </div>
    </div>
  );
};

export default Header;

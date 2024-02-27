import React, { useState, useEffect } from "react";
import { useParams } from "react-router-dom";
import Shimmer from "./Shimmer";

const RestaurantMenu = () => {
  const [resData, setResData] = useState(null);
  const { resId } = useParams();
  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    const res = await fetch(
      `https://www.swiggy.com/dapi/menu/pl?page-type=REGULAR_MENU&complete-menu=true&lat=22.30080&lng=73.20430&restaurantId=${resId}&catalog_qa=undefined&submitAction=ENTER`
    );
    const json = await res.json();
    const result = json?.data?.cards[2]?.card?.card?.info;
    // console.log(result);
    setResData(result);
  };
  if (resData === null) return <Shimmer />;

  const { name, costForTwoMessage, cuisines } = resData;
  return (
    <div className="menu">
      <h1>{name}</h1>
      <h2>{cuisines.join(", ")}</h2>
      <h3>{costForTwoMessage}</h3>
    </div>
  );
};

export default RestaurantMenu;

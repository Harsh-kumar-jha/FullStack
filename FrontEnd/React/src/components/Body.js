import { useEffect, useState } from "react";

import RestaurantCard from "./RestaurantCard";
import Shimmer from "./Shimmer";
import { Link } from "react-router-dom";
const Body = () => {
  const [listOfRestaurant, setListOfRestaurant] = useState([]);
  const [filterListOfRestaurant, setFilterListOfRestaurant] = useState([]);
  const [searchBox, setSearchBox] = useState("");

  const fetchData = async () => {
    try {
      const response = await fetch(
        "https://www.swiggy.com/dapi/restaurants/list/v5?lat=22.30080&lng=73.20430&is-seo-homepage-enabled=true&page_type=DESKTOP_WEB_LISTING"
      );
      const res = await response.json();

      setListOfRestaurant(
        res?.data?.cards[1]?.card?.card?.gridElements?.infoWithStyle
          ?.restaurants
      );
      setFilterListOfRestaurant(
        res?.data?.cards[1]?.card?.card?.gridElements?.infoWithStyle
          ?.restaurants
      );
    } catch (error) {
      console.log("error", error);
    }
  };

  // console.log(listOfRestaurant);
  useEffect(() => {
    fetchData();
  }, []);

  return listOfRestaurant.length === 0 ? (
    <Shimmer />
  ) : (
    <div className="body">
      <div className="filter">
        <div className="search">
          <input
            type="text"
            placeholder="Search Here..."
            className="search-box"
            value={searchBox}
            onChange={(e) => setSearchBox(e.target.value)}
          />
          <button
            onClick={() => {
              const filterList = listOfRestaurant.filter((res) =>
                res?.info?.name.toLowerCase().includes(searchBox)
              );
              setFilterListOfRestaurant(filterList);
            }}
          >
            Search
          </button>
        </div>
        <button
          className="filter-btn"
          onClick={() => {
            const filterList = listOfRestaurant.filter(
              (res) => res.info.avgRating > 4
            );
            setListOfRestaurant(filterList);
          }}
        >
          Top Rated Food
        </button>
      </div>
      <div className="restaurant-container">
        {filterListOfRestaurant?.map((res) => (
          <Link to={"/restaurants/" + res.id}>
            <RestaurantCard resData={res} key={res.id} />
          </Link>
        ))}
      </div>
    </div>
  );
};

export default Body;

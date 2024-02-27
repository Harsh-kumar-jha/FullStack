import { FoodData_URL } from "../utils/constant";

const RestaurantCard = (props) => {
  const { resData } = props;
  const { cloudinaryImageId, name, cuisines, costForTwo, avgRating } =
    resData?.info;

  return (
    <div className="res-card">
      <img
        className="res-logo"
        src={FoodData_URL + cloudinaryImageId}
        alt="res-logo"
      />
      <h3>{name}</h3>
      <h4>{cuisines.join(", ")}</h4>
      <h4>{costForTwo}</h4>
      <h4>{avgRating} star</h4>
      <h4>{resData.info.sla.deliveryTime} min ETA</h4>
    </div>
  );
};

export default RestaurantCard;

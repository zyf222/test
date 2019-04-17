package transport;

public class compute {

    /**
     *
     * @param road                     国内航线，国际航线
     * @param roomtype                头等舱，公务舱，经济舱
     * @param price                   机票价格
     * @param weight                  行李的重量
     * @param x                       行李的长
     * @param y                       行李的宽
     * @param z                       行李的高
     * @param peopletype             成人， 儿童， 占座婴儿，不占座婴儿
     * @param isvip                   金卡会员，银卡会员，留学生，非会员
     * @return                         提示信息
     */

    public static String computeMoney(String road, String roomtype, int price, int weight,int x,int y,int z, String peopletype, String isvip){

        if(road.equals("国内航线")){


            if(weight > 50 || x > 40 || y> 60 || z > 100){
                return "托运不了！";
            }

            int weight_limit = 0;
            if(roomtype.equals("头等舱")){
                weight_limit = 40;
            }else if(roomtype.equals("公务舱")){
                weight_limit = 30;
            }else {
                weight_limit = 20;
            }

            if(peopletype.equals("不占座婴儿") || peopletype.equals("占座婴儿")){
                weight_limit = 10;
            }

            if(isvip.equals("金卡会员")){
                weight_limit += 20;
            }else if(isvip.equals("银卡会员")){
                weight_limit += 10;
            }

            if(weight >= weight_limit){
                return "您的行李托运费为" + (weight - weight_limit)*0.0015 * price + " 元！";
            }else{
                return "您的行李可以免费托运！";
            }
        }else{
            return "这是国际航线！";
        }
    }
}

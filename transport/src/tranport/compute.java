package tranport;

import java.util.ArrayList;
import java.util.Iterator;

public class compute {

    public static String computemoney(visitor user){

        String start = user.getStart();
        String end= user.getEnd();
        String roomtype = user.getRoomtype();
        int packagenum = user.getPackagenum();
        packageinfo p0 = new packageinfo();
        p0.setWeight(user.getWeightxyz()[0][0]);
        p0.setX(user.getWeightxyz()[0][1]);
        p0.setY(user.getWeightxyz()[0][2]);
        p0.setZ(user.getWeightxyz()[0][3]);
        packageinfo p1 = new packageinfo();
        p1.setWeight(user.getWeightxyz()[0][0]);
        p1.setX(user.getWeightxyz()[0][1]);
        p1.setY(user.getWeightxyz()[0][2]);
        p1.setZ(user.getWeightxyz()[0][3]);
        packageinfo p2 = new packageinfo();
        p2.setWeight(user.getWeightxyz()[0][0]);
        p2.setX(user.getWeightxyz()[0][1]);
        p2.setY(user.getWeightxyz()[0][2]);
        p2.setZ(user.getWeightxyz()[0][3]);
        packageinfo p3 = new packageinfo();
        p3.setWeight(user.getWeightxyz()[0][0]);
        p3.setX(user.getWeightxyz()[0][1]);
        p3.setY(user.getWeightxyz()[0][2]);
        p3.setZ(user.getWeightxyz()[0][3]);
        packageinfo p4 = new packageinfo();
        p4.setWeight(user.getWeightxyz()[0][0]);
        p4.setX(user.getWeightxyz()[0][1]);
        p4.setY(user.getWeightxyz()[0][2]);
        p4.setZ(user.getWeightxyz()[0][3]);
        ArrayList<packageinfo> pi = new ArrayList<>();
        pi.add(p0);pi.add(p1);pi.add(p2);pi.add(p3);pi.add(p4);
        String peopletype = user.getPeopletype();
        String isvip = user.getIsvip();

        String result = "";

        if(start.equals("中国大陆（除兰州/乌鲁木齐）") ){
            if(end.equals( "中国大陆（除兰州/乌鲁木齐）") || end.equals( "兰州/乌鲁木齐")){
                result = area0(user);
            }else if (end.equals( "日本，澳新，俄罗斯" )|| end.equals( "美洲" )|| end.equals( "迪拜")){
                result = area1(user);
            }else if(end.equals( "中西亚地区")){
                result = area2(user);
            }else if(end.equals( "内罗毕（除毛里求斯）")){
                result = area3(user);
            }else{
                result = area4(user);
            }
        }else if(start.equals( "兰州/乌鲁木齐")){
            if(end.equals( "中国大陆（除兰州/乌鲁木齐）") || end.equals( "兰州/乌鲁木齐")){
                result = area0(user);
            }else if(end.equals( "迪拜")){
                result = areaspecial(user);
            }else if (end.equals( "日本，澳新，俄罗斯") || end.equals( "美洲")){
                result = area1(user);
            }else if(end.equals( "中西亚地区")){
                result = area2(user);
            }else if(end.equals( "内罗毕（除毛里求斯）")){
                result = area3(user);
            }else{
                result = area4(user);
            }
        }else if(start.equals( "日本，澳洲，俄罗斯，新加坡" )|| start.equals( "美洲")){
            if(end.equals( "中国大陆（除兰州/乌鲁木齐）") || end.equals("兰州/乌鲁木齐")){
                result = area1(user);
            }else{
                result = "托运不了！";
            }
        }else if (start.equals( "迪拜")){
            if(end.equals( "中国大陆（除兰州/乌鲁木齐）")){
                result=area1(user);
            }else if(end.equals( "兰州/乌鲁木齐")){
                result = areaspecial(user);
            }else{
                result = "托运不了！";
            }

        }else if(start.equals( "中西亚地区")){
            if(end.equals( "中国大陆（除兰州/乌鲁木齐）") || end.equals( "兰州/乌鲁木齐")){
                result = area2(user);
            }else{
                result = "托运不了！";
            }
        }else if(start.equals( "内罗毕（除毛里求斯）")){
            if(end.equals( "中国大陆（除兰州/乌鲁木齐）") || end.equals( "兰州/乌鲁木齐")){
                result = area3(user);
            }else{
                result = "托运不了！";
            }
        }else if(start.equals( "韩国")){
            if(end.equals( "中国大陆（除兰州/乌鲁木齐）") || end.equals("兰州/乌鲁木齐")){
                result = area5(user);
            }else{
                result = "托运不了！";
            }
        }else {
            if(end.equals( "中国大陆（除兰州/乌鲁木齐）") || end.equals( "兰州/乌鲁木齐")){
                result = area4(user);

            }else{
               // result= area0(user);
                result = "托运不了！";
            }
        }




        return result;
    }

    public static String  area0(visitor user)               //国内航班
    {
        int packagenum = user.getPackagenum();
        packageinfo p0 = new packageinfo();
        p0.setWeight(user.getWeightxyz()[0][0]);
        p0.setX(user.getWeightxyz()[0][1]);
        p0.setY(user.getWeightxyz()[0][2]);
        p0.setZ(user.getWeightxyz()[0][3]);
        packageinfo p1 = new packageinfo();
        p1.setWeight(user.getWeightxyz()[0][0]);
        p1.setX(user.getWeightxyz()[0][1]);
        p1.setY(user.getWeightxyz()[0][2]);
        p1.setZ(user.getWeightxyz()[0][3]);
        packageinfo p2 = new packageinfo();
        p2.setWeight(user.getWeightxyz()[0][0]);
        p2.setX(user.getWeightxyz()[0][1]);
        p2.setY(user.getWeightxyz()[0][2]);
        p2.setZ(user.getWeightxyz()[0][3]);
        packageinfo p3 = new packageinfo();
        p3.setWeight(user.getWeightxyz()[0][0]);
        p3.setX(user.getWeightxyz()[0][1]);
        p3.setY(user.getWeightxyz()[0][2]);
        p3.setZ(user.getWeightxyz()[0][3]);
        packageinfo p4 = new packageinfo();
        p4.setWeight(user.getWeightxyz()[0][0]);
        p4.setX(user.getWeightxyz()[0][1]);
        p4.setY(user.getWeightxyz()[0][2]);
        p4.setZ(user.getWeightxyz()[0][3]);
        ArrayList<packageinfo> pi = new ArrayList<>();
        pi.add(p0);pi.add(p1);pi.add(p2);pi.add(p3);pi.add(p4);
        double totalweight = 0;
        if(pi.size() == 0){
            return "无需托运";
        }
        for(int i=0; i<packagenum; i++){
            if(pi.get(i).getWeight() > 50 || pi.get(i).getX() > 40 || pi.get(i).getY() > 60 || pi.get(i).getZ() > 100){
                return "托运不了！";
            }
            totalweight = totalweight + pi.get(i).getWeight();
        }

        int weight_limit = 0;
        if(user.getRoomtype().equals("头等舱")){
            weight_limit = 40;
        }else if(user.getRoomtype().equals("公务舱")){
            weight_limit = 30;
        }else{
            weight_limit = 20;
        }

        if(user.getPeopletype().equals("不占座婴儿") || user.getPeopletype().equals("占座婴儿")){
            weight_limit = 10;
        }

        if(user.getIsvip().equals("南航明珠金卡会员，天台联盟超级精英")){
            weight_limit += 20;
        }else if(user.getIsvip().equals("南航明珠银卡会员，天台联盟精英")){
            weight_limit += 10;
        }

        if(totalweight >= weight_limit * packagenum){
            return "您的行李托运费为："+ (totalweight - weight_limit*packagenum)*0.0015*user.getPrice()+" 元！";
        }else{
            return "您的行李可以免费托运！";
        }
    }

    public static String  area1(visitor user)               //区域一
    {
        int packagenum = user.getPackagenum();
        packageinfo p0 = new packageinfo();
        p0.setWeight(user.getWeightxyz()[0][0]);
        p0.setX(user.getWeightxyz()[0][1]);
        p0.setY(user.getWeightxyz()[0][2]);
        p0.setZ(user.getWeightxyz()[0][3]);
        packageinfo p1 = new packageinfo();
        p1.setWeight(user.getWeightxyz()[0][0]);
        p1.setX(user.getWeightxyz()[0][1]);
        p1.setY(user.getWeightxyz()[0][2]);
        p1.setZ(user.getWeightxyz()[0][3]);
        packageinfo p2 = new packageinfo();
        p2.setWeight(user.getWeightxyz()[0][0]);
        p2.setX(user.getWeightxyz()[0][1]);
        p2.setY(user.getWeightxyz()[0][2]);
        p2.setZ(user.getWeightxyz()[0][3]);
        packageinfo p3 = new packageinfo();
        p3.setWeight(user.getWeightxyz()[0][0]);
        p3.setX(user.getWeightxyz()[0][1]);
        p3.setY(user.getWeightxyz()[0][2]);
        p3.setZ(user.getWeightxyz()[0][3]);
        packageinfo p4 = new packageinfo();
        p4.setWeight(user.getWeightxyz()[0][0]);
        p4.setX(user.getWeightxyz()[0][1]);
        p4.setY(user.getWeightxyz()[0][2]);
        p4.setZ(user.getWeightxyz()[0][3]);
        ArrayList<packageinfo> pi = new ArrayList<>();
        pi.add(p0);pi.add(p1);pi.add(p2);pi.add(p3);pi.add(p4);
        if(user.getStart().equals("美洲")){
            for(int i=0; i<packagenum ;i++){
                if(pi.get(i).getWeight() > 45 || pi.get(i).getX() + pi.get(i).getY() + pi.get(i).getZ() > 158){
                    return "托运不了！";
                }
            }
        }else{
            for(int i=0; i<packagenum ;i++){
                if(pi.get(i).getWeight() > 32 || pi.get(i).getX() + pi.get(i).getY() + pi.get(i).getZ() > 158){
                    return "托运不了！";
                }
            }
        }
        int weight_limit = 0;
        int packagenum_limit = 0;
        if(user.getRoomtype().equals("头等舱")){
            weight_limit = 32;
            packagenum_limit = 3;
        }else if(user.getRoomtype().equals("公务舱")){
            weight_limit = 32;
            packagenum_limit = 2;
        }else{
            weight_limit = 23;
            packagenum_limit = 2;
        }
        if(user.getPeopletype().equals("不占座婴儿")){
            weight_limit = 10;
            packagenum_limit = 1;
        }
        if(user.getIsvip().equals("南航明珠金卡会员，天台联盟超级精英")){
            weight_limit += 20;
        }else if(user.getIsvip().equals("南航明珠银卡会员，天台联盟精英")){
            weight_limit += 10;
        }else if(user.getIsvip().equals("留学生，劳务，海员")){
            packagenum_limit += 1;
        }
        int money = 0;
        for(int i=0; i<packagenum; i++){
            if(i == 5){
                break;
                //return "您的行李托运费用为：" + money + "元！";
            }
            if(pi.get(i).getWeight() == 0){
                break;
                //return "您的行李托运费用为：" + money + "元！";
            }else{
                if(i == packagenum_limit){
                    money += 1000;
                }
                if(i >= packagenum_limit + 1){
                    money += 2000;
                }
                if(pi.get(i).getZ() + pi.get(i).getY() + pi.get(i).getX() > 158){
                    money += 1000;
                }
                if(pi.get(i).getWeight() > weight_limit){
                    if(user.getRoomtype().equals("明珠经济舱") || user.getRoomtype().equals("经济舱")){
                        if(pi.get(i).getWeight() <= weight_limit + 9){
                            money += 1000;
                        }else{
                            money += 3000;
                        }
                    }else{
                        money += 3000;
                    }
                }
            }

        }
        return "您的行李托运费为：" + money + "元！";
    }

    public static String area2(visitor user)                //区域二
    {
        int packagenum = user.getPackagenum();
        packageinfo p0 = new packageinfo();
        p0.setWeight(user.getWeightxyz()[0][0]);
        p0.setX(user.getWeightxyz()[0][1]);
        p0.setY(user.getWeightxyz()[0][2]);
        p0.setZ(user.getWeightxyz()[0][3]);
        packageinfo p1 = new packageinfo();
        p1.setWeight(user.getWeightxyz()[0][0]);
        p1.setX(user.getWeightxyz()[0][1]);
        p1.setY(user.getWeightxyz()[0][2]);
        p1.setZ(user.getWeightxyz()[0][3]);
        packageinfo p2 = new packageinfo();
        p2.setWeight(user.getWeightxyz()[0][0]);
        p2.setX(user.getWeightxyz()[0][1]);
        p2.setY(user.getWeightxyz()[0][2]);
        p2.setZ(user.getWeightxyz()[0][3]);
        packageinfo p3 = new packageinfo();
        p3.setWeight(user.getWeightxyz()[0][0]);
        p3.setX(user.getWeightxyz()[0][1]);
        p3.setY(user.getWeightxyz()[0][2]);
        p3.setZ(user.getWeightxyz()[0][3]);
        packageinfo p4 = new packageinfo();
        p4.setWeight(user.getWeightxyz()[0][0]);
        p4.setX(user.getWeightxyz()[0][1]);
        p4.setY(user.getWeightxyz()[0][2]);
        p4.setZ(user.getWeightxyz()[0][3]);
        ArrayList<packageinfo> pi = new ArrayList<>();
        pi.add(p0);pi.add(p1);pi.add(p2);pi.add(p3);pi.add(p4);
        for (int i = 0; i < packagenum; i++) {
            if (pi.get(i).getWeight() > 32) {
                return "托运不了！";
            }
        }
        int weight_limit = 0;
        int packagenum_limit = 0;
        if (user.getRoomtype().equals("头等舱")) {
            weight_limit = 32;
            packagenum_limit = 3;
        } else if (user.getRoomtype().equals("公务舱")) {
            weight_limit = 32;
            packagenum_limit = 2;
        } else {
            weight_limit = 32;
            packagenum_limit = 1;
        }
        if (user.getPeopletype().equals("不占座婴儿")) {
            weight_limit = 10;
            packagenum_limit = 1;
        }
        if (user.getIsvip().equals("南航明珠金卡会员，天台联盟超级精英")) {
            weight_limit += 20;
        } else if (user.getIsvip().equals("南航明珠银卡会员，天台联盟精英")) {
            weight_limit += 10;
        } else if (user.getIsvip().equals("留学生，劳务，海员")) {
            packagenum_limit += 1;
        }
        int money = 0;
        for (int i = 0; i < packagenum; i++) {
            if (i == 5) {
                break;
                //return "您的行李托运费用为：" + money + "元！";
            }
            if (pi.get(i).getWeight() == 0) {
                break;
                //return "您的行李托运费用为：" + money + "元！";
            } else {
                if (i == packagenum_limit) {
                    money += 450;
                }
                if (i >= packagenum_limit + 1) {
                    money += 1300;
                }
                if (pi.get(i).getX() + pi.get(i).getY() + pi.get(i).getZ() > 158) {
                    money += 1000;
                }
                if (pi.get(i).getWeight() > weight_limit) {
                    money += 3000;
                }
            }
        }
        return "您的行李托运费为：" + money + "元！";

    }

    public static String area3(visitor user)                 //区域三
    {
        int packagenum = user.getPackagenum();
        packageinfo p0 = new packageinfo();
        p0.setWeight(user.getWeightxyz()[0][0]);
        p0.setX(user.getWeightxyz()[0][1]);
        p0.setY(user.getWeightxyz()[0][2]);
        p0.setZ(user.getWeightxyz()[0][3]);
        packageinfo p1 = new packageinfo();
        p1.setWeight(user.getWeightxyz()[0][0]);
        p1.setX(user.getWeightxyz()[0][1]);
        p1.setY(user.getWeightxyz()[0][2]);
        p1.setZ(user.getWeightxyz()[0][3]);
        packageinfo p2 = new packageinfo();
        p2.setWeight(user.getWeightxyz()[0][0]);
        p2.setX(user.getWeightxyz()[0][1]);
        p2.setY(user.getWeightxyz()[0][2]);
        p2.setZ(user.getWeightxyz()[0][3]);
        packageinfo p3 = new packageinfo();
        p3.setWeight(user.getWeightxyz()[0][0]);
        p3.setX(user.getWeightxyz()[0][1]);
        p3.setY(user.getWeightxyz()[0][2]);
        p3.setZ(user.getWeightxyz()[0][3]);
        packageinfo p4 = new packageinfo();
        p4.setWeight(user.getWeightxyz()[0][0]);
        p4.setX(user.getWeightxyz()[0][1]);
        p4.setY(user.getWeightxyz()[0][2]);
        p4.setZ(user.getWeightxyz()[0][3]);
        ArrayList<packageinfo> pi = new ArrayList<>();
        pi.add(p0);pi.add(p1);pi.add(p2);pi.add(p3);pi.add(p4);
        for(int i=0; i<packagenum; i++){
            if(pi.get(i).getWeight() > 32){
                return "托运不了！";
            }
        }
        int weight_limit = 0;
        int packagenum_limit = 0;
        if(user.getRoomtype().equals("头等舱")){
            weight_limit = 32;
            packagenum_limit = 3;
        }else if(user.getRoomtype().equals("公务舱")){
            weight_limit = 32;
            packagenum_limit = 2;
        }else{
            weight_limit = 23;
            packagenum_limit = 2;
        }
        if(user.getPeopletype().equals("不占座婴儿")){
            weight_limit = 10;
            packagenum_limit = 1;
        }
        if(user.getIsvip().equals("南航明珠金卡会员，天台联盟超级精英")){
            weight_limit += 20;
        }else if(user.getIsvip().equals("南航明珠银卡会员，天台联盟精英")){
            weight_limit += 10;
        }else if(user.getIsvip().equals("留学生，劳务，海员")){
            packagenum_limit += 1;
        }
        int money = 0;
        for(int i=0; i<packagenum; i++){
            if(i == 5){
                break;
                //return "您的行李托运费用为：" + money + "元！";
            }
            if(pi.get(i).getWeight() == 0){
                break;
                //return "您的行李托运费用为：" + money + "元！";
            }else{
                if(i == packagenum_limit){
                    money += 1000;
                }
                if(i >= packagenum_limit + 1){
                    money += 2000;
                }
                if(pi.get(i).getZ() + pi.get(i).getY() + pi.get(i).getX() > 158){
                    money += 1000;
                }
                if(pi.get(i).getWeight() > weight_limit){
                    if(user.getRoomtype().equals("明珠经济舱") || user.getRoomtype().equals("经济舱")){
                        if(pi.get(i).getWeight() <= weight_limit + 9){
                            money += 2000;
                        }else{
                            money += 3000;
                        }
                    }else{
                        money += 3000;
                    }
                }
            }

        }
        return "您的行李托运费为：" + money + "元！";
    }

    public static String area4(visitor user)                 //区域四
    {
        int packagenum = user.getPackagenum();
        packageinfo p0 = new packageinfo();
        p0.setWeight(user.getWeightxyz()[0][0]);
        p0.setX(user.getWeightxyz()[0][1]);
        p0.setY(user.getWeightxyz()[0][2]);
        p0.setZ(user.getWeightxyz()[0][3]);
        packageinfo p1 = new packageinfo();
        p1.setWeight(user.getWeightxyz()[0][0]);
        p1.setX(user.getWeightxyz()[0][1]);
        p1.setY(user.getWeightxyz()[0][2]);
        p1.setZ(user.getWeightxyz()[0][3]);
        packageinfo p2 = new packageinfo();
        p2.setWeight(user.getWeightxyz()[0][0]);
        p2.setX(user.getWeightxyz()[0][1]);
        p2.setY(user.getWeightxyz()[0][2]);
        p2.setZ(user.getWeightxyz()[0][3]);
        packageinfo p3 = new packageinfo();
        p3.setWeight(user.getWeightxyz()[0][0]);
        p3.setX(user.getWeightxyz()[0][1]);
        p3.setY(user.getWeightxyz()[0][2]);
        p3.setZ(user.getWeightxyz()[0][3]);
        packageinfo p4 = new packageinfo();
        p4.setWeight(user.getWeightxyz()[0][0]);
        p4.setX(user.getWeightxyz()[0][1]);
        p4.setY(user.getWeightxyz()[0][2]);
        p4.setZ(user.getWeightxyz()[0][3]);
        ArrayList<packageinfo> pi = new ArrayList<>();
        pi.add(p0);pi.add(p1);pi.add(p2);pi.add(p3);pi.add(p4);
        for(int i=0; i<packagenum; i++){
            if(pi.get(i).getWeight() > 32){
                return "托运不了！";
            }
        }
        int weight_limit = 0;
        int packagenum_limit = 0;
        if(user.getRoomtype().equals("头等舱")){
            weight_limit = 32;
            packagenum_limit = 3;
        }else if(user.getRoomtype().equals("公务舱")){
            weight_limit = 23;
            packagenum_limit = 3;
        }else if(user.getRoomtype().equals("明珠经济舱")){
            weight_limit = 23;
            packagenum_limit = 2;
        }else{
            weight_limit = 23;
            packagenum_limit = 1;
        }
        if(user.getPeopletype().equals("不占座婴儿")){
            weight_limit = 10;
            packagenum_limit = 1;
        }
        if(user.getIsvip().equals("南航明珠金卡会员，天台联盟超级精英")){
            weight_limit += 20;
        }else if(user.getIsvip().equals("南航明珠银卡会员，天台联盟精英")){
            weight_limit += 10;
        }else if(user.getIsvip().equals("留学生，劳务，海员")){
            packagenum_limit += 1;
        }
        int money = 0;
        for(int i=0; i<packagenum; i++){
            if(i == 5){
                break;
                //return "您的行李托运费用为：" + money + "元！";
            }
            if(pi.get(i).getWeight() == 0){
                break;
                //return "您的行李托运费用为：" + money + "元！";
            }else{
                if(i == packagenum_limit){
                    money += 450;
                }
                if(i >= packagenum_limit + 1){
                    money += 1300;
                }
                if(pi.get(i).getZ() + pi.get(i).getY() + pi.get(i).getX() > 158){
                    money += 1000;
                }
                if(pi.get(i).getWeight() > weight_limit){
                    if(!user.getRoomtype().equals("头等舱")){
                        if(pi.get(i).getWeight() <= weight_limit + 9){
                            money += 1000;
                        }else{
                            money += 3000;
                        }
                    }else{
                        money += 3000;
                    }
                }
            }

        }
        return "您的行李托运费为：" + money + "元！";
    }

    public static String area5(visitor user)                 //韩国始发
    {
        int packagenum = user.getPackagenum();
        packageinfo p0 = new packageinfo();
        p0.setWeight(user.getWeightxyz()[0][0]);
        p0.setX(user.getWeightxyz()[0][1]);
        p0.setY(user.getWeightxyz()[0][2]);
        p0.setZ(user.getWeightxyz()[0][3]);
        packageinfo p1 = new packageinfo();
        p1.setWeight(user.getWeightxyz()[0][0]);
        p1.setX(user.getWeightxyz()[0][1]);
        p1.setY(user.getWeightxyz()[0][2]);
        p1.setZ(user.getWeightxyz()[0][3]);
        packageinfo p2 = new packageinfo();
        p2.setWeight(user.getWeightxyz()[0][0]);
        p2.setX(user.getWeightxyz()[0][1]);
        p2.setY(user.getWeightxyz()[0][2]);
        p2.setZ(user.getWeightxyz()[0][3]);
        packageinfo p3 = new packageinfo();
        p3.setWeight(user.getWeightxyz()[0][0]);
        p3.setX(user.getWeightxyz()[0][1]);
        p3.setY(user.getWeightxyz()[0][2]);
        p3.setZ(user.getWeightxyz()[0][3]);
        packageinfo p4 = new packageinfo();
        p4.setWeight(user.getWeightxyz()[0][0]);
        p4.setX(user.getWeightxyz()[0][1]);
        p4.setY(user.getWeightxyz()[0][2]);
        p4.setZ(user.getWeightxyz()[0][3]);
        ArrayList<packageinfo> pi = new ArrayList<>();
        pi.add(p0);pi.add(p1);pi.add(p2);pi.add(p3);pi.add(p4);
        for(int i=0; i<packagenum; i++){
            if(pi.get(i).getWeight() > 32){
                return "托运不了！";
            }
        }
        int weight_limit = 0;
        int packagenum_limit = 0;
        if(user.getRoomtype().equals("头等舱")){
            weight_limit = 32;
            packagenum_limit = 3;
        }else if(user.getRoomtype().equals("公务舱")){
            weight_limit = 32;
            packagenum_limit = 2;
        }else{
            weight_limit = 23;
            packagenum_limit = 1;
        }
        if(user.getPeopletype().equals("不占座婴儿")){
            weight_limit = 10;
            packagenum_limit = 1;
        }
        if(user.getIsvip().equals("南航明珠金卡会员，天台联盟超级精英")){
            weight_limit += 20;
        }else if(user.getIsvip().equals("南航明珠银卡会员，天台联盟精英")){
            weight_limit += 10;
        }else if(user.getIsvip().equals("留学生，劳务，海员")){
            packagenum_limit += 1;
        }
        int money = 0;
        for(int i=0; i<packagenum; i++){
            if(i == 5){
                break;
                //return "您的行李托运费用为：" + money + "元！";
            }
            if(pi.get(i).getWeight() == 0){
                break;
                //return "您的行李托运费用为：" + money + "元！";
            }else{
                if(i == packagenum_limit){
                    money += 450;
                }
                if(i >= packagenum_limit + 1){
                    money += 1300;
                }
                if(pi.get(i).getZ() + pi.get(i).getY() + pi.get(i).getX() > 158){
                    money += 1000;
                }
                if(pi.get(i).getWeight() > weight_limit){
                    if(!user.getRoomtype().equals("头等舱")){
                        if(pi.get(i).getWeight() <= weight_limit + 9){
                            money += 1000;
                        }else{
                            money += 3000;
                        }
                    }else{
                        money += 3000;
                    }
                }
            }

        }
        return "您的行李托运费为：" + money + "元！";
    }

    public static String areaspecial(visitor user)            //兰州/乌鲁木齐与迪拜之间的航线
    {
        int packagenum = user.getPackagenum();
        packageinfo p0 = new packageinfo();
        p0.setWeight(user.getWeightxyz()[0][0]);
        p0.setX(user.getWeightxyz()[0][1]);
        p0.setY(user.getWeightxyz()[0][2]);
        p0.setZ(user.getWeightxyz()[0][3]);
        packageinfo p1 = new packageinfo();
        p1.setWeight(user.getWeightxyz()[0][0]);
        p1.setX(user.getWeightxyz()[0][1]);
        p1.setY(user.getWeightxyz()[0][2]);
        p1.setZ(user.getWeightxyz()[0][3]);
        packageinfo p2 = new packageinfo();
        p2.setWeight(user.getWeightxyz()[0][0]);
        p2.setX(user.getWeightxyz()[0][1]);
        p2.setY(user.getWeightxyz()[0][2]);
        p2.setZ(user.getWeightxyz()[0][3]);
        packageinfo p3 = new packageinfo();
        p3.setWeight(user.getWeightxyz()[0][0]);
        p3.setX(user.getWeightxyz()[0][1]);
        p3.setY(user.getWeightxyz()[0][2]);
        p3.setZ(user.getWeightxyz()[0][3]);
        packageinfo p4 = new packageinfo();
        p4.setWeight(user.getWeightxyz()[0][0]);
        p4.setX(user.getWeightxyz()[0][1]);
        p4.setY(user.getWeightxyz()[0][2]);
        p4.setZ(user.getWeightxyz()[0][3]);
        ArrayList<packageinfo> pi = new ArrayList<>();
        pi.add(p0);pi.add(p1);pi.add(p2);pi.add(p3);pi.add(p4);
        for(int i=0; i<packagenum; i++){
            if(pi.get(i).getWeight() > 32){
                return "托运不了！";
            }
        }
        int weight_limit = 0;                                         //单个行李的质量上限
        int packagenum_limit = 0;                                     //行李数量上限
        if(user.getRoomtype().equals("头等舱")){
            weight_limit = 32;
            packagenum_limit = 3;
        }else if(user.getRoomtype().equals("公务舱")){
            weight_limit = 32;
            packagenum_limit = 2;
        }else if(user.getRoomtype().equals("高端经济舱")){
            weight_limit = 32;
            packagenum_limit = 1;
        }else{
            weight_limit = 23;
            packagenum_limit = 1;
        }
        if(user.getPeopletype().equals("不占座婴儿")){
            weight_limit = 10;
            packagenum_limit = 1;
        }
        if(user.getIsvip().equals("南航明珠金卡会员，天台联盟超级精英")){
            weight_limit += 20;
        }else if(user.getIsvip().equals("南航明珠银卡会员，天台联盟精英")){
            weight_limit += 10;
        }else if(user.getIsvip().equals("留学生，劳务，海员")){
            packagenum_limit += 1;
        }
        int money = 0;
        for(int i=0; i<packagenum; i++){
            if(i == 5){
                break;
            }
            if(pi.get(i).getWeight() == 0){
                break;
            }else{
                if(i == packagenum_limit){
                    money += 450;
                }
                if(i >= packagenum_limit + 1){
                    money += 1300;
                }
                if(pi.get(i).getZ() + pi.get(i).getY() + pi.get(i).getX() > 158){
                    money += 1000;
                }
                if(pi.get(i).getWeight() > weight_limit){
                    if(user.getRoomtype().equals("明珠经济舱") || user.getRoomtype().equals("经济舱")){
                        if(pi.get(i).getWeight() <= weight_limit + 9){
                            money += 1000;
                        }else{
                            money += 3000;
                        }
                    }else{
                        money += 3000;
                    }
                }
            }

        }
        return "您的行李托运费为：" + money + "元！";
    }
}






package com.example.ero.week4homework2;

import android.content.Context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserProvider {
    static List<ListModel> list = new ArrayList<>();
    public static int position;

    public static List<ListModel> getUserList(Context context) {
        if (!list.isEmpty()) {
            list.clear();
        }
        list.add(new ListModel("Nissan Teana", context.getString(R.string.nissan), new String[]{"https://blogmedia.dealerfire.com/wp-content/uploads/sites/488/2018/04/2019-Nissan-Altima-front-grille-view_o.jpg", "http://www.1gai.ru/uploads/posts/2018-03/1522251831_1.jpg", "https://s1.yimg.com/uu/api/res/1.2/WxPuu2R14t0QtOTl30d.Ug--/YXBwaWQ9eXRhY2h5b247cT03NTs-/http://media.zenfs.com/zh-Hant-TW/homerun/carture__812/2da1813ea455dc0377b214352f26f678", "https://www.autobild.es/sites/autobild.es/public/styles/768x432/public/dc/fotos/Nissan-Versa_Note_2015_C01.jpg?itok=xyZ54WSv"}, context.getString(R.string.nissan_teana), false, false, 0, "auto"));
        list.add(new ListModel("BMW X5", context.getString(R.string.bmw), new String[]{"http://autoua.net/media/uploads/bmw/c24e82738d697d0ab4e74d9750582ae1bbf71a9f.jpg", "http://techworldherald.com/wp-content/uploads/2018/06/BMW-X5-2019-breaks-into-the-market-with-evolved-design-and-technology.jpg", "https://pictures.topspeed.com/IMG/crop/201806/visual-comparison_800x0w.jpg"}, context.getString(R.string.bmw_x5), false, false, 0, "auto"));
        list.add(new ListModel("Mercedes GLE", context.getString(R.string.merc), new String[]{"https://assets.mbusa.com/vcm/MB/DigitalAssets/Vehicles/Models/2018/GLE-Coupe/Features/2018-GLE-GLE43-COUPE-007-MCFO.jpg", "http://automiddleeast.com/wp-content/uploads/2015/09/314485.ECE_.MB_.jpg", "https://img.sm360.ca/ir/w500c/images/newcar/2018/mercedes-benz/gle/400-4matic/suv/exteriorColors/2018_mercedes-benz_gle-500-4matic_vus_rhm_032.png", "https://assets.mbusa.com/vcm/MB/DigitalAssets/Vehicles/Models/2018/GLE-SUV/Features/2018-GLE-GLE63-AMG-SUV-005-MCFO.jpg"}, context.getString(R.string.mercedes), false, false, 0, "auto"));
        list.add(new ListModel("Audi A8", context.getString(R.string.audi_a8), new String[]{"https://static3.car.ru/uploaded/2017/10/10/2022/650_8e3cc4b68f601f70428daabeed4e1820_6e33a3846b9f787feaae2c6114a8a60c.jpg", "https://st2.zr.ru/_ah/img/iETA54bzbTw2vuWOM3McNQ=s800", "http://www.1gai.ru/uploads/posts/2013-08/1377094372_2014-audi-s8.jpg", "https://img1.automoto.ua/auto/Audi-A8-seryiy-none-2018-75-19171572.jpeg"}, context.getString(R.string.audi), false, false, 0, "auto"));
        list.add(new ListModel("Toyota Camry", context.getString(R.string.camry), new String[]{"https://v-2018.com/wp-content/uploads/2017/02/toyota-camry-2018.jpg", "https://img.autobytel.com/car-reviews/autobytel/131645-10-things-you-need-to-know-about-the-all-new-2018-toyota-camry/2018-Toyota-Camry-at-Detroit-Auto-Show-unveil-by-Andy-Bornhop.jpg", "https://hips.hearstapps.com/pop.h-cdn.co/assets/17/02/4000x2000/landscape-1484057043-camry-alternate.jpg?resize=768:*"}, context.getString(R.string.toyota), false, false, 0, "auto"));
        list.add(new ListModel("Yamaha", context.getString(R.string.yama), new String[]{"https://www.motonews.ru/imgs/new_834_4b.jpg", "http://vsemoto.ucoz.ru/_bd/3/29209.jpg", "http://vsemoto.ucoz.ru/_bd/3/29209.jpg"}, context.getString(R.string.yamaha), false, false, 0, "moto"));
        list.add(new ListModel("Neander", context.getString(R.string.nead), new String[]{"https://webnews.bg/uploads/images/59/7759/7759/orig.jpg?_=1446837953", "https://static.fakti.bg/news2011/1072/3d71b91562d4e4db4f053506c43fe647_big.jpg", "http://www.hobby-bg.net/data/uploads/nai-byrziqt-i-moshten-motociklet-v-sveta/1.jpg", "https://bg.all.biz/img/bg/catalog/38622.jpeg"}, context.getString(R.string.neader), false, false, 0, "moto"));
        list.add(new ListModel("Harley-Davidson", context.getString(R.string.haerly_davidson), new String[]{"https://media.zigcdn.com/media/model/2017/Dec/harley-davidson-forty-eight-right-view_600x300.jpg", "https://media.zigcdn.com/media/model/2017/Dec/roadster-right-view_420x210.jpg", "https://cdp.azureedge.net/products/USA/HD/2018/MC/CRUISER/IRON_883/50/HARD_CANDY_CHAMELEON_FLAKE/2000000003.jpg"}, context.getString(R.string.hearly), false, false, 0, "moto"));
        list.add(new ListModel("ASUS E202SA", context.getString(R.string.asus_E), new String[]{"https://img.mvideo.ru/Pdb/30031664b.jpg", "https://items.s1.citilink.ru/1003512_v01_b.jpg", "https://items.s1.citilink.ru/488408_v01_b.jpg"}, context.getString(R.string.asus), false, false, 0, "electrinics"));
        list.add(new ListModel("IPhone 8", context.getString(R.string.iphone_8), new String[]{"https://store.storeimages.cdn-apple.com/4981/as-images.apple.com/is/image/AppleInc/aos/published/images/i/ph/iphone8/select/iphone8-select-2018?wid=249&hei=304&fmt=png-alpha&.v=1521831198119", "https://janebi.com/janebi/9fd2/files/131716.jpg", "https://my.citrus.ua/imgcache/size_1000/uploads/shop/2/2/220a8d68c8b90a880d6b120350d3b094.jpg"}, context.getString(R.string.iphone), false, false, 0, "electrinics"));
        list.add(new ListModel("Samsung TV", context.getString(R.string.samsung_tv), new String[]{"http://cdn2.expertreviews.co.uk/sites/expertreviews/files/styles/er_main_wide/public/2018/03/samsung-tv-model-numbers.jpg?itok=_3peLD8J", "http://d1981spmolq67f.cloudfront.net/img/products/full/290120181606310-ue40mu6100kxxu-black-65804532.jpg?v=1", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8i4qXJotUSdFgUWSCeVb1QFpLK9K_5fls4xnbBlJ6NnkAX3ZC", "http://img1.ibay.com.mv/is1/full/2017/12/item_2070179_485.jpg"}, context.getString(R.string.samsung), false, false, 0, "electrinics"));
        list.add(new ListModel("PlayStation TV", context.getString(R.string.play), new String[]{"https://i2.cdscdn.com/pdt2/0/3/8/1/700x700/0711719834038/rw/pack-ps4-500go-noire-playstation-tv-voucher.jpg", "https://vividgold.co.ke/wp-content/uploads/2016/04/playstation-tv.jpg"}, context.getString(R.string.playstation), false, false, 0, "electrinics"));
        list.add(new ListModel("ZD-967", context.getString(R.string.zd_967), new String[]{"https://electrozon.ru/reviews/2014/Set-of-Tools/Set-tools1.jpg", "https://vlamour.ru/UserFiles/Image/NaboriInstrumenta/nabor(1).jpg", "https://www.adelaida.ro/images/detailed/108/zd-967.jpg"}, context.getString(R.string.zd), false, false, 0, "instruments"));
        list.add(new ListModel("Bosch", context.getString(R.string.bosch_w), new String[]{"http://elektrikexpert.ru/wp-content/uploads/2015/09/123.jpg", "https://www.hornbach.nl/data/shop/D04/001/780/499/238/08/DV_8_6088652_01_4c_DE_20160810221656.jpg"}, context.getString(R.string.bosch), false, false, 0, "instruments"));

        Collections.shuffle(UserProvider.list);
        return list;
    }

    public static List<ListModel> getListCategory(String category) {
        List<ListModel> categoryList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCategory().equals(category)) {
                categoryList.add(list.get(i));
            }
        }
        return categoryList;
    }

    public static List<ListModel> getFavList() {
        List<ListModel> likedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isLiked) {
                likedList.add(list.get(i));
            }
        }
        return likedList;
    }

    public static List<ListModel> getCartList() {
        List<ListModel> cartdList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isToBasked) {
                cartdList.add(list.get(i));
            }
        }
        return cartdList;
    }

    public static ListModel getUserPosition() {
        return list.get(position);
    }
}

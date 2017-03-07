package cn.zxc.demo.demo3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cn.zxc.demo.demo3.order.Doc;
import cn.zxc.demo.demo3.order.PDFUtil;



public class UserServiceImp implements UserService{
	private UserDao dao = new UserDao();
	public User addUser() throws Exception{
		return dao.addUser();
	}

	public User deleteUser(String id) throws Exception {
		User u=new User();
		u.setUsername("Tom");
		u.setId(Integer.parseInt(id));
		u.setPassword("123");
		System.out.println("check");
		System.out.println("delete");
		return u;
		
	}

	public User putUser() throws Exception{
		User u=new User();
		u.setUsername("Black");
		u.setId(2);
		u.setPassword("123");
		System.out.println("check");
		return u;
	}

	public User checkUser(String id) throws Exception {
	
		return dao.getUser(id);
	}

	public Response downLoadPdf() {
		String str="afhhjo分红年度非啊哈佛大或发哦分红啊回复奥大黄蜂哦啊或发哦哈佛奥大黄蜂奥大黄蜂ad"
				+ "哈佛安徽肥东大法好哦啊大活佛大活佛阿道夫红安的哈佛俺不能否案发"
				+ "号发货的佛奥活动佛奥活动佛爱德华佛安保佛啊 啊哈佛奥好地方奥和房东啊返回啊东方豪偶发"
				+ "粉红个安顿好佛奥活动佛奥活动佛安东尼发哦南发哦反 或发哦到哈佛啊发哈厚厚的佛爱德华 哈佛ad核发"
				+ "后发货东方号分好低分突然好听话 套而后他合同阿尔哈听话哦啊额核桃肉哪台 洮儿河同安而后他"
				+ "挺好额合同安慰和投阿尔法打烦了套二交通挖师傅你看撒就发哦激发工会佛啊发货哦啊的合法发"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "分红啊哈佛大很特别高合同爱好报告烘干哦啊噶高不敢当攻沙个哦噶好歌喉 搞化工搞得更好 搞定后宫啊"
				+ "更好地和公安该后悔过该后悔过搞好规划该好好干红红红哒该好好干的嘎哈董浩更好的";
		String str2="湖南日报3月1日讯（记者 周勇军 李寒露）石家庄退伍老兵王新法不远千里到湖南石门县薛家村义务扶贫，累倒在扶贫路上的事迹，经湖南日报"
				+ "和“新湖南”报道后，连日来在他的家乡河北引起强烈反";
		String str3="3月1日上午，湖南省安乡至慈利高速公路开工动员暨常德市重点建设项目集中开"
				+ "工仪式在常德市临澧县举行。安慈高速公路主线全长121.14公里，建设期3年，"
				+ "是省交通运输厅公开招标引进的第一家央企投资的BOT项目。"
				+ "项目建成后，将对完善湖南省高速公路网结构、"
				+ "加快洞庭湖生态经济区及泛湘西北区域的发展具有重要意";
		byte[] createPDf = null;
		List<Doc> docList = new ArrayList<Doc>();
		docList.add(new Doc("王新法获评河北好人", str2, "红网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://hn.rednet.cn/c/2017/03/02/4226196.htm"));
		docList.add(new Doc("湖南:安慈高速公路开工预计3年建成通车", str3, "银河证券网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://www.chinastock.com.cn/yhwz_about.do?methodCall=getDetailInfo&docId=5665769"));
		docList.add(new Doc("王新法获评河北好人", str2, "红网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://hn.rednet.cn/c/2017/03/02/4226196.htm"));
		docList.add(new Doc("湖南:安慈高速公路开工预计3年建成通车", str3, "银河证券网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://www.chinastock.com.cn/yhwz_about.do?methodCall=getDetailInfo&docId=5665769"));
		docList.add(new Doc("王新法获评河北好人", str2, "红网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://hn.rednet.cn/c/2017/03/02/4226196.htm"));
		docList.add(new Doc("湖南:安慈高速公路开工预计3年建成通车", str3, "银河证券网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://www.chinastock.com.cn/yhwz_about.do?methodCall=getDetailInfo&docId=5665769"));
		docList.add(new Doc("王新法获评河北好人", str2, "红网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://hn.rednet.cn/c/2017/03/02/4226196.htm"));
		docList.add(new Doc("湖南:安慈高速公路开工预计3年建成通车", str3, "银河证券网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://www.chinastock.com.cn/yhwz_about.do?methodCall=getDetailInfo&docId=5665769"));
		docList.add(new Doc("王新法获评河北好人", str2, "红网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://hn.rednet.cn/c/2017/03/02/4226196.htm"));
		docList.add(new Doc("湖南:安慈高速公路开工预计3年建成通车", str3, "银河证券网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://www.chinastock.com.cn/yhwz_about.do?methodCall=getDetailInfo&docId=5665769"));
		docList.add(new Doc("王新法获评河北好人", str2, "红网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://hn.rednet.cn/c/2017/03/02/4226196.htm"));
		docList.add(new Doc("湖南:安慈高速公路开工预计3年建成通车", str3, "银河证券网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://www.chinastock.com.cn/yhwz_about.do?methodCall=getDetailInfo&docId=5665769"));
		docList.add(new Doc("王新法获评河北好人", str2, "红网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://hn.rednet.cn/c/2017/03/02/4226196.htm"));
		docList.add(new Doc("湖南:安慈高速公路开工预计3年建成通车", str3, "银河证券网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://www.chinastock.com.cn/yhwz_about.do?methodCall=getDetailInfo&docId=5665769"));
		docList.add(new Doc("王新法获评河北好人", str2, "红网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://hn.rednet.cn/c/2017/03/02/4226196.htm"));
		docList.add(new Doc("湖南:安慈高速公路开工预计3年建成通车", str3, "银河证券网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://www.chinastock.com.cn/yhwz_about.do?methodCall=getDetailInfo&docId=5665769"));
		docList.add(new Doc("王新法获评河北好人", str2, "红网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://hn.rednet.cn/c/2017/03/02/4226196.htm"));
		docList.add(new Doc("湖南:安慈高速公路开工预计3年建成通车", str3, "银河证券网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://www.chinastock.com.cn/yhwz_about.do?methodCall=getDetailInfo&docId=5665769"));
		docList.add(new Doc("王新法获评河北好人", str2, "红网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://hn.rednet.cn/c/2017/03/02/4226196.htm"));
		docList.add(new Doc("湖南:安慈高速公路开工预计3年建成通车", str3, "银河证券网", 
				PDFUtil.ymdhmDateForm.format(new Date(System.currentTimeMillis())),
				"新闻", "", "http://www.chinastock.com.cn/yhwz_about.do?methodCall=getDetailInfo&docId=5665769"));
		
		try {
			createPDf = PDFUtil.createPDf(docList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return Response.status(Status.OK).header("Content-Type", "application/pdf"+";charset=utf-8")
	            .header("Content-Disposition", "attachment;filename=zxc.pdf").entity(createPDf).build();
	}



}

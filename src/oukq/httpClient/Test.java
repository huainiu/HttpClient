package oukq.httpClient;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import oukq.init.StaticProperty;
import oukq.jsoup.adapter.For1024ImgUriAdapter;
import oukq.jsoup.adapter.For163ImgUriAdatper;
import oukq.jsoup.adapter.ImgUriAdapter;
import oukq.tools.FileUtils;
import oukq.tools.ShowPict;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String path = StaticProperty.PATH_FID_16+1;
		String fpath = "D://1024.txt";
		ExecutorService pool = Executors.newFixedThreadPool(10);
		String content = HttpClientStaticMethod.getHtmlByUrl(path);
		FileUtils.outToNewFile(fpath, content);
//		ImgUriAdapter a = new For1024ImgUriAdapter();
//		List<String> uris = a.getUris(content);
//		for(String uri : uris){
//			HttpClientStaticMethod.downLoadPictFromUri(uri,a.getDir());
//		}
		System.out.println("完成");
		
//		if(null == content || content.isEmpty()){
//			System.out.println("空字符串");
//		} else {
//			String res = FileUtils.outToNewFile(fpath,content);
//			if(!res.isEmpty()){
//				System.out.println("success!");
//				return;
//			}
//			
//		}
//		System.out.println("fail!");
//		String res = HttpClientStaticMethod.getPictFromUri(path);
//		if(null == res || res.isEmpty()){
//			System.out.println("无法获取图片");
//			return;
//		} else {
//			System.out.println("成功！");
//		}
//		new ShowPict(res).setVisible(true);
	}
	
	public void test(){
	}

}

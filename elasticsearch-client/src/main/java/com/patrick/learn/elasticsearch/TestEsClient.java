package com.patrick.learn.elasticsearch;

import java.net.InetAddress;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.get.MultiGetItemResponse;
import org.elasticsearch.action.get.MultiGetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

public class TestEsClient {

	public static void main(String[] args) {
        try {
            //设置集群名称
            Settings settings = Settings.builder().put("cluster.name", "elasticsearch").build();
            //创建client
            TransportClient client = new PreBuiltTransportClient(settings)
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
            
          // String index = generateIndex(client,"users","user");
            //System.out.println(index);
            //deleteIndex(client,"users","user","2");
            //搜索数据
            //GetResponse response = client.prepareGet("users", "user", "1").execute().actionGet();
            //输出结果
            //System.out.println(response.getSourceAsString());
            Upsert(client);
            batchQuery(client);
            //关闭client
            client.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
	//生成数据
	public static String generateIndex(TransportClient client ,String index,String Type) {
		  Map<String, Object> json = new HashMap<String, Object>();
		  json.put("user", "patrick3");
		  json.put("postDate", new Date());
		  json.put("message", "trying out Elastic Search");
		
		  IndexResponse response = client
		    .prepareIndex(index,Type, "3").setSource(json)
		    .execute().actionGet();
		 return response.getIndex();
	}
	//删除
	public static void deleteIndex(TransportClient client ,String index,String Type,String id) {
		DeleteResponse response = client.prepareDelete(index, Type, id)
            .get();
	}

	//批量获取
	public static void batchQuery(TransportClient client){
		MultiGetResponse multiGetResponse = client.prepareMultiGet()
		        .add("users", "user", "1")
		        .add("users", "user", "2", "3", "4")
		        .get();
		        
		        for (MultiGetItemResponse itemResponse : multiGetResponse) {
		            GetResponse response = itemResponse.getResponse();
		            if (response.isExists()) {
		                String sourceAsString = response.getSourceAsString();
		                System.out.println(sourceAsString);
		            }
		        }
	}
	//更新
	public  static void Upsert(TransportClient client) throws Exception {
        // 设置查询条件, 查找不到则添加生效
        IndexRequest indexRequest = new IndexRequest("users", "user", "1")
            .source(XContentFactory.jsonBuilder()
                .startObject()
                    .field("name", "qergef")
                    .field("gender", "malfdsae")
                .endObject());
        // 设置更新, 查找到更新下面的设置
        UpdateRequest upsert = new UpdateRequest("users", "user", "1")
            .doc(XContentFactory.jsonBuilder()
                    .startObject()
                        .field("user", "wenbronk")
                    .endObject())
            .upsert(indexRequest);
        
        client.update(upsert).get();
    }
}

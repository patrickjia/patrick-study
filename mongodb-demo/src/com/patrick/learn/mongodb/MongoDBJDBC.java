package com.patrick.learn.mongodb;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class MongoDBJDBC {
	public static void main(String[] args){  
		 MongoClient mongoClient = null;
        try {  
            //获取数据库
        	MongoDatabase mongoDatabase = getMongoDataBase(mongoClient);
          //创建集合 参数为 “集合名称”  
           
          //插入文档  
            /** 
             * 1. 创建文档 org.bson.Document 参数为key-value的格式 
             * 2. 创建文档集合List<Document> 
             * 3. 将文档集合插入数据库集合中 mongoCollection.insertMany(List<Document>) 插入单个文档可以用 mongoCollection.insertOne(Document) 
             * */ 
            
          //获取集合 参数为“集合名称”  
            MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("users");  
            System.out.println("Collection mycol selected successfully");
           
            //insertDocumentsData(mongoCollection);
             
            List<User> users = getList(mongoCollection);
            for (Iterator iterator = users.iterator(); iterator.hasNext();) {
				User user = (User) iterator.next();
				System.out.println(user.getUserId());
			}
        } catch (Exception e) {  
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );  
        }  finally{  
        	if(null!=mongoClient){
        		mongoClient.close(); 
            } 
        }
    } 
	
	
	public static  List<User> getList(MongoCollection mongoCollection){
		//检索查看结果  
        BasicDBObject query = new BasicDBObject();
        //模糊查询
        Pattern pattern = Pattern.compile("^.*test.*$", Pattern.CASE_INSENSITIVE);
        query.put("userName",pattern);
       // query.put("userId","U14985523226071");
        FindIterable<Document> findIterable = mongoCollection.find(query);  
        MongoCursor<Document> mongoCursor = findIterable.iterator(); 
        List<User> users = new ArrayList<User>();
        while(mongoCursor.hasNext()){  
        	try {
				users.add(BsonUtil.toBean(mongoCursor.next(), User.class));
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } 
        return users;
	}
	
	public static MongoDatabase getMongoDataBase(MongoClient mongoClient){
		ServerAddress serverAddress = new ServerAddress("localhost",27017);  
        List<ServerAddress> addrs = new ArrayList<ServerAddress>();  
        addrs.add(serverAddress);  
          
        //MongoCredential.createScramSha1Credential()三个参数分别为 用户名 数据库名称 密码  
        MongoCredential credential = MongoCredential.createScramSha1Credential("root", "admin", "Password01".toCharArray());  
        List<MongoCredential> credentials = new ArrayList<MongoCredential>();  
        credentials.add(credential);  
          
        //通过连接认证获取MongoDB连接  
        mongoClient = new MongoClient(addrs,credentials);  
          
        //连接到数据库  
        MongoDatabase mongoDatabase = mongoClient.getDatabase("admin");  
        System.out.println("Connect to database successfully"); 
        return mongoDatabase;
	}
	
	/**
	 * 新增集合信息
	 *
	 **/
	public static void createCollection(MongoDatabase mongoDatabase){
		mongoDatabase.createCollection("users");
		System.out.println("Collection created successfully");
	}
	
	/**
	 * 保存文档信息
	 **/
	public static void insertDocumentsData(MongoCollection mongoCollection){
		
		User user  = new User();
		user.setUserId("2017062701");
		user.setUserName("usertest");
		user.setDeptName("depttest");
		user.setPostionName("postiontest");
		
        List<Document> documents = new ArrayList<Document>();  
        Document document;
		try {
			document = BsonUtil.toBson(user);
			documents.add(document);
	        mongoCollection.insertMany(documents);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        for (int i = 0; i < 10000; i++) {
//        	Document document = new Document("userId", "U"+new Date().getTime()+(i+1)+"").  
//                    append("userName", "测试姓名"+(i+1)).  
//                    append("deptName", "测试部"+(i+1)).  
//                    append("postionName", "测试岗位"+(i+1));  
//            documents.add(document);
		//}
		
        System.out.println("Document inserted successfully"); 
	}
	
	/**
	 * 更新文档信息
	 * 
	 **/
	public static void updateDocumentsData(MongoCollection mongoCollection){
		 //更新文档   将文档中likes=100的文档修改为likes=200   
		mongoCollection.updateMany(Filters.eq("title", "MongoDB"), new Document("$set",new Document("title","测试"))); 
		
		
	}
	
}

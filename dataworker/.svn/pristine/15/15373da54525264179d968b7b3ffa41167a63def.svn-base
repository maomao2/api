package com.kwgproperty.server.dataworker.manager;

import com.kwgproperty.server.dataworker.util.HttpUtil;
import com.kwgproperty.server.dataworker.util.StringUtil;
import com.rabbitmq.client.*;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.io.IOException;

public class MqttManager {

    protected final static Logger logger = LoggerFactory.getLogger(MqttManager.class);
    private static volatile MqttManager instance = null;
    private final static String QUEUE_NAME = "dataworker";
    private ConnectionFactory factory = new ConnectionFactory();
    private ConnectionFactory factoryPrd = new ConnectionFactory();
    private Connection connection;
    private Connection connectionPrd;
    private Channel channel;
    private Channel channelPrd;

    public synchronized static MqttManager get() {
        if (instance == null) {
            synchronized (MqttManager.class) {
                if (instance == null) {
                    instance = new MqttManager();
                }
            }
        }
        return instance;
    }

    private MqttManager() {
        init();
        initDebug();
    }

    private synchronized void init() {
        factoryPrd.setHost("119.23.47.206");
        factoryPrd.setUsername("hejing");
        factoryPrd.setPassword("hjjt2017");
        try {
            connectionPrd = factoryPrd.newConnection();
            channelPrd = connectionPrd.createChannel();
            channelPrd.queueDeclare(QUEUE_NAME, false, false, false, null);
            Consumer consumer = new DefaultConsumer(channelPrd) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String message = new String(body, "UTF-8");
                    logger.error("----->>onMessage");
                    JSONObject jo = new JSONObject(message);
                    if (jo.getInt("type") == 1) {
                        logger.error("----->>onMessage type 1");
                        logger.error("----->>onMessage data:" + jo.toString());
                        boolean debug = jo.getBoolean("debug");
                        String buname = jo.getString("buname");
                        String lpname = jo.getString("lpname");
                        String fqname = jo.getString("fqname");
                        String bldname = jo.getString("bldname");
                        String room = jo.getString("room");
                        String owner_name = jo.getString("owner_name");
                        String identity_no = jo.getString("identity_no");
                        JSONObject data = new JSONObject();
                        String result = HttpUtil.get("http://127.0.0.1:8080/api/iserpcst?buname=" + buname + "&lpname=" + lpname + "&fqname=" + fqname + "&bldname=" + bldname + "&room=" + room + "&cstname=" + owner_name + "&cardid=" + identity_no);
                        logger.error("------>>" + result);
                        data.put("result", result);
                        data.put("callback", jo.getString("callback"));
                        String tmp = HttpUtil.postHeader(debug ? "http://hejing.jclang.me/api/v1/user/bind_home_my_cb" : "https://kwgyun.kwgproperty.com/api/v1/user/bind_home_my_cb", RequestBody.create(MediaType.parse("application/json"), data.toString()));
                        logger.error("----->>tmp:" + tmp);
                    } else if (jo.getInt("type") == 2) {
                        logger.error("----->>onMessage type 2");
                        logger.error("----->>onMessage data:" + jo.toString());
                        boolean debug = jo.getBoolean("debug");
                        String roomIds = jo.optString("roomids");
                        JSONObject data = new JSONObject();
                        String result = "";
                        if (roomIds != null) {
                            String[] ids = roomIds.split(",");
                            JSONArray jsonArray = new JSONArray();
                            try {
                                for (String id : ids) {
                                    String tmp = HttpUtil.get("http://127.0.0.1:8080/api/produceevidence?roomId=" + id);
                                    if (!StringUtils.isEmpty(tmp)) {
                                        JSONArray item = new JSONArray(tmp);
                                        jsonArray.put(item);
                                    }
                                }
                            } catch (Exception e) {
                                logger.error(e.getMessage());
                            }
                            result = jsonArray.toString();
                        }
                        data.put("result", result);
                        data.put("callback", jo.getString("callback"));
                        HttpUtil.postHeader(debug ? "http://hejing.jclang.me/api/v1/user/produce_status_cb" : "https://kwgyun.kwgproperty.com/api/v1/user/produce_status_cb", RequestBody.create(MediaType.parse("application/json"), data.toString()));
                    } else if (jo.optInt("type") == 3) {
                        logger.error("----->>onMessage type 3");
                        logger.error("----->>onMessage data:" + jo.toString());
                        boolean debug = jo.getBoolean("debug");
                        String phone = jo.getString("phone");
                        JSONObject data = new JSONObject();
                        String result = HttpUtil.get("http://127.0.0.1:8080/api/user?phone=" + phone);
                        logger.error("------>>" + result);
                        data.put("result", result);
                        String tmp = HttpUtil.postHeader(debug ? "http://hejing.jclang.me/api/v1/user/user_cb" : "https://kwgyun.kwgproperty.com/api/v1/user/user_cb", RequestBody.create(MediaType.parse("application/json"), data.toString()));
                        logger.error("----->>tmp:" + tmp);
                    }
                }
            };
            channelPrd.basicConsume(QUEUE_NAME, true, consumer);
        } catch (IOException e) {
            logger.error(e.getMessage());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    private synchronized void initDebug() {
        factory.setHost("112.74.99.33");
        factory.setUsername("hejing");
        factory.setPassword("hjjt2017");
        try {
            connection = factory.newConnection();
            channel = connection.createChannel();
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            Consumer consumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String message = new String(body, "UTF-8");
                    logger.error("----->>onMessage");
                    JSONObject jo = new JSONObject(message);
                    if (jo.getInt("type") == 1) {
                        logger.error("----->>onMessage type 1");
                        logger.error("----->>onMessage data:" + jo.toString());
                        boolean debug = jo.getBoolean("debug");
                        String buname = jo.getString("buname");
                        String lpname = jo.getString("lpname");
                        String fqname = jo.getString("fqname");
                        String bldname = jo.getString("bldname");
                        String room = jo.getString("room");
                        String owner_name = jo.getString("owner_name");
                        String identity_no = jo.getString("identity_no");
                        JSONObject data = new JSONObject();
                        String result = HttpUtil.get("http://127.0.0.1:8080/api/iserpcst?buname=" + buname + "&lpname=" + lpname + "&fqname=" + fqname + "&bldname=" + bldname + "&room=" + room + "&cstname=" + owner_name + "&cardid=" + identity_no);
                        logger.error("------>>" + result);
                        data.put("result", result);
                        data.put("callback", jo.getString("callback"));
                        String tmp = HttpUtil.postHeader(debug ? "http://hejing.jclang.me/api/v1/user/bind_home_my_cb" : "https://kwgyun.kwgproperty.com/api/v1/user/bind_home_my_cb", RequestBody.create(MediaType.parse("application/json"), data.toString()));
                        logger.error("----->>tmp:" + tmp);
                    } else if (jo.getInt("type") == 2) {
                        logger.error("----->>onMessage type 2");
                        logger.error("----->>onMessage data:" + jo.toString());
                        boolean debug = jo.getBoolean("debug");
                        String roomIds = jo.optString("roomids");
                        JSONObject data = new JSONObject();
                        String result = "";
                        if (roomIds != null) {
                            String[] ids = roomIds.split(",");
                            JSONArray jsonArray = new JSONArray();
                            try {
                                for (String id : ids) {
                                    String tmp = HttpUtil.get("http://127.0.0.1:8080/api/produceevidence?roomId=" + id);
                                    if (!StringUtils.isEmpty(tmp)) {
                                        JSONArray item = new JSONArray(tmp);
                                        jsonArray.put(item);
                                    }
                                }
                            } catch (Exception e) {
                                logger.error(e.getMessage());
                            }
                            result = jsonArray.toString();
                        }
                        data.put("result", result);
                        data.put("callback", jo.getString("callback"));
                        HttpUtil.postHeader(debug ? "http://hejing.jclang.me/api/v1/user/produce_status_cb" : "https://kwg.kwgproperty.com/api/v1/user/produce_status_cb", RequestBody.create(MediaType.parse("application/json"), data.toString()));
                    } else if (jo.optInt("type") == 3) {
                        logger.error("----->>onMessage type 3");
                        logger.error("----->>onMessage data:" + jo.toString());
                        boolean debug = jo.getBoolean("debug");
                        String phone = jo.getString("phone");
                        JSONObject data = new JSONObject();
                        String result = HttpUtil.get("http://127.0.0.1:8080/api/user?phone=" + phone);
                        logger.error("------>>" + result);
                        data.put("result", result);
                        String tmp = HttpUtil.postHeader(debug ? "http://hejing.jclang.me/api/v1/user/user_cb" : "https://kwgyun.kwgproperty.com/api/v1/user/user_cb", RequestBody.create(MediaType.parse("application/json"), data.toString()));
                        logger.error("----->>tmp:" + tmp);
                    }
                }
            };
            channel.basicConsume(QUEUE_NAME, true, consumer);
        } catch (IOException e) {
            logger.error(e.getMessage());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

}

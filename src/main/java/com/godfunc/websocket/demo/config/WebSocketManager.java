package com.godfunc.websocket.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.WebSocketSession;

import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class WebSocketManager {
    private static ConcurrentHashMap<String, String> manager = new ConcurrentHashMap<>();

    public static void add(String key, String sessionId) {
        log.info("新添加webSocket连接 {} ", key);
        manager.put(key, sessionId);
    }

    public static void remove(String key) {
        log.info("移除webSocket连接 {} ", key);
        manager.remove(key);
    }

    public static String get(String key) {
        log.info("获取webSocket连接 {}", key);
        return manager.get(key);
    }
}

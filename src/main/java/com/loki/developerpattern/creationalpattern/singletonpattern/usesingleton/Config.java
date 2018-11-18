package com.loki.developerpattern.creationalpattern.singletonpattern.usesingleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xujs
 */
public class Config {

    private static Config singleton = new Config();

    private Map<String, String> info = new HashMap<>();

    public static Config getInstance() {
        return singleton;
    }

    public Config() {}

    public void init() {
        info.put("test", "test singleton");
    }

    public Map<String, String> getInfo() {
        return info;
    }

}

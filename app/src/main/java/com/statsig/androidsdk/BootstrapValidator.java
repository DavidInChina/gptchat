package com.statsig.androidsdk;

import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0007H\u0002J\"\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lcom/statsig/androidsdk/BootstrapValidator;", "", "()V", "getUserIdentifier", "", "", "customIDs", "", "isValid", "", "initializeValues", "user", "Lcom/statsig/androidsdk/StatsigUser;", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class BootstrapValidator {
    public static final BootstrapValidator INSTANCE = new BootstrapValidator();

    private BootstrapValidator() {
    }

    private final Map<String, String> getUserIdentifier(Map<?, ?> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map == null) {
            return linkedHashMap;
        }
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (!AbstractC3557B.K(key, "stableID") && (key instanceof String)) {
                Object value = entry.getValue();
                if (value == null || (value instanceof String)) {
                    linkedHashMap.put(key, value);
                } else if (value instanceof Map) {
                    linkedHashMap.putAll(getUserIdentifier((Map) value));
                }
            }
        }
        return linkedHashMap;
    }

    public final boolean isValid(Map<String, ? extends Object> map, StatsigUser statsigUser) {
        Map<?, ?> map2;
        AbstractC3557B.c0("initializeValues", map);
        AbstractC3557B.c0("user", statsigUser);
        try {
            Object obj = map.get("evaluated_keys");
            if (obj instanceof Map) {
                map2 = (Map) obj;
            } else {
                map2 = null;
            }
            if (map2 == null) {
                return true;
            }
            Map<String, String> userIdentifier = getUserIdentifier(statsigUser.getCustomIDs());
            userIdentifier.put("userID", statsigUser.getUserID());
            return AbstractC3557B.K(userIdentifier, getUserIdentifier(map2));
        } catch (Exception unused) {
            return true;
        }
    }
}

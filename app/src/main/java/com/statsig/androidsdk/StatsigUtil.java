package com.statsig.androidsdk;

import Ad.l;
import I8.C;
import I8.n;
import I8.o;
import android.content.SharedPreferences;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ1\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00022\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0011\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0017H\u0000\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/statsig/androidsdk/StatsigUtil;", "", "", "", "user", "normalizeUser", "(Ljava/util/Map;)Ljava/util/Map;", "Landroid/content/SharedPreferences;", "sharedPrefs", SubscriberAttributeKt.JSON_NAME_KEY, "syncGetFromSharedPrefs$build_release", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;", "syncGetFromSharedPrefs", "value", "Ljf/y;", "saveStringToSharedPrefs$build_release", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Lnf/e;)Ljava/lang/Object;", "saveStringToSharedPrefs", "removeFromSharedPrefs$build_release", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lnf/e;)Ljava/lang/Object;", "removeFromSharedPrefs", "getFromSharedPrefs$build_release", "getFromSharedPrefs", "LI8/n;", "getGson$build_release", "()LI8/n;", "getGson", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "<init>", "()V", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class StatsigUtil {
    public static final StatsigUtil INSTANCE = new StatsigUtil();
    private static final CoroutineDispatcherProvider dispatcherProvider = new CoroutineDispatcherProvider(null, null, null, 7, null);

    private StatsigUtil() {
    }

    public final Object getFromSharedPrefs$build_release(SharedPreferences sharedPreferences, String str, AbstractC4825e abstractC4825e) {
        if (sharedPreferences == null) {
            return null;
        }
        return l.n1(abstractC4825e, dispatcherProvider.getIo(), new StatsigUtil$getFromSharedPrefs$2(sharedPreferences, str, null));
    }

    public final n getGson$build_release() {
        o oVar = new o();
        oVar.f8128l = C.f8097h0;
        return oVar.a();
    }

    public final Map<String, Object> normalizeUser(Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                Object[] objArr = (Object[]) value;
                int length = objArr.length;
                ArrayList arrayList = new ArrayList();
                for (Object obj : objArr) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                if (length == arrayList.size()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else {
                if (!(value instanceof String) && !(value instanceof Boolean) && !(value instanceof Double)) {
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final Object removeFromSharedPrefs$build_release(SharedPreferences sharedPreferences, String str, AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        if (sharedPreferences == null) {
            return yVar;
        }
        Object n12 = l.n1(abstractC4825e, dispatcherProvider.getIo(), new StatsigUtil$removeFromSharedPrefs$2(sharedPreferences, str, null));
        if (n12 == EnumC5000a.f41328Y) {
            return n12;
        }
        return yVar;
    }

    public final Object saveStringToSharedPrefs$build_release(SharedPreferences sharedPreferences, String str, String str2, AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        if (sharedPreferences == null) {
            return yVar;
        }
        Object n12 = l.n1(abstractC4825e, dispatcherProvider.getIo(), new StatsigUtil$saveStringToSharedPrefs$2(sharedPreferences, str, str2, null));
        if (n12 == EnumC5000a.f41328Y) {
            return n12;
        }
        return yVar;
    }

    public final String syncGetFromSharedPrefs$build_release(SharedPreferences sharedPreferences, String str) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        if (sharedPreferences == null) {
            return null;
        }
        try {
            return sharedPreferences.getString(str, null);
        } catch (ClassCastException unused) {
            return null;
        }
    }
}

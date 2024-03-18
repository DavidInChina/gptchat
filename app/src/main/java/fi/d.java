package fi;

import Wh.w;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kf.AbstractC4268D;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArraySet f30907a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public static final Map f30908b;

    static {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = w.class.getPackage();
        if (r22 != null) {
            str = r22.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        linkedHashMap.put(w.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(di.g.class.getName(), "okhttp.Http2");
        linkedHashMap.put(Zh.f.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f30908b = AbstractC4268D.l1(linkedHashMap);
    }
}

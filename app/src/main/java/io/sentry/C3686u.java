package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: io.sentry.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3686u {

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f34763f;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f34764a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f34765b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public C3607a f34766c = null;

    /* renamed from: d  reason: collision with root package name */
    public C3607a f34767d = null;

    /* renamed from: e  reason: collision with root package name */
    public C3607a f34768e = null;

    static {
        HashMap hashMap = new HashMap();
        f34763f = hashMap;
        hashMap.put("boolean", Boolean.class);
        hashMap.put("char", Character.class);
        hashMap.put("byte", Byte.class);
        hashMap.put("short", Short.class);
        hashMap.put("int", Integer.class);
        hashMap.put("long", Long.class);
        hashMap.put("float", Float.class);
        hashMap.put("double", Double.class);
    }

    public final synchronized void a() {
        try {
            Iterator it = this.f34764a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() != null && ((String) entry.getKey()).startsWith("sentry:")) {
                }
                it.remove();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Object b(Class cls, String str) {
        Object obj = this.f34764a.get(str);
        if (cls.isInstance(obj)) {
            return obj;
        }
        Class cls2 = (Class) f34763f.get(cls.getCanonicalName());
        if (obj != null && cls.isPrimitive() && cls2 != null) {
            if (cls2.isInstance(obj)) {
                return obj;
            }
        }
        return null;
    }

    public final synchronized void c(String str, Object obj) {
        this.f34764a.put(str, obj);
    }
}

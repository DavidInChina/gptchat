package c5;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap f26277l = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f26278a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f26279b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f26280c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f26281d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f26282e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f26283f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f26284g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f26285h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f26286i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f26287j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f26288k = new ArrayList();

    public static synchronized i a(int i10) {
        synchronized (i.class) {
            if (i10 == 0) {
                return null;
            }
            try {
                HashMap hashMap = f26277l;
                if (!hashMap.containsKey(Integer.valueOf(i10))) {
                    hashMap.put(Integer.valueOf(i10), new i());
                }
                return (i) hashMap.get(Integer.valueOf(i10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void b(int i10) {
        synchronized (i.class) {
            if (i10 != 0) {
                HashMap hashMap = f26277l;
                if (hashMap.containsKey(Integer.valueOf(i10))) {
                    hashMap.remove(Integer.valueOf(i10));
                }
            }
        }
    }
}

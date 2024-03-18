package E3;

import K0.e;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.openai.chatgpt.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f4425d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f4426e = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Context f4429c;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f4428b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4427a = new HashMap();

    public a(Context context) {
        this.f4429c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f4425d == null) {
            synchronized (f4426e) {
                try {
                    if (f4425d == null) {
                        f4425d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f4425d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f4429c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f4428b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new e(2, e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (Gi.e.D()) {
            try {
                Trace.beginSection(Gi.e.V(cls.getSimpleName()));
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f4427a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> a5 = bVar.a();
                if (!a5.isEmpty()) {
                    for (Class cls2 : a5) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f4429c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }
}

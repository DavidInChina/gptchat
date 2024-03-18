package hh;

import android.os.SystemClock;
import id.AbstractC3557B;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import leakcanary.KeyedWeakReference;
import wf.AbstractC6216a;

/* renamed from: hh.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3443k {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f32362a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f32363b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue f32364c = new ReferenceQueue();

    /* renamed from: d  reason: collision with root package name */
    public final C3435c f32365d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f32366e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC6216a f32367f;

    public C3443k() {
        C3435c c3435c = C3435c.f32349a;
        ExecutorC3436d executorC3436d = ExecutorC3436d.f32350Y;
        C3437e c3437e = C3437e.f32351Z;
        this.f32365d = c3435c;
        this.f32366e = executorC3436d;
        this.f32367f = c3437e;
    }

    public final synchronized void a(String str, Object obj) {
        KeyedWeakReference keyedWeakReference;
        String str2;
        String str3;
        try {
            AbstractC3557B.d0("watchedObject", obj);
            AbstractC3557B.d0("description", str);
            if (!((Boolean) this.f32367f.mo122invoke()).booleanValue()) {
                return;
            }
            do {
                keyedWeakReference = (KeyedWeakReference) this.f32364c.poll();
                if (keyedWeakReference != null) {
                    this.f32363b.remove(keyedWeakReference.getKey());
                    continue;
                }
            } while (keyedWeakReference != null);
            String uuid = UUID.randomUUID().toString();
            AbstractC3557B.Y("UUID.randomUUID()\n      .toString()", uuid);
            this.f32365d.getClass();
            KeyedWeakReference keyedWeakReference2 = new KeyedWeakReference(obj, uuid, str, SystemClock.uptimeMillis(), this.f32364c);
            Ki.a aVar = R4.b.f15040a;
            if (aVar != null) {
                StringBuilder sb2 = new StringBuilder("Watching ");
                if (obj instanceof Class) {
                    str2 = obj.toString();
                } else {
                    str2 = "instance of ".concat(obj.getClass().getName());
                }
                sb2.append(str2);
                if (str.length() > 0) {
                    str3 = " (" + str + ')';
                } else {
                    str3 = "";
                }
                sb2.append(str3);
                sb2.append(" with key ");
                sb2.append(uuid);
                ((C3435c) aVar).a(sb2.toString());
            }
            this.f32363b.put(uuid, keyedWeakReference2);
            this.f32366e.execute(new RunnableC3442j(this, uuid));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

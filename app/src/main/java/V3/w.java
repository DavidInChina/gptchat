package V3;

import M3.C0934c;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: e  reason: collision with root package name */
    public static final String f18379e = L3.s.f("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    public final C0934c f18380a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f18381b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f18382c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Object f18383d = new Object();

    public w(C0934c c0934c) {
        this.f18380a = c0934c;
    }

    public final void a(U3.j jVar) {
        synchronized (this.f18383d) {
            try {
                if (((v) this.f18381b.remove(jVar)) != null) {
                    L3.s d10 = L3.s.d();
                    String str = f18379e;
                    d10.a(str, "Stopping timer for " + jVar);
                    this.f18382c.remove(jVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

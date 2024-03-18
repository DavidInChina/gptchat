package u4;

import android.os.SystemClock;
import i4.n;
import q1.AbstractC5260f;
import r4.C5364a;

/* loaded from: classes2.dex */
public final class j implements h {

    /* renamed from: Y  reason: collision with root package name */
    public static final j f46403Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static n f46404Z;

    @Override // u4.h
    public boolean a(r4.h hVar) {
        AbstractC5260f abstractC5260f = hVar.f44441a;
        if (!(abstractC5260f instanceof C5364a) || ((C5364a) abstractC5260f).f44429h > 100) {
            AbstractC5260f abstractC5260f2 = hVar.f44442b;
            if (!(abstractC5260f2 instanceof C5364a) || ((C5364a) abstractC5260f2).f44429h > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // u4.h
    public boolean d() {
        boolean z10;
        synchronized (g.f46393a) {
            try {
                int i10 = g.f46395c;
                g.f46395c = i10 + 1;
                if (i10 >= 30 || SystemClock.uptimeMillis() > g.f46396d + 30000) {
                    boolean z11 = false;
                    g.f46395c = 0;
                    g.f46396d = SystemClock.uptimeMillis();
                    String[] list = g.f46394b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    if (list.length < 800) {
                        z11 = true;
                    }
                    g.f46397e = z11;
                }
                z10 = g.f46397e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}

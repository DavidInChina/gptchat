package Ii;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import id.AbstractC3557B;
import java.util.Iterator;
import wf.AbstractC6216a;

/* renamed from: Ii.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0800e extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0800e f8642Z = new C0800e(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0800e f8643h0 = new C0800e(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C0800e f8644i0 = new C0800e(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8645Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0800e(int i10) {
        super(0);
        this.f8645Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8645Y) {
            case 0:
                mo122invoke();
                return yVar;
            case 1:
                return new Handler(Looper.getMainLooper());
            default:
                mo122invoke();
                return yVar;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo122invoke() {
        switch (this.f8645Y) {
            case 0:
                Mg.a aVar = Mg.b.f12127Z;
                long y02 = Df.H.y0(System.nanoTime(), Mg.d.f12132Z);
                Iterator it = AbstractC0801f.f8646a.iterator();
                while (it.hasNext()) {
                    ((wf.k) it.next()).invoke(new Mg.b(y02));
                }
                AbstractC0801f.f8646a.clear();
                return;
            default:
                Hi.c cVar = v.f8691c;
                if (cVar != null) {
                    long uptimeMillis = SystemClock.uptimeMillis() - cVar.f7833b;
                    boolean z10 = v.f8689a;
                    Hi.c cVar2 = v.f8691c;
                    if (cVar2 != null) {
                        v.f8691c = Hi.c.a(cVar2, null, null, null, Long.valueOf(uptimeMillis), null, null, null, null, null, null, null, null, null, null, -524289);
                        return;
                    } else {
                        AbstractC3557B.C2("appStartData");
                        throw null;
                    }
                }
                AbstractC3557B.C2("appStartData");
                throw null;
        }
    }
}

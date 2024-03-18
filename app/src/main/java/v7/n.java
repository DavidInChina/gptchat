package v7;

import io.sentry.C3636c1;
import java.util.Map;
import s8.C5592i;
import u8.C5852b;

/* loaded from: classes2.dex */
public final class n implements N7.b {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f47322Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N7.f f47323Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f47324h0;

    public /* synthetic */ n(Object obj, N7.f fVar, int i10) {
        this.f47322Y = i10;
        this.f47324h0 = obj;
        this.f47323Z = fVar;
    }

    private final void a() {
        m8.o oVar = (m8.o) this.f47324h0;
        N7.f fVar = this.f47323Z;
        synchronized (oVar.f38991f) {
            oVar.f38990e.remove(fVar);
        }
    }

    private final void c() {
        C5592i c5592i = (C5592i) this.f47324h0;
        N7.f fVar = this.f47323Z;
        synchronized (c5592i.f45456f) {
            c5592i.f45455e.remove(fVar);
        }
    }

    @Override // N7.b
    public final void b(N7.m mVar) {
        switch (this.f47322Y) {
            case 0:
                ((Map) ((C3636c1) this.f47324h0).f34286h0).remove(this.f47323Z);
                return;
            case 1:
                a();
                return;
            case 2:
                c();
                return;
            default:
                C5852b c5852b = (C5852b) this.f47324h0;
                N7.f fVar = this.f47323Z;
                synchronized (c5852b.f46478f) {
                    c5852b.f46477e.remove(fVar);
                }
                return;
        }
    }
}

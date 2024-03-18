package m8;

import K4.C0813a;
import android.os.RemoteException;
import android.util.Log;
import io.sentry.android.core.AbstractC3612c;
import l8.BinderC4349g;
import l8.C4350h;

/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f38977Z = 1;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ N7.f f38978h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f38979i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f38980j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C4350h c4350h, N7.f fVar, String str, N7.f fVar2) {
        super(fVar);
        this.f38980j0 = c4350h;
        this.f38979i0 = str;
        this.f38978h0 = fVar2;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [android.os.IInterface, m8.g] */
    @Override // m8.j
    public final void a() {
        switch (this.f38977Z) {
            case 0:
                synchronized (((o) this.f38980j0).f38991f) {
                    try {
                        o oVar = (o) this.f38980j0;
                        N7.f fVar = this.f38978h0;
                        oVar.f38990e.add(fVar);
                        fVar.f12723a.a(new v7.n(oVar, fVar, 1));
                        if (((o) this.f38980j0).f38996k.getAndIncrement() > 0) {
                            ((o) this.f38980j0).f38987b.e("Already connected to the service.", new Object[0]);
                        }
                        o.b((o) this.f38980j0, (j) this.f38979i0);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                N7.f fVar2 = this.f38978h0;
                Object obj = this.f38980j0;
                Object obj2 = this.f38979i0;
                try {
                    C4350h c4350h = (C4350h) obj;
                    ((C4350h) obj).f37879a.f38998m.b(c4350h.f37880b, C4350h.a(c4350h, (String) obj2), new BinderC4349g((C4350h) obj, fVar2, (String) obj2));
                    return;
                } catch (RemoteException e10) {
                    C0813a c0813a = C4350h.f37877e;
                    Object[] objArr = {(String) obj2};
                    c0813a.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        AbstractC3612c.d("PlayCore", C0813a.f(c0813a.f9398Z, "requestUpdateInfo(%s)", objArr), e10);
                    }
                    fVar2.a(new RuntimeException(e10));
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, N7.f fVar, N7.f fVar2, l lVar) {
        super(fVar);
        this.f38980j0 = oVar;
        this.f38978h0 = fVar2;
        this.f38979i0 = lVar;
    }
}

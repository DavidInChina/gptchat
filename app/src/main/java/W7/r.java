package w7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;
import k6.AbstractC4194d;
import u7.C5849e;

/* loaded from: classes2.dex */
public final class r implements u7.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Df.H f48192a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ N7.f f48193b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC6137i f48194c;

    public r(BasePendingResult basePendingResult, N7.f fVar, f8.e eVar) {
        this.f48192a = basePendingResult;
        this.f48193b = fVar;
        this.f48194c = eVar;
    }

    @Override // u7.k
    public final void a(Status status) {
        boolean z10;
        C5849e c5849e;
        if (status.f26807Y <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        N7.f fVar = this.f48193b;
        if (z10) {
            u7.m o10 = this.f48192a.o(TimeUnit.MILLISECONDS);
            switch (((f8.e) this.f48194c).f29664Y) {
                case 0:
                    AbstractC4194d.B(o10);
                    throw null;
                default:
                    fVar.f12723a.g(null);
                    return;
            }
        }
        if (status.f26809h0 != null) {
            c5849e = new C5849e(status);
        } else {
            c5849e = new C5849e(status);
        }
        fVar.f12723a.f(c5849e);
    }
}

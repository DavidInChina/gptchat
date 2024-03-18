package B;

import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: B.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1293Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1294Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B0.A f1295h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0137k f1296i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0116d(B0.A a5, AbstractC0137k abstractC0137k, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1295h0 = a5;
        this.f1296i0 = abstractC0137k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0116d c0116d = new C0116d(this.f1295h0, this.f1296i0, abstractC4825e);
        c0116d.f1294Z = obj;
        return c0116d;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0116d) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CancellationException e10;
        Ng.F f6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1293Y;
        if (i10 != 0) {
            if (i10 == 1) {
                f6 = (Ng.F) this.f1294Z;
                try {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } catch (CancellationException e11) {
                    e10 = e11;
                    if (!Ad.l.F0(f6)) {
                        throw e10;
                    }
                    return jf.y.f36177a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ng.F f10 = (Ng.F) this.f1294Z;
            try {
                B0.A a5 = this.f1295h0;
                C0113c c0113c = new C0113c(this.f1296i0, null, f10);
                this.f1294Z = f10;
                this.f1293Y = 1;
                if (((B0.P) a5).A0(c0113c, this) == enumC5000a) {
                    return enumC5000a;
                }
            } catch (CancellationException e12) {
                f6 = f10;
                e10 = e12;
                if (!Ad.l.F0(f6)) {
                }
                return jf.y.f36177a;
            }
        }
        return jf.y.f36177a;
    }
}

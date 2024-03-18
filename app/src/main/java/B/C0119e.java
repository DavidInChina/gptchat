package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: B.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119e extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1302Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1303Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0137k f1304h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119e(AbstractC0137k abstractC0137k, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1304h0 = abstractC0137k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0119e c0119e = new C0119e(this.f1304h0, abstractC4825e);
        c0119e.f1303Z = obj;
        return c0119e;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0119e) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1302Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            B0.A a5 = (B0.A) this.f1303Z;
            AbstractC0137k abstractC0137k = this.f1304h0;
            if (!abstractC0137k.f1382v0) {
                return yVar;
            }
            C0116d c0116d = new C0116d(a5, abstractC0137k, null);
            this.f1302Y = 1;
            if (Ad.l.e0(c0116d, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}

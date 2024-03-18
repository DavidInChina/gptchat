package G;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6659E;
import z.C6694e;

/* renamed from: G.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0558m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f5535Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r f5536Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6659E f5537h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0558m(r rVar, AbstractC6659E abstractC6659E, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5536Z = rVar;
        this.f5537h0 = abstractC6659E;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0558m(this.f5536Z, this.f5537h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0558m) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f5535Y;
        r rVar = this.f5536Z;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        int i11 = r.f5550n;
                        rVar.a(false);
                        return jf.y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                com.google.android.gms.internal.play_billing.N.B0(obj);
                C6694e c6694e = rVar.f5558h;
                Float f6 = new Float(0.0f);
                this.f5535Y = 1;
                if (c6694e.f(f6, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            C6694e c6694e2 = rVar.f5558h;
            Float f10 = new Float(1.0f);
            AbstractC6659E abstractC6659E = this.f5537h0;
            C0557l c0557l = new C0557l(rVar, 0);
            this.f5535Y = 2;
            if (C6694e.c(c6694e2, f10, abstractC6659E, c0557l, this, 4) == enumC5000a) {
                return enumC5000a;
            }
            int i112 = r.f5550n;
            rVar.a(false);
            return jf.y.f36177a;
        } catch (Throwable th2) {
            int i12 = r.f5550n;
            rVar.a(false);
            throw th2;
        }
    }
}

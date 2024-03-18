package Z1;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Z1.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1753b0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public C1754c f22942Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f22943Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1757d0 f22944h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1753b0(C1757d0 c1757d0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22944h0 = c1757d0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1753b0(this.f22944h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1753b0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C1754c c1754c;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22943Z;
        C1757d0 c1757d0 = this.f22944h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1754c = this.f22942Y;
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            int i11 = c1757d0.f22952b;
            c1754c = new C1754c(i11);
            D5.a aVar = g2.s.f31134a;
            String f02 = r9.y.f0(i11);
            this.f22942Y = c1754c;
            this.f22943Z = 1;
            obj = aVar.d(c1757d0.f22951a, f02, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            this.f22942Y = null;
            this.f22943Z = 2;
            if (C1757d0.a(c1757d0, c1754c, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}

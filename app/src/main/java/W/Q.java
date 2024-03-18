package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class Q extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19561Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f19562Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ float f19563h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f19564i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(Object obj, AbstractC4825e abstractC4825e, int i10) {
        super(3, abstractC4825e);
        this.f19561Y = i10;
        this.f19564i0 = obj;
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f19561Y) {
            case 0:
                Ng.F f6 = (Ng.F) obj;
                return p(((Number) obj2).floatValue(), (AbstractC4825e) obj3);
            case 1:
                Ng.F f10 = (Ng.F) obj;
                return p(((Number) obj2).floatValue(), (AbstractC4825e) obj3);
            default:
                Ng.F f11 = (Ng.F) obj;
                return p(((Number) obj2).floatValue(), (AbstractC4825e) obj3);
        }
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f19561Y;
        Object obj2 = this.f19564i0;
        switch (i10) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                int i11 = this.f19562Z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                float f6 = this.f19563h0;
                C1568j1 c1568j1 = (C1568j1) ((n4) obj2);
                int i12 = c1568j1.f20168a;
                this.f19562Z = 1;
                if (AbstractC1522a0.g(c1568j1.f20169b, f6, c1568j1.f20173f, c1568j1.f20172e, this) == enumC5000a) {
                    return enumC5000a;
                }
                return yVar;
            case 1:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                int i13 = this.f19562Z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                float f10 = this.f19563h0;
                C1568j1 c1568j12 = (C1568j1) ((n4) obj2);
                int i14 = c1568j12.f20168a;
                this.f19562Z = 1;
                if (AbstractC1522a0.g(c1568j12.f20169b, f10, c1568j12.f20173f, c1568j12.f20172e, this) == enumC5000a2) {
                    return enumC5000a2;
                }
                return yVar;
            default:
                EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                if (this.f19562Z == 0) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    ((wf.k) obj2).invoke(new Float(this.f19563h0));
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object p(float f6, AbstractC4825e abstractC4825e) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f19561Y;
        Object obj = this.f19564i0;
        switch (i10) {
            case 0:
                Q q10 = new Q((n4) obj, abstractC4825e, 0);
                q10.f19563h0 = f6;
                return q10.invokeSuspend(yVar);
            case 1:
                Q q11 = new Q((n4) obj, abstractC4825e, 1);
                q11.f19563h0 = f6;
                return q11.invokeSuspend(yVar);
            default:
                Q q12 = new Q((wf.k) obj, abstractC4825e, 2);
                q12.f19563h0 = f6;
                return q12.invokeSuspend(yVar);
        }
    }
}

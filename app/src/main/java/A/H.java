package A;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5251c;

/* loaded from: classes.dex */
public final class H extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f71Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f72Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ B.Y0 f73h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ long f74i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0016f f75j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(AbstractC0016f abstractC0016f, AbstractC4825e abstractC4825e, int i10) {
        super(3, abstractC4825e);
        this.f71Y = i10;
        this.f75j0 = abstractC0016f;
    }

    @Override // wf.o
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f71Y) {
            case 0:
                return p((B.Y0) obj, ((C5251c) obj2).f43623a, (AbstractC4825e) obj3);
            default:
                return p((B.Y0) obj, ((C5251c) obj2).f43623a, (AbstractC4825e) obj3);
        }
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f71Y;
        AbstractC0016f abstractC0016f = this.f75j0;
        switch (i10) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                int i11 = this.f72Z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                B.Y0 y02 = this.f73h0;
                long j6 = this.f74i0;
                I i12 = (I) abstractC0016f;
                if (i12.f193u0) {
                    this.f72Z = 1;
                    if (i12.B0(y02, j6, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    return yVar;
                }
                return yVar;
            default:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                int i13 = this.f72Z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                B.Y0 y03 = this.f73h0;
                long j10 = this.f74i0;
                P p10 = (P) abstractC0016f;
                if (p10.f193u0) {
                    this.f72Z = 1;
                    if (p10.B0(y03, j10, this) == enumC5000a2) {
                        return enumC5000a2;
                    }
                    return yVar;
                }
                return yVar;
        }
    }

    public final Object p(B.Y0 y02, long j6, AbstractC4825e abstractC4825e) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f71Y;
        AbstractC0016f abstractC0016f = this.f75j0;
        switch (i10) {
            case 0:
                H h10 = new H((I) abstractC0016f, abstractC4825e, 0);
                h10.f73h0 = y02;
                h10.f74i0 = j6;
                return h10.invokeSuspend(yVar);
            default:
                H h11 = new H((P) abstractC0016f, abstractC4825e, 1);
                h11.f73h0 = y02;
                h11.f74i0 = j6;
                return h11.invokeSuspend(yVar);
        }
    }
}

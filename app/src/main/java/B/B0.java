package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5251c;

/* loaded from: classes.dex */
public final class B0 extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1033Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B0(int i10, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f1033Y = i10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f1033Y;
        switch (i10) {
            case 0:
                Ng.F f6 = (Ng.F) obj;
                long j6 = ((C5251c) obj2).f43623a;
                AbstractC4825e abstractC4825e = (AbstractC4825e) obj3;
                switch (i10) {
                    case 0:
                        return new B0(0, abstractC4825e).invokeSuspend(yVar);
                    default:
                        return new B0(2, abstractC4825e).invokeSuspend(yVar);
                }
            case 1:
                Ng.F f10 = (Ng.F) obj;
                ((Number) obj2).floatValue();
                return new B0(1, (AbstractC4825e) obj3).invokeSuspend(yVar);
            case 2:
                Ng.F f11 = (Ng.F) obj;
                long j10 = ((C5251c) obj2).f43623a;
                AbstractC4825e abstractC4825e2 = (AbstractC4825e) obj3;
                switch (i10) {
                    case 0:
                        return new B0(0, abstractC4825e2).invokeSuspend(yVar);
                    default:
                        return new B0(2, abstractC4825e2).invokeSuspend(yVar);
                }
            case 3:
                Y0 y02 = (Y0) obj;
                long j11 = ((C5251c) obj2).f43623a;
                AbstractC4825e abstractC4825e3 = (AbstractC4825e) obj3;
                switch (i10) {
                    case 3:
                        return new B0(3, abstractC4825e3).invokeSuspend(yVar);
                    default:
                        return new B0(5, abstractC4825e3).invokeSuspend(yVar);
                }
            case 4:
                ((Number) obj).intValue();
                Throwable th2 = (Throwable) obj2;
                return new B0(4, (AbstractC4825e) obj3).invokeSuspend(yVar);
            default:
                Y0 y03 = (Y0) obj;
                long j12 = ((C5251c) obj2).f43623a;
                AbstractC4825e abstractC4825e4 = (AbstractC4825e) obj3;
                switch (i10) {
                    case 3:
                        return new B0(3, abstractC4825e4).invokeSuspend(yVar);
                    default:
                        return new B0(5, abstractC4825e4).invokeSuspend(yVar);
                }
        }
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f1033Y) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                return yVar;
            case 1:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                return yVar;
            case 2:
                EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                return yVar;
            case 3:
                EnumC5000a enumC5000a4 = EnumC5000a.f41328Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                return yVar;
            case 4:
                EnumC5000a enumC5000a5 = EnumC5000a.f41328Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                return Boolean.FALSE;
            default:
                EnumC5000a enumC5000a6 = EnumC5000a.f41328Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                return yVar;
        }
    }
}

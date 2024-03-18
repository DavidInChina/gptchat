package G;

import A.B0;
import B.AbstractC0168u1;
import F.C0530d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class Z extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f5475Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ V f5476Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f5477h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(V v10, int i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5476Z = v10;
        this.f5477h0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new Z(this.f5476Z, this.f5477h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r7 == r0) goto L17;
     */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f5475Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f5475Y = 1;
            C0530d c0530d = (C0530d) this.f5476Z;
            int i11 = c0530d.f4918a;
            int i12 = this.f5477h0;
            AbstractC0168u1 abstractC0168u1 = c0530d.f4920c;
            switch (i11) {
                case 0:
                    obj2 = F.J.j((F.J) abstractC0168u1, i12, this);
                    break;
                default:
                    H.F f6 = (H.F) abstractC0168u1;
                    f6.getClass();
                    obj2 = f6.c(B0.f14Y, new H.E(f6, 0.0f, i12, null), this);
                    if (obj2 != enumC5000a) {
                        obj2 = yVar;
                        break;
                    }
                    break;
            }
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}

package G;

import B.AbstractC0168u1;
import F.C0530d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6696f;

/* loaded from: classes2.dex */
public final class Y extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f5472Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ V f5473Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f5474h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(V v10, float f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5473Z = v10;
        this.f5474h0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new Y(this.f5473Z, this.f5474h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r5 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r5 == r0) goto L15;
     */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f5472Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f5472Y = 1;
            C0530d c0530d = (C0530d) this.f5473Z;
            int i11 = c0530d.f4918a;
            float f6 = this.f5474h0;
            AbstractC0168u1 abstractC0168u1 = c0530d.f4920c;
            switch (i11) {
                case 0:
                    obj2 = Ng.H.k((F.J) abstractC0168u1, f6, AbstractC6696f.u(0.0f, 0.0f, null, 7), this);
                    break;
                default:
                    obj2 = Ng.H.k((H.F) abstractC0168u1, f6, AbstractC6696f.u(0.0f, 0.0f, null, 7), this);
                    break;
            }
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}

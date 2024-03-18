package na;

import F.C0531e;
import G.AbstractC0555j;
import G.C0554i;
import Z.AbstractC1710f0;
import ca.AbstractC2318j;
import id.AbstractC3557B;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: na.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4742c0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39935Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ D1 f39936Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ F.J f39937h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f39938i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4742c0(D1 d12, F.J j6, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39936Z = d12;
        this.f39937h0 = j6;
        this.f39938i0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4742c0(this.f39936Z, this.f39937h0, this.f39938i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4742c0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
        if ((r15.f4840o + r15.f4841p) == ((F.z) r5.h()).f5014i) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
        if (r15 == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e7, code lost:
        if (r15 == r0) goto L44;
     */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39935Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            D1 d12 = this.f39936Z;
            if (d12.f39771j.isEmpty()) {
                return yVar;
            }
            List list = d12.f39771j;
            int size = list.size();
            EnumC4797v0 enumC4797v0 = d12.f39784w;
            L1 l12 = new L1(size, enumC4797v0);
            AbstractC1710f0 abstractC1710f0 = this.f39938i0;
            if (((L1) abstractC1710f0.getValue()) == null) {
                abstractC1710f0.setValue(l12);
            }
            boolean K10 = AbstractC3557B.K(l12, (L1) abstractC1710f0.getValue());
            int ordinal = enumC4797v0.ordinal();
            F.J j6 = this.f39937h0;
            Integer num = null;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new RuntimeException();
                    }
                } else {
                    int size2 = list.size() - 1;
                    F.n m02 = K8.d.m0(j6, ((AbstractC2318j) list.get(size2)).a());
                    if (m02 == null || ((F.A) m02).f4840o != 0) {
                        num = new Integer(size2);
                    }
                }
            } else {
                F.n m03 = K8.d.m0(j6, ((AbstractC2318j) list.get(list.size() - 1)).a());
                if (m03 != null) {
                    F.A a5 = (F.A) m03;
                }
                num = new Integer(list.size());
            }
            if (num != null) {
                int intValue = num.intValue();
                boolean z10 = !K10;
                this.f39935Y = 1;
                if (z10) {
                    i0.r rVar = F.J.f4870A;
                    Z0.b bVar = j6.f4878h;
                    float f6 = AbstractC0555j.f5530a;
                    C0531e c0531e = j6.f4874d;
                    obj2 = c0531e.h(new C0554i(intValue, 0, 100, c0531e, bVar, null), this);
                    if (obj2 != enumC5000a) {
                        obj2 = yVar;
                    }
                    if (obj2 != enumC5000a) {
                        obj2 = yVar;
                    }
                } else {
                    if (!z10) {
                        obj2 = F.J.j(j6, intValue, this);
                    }
                    obj2 = yVar;
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                }
            }
        }
        return yVar;
    }
}

package r9;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44605Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Yg.r f44606Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f44607h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Yg.r rVar, wf.k kVar, int i10) {
        super(1);
        this.f44605Y = i10;
        this.f44606Z = rVar;
        this.f44607h0 = kVar;
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f44605Y) {
            case 0:
                invoke((String) obj);
                return yVar;
            case 1:
                invoke((String) obj);
                return yVar;
            default:
                invoke((String) obj);
                return yVar;
        }
    }

    public final void invoke(String str) {
        int i10 = this.f44605Y;
        wf.k kVar = this.f44607h0;
        Yg.r rVar = this.f44606Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("item", str);
                Integer W12 = Lg.m.W1(str);
                int intValue = W12 != null ? W12.intValue() : rVar.f22420Y.getDayOfMonth();
                if (intValue == rVar.f22420Y.getDayOfMonth()) {
                    return;
                }
                kVar.invoke(x.g(rVar, 0, 0, intValue, 3));
                return;
            case 1:
                AbstractC3557B.c0("item", str);
                int indexOf = x.f44620c.indexOf(str) + 1;
                if (indexOf == rVar.f22420Y.getMonthValue()) {
                    return;
                }
                kVar.invoke(x.g(rVar, 0, indexOf, 0, 5));
                return;
            default:
                AbstractC3557B.c0("item", str);
                Integer W13 = Lg.m.W1(str);
                int intValue2 = W13 != null ? W13.intValue() : rVar.f22420Y.getYear();
                if (intValue2 == rVar.f22420Y.getYear()) {
                    return;
                }
                kVar.invoke(x.g(rVar, intValue2, 0, 0, 6));
                return;
        }
    }
}

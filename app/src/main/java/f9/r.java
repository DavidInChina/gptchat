package f9;

import ce.AbstractC2400f;

/* loaded from: classes2.dex */
public final class r implements AbstractC2400f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29938a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29939b;

    public /* synthetic */ r(int i10, Object obj) {
        this.f29938a = i10;
        this.f29939b = obj;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f29938a;
        Object obj = this.f29939b;
        switch (i10) {
            case 0:
                s sVar = (s) obj;
                return new t(sVar.f29941b, sVar.f29942c, sVar.f29943d, sVar.f29944e);
            case 1:
                w wVar = (w) obj;
                return new C2960l(wVar.f29972c, wVar.f29973d);
            case 2:
                y yVar = (y) obj;
                return new z(yVar.f29990c, yVar.f29991d);
            default:
                return ((p000if.a) obj).get();
        }
    }
}

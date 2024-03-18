package rc;

import java.util.LinkedHashMap;
import java.util.Set;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class b0 extends AbstractC5163j implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Set f44844Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ zd.g f44845Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ zd.n f44846h0;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.j, rc.b0] */
    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? abstractC5163j = new AbstractC5163j(4, (AbstractC4825e) obj4);
        abstractC5163j.f44844Y = (Set) obj;
        abstractC5163j.f44845Z = (zd.g) obj2;
        abstractC5163j.f44846h0 = (zd.n) obj3;
        return abstractC5163j.invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        zd.g gVar = this.f44845Z;
        zd.n nVar = this.f44846h0;
        Set set = this.f44844Y;
        int n02 = P4.a.n0(AbstractC6583a.H1(set, 10));
        if (n02 < 16) {
            n02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
        for (Object obj2 : set) {
            zd.k kVar = (zd.k) obj2;
            linkedHashMap.put(obj2, new Z(gVar.f51972h.contains(kVar.f51976a), gVar.f51971g.contains(kVar.f51976a), ((Boolean) kVar.f51977b.invoke(nVar)).booleanValue()));
        }
        return linkedHashMap;
    }
}

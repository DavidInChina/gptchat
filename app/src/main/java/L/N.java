package L;

import H0.C0705t0;
import H0.T0;
import Mf.AbstractC1003l;
import ab.C1961o;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import s3.C5562l;
import s3.C5565o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class N extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10000Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f10001Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f10002h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f10003i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(Object obj, Object obj2, boolean z10, int i10) {
        super(0);
        this.f10000Y = i10;
        this.f10002h0 = obj;
        this.f10003i0 = obj2;
        this.f10001Z = z10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        T0 t02;
        List list;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f10000Y;
        boolean z10 = this.f10001Z;
        Object obj = this.f10003i0;
        Object obj2 = this.f10002h0;
        switch (i10) {
            case 0:
                P0 p02 = (P0) obj2;
                p0.l lVar = (p0.l) obj;
                boolean z11 = !z10;
                if (!p02.b()) {
                    lVar.a();
                } else if (z11 && (t02 = p02.f10031c) != null) {
                    T0.A a5 = ((C0705t0) t02).f7042a;
                    if (((T0.F) a5.f16731b.get()) != null) {
                        ((T0.D) a5.f16730a).a(T0.B.f16734h0);
                    }
                }
                return Boolean.TRUE;
            case 1:
                mo122invoke();
                return yVar;
            case 2:
                mo122invoke();
                return yVar;
            case 3:
                mo122invoke();
                return yVar;
            case 4:
                xg.z zVar = (xg.z) obj2;
                xg.D a10 = zVar.a((AbstractC1003l) zVar.f50057a.f11538c);
                if (a10 != null) {
                    fg.G g10 = (fg.G) obj;
                    M3.I i11 = zVar.f50057a;
                    if (z10) {
                        list = kf.t.K2(((xg.m) i11.f11536a).f50014e.k(a10, g10));
                    } else {
                        list = kf.t.K2(((xg.m) i11.f11536a).f50014e.a(a10, g10));
                    }
                } else {
                    list = null;
                }
                return list == null ? kf.v.f37483Y : list;
            default:
                mo122invoke();
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(xg.z zVar, boolean z10, fg.G g10) {
        super(0);
        this.f10000Y = 4;
        this.f10002h0 = zVar;
        this.f10001Z = z10;
        this.f10003i0 = g10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(boolean z10, Object obj, Object obj2, int i10) {
        super(0);
        this.f10000Y = i10;
        this.f10001Z = z10;
        this.f10002h0 = obj;
        this.f10003i0 = obj2;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo122invoke() {
        int i10 = this.f10000Y;
        boolean z10 = this.f10001Z;
        Object obj = this.f10003i0;
        Object obj2 = this.f10002h0;
        switch (i10) {
            case 1:
                if (!z10) {
                    return;
                }
                A3.d dVar = (A3.d) obj2;
                String str = (String) obj;
                dVar.getClass();
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                dVar.f638a.r(str);
                return;
            case 2:
                ((C5565o) obj2).d((C5562l) obj);
                return;
            case 3:
                if (!z10) {
                    return;
                }
                ((wf.k) obj2).invoke(new C1961o(((Wa.m) obj).f20857a));
                return;
            default:
                Ii.A a5 = (Ii.A) obj2;
                String str2 = (String) obj;
                if (!a5.f8623s0.containsKey(str2)) {
                    return;
                }
                LinkedHashMap linkedHashMap = a5.f8623s0;
                AbstractC3557B.b0("identityHash", str2);
                linkedHashMap.put(str2, new Ii.w(false, z10));
                return;
        }
    }
}

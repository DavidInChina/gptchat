package U8;

import H0.AbstractC0701r0;
import L.C0845e0;
import M3.H;
import N0.C1046e;
import S8.L;
import S8.M;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.o1;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.y;
import nf.AbstractC4828h;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Map f17562Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ M f17563Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1046e f17564h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f17565i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f17566j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f17567k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.k f17568l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ p f17569m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Map map, M m10, C1046e c1046e, boolean z10, int i10, int i11, wf.k kVar, p pVar) {
        super(3);
        this.f17562Y = map;
        this.f17563Z = m10;
        this.f17564h0 = c1046e;
        this.f17565i0 = z10;
        this.f17566j0 = i10;
        this.f17567k0 = i11;
        this.f17568l0 = kVar;
        this.f17569m0 = pVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        boolean z10;
        long j6;
        long V10;
        LinkedHashMap linkedHashMap;
        long V11;
        Z0.k kVar;
        int i10;
        androidx.compose.foundation.layout.d dVar = (androidx.compose.foundation.layout.d) obj;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3557B.c0("$this$BoxWithConstraints", dVar);
        if ((intValue & 14) == 0) {
            if (((Z.r) abstractC1725n).g(dVar)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue |= i10;
        }
        if ((intValue & 91) == 18) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        Map map = this.f17562Y;
        AbstractC3557B.c0("inlineContents", map);
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(1382998036);
        Z0.b bVar = (Z0.b) rVar2.m(AbstractC0701r0.f7002e);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P4.a.n0(map.size()));
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            obj4 = C1723m.f22654Y;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            a aVar = (a) entry.getValue();
            long j10 = dVar.f24736b;
            long n10 = A7.b.n(0, Z0.a.h(j10), 0, Z0.a.g(j10), 5);
            Object i11 = AbstractC6463a.i(rVar2, -1990137059, -492369756);
            if (i11 == obj4) {
                wf.k kVar2 = aVar.f17511a;
                if (kVar2 != null) {
                    kVar = (Z0.k) kVar2.invoke(bVar);
                } else {
                    kVar = null;
                }
                i11 = AbstractC4828h.Z(kVar, o1.f22665a);
                rVar2.h0(i11);
            }
            rVar2.t(false);
            AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) i11;
            Z0.k kVar3 = (Z0.k) abstractC1710f0.getValue();
            if (kVar3 != null) {
                j6 = n10;
                V10 = bVar.C((int) (kVar3.f22804a >> 32));
            } else {
                j6 = n10;
                V10 = H.V(0);
            }
            long j11 = V10;
            Z0.k kVar4 = (Z0.k) abstractC1710f0.getValue();
            if (kVar4 != null) {
                linkedHashMap = linkedHashMap2;
                V11 = bVar.C((int) (kVar4.f22804a & 4294967295L));
            } else {
                linkedHashMap = linkedHashMap2;
                V11 = H.V(1);
            }
            C0845e0 c0845e0 = new C0845e0(new N0.r(j11, V11, aVar.f17512b), R4.b.X(rVar2, -877544637, new d(j6, abstractC1710f0, aVar, bVar)));
            rVar2.t(false);
            linkedHashMap2 = linkedHashMap;
            linkedHashMap2.put(key, c0845e0);
        }
        rVar2.t(false);
        rVar2.W(648275739);
        C1046e c1046e = this.f17564h0;
        boolean g10 = rVar2.g(c1046e);
        p pVar = this.f17569m0;
        boolean g11 = g10 | rVar2.g(pVar);
        Object K10 = rVar2.K();
        if (!g11 && K10 != obj4) {
            z10 = false;
        } else {
            z10 = false;
            K10 = new s(c1046e, pVar, 0);
            rVar2.h0(K10);
        }
        wf.k kVar5 = (wf.k) K10;
        rVar2.t(z10);
        rVar2.W(648276431);
        boolean g12 = rVar2.g(c1046e) | rVar2.g(pVar);
        Object K11 = rVar2.K();
        if (g12 || K11 == obj4) {
            K11 = new s(c1046e, pVar, 1);
            rVar2.h0(K11);
        }
        rVar2.t(false);
        L.a(this.f17563Z, this.f17564h0, null, this.f17565i0, this.f17566j0, this.f17567k0, this.f17568l0, linkedHashMap2, kVar5, (wf.k) K11, rVar2, 16777216, 2);
        return y.f36177a;
    }
}

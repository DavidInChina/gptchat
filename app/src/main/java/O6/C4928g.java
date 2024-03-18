package o6;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import k6.C4191a;
import l8.AbstractC4344b;
import m6.C4562a;
import m6.C4564c;
import p5.EnumC5090b;
import t5.AbstractC5675a;

/* renamed from: o6.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4928g implements M, P {

    /* renamed from: a  reason: collision with root package name */
    public final u5.g f40854a;

    /* renamed from: b  reason: collision with root package name */
    public final float f40855b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f40856c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f40857d;

    /* renamed from: e  reason: collision with root package name */
    public final D5.a f40858e;

    /* renamed from: f  reason: collision with root package name */
    public final w6.m f40859f;

    /* renamed from: g  reason: collision with root package name */
    public final w6.m f40860g;

    /* renamed from: h  reason: collision with root package name */
    public final w6.m f40861h;

    /* renamed from: i  reason: collision with root package name */
    public final i6.h f40862i;

    /* renamed from: j  reason: collision with root package name */
    public C4562a f40863j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f40864k;

    /* renamed from: l  reason: collision with root package name */
    public Q f40865l;

    public C4928g(String str, u5.g gVar, float f6, boolean z10, boolean z11, D5.a aVar, w6.m mVar, w6.m mVar2, w6.m mVar3, C4191a c4191a) {
        AbstractC3557B.c0("applicationId", str);
        AbstractC3557B.c0("firstPartyHostHeaderTypeResolver", aVar);
        AbstractC3557B.c0("cpuVitalMonitor", mVar);
        AbstractC3557B.c0("memoryVitalMonitor", mVar2);
        AbstractC3557B.c0("frameRateVitalMonitor", mVar3);
        this.f40854a = gVar;
        this.f40855b = f6;
        this.f40856c = z10;
        this.f40857d = z11;
        this.f40858e = aVar;
        this.f40859f = mVar;
        this.f40860g = mVar2;
        this.f40861h = mVar3;
        this.f40862i = c4191a;
        this.f40863j = new C4562a(str, C4562a.f38944m, false, null, null, null, null, 1, 1, 1, null, null);
        this.f40864k = AbstractC4344b.N0(new O(this, gVar, f6, z10, z11, this, aVar, mVar, mVar2, mVar3, c4191a, false));
    }

    @Override // o6.M
    public final boolean a() {
        return true;
    }

    @Override // o6.M
    public final M b(L4.a aVar, AbstractC5675a abstractC5675a) {
        boolean z10;
        Object obj;
        ArrayList arrayList;
        Q q10;
        AbstractC3557B.c0("writer", abstractC5675a);
        if (aVar instanceof C4946z) {
            C4946z c4946z = (C4946z) aVar;
            this.f40863j = C4562a.a(this.f40863j, null, false, null, null, null, null, 0, 0, 0, c4946z.f40919j, c4946z.f40920k, 1023);
        }
        boolean z11 = aVar instanceof C;
        if (!z11 && !(aVar instanceof C4920A)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList2 = this.f40864k;
        Iterator it = arrayList2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((M) obj).a()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (((M) obj) == null && z10) {
            O o10 = new O(this, this.f40854a, this.f40855b, this.f40856c, this.f40857d, this, this.f40858e, this.f40859f, this.f40860g, this.f40861h, this.f40862i, true);
            arrayList = arrayList2;
            arrayList.add(o10);
            if (!z11 && (q10 = this.f40865l) != null) {
                o10.b(new C(q10.f40706a, q10.f40707b, new C4564c()), abstractC5675a);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((M) obj2).a()) {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList3.size() > 1) {
                P4.a.m0(this.f40854a.l(), 5, EnumC5090b.f42740h0, C4927f.f40848Z, null, false, 56);
            }
        } else {
            arrayList = arrayList2;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((M) it2.next()).b(aVar, abstractC5675a) == null) {
                it2.remove();
            }
        }
        return this;
    }

    @Override // o6.M
    public final C4562a c() {
        return this.f40863j;
    }
}

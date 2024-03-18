package Sd;

import Li.r;
import Qd.k;
import Qd.m;
import Rd.i;
import Rd.l;
import Vd.h;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.platform.plugins.SegmentSettings;
import eh.AbstractC2904d;
import eh.C2917q;
import id.AbstractC3557B;
import java.util.List;
import kf.v;
import kotlinx.serialization.KSerializer;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class e extends Rd.a implements r {

    /* renamed from: i0  reason: collision with root package name */
    public Rd.f f16569i0;

    /* renamed from: j0  reason: collision with root package name */
    public List f16570j0 = v.f37483Y;

    /* renamed from: k0  reason: collision with root package name */
    public final String f16571k0 = "Segment.io";

    public final void b(com.segment.analytics.kotlin.core.a aVar) {
        Rd.f fVar = this.f16569i0;
        if (fVar != null) {
            fVar.f15438e.t(aVar);
        }
    }

    @Override // Rd.j
    public final void c(Settings settings, i iVar) {
        String str;
        Rd.f fVar;
        kotlinx.serialization.json.c cVar;
        AbstractC3557B.c0("settings", settings);
        AbstractC3557B.c0("type", iVar);
        String str2 = this.f16571k0;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str2);
        this.f15420h0 = settings.f27796a.containsKey(str2);
        this.f15418Y.b(new Oc.c(settings, 6, iVar));
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str2);
        if (settings.f27796a.containsKey(str2)) {
            AbstractC2904d.f29415d.getClass();
            KSerializer serializer = SegmentSettings.Companion.serializer();
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) settings.f27796a.get(str2);
            Object obj = null;
            if (bVar != null) {
                C2917q c2917q = h.f18603a;
                if (bVar instanceof kotlinx.serialization.json.c) {
                    cVar = (kotlinx.serialization.json.c) bVar;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    obj = h.f18604b.a(serializer, cVar);
                }
            }
            SegmentSettings segmentSettings = (SegmentSettings) obj;
            if (segmentSettings != null && (str = segmentSettings.f27812b) != null && (fVar = this.f16569i0) != null) {
                fVar.f15437d = str;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, Ud.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, Ud.d] */
    @Override // Rd.j
    public final void d(Qd.i iVar) {
        List list;
        AbstractC3557B.t2(this, iVar);
        l lVar = this.f15418Y;
        lVar.getClass();
        lVar.f15456b = iVar;
        k kVar = iVar.f14610Y;
        if (kVar.f14629j.isEmpty()) {
            Ud.b[] bVarArr = new Ud.b[2];
            int i10 = kVar.f14627h;
            ?? obj = new Object();
            obj.f17705a = i10;
            if (i10 < 1) {
                i10 = 20;
            }
            obj.f17705a = i10;
            bVarArr[0] = obj;
            ?? obj2 = new Object();
            obj2.f17711a = kVar.f14628i * 1000;
            bVarArr[1] = obj2;
            list = AbstractC4344b.G0(bVarArr);
        } else {
            list = kVar.f14629j;
        }
        this.f16570j0 = list;
        c cVar = new c();
        Qd.i iVar2 = this.f15419Z;
        if (iVar2 != null) {
            cVar.e(iVar2);
            lVar.a(cVar);
            this.f16569i0 = new Rd.f(iVar, this.f16571k0, kVar.f14620a, this.f16570j0, kVar.f14632m);
            m mVar = iVar.f14611Z;
            Ad.l.O0(mVar.b(), mVar.d(), null, new d(iVar, this, null), 2);
            return;
        }
        AbstractC3557B.C2("analytics");
        throw null;
    }
}

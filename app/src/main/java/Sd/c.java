package Sd;

import Qd.i;
import Rd.h;
import Rd.j;
import com.segment.analytics.kotlin.core.DestinationMetadata;
import com.segment.analytics.kotlin.core.Settings;
import eh.C2917q;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kf.t;
import kf.v;
import lf.C4442g;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: Y  reason: collision with root package name */
    public i f16564Y;

    /* renamed from: Z  reason: collision with root package name */
    public Settings f16565Z = new Settings();

    @Override // Rd.j
    public final com.segment.analytics.kotlin.core.a a(com.segment.analytics.kotlin.core.a aVar) {
        ArrayList<Rd.a> arrayList;
        kotlinx.serialization.json.c cVar;
        kotlinx.serialization.json.b bVar;
        CopyOnWriteArrayList<j> copyOnWriteArrayList;
        i iVar = this.f16564Y;
        kotlinx.serialization.json.a aVar2 = null;
        if (iVar != null) {
            Rd.g gVar = (Rd.g) iVar.i().f15455a.get(h.f15445h0);
            if (gVar != null && (copyOnWriteArrayList = gVar.f15442a) != null) {
                ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(copyOnWriteArrayList, 10));
                for (j jVar : copyOnWriteArrayList) {
                    AbstractC3557B.a0("null cannot be cast to non-null type com.segment.analytics.kotlin.core.platform.DestinationPlugin", jVar);
                    arrayList2.add((Rd.a) jVar);
                }
                arrayList = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Rd.a aVar3 = (Rd.a) next;
                    if (aVar3.f15420h0 && !(aVar3 instanceof e)) {
                        arrayList.add(next);
                    }
                }
            } else {
                arrayList = null;
            }
            DestinationMetadata destinationMetadata = new DestinationMetadata();
            C4442g c4442g = new C4442g();
            if (arrayList != null) {
                for (Rd.a aVar4 : arrayList) {
                    c4442g.add(((e) aVar4).f16571k0);
                }
            }
            C4442g K10 = R4.b.K(c4442g);
            C4442g c4442g2 = new C4442g();
            for (String str : this.f16565Z.f27796a.f37662Y.keySet()) {
                if (!AbstractC3557B.K(str, "Segment.io") && !K10.f38329Y.containsKey(str)) {
                    c4442g2.add(str);
                }
            }
            kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) this.f16565Z.f27796a.get("Segment.io");
            if (bVar2 != null) {
                C2917q c2917q = Vd.h.f18603a;
                if (bVar2 instanceof kotlinx.serialization.json.c) {
                    cVar = (kotlinx.serialization.json.c) bVar2;
                } else {
                    cVar = null;
                }
                if (cVar != null && (bVar = (kotlinx.serialization.json.b) cVar.get("unbundledIntegrations")) != null) {
                    if (bVar instanceof kotlinx.serialization.json.a) {
                        aVar2 = (kotlinx.serialization.json.a) bVar;
                    }
                    if (aVar2 != null) {
                        for (kotlinx.serialization.json.b bVar3 : aVar2.f37661Y) {
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.serialization.json.JsonPrimitive", bVar3);
                            String r10 = ((kotlinx.serialization.json.d) bVar3).r();
                            if (!K10.f38329Y.containsKey(r10)) {
                                c4442g2.add(r10);
                            }
                        }
                    }
                }
            }
            C4442g K11 = R4.b.K(c4442g2);
            destinationMetadata.f27765c = v.f37483Y;
            destinationMetadata.f27763a = t.K2(K10);
            destinationMetadata.f27764b = t.K2(K11);
            com.segment.analytics.kotlin.core.a b10 = aVar.b();
            b10.q(destinationMetadata);
            return b10;
        }
        AbstractC3557B.C2("analytics");
        throw null;
    }

    @Override // Rd.j
    public final void c(Settings settings, Rd.i iVar) {
        AbstractC3557B.c0("settings", settings);
        AbstractC3557B.c0("type", iVar);
        AbstractC3557B.J2(settings, iVar);
        this.f16565Z = settings;
    }

    @Override // Rd.j
    public final void d(i iVar) {
        AbstractC3557B.t2(this, iVar);
    }

    @Override // Rd.j
    public final void e(i iVar) {
        AbstractC3557B.c0("<set-?>", iVar);
        this.f16564Y = iVar;
    }

    @Override // Rd.j
    public final h getType() {
        return h.f15444Z;
    }
}

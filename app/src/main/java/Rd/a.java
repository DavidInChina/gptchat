package Rd;

import com.segment.analytics.kotlin.core.AliasEvent;
import com.segment.analytics.kotlin.core.GroupEvent;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.ScreenEvent;
import com.segment.analytics.kotlin.core.TrackEvent;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: Y  reason: collision with root package name */
    public final l f15418Y = new l();

    /* renamed from: Z  reason: collision with root package name */
    public Qd.i f15419Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f15420h0;

    @Override // Rd.j
    public final com.segment.analytics.kotlin.core.a a(com.segment.analytics.kotlin.core.a aVar) {
        boolean z10;
        com.segment.analytics.kotlin.core.a aVar2;
        Boolean a5 = Vd.h.a(((Sd.e) this).f16571k0, aVar.e());
        if (a5 != null) {
            z10 = a5.booleanValue();
        } else {
            z10 = true;
        }
        com.segment.analytics.kotlin.core.a aVar3 = null;
        if (!this.f15420h0 || !z10) {
            return null;
        }
        h hVar = h.f15443Y;
        l lVar = this.f15418Y;
        com.segment.analytics.kotlin.core.a c10 = lVar.c(h.f15444Z, lVar.c(hVar, aVar));
        if (c10 != null) {
            if (c10 instanceof IdentifyEvent) {
                aVar2 = (IdentifyEvent) c10;
                ((Sd.e) this).b(aVar2);
            } else if (c10 instanceof TrackEvent) {
                aVar2 = (TrackEvent) c10;
                ((Sd.e) this).b(aVar2);
            } else if (c10 instanceof GroupEvent) {
                aVar2 = (GroupEvent) c10;
                ((Sd.e) this).b(aVar2);
            } else if (c10 instanceof ScreenEvent) {
                aVar2 = (ScreenEvent) c10;
                ((Sd.e) this).b(aVar2);
            } else if (c10 instanceof AliasEvent) {
                aVar2 = (AliasEvent) c10;
                ((Sd.e) this).b(aVar2);
            } else {
                throw new RuntimeException();
            }
            aVar3 = aVar2;
        }
        return lVar.c(h.f15446i0, aVar3);
    }

    @Override // Rd.j
    public final void e(Qd.i iVar) {
        AbstractC3557B.c0("<set-?>", iVar);
        this.f15419Z = iVar;
    }

    @Override // Rd.j
    public final h getType() {
        return h.f15445h0;
    }
}

package Sd;

import Df.H;
import Rd.i;
import Rd.j;
import Vd.h;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.D;
import com.segment.analytics.kotlin.core.Settings;
import eh.AbstractC2911k;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b implements j {
    public static final a Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public kotlinx.serialization.json.c f16562Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f16563Z;

    public b() {
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("randomUUID().toString()", uuid);
        this.f16563Z = uuid;
    }

    @Override // Rd.j
    public final com.segment.analytics.kotlin.core.a a(com.segment.analytics.kotlin.core.a aVar) {
        D d10 = new D(6);
        h.b(d10, aVar.d());
        kotlinx.serialization.json.c cVar = this.f16562Y;
        if (cVar != null) {
            d10.m("library", cVar);
            H.k0(d10, "instanceId", this.f16563Z);
            aVar.l(d10.c());
            return aVar;
        }
        AbstractC3557B.C2("library");
        throw null;
    }

    @Override // Rd.j
    public final void c(Settings settings, i iVar) {
        AbstractC3557B.J2(settings, iVar);
    }

    @Override // Rd.j
    public final void d(Qd.i iVar) {
        AbstractC3557B.t2(this, iVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlinx.serialization.json.d b10 = AbstractC2911k.b("analytics-kotlin");
        AbstractC3557B.c0("element", b10);
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) linkedHashMap.put("name", b10);
        kotlinx.serialization.json.d b11 = AbstractC2911k.b("1.14.2");
        AbstractC3557B.c0("element", b11);
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) linkedHashMap.put(ParameterNames.VERSION, b11);
        this.f16562Y = new kotlinx.serialization.json.c(linkedHashMap);
    }

    @Override // Rd.j
    public final void e(Qd.i iVar) {
        AbstractC3557B.c0("<set-?>", iVar);
    }

    @Override // Rd.j
    public final Rd.h getType() {
        return Rd.h.f15443Y;
    }
}

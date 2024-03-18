package fh;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import eh.C2899A;
import eh.C2906f;
import id.AbstractC3557B;
import java.util.Map;

/* renamed from: fh.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3062E extends C3099z {

    /* renamed from: h  reason: collision with root package name */
    public String f30806h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f30807i;

    @Override // fh.C3099z, fh.AbstractC3077d
    public final kotlinx.serialization.json.b J() {
        return new kotlinx.serialization.json.c((Map) this.f30904g);
    }

    @Override // fh.C3099z, fh.AbstractC3077d
    public final void K(String str, kotlinx.serialization.json.b bVar) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC3557B.c0("element", bVar);
        if (this.f30807i) {
            if (bVar instanceof kotlinx.serialization.json.d) {
                this.f30806h = ((kotlinx.serialization.json.d) bVar).r();
                this.f30807i = false;
                return;
            } else if (!(bVar instanceof kotlinx.serialization.json.c)) {
                if (bVar instanceof kotlinx.serialization.json.a) {
                    throw Bi.c.l(C2906f.f29423b);
                }
                throw new RuntimeException();
            } else {
                throw Bi.c.l(C2899A.f29406b);
            }
        }
        Map map = (Map) this.f30904g;
        String str2 = this.f30806h;
        if (str2 != null) {
            map.put(str2, bVar);
            this.f30807i = true;
            return;
        }
        AbstractC3557B.C2(ParameterNames.TAG);
        throw null;
    }
}

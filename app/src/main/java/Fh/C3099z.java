package fh;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import eh.AbstractC2904d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: fh.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3099z extends AbstractC3077d {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f30903f;

    /* renamed from: g  reason: collision with root package name */
    public Object f30904g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3099z(AbstractC2904d abstractC2904d, wf.k kVar, int i10) {
        super(abstractC2904d, kVar);
        this.f30903f = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                AbstractC3557B.c0("json", abstractC2904d);
                AbstractC3557B.c0("nodeConsumer", kVar);
                this.f28435a.add("primitive");
                return;
            }
            AbstractC3557B.c0("json", abstractC2904d);
            AbstractC3557B.c0("nodeConsumer", kVar);
            super(abstractC2904d, kVar);
            this.f30904g = new ArrayList();
            return;
        }
        AbstractC3557B.c0("json", abstractC2904d);
        AbstractC3557B.c0("nodeConsumer", kVar);
        super(abstractC2904d, kVar);
        this.f30904g = new LinkedHashMap();
    }

    @Override // fh.AbstractC3077d
    public kotlinx.serialization.json.b J() {
        switch (this.f30903f) {
            case 0:
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) this.f30904g;
                if (bVar != null) {
                    return bVar;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
            case 1:
                return new kotlinx.serialization.json.c((Map) this.f30904g);
            default:
                return new kotlinx.serialization.json.a((ArrayList) this.f30904g);
        }
    }

    @Override // fh.AbstractC3077d
    public void K(String str, kotlinx.serialization.json.b bVar) {
        switch (this.f30903f) {
            case 0:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                AbstractC3557B.c0("element", bVar);
                if (str == "primitive") {
                    if (((kotlinx.serialization.json.b) this.f30904g) == null) {
                        this.f30904g = bVar;
                        this.f30866c.invoke(bVar);
                        return;
                    }
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
                }
                throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
            case 1:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                AbstractC3557B.c0("element", bVar);
                ((Map) this.f30904g).put(str, bVar);
                return;
            default:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                AbstractC3557B.c0("element", bVar);
                ((ArrayList) this.f30904g).add(Integer.parseInt(str), bVar);
                return;
        }
    }

    @Override // ch.AbstractC2431b
    public final void q(SerialDescriptor serialDescriptor, int i10, KSerializer kSerializer, Object obj) {
        int i11 = this.f30903f;
        ArrayList arrayList = this.f28435a;
        switch (i11) {
            case 1:
                AbstractC3557B.c0("descriptor", serialDescriptor);
                AbstractC3557B.c0("serializer", kSerializer);
                if (obj != null || this.f30867d.f29446f) {
                    arrayList.add(H(serialDescriptor, i10));
                    Df.H.E(this, kSerializer, obj);
                    return;
                }
                return;
            default:
                AbstractC3557B.c0("descriptor", serialDescriptor);
                AbstractC3557B.c0("serializer", kSerializer);
                arrayList.add(H(serialDescriptor, i10));
                Df.H.E(this, kSerializer, obj);
                return;
        }
    }
}

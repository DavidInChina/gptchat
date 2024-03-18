package Zg;

import Yg.v;
import Yg.w;
import bh.C2215e;
import dh.m0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class l implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final l f23757a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f23758b = Ad.l.t("TimeZone", C2215e.f25994i);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        v vVar = w.Companion;
        String o10 = decoder.o();
        vVar.getClass();
        return v.b(o10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23758b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w wVar = (w) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", wVar);
        String id2 = wVar.f22424a.getId();
        AbstractC3557B.b0("getId(...)", id2);
        encoder.D(id2);
    }
}

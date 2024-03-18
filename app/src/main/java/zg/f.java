package Zg;

import Yg.n;
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
public final class f implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final f f23745a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f23746b = Ad.l.t("FixedOffsetTimeZone", C2215e.f25994i);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        v vVar = w.Companion;
        String o10 = decoder.o();
        vVar.getClass();
        w b10 = v.b(o10);
        if (b10 instanceof n) {
            return (n) b10;
        }
        throw new IllegalArgumentException("Timezone identifier '" + b10 + "' does not correspond to a fixed-offset timezone");
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23746b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n nVar = (n) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", nVar);
        String id2 = nVar.f22424a.getId();
        AbstractC3557B.b0("getId(...)", id2);
        encoder.D(id2);
    }
}

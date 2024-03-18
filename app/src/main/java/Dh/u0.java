package dh;

import bh.C2215e;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class u0 implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final u0 f28491a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f28492b = new m0("kotlin.String", C2215e.f25994i);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return decoder.o();
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28492b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = (String) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", str);
        encoder.D(str);
    }
}

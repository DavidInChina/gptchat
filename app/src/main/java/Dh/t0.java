package dh;

import bh.C2215e;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class t0 implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final t0 f28489a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f28490b = new m0("kotlin.Short", C2215e.f25993h);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return Short.valueOf(decoder.B());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28490b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        short shortValue = ((Number) obj).shortValue();
        AbstractC3557B.c0("encoder", encoder);
        encoder.h(shortValue);
    }
}

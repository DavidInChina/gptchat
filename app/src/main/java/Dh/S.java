package dh;

import bh.C2215e;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class S implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final S f28417a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f28418b = new m0("kotlin.Long", C2215e.f25992g);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return Long.valueOf(decoder.p());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28418b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long longValue = ((Number) obj).longValue();
        AbstractC3557B.c0("encoder", encoder);
        encoder.y(longValue);
    }
}

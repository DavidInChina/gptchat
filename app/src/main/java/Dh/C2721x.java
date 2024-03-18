package dh;

import bh.C2215e;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: dh.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2721x implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2721x f28501a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f28502b = new m0("kotlin.Double", C2215e.f25989d);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return Double.valueOf(decoder.D());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28502b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        AbstractC3557B.c0("encoder", encoder);
        encoder.g(doubleValue);
    }
}

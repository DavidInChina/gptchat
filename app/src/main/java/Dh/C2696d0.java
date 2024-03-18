package dh;

import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: dh.d0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2696d0 implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2696d0 f28440a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C2694c0 f28441b = C2694c0.f28437a;

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        throw new IllegalArgumentException("'kotlin.Nothing' does not have instances");
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28441b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", (Void) obj);
        throw new IllegalArgumentException("'kotlin.Nothing' cannot be serialized");
    }
}

package dh;

import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: dh.e0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2698e0 implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f28444a;

    /* renamed from: b  reason: collision with root package name */
    public final p0 f28445b;

    public C2698e0(KSerializer kSerializer) {
        AbstractC3557B.c0("serializer", kSerializer);
        this.f28444a = kSerializer;
        this.f28445b = new p0(kSerializer.getDescriptor());
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        if (decoder.s()) {
            return decoder.g(this.f28444a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2698e0.class == obj.getClass() && AbstractC3557B.K(this.f28444a, ((C2698e0) obj).f28444a)) {
            return true;
        }
        return false;
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return this.f28445b;
    }

    public final int hashCode() {
        return this.f28444a.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC3557B.c0("encoder", encoder);
        if (obj != null) {
            encoder.w(this.f28444a, obj);
        } else {
            encoder.e();
        }
    }
}

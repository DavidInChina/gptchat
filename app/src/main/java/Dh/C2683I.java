package dh;

import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: dh.I  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2683I implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KSerializer f28398a;

    public C2683I(KSerializer kSerializer) {
        this.f28398a = kSerializer;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{this.f28398a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC3557B.c0("encoder", encoder);
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

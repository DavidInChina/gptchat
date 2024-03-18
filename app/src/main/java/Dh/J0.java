package dh;

import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class J0 implements KSerializer {

    /* renamed from: b  reason: collision with root package name */
    public static final J0 f28403b = new J0();

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C2676B f28404a = new C2676B("kotlin.Unit", jf.y.f36177a);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        this.f28404a.deserialize(decoder);
        return jf.y.f36177a;
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return this.f28404a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jf.y yVar = (jf.y) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", yVar);
        this.f28404a.serialize(encoder, yVar);
    }
}

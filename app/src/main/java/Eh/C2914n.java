package eh;

import bh.C2213c;
import bh.C2217g;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: eh.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2914n implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2914n f29467a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C2217g f29468b = Ad.l.O("kotlinx.serialization.json.JsonElement", C2213c.f25985b, new SerialDescriptor[0], C2913m.f29464Z);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return A7.b.b0(decoder).k();
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f29468b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", bVar);
        A7.b.X(encoder);
        if (bVar instanceof kotlinx.serialization.json.d) {
            encoder.w(C2900B.f29407a, bVar);
        } else if (bVar instanceof kotlinx.serialization.json.c) {
            encoder.w(C2899A.f29405a, bVar);
        } else if (bVar instanceof kotlinx.serialization.json.a) {
            encoder.w(C2906f.f29422a, bVar);
        }
    }
}

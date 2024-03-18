package eh;

import dh.u0;
import id.AbstractC3557B;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: eh.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2899A implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2899A f29405a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C2926z f29406b = C2926z.f29479b;

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        A7.b.b0(decoder);
        return new kotlinx.serialization.json.c((Map) A7.b.G(u0.f28491a, C2914n.f29467a).deserialize(decoder));
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f29406b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", cVar);
        A7.b.X(encoder);
        A7.b.G(u0.f28491a, C2914n.f29467a).serialize(encoder, cVar);
    }
}

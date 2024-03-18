package eh;

import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: eh.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2906f implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2906f f29422a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C2905e f29423b = C2905e.f29419b;

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        A7.b.b0(decoder);
        return new kotlinx.serialization.json.a((List) A7.b.E(C2914n.f29467a).deserialize(decoder));
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f29423b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.a aVar = (kotlinx.serialization.json.a) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", aVar);
        A7.b.X(encoder);
        A7.b.E(C2914n.f29467a).serialize(encoder, aVar);
    }
}

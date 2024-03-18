package eh;

import bh.C2217g;
import bh.C2220j;
import bh.C2222l;
import fh.C3091r;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;

/* renamed from: eh.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2925y implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2925y f29477a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C2217g f29478b = Ad.l.O("kotlinx.serialization.json.JsonNull", C2222l.f26014a, new SerialDescriptor[0], C2220j.f26012Y);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        A7.b.b0(decoder);
        if (!decoder.s()) {
            return JsonNull.INSTANCE;
        }
        throw new C3091r("Expected 'null' literal");
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f29478b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", (JsonNull) obj);
        A7.b.X(encoder);
        encoder.e();
    }
}

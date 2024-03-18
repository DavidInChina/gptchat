package Vd;

import ah.C1990a;
import eh.AbstractC2904d;
import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class a implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18581a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f18582b = new C1990a(C.f37623a.b(Object.class), new KSerializer[0]).f24193c;

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return "not-implemented";
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f18582b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", obj);
        kotlinx.serialization.json.b d10 = h.d(obj);
        AbstractC2904d.f29415d.getClass();
        encoder.w(kotlinx.serialization.json.b.Companion.serializer(), d10);
    }
}

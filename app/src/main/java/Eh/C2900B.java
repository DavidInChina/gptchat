package eh;

import bh.C2215e;
import bh.C2217g;
import bh.C2220j;
import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import y.AbstractC6463a;

/* renamed from: eh.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2900B implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2900B f29407a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C2217g f29408b = Ad.l.O("kotlinx.serialization.json.JsonPrimitive", C2215e.f25994i, new SerialDescriptor[0], C2220j.f26012Y);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        kotlinx.serialization.json.b k10 = A7.b.b0(decoder).k();
        if (k10 instanceof kotlinx.serialization.json.d) {
            return (kotlinx.serialization.json.d) k10;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw Bi.c.n(AbstractC6463a.m(C.f37623a, k10.getClass(), sb2), k10.toString(), -1);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f29408b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", dVar);
        A7.b.X(encoder);
        if (dVar instanceof JsonNull) {
            encoder.w(C2925y.f29477a, JsonNull.INSTANCE);
        } else {
            encoder.w(C2919s.f29473a, (C2918r) dVar);
        }
    }
}

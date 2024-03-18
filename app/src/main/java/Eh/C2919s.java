package eh;

import bh.C2215e;
import dh.F0;
import dh.m0;
import id.AbstractC3557B;
import jf.C3970t;
import kotlin.jvm.internal.C;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import y.AbstractC6463a;

/* renamed from: eh.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2919s implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2919s f29473a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f29474b = Ad.l.t("kotlinx.serialization.json.JsonLiteral", C2215e.f25994i);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        kotlinx.serialization.json.b k10 = A7.b.b0(decoder).k();
        if (k10 instanceof C2918r) {
            return (C2918r) k10;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw Bi.c.n(AbstractC6463a.m(C.f37623a, k10.getClass(), sb2), k10.toString(), -1);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f29474b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Boolean bool;
        C2918r c2918r = (C2918r) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2918r);
        A7.b.X(encoder);
        boolean z10 = c2918r.f29470Y;
        String str = c2918r.f29472h0;
        if (z10) {
            encoder.D(str);
            return;
        }
        SerialDescriptor serialDescriptor = c2918r.f29471Z;
        if (serialDescriptor != null) {
            encoder.v(serialDescriptor).D(str);
            return;
        }
        Long X12 = Lg.m.X1(str);
        if (X12 != null) {
            encoder.y(X12.longValue());
            return;
        }
        C3970t k22 = R4.b.k2(str);
        if (k22 != null) {
            encoder.v(F0.f28392b).y(k22.f36172Y);
            return;
        }
        Double V12 = Lg.m.V1(str);
        if (V12 != null) {
            encoder.g(V12.doubleValue());
            return;
        }
        if (AbstractC3557B.K(str, "true")) {
            bool = Boolean.TRUE;
        } else if (AbstractC3557B.K(str, "false")) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        if (bool != null) {
            encoder.k(bool.booleanValue());
        } else {
            encoder.D(str);
        }
    }
}

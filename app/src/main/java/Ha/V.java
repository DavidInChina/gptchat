package ha;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import eh.C2906f;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class V implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final V f32041a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f32042b;

    /* JADX WARN: Type inference failed for: r0v0, types: [ha.V, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f32041a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.metadata.ToolMetadata", obj, 7);
        pluginGeneratedSerialDescriptor.k("command", true);
        pluginGeneratedSerialDescriptor.k("args", true);
        pluginGeneratedSerialDescriptor.k("status", true);
        pluginGeneratedSerialDescriptor.k("actionCall", true);
        pluginGeneratedSerialDescriptor.k("actionResponse", true);
        pluginGeneratedSerialDescriptor.k("invokedPlugin", true);
        pluginGeneratedSerialDescriptor.k("gizmoId", true);
        f32042b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = X.f32043h;
        return new KSerializer[]{A7.b.U0(kSerializerArr[0]), A7.b.U0(C2906f.f29422a), A7.b.U0(kSerializerArr[2]), A7.b.U0(C3377u.f32079a), A7.b.U0(Q.f32030a), A7.b.U0(O9.O.f13483a), A7.b.U0(wd.M.f48360a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        wd.O o10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32042b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = X.f32043h;
        boolean z10 = true;
        int i10 = 0;
        U u10 = null;
        kotlinx.serialization.json.a aVar = null;
        Y y10 = null;
        M m10 = null;
        T t10 = null;
        O9.Q q10 = null;
        String str = null;
        while (z10) {
            int t11 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t11) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    u10 = (U) c10.v(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], u10);
                    i10 |= 1;
                    break;
                case 1:
                    aVar = (kotlinx.serialization.json.a) c10.v(pluginGeneratedSerialDescriptor, 1, C2906f.f29422a, aVar);
                    i10 |= 2;
                    break;
                case 2:
                    y10 = (Y) c10.v(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], y10);
                    i10 |= 4;
                    break;
                case 3:
                    m10 = (M) c10.v(pluginGeneratedSerialDescriptor, 3, C3377u.f32079a, m10);
                    i10 |= 8;
                    break;
                case 4:
                    t10 = (T) c10.v(pluginGeneratedSerialDescriptor, 4, Q.f32030a, t10);
                    i10 |= 16;
                    break;
                case 5:
                    q10 = (O9.Q) c10.v(pluginGeneratedSerialDescriptor, 5, O9.O.f13483a, q10);
                    i10 |= 32;
                    break;
                case 6:
                    wd.M m11 = wd.M.f48360a;
                    if (str != null) {
                        o10 = new wd.O(str);
                    } else {
                        o10 = null;
                    }
                    wd.O o11 = (wd.O) c10.v(pluginGeneratedSerialDescriptor, 6, m11, o10);
                    if (o11 != null) {
                        str = o11.f48362a;
                    } else {
                        str = null;
                    }
                    i10 |= 64;
                    break;
                default:
                    throw new C2004o(t11);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new X(i10, u10, aVar, y10, m10, t10, q10, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f32042b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wd.O o10;
        X x10 = (X) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", x10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32042b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        W w10 = X.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = X.f32043h;
        U u10 = x10.f32044a;
        if (C10 || u10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], u10);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        kotlinx.serialization.json.a aVar = x10.f32045b;
        if (C11 || aVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, C2906f.f29422a, aVar);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        Y y10 = x10.f32046c;
        if (C12 || y10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], y10);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        M m10 = x10.f32047d;
        if (C13 || m10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, C3377u.f32079a, m10);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        T t10 = x10.f32048e;
        if (C14 || t10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 4, Q.f32030a, t10);
        }
        boolean C15 = c10.C(pluginGeneratedSerialDescriptor);
        O9.Q q10 = x10.f32049f;
        if (C15 || q10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 5, O9.O.f13483a, q10);
        }
        boolean C16 = c10.C(pluginGeneratedSerialDescriptor);
        String str = x10.f32050g;
        if (C16 || str != null) {
            wd.M m11 = wd.M.f48360a;
            if (str != null) {
                o10 = new wd.O(str);
            } else {
                o10 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 6, m11, o10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

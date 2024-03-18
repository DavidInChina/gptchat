package jc;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.M;
import wd.O;

/* renamed from: jc.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3943k implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C3943k f36113a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f36114b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, jc.k, java.lang.Object] */
    static {
        ?? obj = new Object();
        f36113a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.settings.impl.memory.api.MemoryRequest", obj, 1);
        pluginGeneratedSerialDescriptor.k("gizmoId", false);
        f36114b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(M.f48360a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        O o10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f36114b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    M m10 = M.f48360a;
                    if (str != null) {
                        o10 = new O(str);
                    } else {
                        o10 = null;
                    }
                    O o11 = (O) c10.v(pluginGeneratedSerialDescriptor, 0, m10, o10);
                    if (o11 != null) {
                        str = o11.f48362a;
                    } else {
                        str = null;
                    }
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C3945m(i10, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f36114b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        O o10;
        C3945m c3945m = (C3945m) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c3945m);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f36114b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        M m10 = M.f48360a;
        String str = c3945m.f36115a;
        if (str != null) {
            o10 = new O(str);
        } else {
            o10 = null;
        }
        c10.q(pluginGeneratedSerialDescriptor, 0, m10, o10);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

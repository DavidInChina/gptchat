package Dd;

import O9.C1118n;
import O9.C1122p;
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

/* renamed from: Dd.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0394o implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0394o f3565a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f3566b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Dd.o, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f3565a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.RelayMessage", obj, 2);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("message", true);
        f3566b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C0396q.f3567c[0], A7.b.U0(C1118n.f13562a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3566b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C0396q.f3567c;
        H h10 = null;
        boolean z10 = true;
        C1122p c1122p = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        c1122p = (C1122p) c10.v(pluginGeneratedSerialDescriptor, 1, C1118n.f13562a, c1122p);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    h10 = (H) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], h10);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C0396q(i10, h10, c1122p);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f3566b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0396q c0396q = (C0396q) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0396q);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3566b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C0396q.f3567c[0], c0396q.f3568a);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        C1122p c1122p = c0396q.f3569b;
        if (C10 || c1122p != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, C1118n.f13562a, c1122p);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

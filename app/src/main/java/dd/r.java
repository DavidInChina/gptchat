package Dd;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2721x;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final class r implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final r f3570a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f3571b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Dd.r, java.lang.Object] */
    static {
        ?? obj = new Object();
        f3570a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.StateUpdate", obj, 2);
        pluginGeneratedSerialDescriptor.k("newState", false);
        pluginGeneratedSerialDescriptor.k("delayS", true);
        f3571b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C0398t.f3572c[0], A7.b.U0(C2721x.f28501a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3571b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C0398t.f3572c;
        N n10 = null;
        boolean z10 = true;
        Double d10 = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        d10 = (Double) c10.v(pluginGeneratedSerialDescriptor, 1, C2721x.f28501a, d10);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    n10 = (N) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], n10);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C0398t(i10, n10, d10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f3571b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0398t c0398t = (C0398t) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0398t);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3571b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C0398t.f3572c[0], c0398t.f3573a);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Double d10 = c0398t.f3574b;
        if (C10 || d10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, C2721x.f28501a, d10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

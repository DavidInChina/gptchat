package rb;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2721x;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: rb.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5404E implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C5404E f44655a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f44656b;

    /* JADX WARN: Type inference failed for: r0v0, types: [rb.E, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f44655a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.messages.impl.tools.clientactions.FusedLocation", obj, 3);
        pluginGeneratedSerialDescriptor.k("latitude", false);
        pluginGeneratedSerialDescriptor.k("longitude", false);
        pluginGeneratedSerialDescriptor.k("addresses", true);
        f44656b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C5406G.f44657d[2];
        C2721x c2721x = C2721x.f28501a;
        return new KSerializer[]{c2721x, c2721x, kSerializer};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f44656b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C5406G.f44657d;
        int i10 = 0;
        List list = null;
        double d10 = 0.0d;
        double d11 = 0.0d;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            list = (List) c10.n(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        d11 = c10.x(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    d10 = c10.x(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C5406G(i10, d10, d11, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f44656b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5406G c5406g = (C5406G) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c5406g);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f44656b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.x(pluginGeneratedSerialDescriptor, 0, c5406g.f44658a);
        c10.x(pluginGeneratedSerialDescriptor, 1, c5406g.f44659b);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        List list = c5406g.f44660c;
        if (C10 || !AbstractC3557B.K(list, kf.v.f37483Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 2, C5406G.f44657d[2], list);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

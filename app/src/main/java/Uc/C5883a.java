package uc;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import kf.v;
import kf.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: uc.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5883a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C5883a f46627a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f46628b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, uc.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        f46627a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.user.impl.api.beta.BetaFeatures", obj, 2);
        pluginGeneratedSerialDescriptor.k("features", true);
        pluginGeneratedSerialDescriptor.k("exposedFeatures", true);
        f46628b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C5885c.f46629c;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46628b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C5885c.f46629c;
        Map map = null;
        boolean z10 = true;
        List list = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        list = (List) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    map = (Map) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], map);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C5885c(i10, map, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f46628b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5885c c5885c = (C5885c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c5885c);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46628b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C5884b c5884b = C5885c.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C5885c.f46629c;
        Map map = c5885c.f46630a;
        if (C10 || !AbstractC3557B.K(map, w.f37484Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], map);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        List list = c5885c.f46631b;
        if (C11 || !AbstractC3557B.K(list, v.f37483Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

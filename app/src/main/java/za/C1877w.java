package Za;

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

/* renamed from: Za.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1877w implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1877w f23623a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23624b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Za.w] */
    static {
        ?? obj = new Object();
        f23623a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmoAboutBlock.GenericTitleSubtitle", obj, 3);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("subtitle", false);
        f23624b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{u0Var, u0Var, u0Var};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23624b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        boolean z10 = true;
        int i10 = 0;
        String str2 = null;
        String str3 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            str3 = c10.r(pluginGeneratedSerialDescriptor, 2);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        str2 = c10.r(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    str = c10.r(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1879y(i10, str, str2, str3);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23624b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1879y c1879y = (C1879y) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1879y);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23624b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c1879y.f23631a, pluginGeneratedSerialDescriptor);
        c10.z(1, c1879y.f23632b, pluginGeneratedSerialDescriptor);
        c10.z(2, c1879y.f23633c, pluginGeneratedSerialDescriptor);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

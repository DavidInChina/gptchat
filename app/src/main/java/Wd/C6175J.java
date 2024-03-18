package wd;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: wd.J  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6175J implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C6175J f48349a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f48350b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, wd.J] */
    static {
        ?? obj = new Object();
        f48349a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.FileAssetPointer", obj, 3);
        pluginGeneratedSerialDescriptor.k("assetPointer", false);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("size", true);
        f48350b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C6207u.f48466a, dh.u0.f28491a, A7.b.U0(C2686L.f28406a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6209w c6209w;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48350b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        Integer num = null;
        String str2 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            num = (Integer) c10.v(pluginGeneratedSerialDescriptor, 2, C2686L.f28406a, num);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        str2 = c10.r(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    C6207u c6207u = C6207u.f48466a;
                    if (str != null) {
                        c6209w = new C6209w(str);
                    } else {
                        c6209w = null;
                    }
                    C6209w c6209w2 = (C6209w) c10.n(pluginGeneratedSerialDescriptor, 0, c6207u, c6209w);
                    if (c6209w2 != null) {
                        str = c6209w2.f48469a;
                    } else {
                        str = null;
                    }
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new L(i10, str, str2, num);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f48350b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        L l10 = (L) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", l10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48350b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C6207u.f48466a, new C6209w(l10.f48357a));
        c10.z(1, l10.f48358b, pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Integer num = l10.f48359c;
        if (C10 || num != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C2686L.f28406a, num);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

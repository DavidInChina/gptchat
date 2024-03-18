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

/* loaded from: classes2.dex */
public final class P implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final P f48363a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f48364b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, wd.P, java.lang.Object] */
    static {
        ?? obj = new Object();
        f48363a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.ImageAssetPointer", obj, 5);
        pluginGeneratedSerialDescriptor.k("assetPointer", false);
        pluginGeneratedSerialDescriptor.k("sizeBytes", false);
        pluginGeneratedSerialDescriptor.k("width", false);
        pluginGeneratedSerialDescriptor.k("height", false);
        pluginGeneratedSerialDescriptor.k("metadata", true);
        f48364b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer U02 = A7.b.U0(V.f48369a);
        C2686L c2686l = C2686L.f28406a;
        return new KSerializer[]{C6207u.f48466a, c2686l, c2686l, c2686l, U02};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6209w c6209w;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48364b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        String str = null;
        X x10 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    x10 = (X) c10.v(pluginGeneratedSerialDescriptor, 4, V.f48369a, x10);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                i13 = c10.m(pluginGeneratedSerialDescriptor, 3);
                                i10 |= 8;
                            }
                        } else {
                            i12 = c10.m(pluginGeneratedSerialDescriptor, 2);
                            i10 |= 4;
                        }
                    } else {
                        i11 = c10.m(pluginGeneratedSerialDescriptor, 1);
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
        return new Y(i10, str, i11, i12, i13, x10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f48364b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Y y10 = (Y) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", y10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48364b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C6207u.f48466a, new C6209w(y10.f48372a));
        c10.m(1, y10.f48373b, pluginGeneratedSerialDescriptor);
        c10.m(2, y10.f48374c, pluginGeneratedSerialDescriptor);
        c10.m(3, y10.f48375d, pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        X x10 = y10.f48376e;
        if (C10 || x10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 4, V.f48369a, x10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

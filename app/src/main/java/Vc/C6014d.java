package vc;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.M;
import wd.O;

/* renamed from: vc.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6014d implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C6014d f47444a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f47445b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, vc.d, java.lang.Object] */
    static {
        ?? obj = new Object();
        f47444a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.user.impl.api.settings.ApiUserSettingsDelete", obj, 2);
        pluginGeneratedSerialDescriptor.k("gizmoId", false);
        pluginGeneratedSerialDescriptor.k("deleteAll", true);
        f47445b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(M.f48360a), C2701g.f28450a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        O o10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f47445b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        String str = null;
        int i10 = 0;
        boolean z11 = false;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        z11 = c10.q(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
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
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C6016f(i10, str, z11);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f47445b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        O o10;
        C6016f c6016f = (C6016f) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c6016f);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f47445b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        M m10 = M.f48360a;
        String str = c6016f.f47446a;
        if (str != null) {
            o10 = new O(str);
        } else {
            o10 = null;
        }
        c10.q(pluginGeneratedSerialDescriptor, 0, m10, o10);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = c6016f.f47447b;
        if (C10 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 1, z10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

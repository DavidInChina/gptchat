package O9;

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

/* renamed from: O9.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1105g0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1105g0 f13537a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13538b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, O9.g0] */
    static {
        ?? obj = new Object();
        f13537a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiJitPluginData.FromServer.JitBody.Action", obj, 6);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("oauthRedirect", true);
        pluginGeneratedSerialDescriptor.k("allow", true);
        pluginGeneratedSerialDescriptor.k("alwaysAllow", true);
        pluginGeneratedSerialDescriptor.k("deny", true);
        f13538b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(C1126r0.f13586a), A7.b.U0(C1107h0.f13542a), A7.b.U0(C1113k0.f13548a), A7.b.U0(C1121o0.f13567a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13538b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        int i10 = 0;
        String str = null;
        String str2 = null;
        C1130t0 c1130t0 = null;
        C1111j0 c1111j0 = null;
        C1117m0 c1117m0 = null;
        C1125q0 c1125q0 = null;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, dh.u0.f28491a, str);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str2);
                    i10 |= 2;
                    break;
                case 2:
                    c1130t0 = (C1130t0) c10.v(pluginGeneratedSerialDescriptor, 2, C1126r0.f13586a, c1130t0);
                    i10 |= 4;
                    break;
                case 3:
                    c1111j0 = (C1111j0) c10.v(pluginGeneratedSerialDescriptor, 3, C1107h0.f13542a, c1111j0);
                    i10 |= 8;
                    break;
                case 4:
                    c1117m0 = (C1117m0) c10.v(pluginGeneratedSerialDescriptor, 4, C1113k0.f13548a, c1117m0);
                    i10 |= 16;
                    break;
                case 5:
                    c1125q0 = (C1125q0) c10.v(pluginGeneratedSerialDescriptor, 5, C1121o0.f13567a, c1125q0);
                    i10 |= 32;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1132u0(i10, str, str2, c1130t0, c1111j0, c1117m0, c1125q0);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13538b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1132u0 c1132u0 = (C1132u0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1132u0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13538b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        dh.u0 u0Var = dh.u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 0, u0Var, c1132u0.f13598a);
        c10.q(pluginGeneratedSerialDescriptor, 1, u0Var, c1132u0.f13599b);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        C1130t0 c1130t0 = c1132u0.f13600c;
        if (C10 || c1130t0 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C1126r0.f13586a, c1130t0);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        C1111j0 c1111j0 = c1132u0.f13601d;
        if (C11 || c1111j0 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, C1107h0.f13542a, c1111j0);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        C1117m0 c1117m0 = c1132u0.f13602e;
        if (C12 || c1117m0 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 4, C1113k0.f13548a, c1117m0);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        C1125q0 c1125q0 = c1132u0.f13603f;
        if (C13 || c1125q0 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 5, C1121o0.f13567a, c1125q0);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

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
import wd.C6178a0;
import wd.C6182c0;

/* renamed from: O9.r0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1126r0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1126r0 f13586a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13587b;

    /* JADX WARN: Type inference failed for: r0v0, types: [O9.r0, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f13586a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiJitPluginData.FromServer.JitBody.Action.OauthAction", obj, 4);
        pluginGeneratedSerialDescriptor.k("gizmoId", true);
        pluginGeneratedSerialDescriptor.k("gizmoActionId", true);
        pluginGeneratedSerialDescriptor.k("domain", true);
        pluginGeneratedSerialDescriptor.k("targetMessageId", true);
        f13587b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer U02 = A7.b.U0(wd.M.f48360a);
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{U02, A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(C6178a0.f48382a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6182c0 c6182c0;
        wd.O o10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13587b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                C6178a0 c6178a0 = C6178a0.f48382a;
                                if (str4 != null) {
                                    c6182c0 = new C6182c0(str4);
                                } else {
                                    c6182c0 = null;
                                }
                                C6182c0 c6182c02 = (C6182c0) c10.v(pluginGeneratedSerialDescriptor, 3, c6178a0, c6182c0);
                                if (c6182c02 != null) {
                                    str4 = c6182c02.f48393Y;
                                } else {
                                    str4 = null;
                                }
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, dh.u0.f28491a, str3);
                            i10 |= 4;
                        }
                    } else {
                        str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str2);
                        i10 |= 2;
                    }
                } else {
                    wd.M m10 = wd.M.f48360a;
                    if (str != null) {
                        o10 = new wd.O(str);
                    } else {
                        o10 = null;
                    }
                    wd.O o11 = (wd.O) c10.v(pluginGeneratedSerialDescriptor, 0, m10, o10);
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
        return new C1130t0(i10, str, str2, str3, str4);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13587b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wd.O o10;
        C1130t0 c1130t0 = (C1130t0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1130t0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13587b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c1130t0.f13594a;
        C6182c0 c6182c0 = null;
        if (C10 || str != null) {
            wd.M m10 = wd.M.f48360a;
            if (str != null) {
                o10 = new wd.O(str);
            } else {
                o10 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 0, m10, o10);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c1130t0.f13595b;
        if (C11 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str2);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str3 = c1130t0.f13596c;
        if (C12 || str3 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, dh.u0.f28491a, str3);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        String str4 = c1130t0.f13597d;
        if (C13 || str4 != null) {
            C6178a0 c6178a0 = C6178a0.f48382a;
            if (str4 != null) {
                c6182c0 = new C6182c0(str4);
            }
            c10.q(pluginGeneratedSerialDescriptor, 3, c6178a0, c6182c0);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

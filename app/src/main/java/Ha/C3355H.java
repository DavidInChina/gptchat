package ha;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6178a0;
import wd.C6182c0;

/* renamed from: ha.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3355H implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C3355H f32009a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f32010b;

    /* JADX WARN: Type inference failed for: r0v0, types: [ha.H, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f32009a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.metadata.CustomActionCall.Action.OauthAction", obj, 5);
        pluginGeneratedSerialDescriptor.k("actionType", true);
        pluginGeneratedSerialDescriptor.k("gizmoId", true);
        pluginGeneratedSerialDescriptor.k("gizmoActionId", true);
        pluginGeneratedSerialDescriptor.k("domain", true);
        pluginGeneratedSerialDescriptor.k("targetMessageId", false);
        f32010b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{A7.b.U0(u0Var), A7.b.U0(wd.M.f48360a), A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(C6178a0.f48382a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6182c0 c6182c0;
        wd.O o10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32010b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    C6178a0 c6178a0 = C6178a0.f48382a;
                                    if (str5 != null) {
                                        c6182c0 = new C6182c0(str5);
                                    } else {
                                        c6182c0 = null;
                                    }
                                    C6182c0 c6182c02 = (C6182c0) c10.v(pluginGeneratedSerialDescriptor, 4, c6178a0, c6182c0);
                                    if (c6182c02 != null) {
                                        str5 = c6182c02.f48393Y;
                                    } else {
                                        str5 = null;
                                    }
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                str4 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str4);
                                i10 |= 8;
                            }
                        } else {
                            str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str3);
                            i10 |= 4;
                        }
                    } else {
                        wd.M m10 = wd.M.f48360a;
                        if (str2 != null) {
                            o10 = new wd.O(str2);
                        } else {
                            o10 = null;
                        }
                        wd.O o11 = (wd.O) c10.v(pluginGeneratedSerialDescriptor, 1, m10, o10);
                        if (o11 != null) {
                            str2 = o11.f48362a;
                        } else {
                            str2 = null;
                        }
                        i10 |= 2;
                    }
                } else {
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C3357J(i10, str, str2, str3, str4, str5);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f32010b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wd.O o10;
        C3357J c3357j = (C3357J) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c3357j);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32010b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c3357j.f32011a;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c3357j.f32012b;
        C6182c0 c6182c0 = null;
        if (C11 || str2 != null) {
            wd.M m10 = wd.M.f48360a;
            if (str2 != null) {
                o10 = new wd.O(str2);
            } else {
                o10 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 1, m10, o10);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str3 = c3357j.f32013c;
        if (C12 || str3 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str3);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        String str4 = c3357j.f32014d;
        if (C13 || str4 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str4);
        }
        C6178a0 c6178a0 = C6178a0.f48382a;
        String str5 = c3357j.f32015e;
        if (str5 != null) {
            c6182c0 = new C6182c0(str5);
        }
        c10.q(pluginGeneratedSerialDescriptor, 4, c6178a0, c6182c0);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

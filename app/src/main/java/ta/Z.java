package ta;

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
import wd.C6166A;
import wd.C6168C;
import wd.C6178a0;
import wd.C6182c0;

/* loaded from: classes2.dex */
public final class Z implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final Z f45885a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f45886b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, ta.Z] */
    static {
        ?? obj = new Object();
        f45885a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.impl.input.RequestHashParameters", obj, 4);
        pluginGeneratedSerialDescriptor.k("accountId", false);
        pluginGeneratedSerialDescriptor.k("deviceId", false);
        pluginGeneratedSerialDescriptor.k("parentMessageId", false);
        pluginGeneratedSerialDescriptor.k("conversationId", false);
        f45886b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{A7.b.U0(u0Var), u0Var, A7.b.U0(C6178a0.f48382a), A7.b.U0(C6166A.f48310a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6168C c6168c;
        C6182c0 c6182c0;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f45886b;
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
                                C6166A c6166a = C6166A.f48310a;
                                if (str4 != null) {
                                    c6168c = new C6168C(str4);
                                } else {
                                    c6168c = null;
                                }
                                C6168C c6168c2 = (C6168C) c10.v(pluginGeneratedSerialDescriptor, 3, c6166a, c6168c);
                                if (c6168c2 != null) {
                                    str4 = c6168c2.f48321a;
                                } else {
                                    str4 = null;
                                }
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            C6178a0 c6178a0 = C6178a0.f48382a;
                            if (str3 != null) {
                                c6182c0 = new C6182c0(str3);
                            } else {
                                c6182c0 = null;
                            }
                            C6182c0 c6182c02 = (C6182c0) c10.v(pluginGeneratedSerialDescriptor, 2, c6178a0, c6182c0);
                            if (c6182c02 != null) {
                                str3 = c6182c02.f48393Y;
                            } else {
                                str3 = null;
                            }
                            i10 |= 4;
                        }
                    } else {
                        str2 = c10.r(pluginGeneratedSerialDescriptor, 1);
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
        return new b0(i10, str, str2, str3, str4);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f45886b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6182c0 c6182c0;
        b0 b0Var = (b0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", b0Var);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f45886b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 0, u0.f28491a, b0Var.f45903a);
        c10.z(1, b0Var.f45904b, pluginGeneratedSerialDescriptor);
        C6178a0 c6178a0 = C6178a0.f48382a;
        C6168C c6168c = null;
        String str = b0Var.f45905c;
        if (str != null) {
            c6182c0 = new C6182c0(str);
        } else {
            c6182c0 = null;
        }
        c10.q(pluginGeneratedSerialDescriptor, 2, c6178a0, c6182c0);
        C6166A c6166a = C6166A.f48310a;
        String str2 = b0Var.f45906d;
        if (str2 != null) {
            c6168c = new C6168C(str2);
        }
        c10.q(pluginGeneratedSerialDescriptor, 3, c6166a, c6168c);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

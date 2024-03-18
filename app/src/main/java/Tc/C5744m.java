package tc;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6191h;
import wd.C6195j;
import wd.C6203p;

/* renamed from: tc.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5744m implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C5744m f46090a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f46091b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, tc.m, java.lang.Object] */
    static {
        ?? obj = new Object();
        f46090a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.user.impl.api.account.AccountStatusResponseAccount", obj, 7);
        pluginGeneratedSerialDescriptor.k("accountUserId", false);
        pluginGeneratedSerialDescriptor.k("accountId", false);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("structure", false);
        pluginGeneratedSerialDescriptor.k("planType", false);
        pluginGeneratedSerialDescriptor.k("isDeactivated", false);
        pluginGeneratedSerialDescriptor.k("profilePictureUrl", true);
        f46091b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer U02 = A7.b.U0(C6203p.f48447a);
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{U02, C6191h.f48420a, A7.b.U0(u0Var), u0Var, u0Var, C2701g.f28450a, A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        wd.r rVar;
        C6195j c6195j;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46091b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    C6203p c6203p = C6203p.f48447a;
                    if (str != null) {
                        rVar = new wd.r(str);
                    } else {
                        rVar = null;
                    }
                    wd.r rVar2 = (wd.r) c10.v(pluginGeneratedSerialDescriptor, 0, c6203p, rVar);
                    if (rVar2 != null) {
                        str = rVar2.f48451a;
                    } else {
                        str = null;
                    }
                    i10 |= 1;
                    break;
                case 1:
                    C6191h c6191h = C6191h.f48420a;
                    if (str2 != null) {
                        c6195j = new C6195j(str2);
                    } else {
                        c6195j = null;
                    }
                    C6195j c6195j2 = (C6195j) c10.n(pluginGeneratedSerialDescriptor, 1, c6191h, c6195j);
                    if (c6195j2 != null) {
                        str2 = c6195j2.f48426a;
                    } else {
                        str2 = null;
                    }
                    i10 |= 2;
                    break;
                case 2:
                    str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str3);
                    i10 |= 4;
                    break;
                case 3:
                    str4 = c10.r(pluginGeneratedSerialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    str5 = c10.r(pluginGeneratedSerialDescriptor, 4);
                    i10 |= 16;
                    break;
                case 5:
                    z11 = c10.q(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                case 6:
                    str6 = (String) c10.v(pluginGeneratedSerialDescriptor, 6, u0.f28491a, str6);
                    i10 |= 64;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C5746o(i10, str, str2, str3, str4, str5, z11, str6);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f46091b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wd.r rVar;
        C5746o c5746o = (C5746o) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c5746o);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46091b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C6203p c6203p = C6203p.f48447a;
        String str = c5746o.f46092a;
        if (str != null) {
            rVar = new wd.r(str);
        } else {
            rVar = null;
        }
        c10.q(pluginGeneratedSerialDescriptor, 0, c6203p, rVar);
        c10.i(pluginGeneratedSerialDescriptor, 1, C6191h.f48420a, new C6195j(c5746o.f46093b));
        u0 u0Var = u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, c5746o.f46094c);
        c10.z(3, c5746o.f46095d, pluginGeneratedSerialDescriptor);
        c10.z(4, c5746o.f46096e, pluginGeneratedSerialDescriptor);
        c10.p(pluginGeneratedSerialDescriptor, 5, c5746o.f46097f);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c5746o.f46098g;
        if (C10 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 6, u0Var, str2);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

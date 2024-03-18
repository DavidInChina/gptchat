package Za;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: Za.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1841d implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1841d f23547a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23548b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Za.d, java.lang.Object] */
    static {
        ?? obj = new Object();
        f23547a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmo", obj, 10);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("display", false);
        pluginGeneratedSerialDescriptor.k("model", false);
        pluginGeneratedSerialDescriptor.k("author", false);
        pluginGeneratedSerialDescriptor.k("instructions", false);
        pluginGeneratedSerialDescriptor.k("tags", true);
        pluginGeneratedSerialDescriptor.k("lastInteractionTime", false);
        pluginGeneratedSerialDescriptor.k("noLongerAvailable", false);
        pluginGeneratedSerialDescriptor.k("vanityMetrics", false);
        pluginGeneratedSerialDescriptor.k("shareRecipient", false);
        f23548b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1863o.f23584k;
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{u0Var, C1851i.f23562a, A7.b.U0(u0Var), A7.b.U0(C1835a.f23534a), A7.b.U0(u0Var), kSerializerArr[5], A7.b.U0(dh.S.f28417a), A7.b.U0(C2701g.f28450a), A7.b.U0(C1857l.f23573a), A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23548b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1863o.f23584k;
        C1861n c1861n = null;
        String str = null;
        String str2 = null;
        C1855k c1855k = null;
        String str3 = null;
        C1839c c1839c = null;
        String str4 = null;
        List list = null;
        Long l10 = null;
        Boolean bool = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    str2 = c10.r(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    c1855k = (C1855k) c10.n(pluginGeneratedSerialDescriptor, 1, C1851i.f23562a, c1855k);
                    i10 |= 2;
                    break;
                case 2:
                    str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, dh.u0.f28491a, str3);
                    i10 |= 4;
                    break;
                case 3:
                    c1839c = (C1839c) c10.v(pluginGeneratedSerialDescriptor, 3, C1835a.f23534a, c1839c);
                    i10 |= 8;
                    break;
                case 4:
                    str4 = (String) c10.v(pluginGeneratedSerialDescriptor, 4, dh.u0.f28491a, str4);
                    i10 |= 16;
                    break;
                case 5:
                    list = (List) c10.n(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list);
                    i10 |= 32;
                    break;
                case 6:
                    l10 = (Long) c10.v(pluginGeneratedSerialDescriptor, 6, dh.S.f28417a, l10);
                    i10 |= 64;
                    break;
                case 7:
                    bool = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 7, C2701g.f28450a, bool);
                    i10 |= 128;
                    break;
                case 8:
                    c1861n = (C1861n) c10.v(pluginGeneratedSerialDescriptor, 8, C1857l.f23573a, c1861n);
                    i10 |= 256;
                    break;
                case 9:
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 9, dh.u0.f28491a, str);
                    i10 |= 512;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1863o(i10, str2, c1855k, str3, c1839c, str4, list, l10, bool, c1861n, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23548b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1863o c1863o = (C1863o) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1863o);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23548b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c1863o.f23585a, pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 1, C1851i.f23562a, c1863o.f23586b);
        dh.u0 u0Var = dh.u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, c1863o.f23587c);
        c10.q(pluginGeneratedSerialDescriptor, 3, C1835a.f23534a, c1863o.f23588d);
        c10.q(pluginGeneratedSerialDescriptor, 4, u0Var, c1863o.f23589e);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        List list = c1863o.f23590f;
        if (C10 || !AbstractC3557B.K(list, kf.v.f37483Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 5, C1863o.f23584k[5], list);
        }
        c10.q(pluginGeneratedSerialDescriptor, 6, dh.S.f28417a, c1863o.f23591g);
        c10.q(pluginGeneratedSerialDescriptor, 7, C2701g.f28450a, c1863o.f23592h);
        c10.q(pluginGeneratedSerialDescriptor, 8, C1857l.f23573a, c1863o.f23593i);
        c10.q(pluginGeneratedSerialDescriptor, 9, u0Var, c1863o.f23594j);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

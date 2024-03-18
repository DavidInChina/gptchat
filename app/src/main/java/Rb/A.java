package Rb;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2695d;
import dh.C2701g;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class A implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final A f15246a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f15247b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Rb.A, java.lang.Object] */
    static {
        ?? obj = new Object();
        f15246a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.reporting.ReportContentReason", obj, 10);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("cta", false);
        pluginGeneratedSerialDescriptor.k("explanation", false);
        pluginGeneratedSerialDescriptor.k("subReasons", false);
        pluginGeneratedSerialDescriptor.k("hasDetails", false);
        pluginGeneratedSerialDescriptor.k("detailsPlaceholder", true);
        pluginGeneratedSerialDescriptor.k("linkExplanation", true);
        pluginGeneratedSerialDescriptor.k("linkAttachment", true);
        pluginGeneratedSerialDescriptor.k("subtext", true);
        pluginGeneratedSerialDescriptor.k("additionalFields", true);
        f15247b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C.f15248k;
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, u0Var, A7.b.U0(u0Var), new C2695d(f15246a, 0), C2701g.f28450a, A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(u0Var), kSerializerArr[9]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        boolean z10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15247b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C.f15248k;
        A a5 = f15246a;
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list2 = null;
        String str6 = null;
        String str7 = null;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = true;
        while (z12) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = z11;
                    z12 = false;
                    break;
                case 0:
                    z10 = z11;
                    str3 = c10.r(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    str4 = c10.r(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    continue;
                case 2:
                    z10 = z11;
                    str5 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str5);
                    i10 |= 4;
                    break;
                case 3:
                    z10 = z11;
                    list2 = (List) c10.n(pluginGeneratedSerialDescriptor, 3, new C2695d(a5, 0), list2);
                    i10 |= 8;
                    break;
                case 4:
                    z11 = c10.q(pluginGeneratedSerialDescriptor, 4);
                    i10 |= 16;
                    continue;
                case 5:
                    z10 = z11;
                    str6 = (String) c10.v(pluginGeneratedSerialDescriptor, 5, u0.f28491a, str6);
                    i10 |= 32;
                    break;
                case 6:
                    z10 = z11;
                    str7 = (String) c10.v(pluginGeneratedSerialDescriptor, 6, u0.f28491a, str7);
                    i10 |= 64;
                    break;
                case 7:
                    z10 = z11;
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 7, u0.f28491a, str);
                    i10 |= 128;
                    break;
                case 8:
                    z10 = z11;
                    str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 8, u0.f28491a, str2);
                    i10 |= 256;
                    break;
                case 9:
                    z10 = z11;
                    list = (List) c10.n(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], list);
                    i10 |= 512;
                    break;
                default:
                    throw new C2004o(t10);
            }
            z11 = z10;
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C(i10, str3, str4, str5, list2, z11, str6, str7, str, str2, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f15247b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C c10 = (C) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15247b;
        AbstractC2431b c11 = encoder.c(pluginGeneratedSerialDescriptor);
        c11.z(0, c10.f15249a, pluginGeneratedSerialDescriptor);
        c11.z(1, c10.f15250b, pluginGeneratedSerialDescriptor);
        u0 u0Var = u0.f28491a;
        c11.q(pluginGeneratedSerialDescriptor, 2, u0Var, c10.f15251c);
        c11.i(pluginGeneratedSerialDescriptor, 3, new C2695d(f15246a, 0), c10.f15252d);
        c11.p(pluginGeneratedSerialDescriptor, 4, c10.f15253e);
        boolean C10 = c11.C(pluginGeneratedSerialDescriptor);
        String str = c10.f15254f;
        if (C10 || str != null) {
            c11.q(pluginGeneratedSerialDescriptor, 5, u0Var, str);
        }
        boolean C11 = c11.C(pluginGeneratedSerialDescriptor);
        String str2 = c10.f15255g;
        if (C11 || str2 != null) {
            c11.q(pluginGeneratedSerialDescriptor, 6, u0Var, str2);
        }
        boolean C12 = c11.C(pluginGeneratedSerialDescriptor);
        String str3 = c10.f15256h;
        if (C12 || str3 != null) {
            c11.q(pluginGeneratedSerialDescriptor, 7, u0Var, str3);
        }
        boolean C13 = c11.C(pluginGeneratedSerialDescriptor);
        String str4 = c10.f15257i;
        if (C13 || str4 != null) {
            c11.q(pluginGeneratedSerialDescriptor, 8, u0Var, str4);
        }
        boolean C14 = c11.C(pluginGeneratedSerialDescriptor);
        List list = c10.f15258j;
        if (C14 || !AbstractC3557B.K(list, kf.v.f37483Y)) {
            c11.i(pluginGeneratedSerialDescriptor, 9, C.f15248k[9], list);
        }
        c11.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

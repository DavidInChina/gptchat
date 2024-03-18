package Rb;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
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

/* renamed from: Rb.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259e implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1259e f15347a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f15348b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Rb.e, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f15347a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.reporting.ReportAdditionalField", obj, 4);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("type", true);
        pluginGeneratedSerialDescriptor.k("placeholder", true);
        pluginGeneratedSerialDescriptor.k(ParameterNames.REQUIRED, true);
        f15348b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C1261g.f15349a, C1265k.f15357e[1], A7.b.U0(u0.f28491a), C2701g.f28450a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C1263i c1263i;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15348b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1265k.f15357e;
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = false;
        String str = null;
        EnumC1264j enumC1264j = null;
        String str2 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                z11 = c10.q(pluginGeneratedSerialDescriptor, 3);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str2);
                            i10 |= 4;
                        }
                    } else {
                        enumC1264j = (EnumC1264j) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], enumC1264j);
                        i10 |= 2;
                    }
                } else {
                    C1261g c1261g = C1261g.f15349a;
                    if (str != null) {
                        c1263i = new C1263i(str);
                    } else {
                        c1263i = null;
                    }
                    C1263i c1263i2 = (C1263i) c10.n(pluginGeneratedSerialDescriptor, 0, c1261g, c1263i);
                    if (c1263i2 != null) {
                        str = c1263i2.f15351a;
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
        return new C1265k(i10, str, enumC1264j, str2, z11);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f15348b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1265k c1265k = (C1265k) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1265k);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15348b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C1260f c1260f = C1265k.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C1261g.f15349a, new C1263i(c1265k.f15358a));
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        EnumC1264j enumC1264j = c1265k.f15359b;
        if (C10 || enumC1264j != EnumC1264j.f15354h0) {
            c10.i(pluginGeneratedSerialDescriptor, 1, C1265k.f15357e[1], enumC1264j);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c1265k.f15360c;
        if (C11 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = c1265k.f15361d;
        if (C12 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 3, z10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

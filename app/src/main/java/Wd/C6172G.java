package wd;

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

/* renamed from: wd.G  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6172G implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C6172G f48335a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f48336b;

    /* JADX WARN: Type inference failed for: r0v0, types: [wd.G, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f48335a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.DalleOperationAssetPointer", obj, 5);
        pluginGeneratedSerialDescriptor.k("type", true);
        pluginGeneratedSerialDescriptor.k("originalAssetPointer", true);
        pluginGeneratedSerialDescriptor.k("maskAssetPointer", true);
        pluginGeneratedSerialDescriptor.k("originalGenId", true);
        pluginGeneratedSerialDescriptor.k("inPaintingImage", true);
        f48336b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C6174I.f48341f[0];
        C6207u c6207u = C6207u.f48466a;
        KSerializer U02 = A7.b.U0(c6207u);
        KSerializer U03 = A7.b.U0(c6207u);
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{kSerializer, U02, U03, A7.b.U0(u0Var), A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6209w c6209w;
        C6209w c6209w2;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48336b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C6174I.f48341f;
        boolean z10 = true;
        int i10 = 0;
        Z z11 = null;
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
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    str4 = (String) c10.v(pluginGeneratedSerialDescriptor, 4, dh.u0.f28491a, str4);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, dh.u0.f28491a, str3);
                                i10 |= 8;
                            }
                        } else {
                            C6207u c6207u = C6207u.f48466a;
                            if (str2 != null) {
                                c6209w = new C6209w(str2);
                            } else {
                                c6209w = null;
                            }
                            C6209w c6209w3 = (C6209w) c10.v(pluginGeneratedSerialDescriptor, 2, c6207u, c6209w);
                            if (c6209w3 != null) {
                                str2 = c6209w3.f48469a;
                            } else {
                                str2 = null;
                            }
                            i10 |= 4;
                        }
                    } else {
                        C6207u c6207u2 = C6207u.f48466a;
                        if (str != null) {
                            c6209w2 = new C6209w(str);
                        } else {
                            c6209w2 = null;
                        }
                        C6209w c6209w4 = (C6209w) c10.v(pluginGeneratedSerialDescriptor, 1, c6207u2, c6209w2);
                        if (c6209w4 != null) {
                            str = c6209w4.f48469a;
                        } else {
                            str = null;
                        }
                        i10 |= 2;
                    }
                } else {
                    z11 = (Z) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], z11);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C6174I(i10, z11, str, str2, str3, str4);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f48336b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6209w c6209w;
        C6174I c6174i = (C6174I) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c6174i);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48336b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C6173H c6173h = C6174I.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Z z10 = c6174i.f48342a;
        if (C10 || z10 != Z.f48378Z) {
            c10.i(pluginGeneratedSerialDescriptor, 0, C6174I.f48341f[0], z10);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c6174i.f48343b;
        C6209w c6209w2 = null;
        if (C11 || str != null) {
            C6207u c6207u = C6207u.f48466a;
            if (str != null) {
                c6209w = new C6209w(str);
            } else {
                c6209w = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 1, c6207u, c6209w);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c6174i.f48344c;
        if (C12 || str2 != null) {
            C6207u c6207u2 = C6207u.f48466a;
            if (str2 != null) {
                c6209w2 = new C6209w(str2);
            }
            c10.q(pluginGeneratedSerialDescriptor, 2, c6207u2, c6209w2);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        String str3 = c6174i.f48345d;
        if (C13 || str3 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, dh.u0.f28491a, str3);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        String str4 = c6174i.f48346e;
        if (C14 || str4 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 4, dh.u0.f28491a, str4);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

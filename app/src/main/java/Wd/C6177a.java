package wd;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import id.AbstractC3557B;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: wd.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6177a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C6177a f48380a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f48381b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, wd.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        f48380a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.Account", obj, 9);
        pluginGeneratedSerialDescriptor.k("accountId", false);
        pluginGeneratedSerialDescriptor.k("accountUserId", true);
        pluginGeneratedSerialDescriptor.k("subscription", true);
        pluginGeneratedSerialDescriptor.k("name", true);
        pluginGeneratedSerialDescriptor.k("structure", true);
        pluginGeneratedSerialDescriptor.k("features", true);
        pluginGeneratedSerialDescriptor.k("planType", true);
        pluginGeneratedSerialDescriptor.k("isDeactivated", true);
        pluginGeneratedSerialDescriptor.k("profilePictureUrl", true);
        f48381b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C6189g.f48403j;
        KSerializer U02 = A7.b.U0(C6203p.f48447a);
        KSerializer U03 = A7.b.U0(z0.f48480a);
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{C6191h.f48420a, U02, U03, A7.b.U0(u0Var), kSerializerArr[4], kSerializerArr[5], A7.b.U0(kSerializerArr[6]), C2701g.f28450a, A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6195j c6195j;
        String str;
        r rVar;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48381b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C6189g.f48403j;
        boolean z10 = true;
        String str2 = null;
        int i10 = 0;
        String str3 = null;
        String str4 = null;
        B0 b02 = null;
        String str5 = null;
        EnumC6187f enumC6187f = null;
        Set set = null;
        EnumC6198k0 enumC6198k0 = null;
        boolean z11 = false;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    C6191h c6191h = C6191h.f48420a;
                    if (str3 != null) {
                        c6195j = new C6195j(str3);
                    } else {
                        c6195j = null;
                    }
                    C6195j c6195j2 = (C6195j) c10.n(pluginGeneratedSerialDescriptor, 0, c6191h, c6195j);
                    if (c6195j2 != null) {
                        str = c6195j2.f48426a;
                    } else {
                        str = null;
                    }
                    i10 |= 1;
                    str3 = str;
                    break;
                case 1:
                    C6203p c6203p = C6203p.f48447a;
                    if (str4 != null) {
                        rVar = new r(str4);
                    } else {
                        rVar = null;
                    }
                    r rVar2 = (r) c10.v(pluginGeneratedSerialDescriptor, 1, c6203p, rVar);
                    if (rVar2 != null) {
                        str4 = rVar2.f48451a;
                    } else {
                        str4 = null;
                    }
                    i10 |= 2;
                    break;
                case 2:
                    b02 = (B0) c10.v(pluginGeneratedSerialDescriptor, 2, z0.f48480a, b02);
                    i10 |= 4;
                    break;
                case 3:
                    str5 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, dh.u0.f28491a, str5);
                    i10 |= 8;
                    break;
                case 4:
                    enumC6187f = (EnumC6187f) c10.n(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], enumC6187f);
                    i10 |= 16;
                    break;
                case 5:
                    set = (Set) c10.n(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], set);
                    i10 |= 32;
                    break;
                case 6:
                    enumC6198k0 = (EnumC6198k0) c10.v(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], enumC6198k0);
                    i10 |= 64;
                    break;
                case 7:
                    z11 = c10.q(pluginGeneratedSerialDescriptor, 7);
                    i10 |= 128;
                    break;
                case 8:
                    str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 8, dh.u0.f28491a, str2);
                    i10 |= 256;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C6189g(i10, str3, str4, b02, str5, enumC6187f, set, enumC6198k0, z11, str2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f48381b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r rVar;
        C6189g c6189g = (C6189g) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c6189g);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48381b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C6179b c6179b = C6189g.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C6191h.f48420a, new C6195j(c6189g.f48410a));
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c6189g.f48411b;
        if (C10 || str != null) {
            C6203p c6203p = C6203p.f48447a;
            if (str != null) {
                rVar = new r(str);
            } else {
                rVar = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 1, c6203p, rVar);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        B0 b02 = c6189g.f48412c;
        if (C11 || b02 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, z0.f48480a, b02);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c6189g.f48413d;
        if (C12 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, dh.u0.f28491a, str2);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C6189g.f48403j;
        EnumC6187f enumC6187f = c6189g.f48414e;
        if (C13 || enumC6187f != EnumC6187f.f48399Z) {
            c10.i(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], enumC6187f);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        Set set = c6189g.f48415f;
        if (C14 || !AbstractC3557B.K(set, kf.x.f37485Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], set);
        }
        boolean C15 = c10.C(pluginGeneratedSerialDescriptor);
        EnumC6198k0 enumC6198k0 = c6189g.f48416g;
        if (C15 || enumC6198k0 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], enumC6198k0);
        }
        boolean C16 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = c6189g.f48417h;
        if (C16 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 7, z10);
        }
        boolean C17 = c10.C(pluginGeneratedSerialDescriptor);
        String str3 = c6189g.f48418i;
        if (C17 || str3 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 8, dh.u0.f28491a, str3);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

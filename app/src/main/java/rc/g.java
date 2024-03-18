package Rc;

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
import wd.C6186e0;
import wd.C6190g0;

/* loaded from: classes.dex */
public final class g implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final g f15394a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f15395b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Rc.g] */
    static {
        ?? obj = new Object();
        f15394a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.models.api.ModelsResponseCategory", obj, 9);
        pluginGeneratedSerialDescriptor.k("category", false);
        pluginGeneratedSerialDescriptor.k("humanCategoryName", false);
        pluginGeneratedSerialDescriptor.k("subscriptionLevel", false);
        pluginGeneratedSerialDescriptor.k("defaultModel", false);
        pluginGeneratedSerialDescriptor.k("browsingModel", true);
        pluginGeneratedSerialDescriptor.k("codeInterpreterModel", true);
        pluginGeneratedSerialDescriptor.k("pluginsModel", true);
        pluginGeneratedSerialDescriptor.k("multimodalModel", true);
        pluginGeneratedSerialDescriptor.k("dalleModel", true);
        f15395b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        C6186e0 c6186e0 = C6186e0.f48396a;
        KSerializer U02 = A7.b.U0(c6186e0);
        KSerializer U03 = A7.b.U0(c6186e0);
        KSerializer U04 = A7.b.U0(c6186e0);
        KSerializer U05 = A7.b.U0(c6186e0);
        KSerializer U06 = A7.b.U0(c6186e0);
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, u0Var, u0Var, c6186e0, U02, U03, U04, U05, U06};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6190g0 c6190g0;
        C6190g0 c6190g02;
        C6190g0 c6190g03;
        C6190g0 c6190g04;
        C6190g0 c6190g05;
        C6190g0 c6190g06;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15395b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        String str = null;
        int i10 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
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
                    str3 = c10.r(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    str4 = c10.r(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    C6186e0 c6186e0 = C6186e0.f48396a;
                    if (str5 != null) {
                        c6190g02 = new C6190g0(str5);
                    } else {
                        c6190g02 = null;
                    }
                    C6190g0 c6190g07 = (C6190g0) c10.n(pluginGeneratedSerialDescriptor, 3, c6186e0, c6190g02);
                    if (c6190g07 != null) {
                        str5 = c6190g07.f48419a;
                    } else {
                        str5 = null;
                    }
                    i10 |= 8;
                    break;
                case 4:
                    C6186e0 c6186e02 = C6186e0.f48396a;
                    if (str6 != null) {
                        c6190g03 = new C6190g0(str6);
                    } else {
                        c6190g03 = null;
                    }
                    C6190g0 c6190g08 = (C6190g0) c10.v(pluginGeneratedSerialDescriptor, 4, c6186e02, c6190g03);
                    if (c6190g08 != null) {
                        str6 = c6190g08.f48419a;
                    } else {
                        str6 = null;
                    }
                    i10 |= 16;
                    break;
                case 5:
                    C6186e0 c6186e03 = C6186e0.f48396a;
                    if (str7 != null) {
                        c6190g04 = new C6190g0(str7);
                    } else {
                        c6190g04 = null;
                    }
                    C6190g0 c6190g09 = (C6190g0) c10.v(pluginGeneratedSerialDescriptor, 5, c6186e03, c6190g04);
                    if (c6190g09 != null) {
                        str7 = c6190g09.f48419a;
                    } else {
                        str7 = null;
                    }
                    i10 |= 32;
                    break;
                case 6:
                    C6186e0 c6186e04 = C6186e0.f48396a;
                    if (str8 != null) {
                        c6190g05 = new C6190g0(str8);
                    } else {
                        c6190g05 = null;
                    }
                    C6190g0 c6190g010 = (C6190g0) c10.v(pluginGeneratedSerialDescriptor, 6, c6186e04, c6190g05);
                    if (c6190g010 != null) {
                        str8 = c6190g010.f48419a;
                    } else {
                        str8 = null;
                    }
                    i10 |= 64;
                    break;
                case 7:
                    C6186e0 c6186e05 = C6186e0.f48396a;
                    if (str9 != null) {
                        c6190g06 = new C6190g0(str9);
                    } else {
                        c6190g06 = null;
                    }
                    C6190g0 c6190g011 = (C6190g0) c10.v(pluginGeneratedSerialDescriptor, 7, c6186e05, c6190g06);
                    if (c6190g011 != null) {
                        str9 = c6190g011.f48419a;
                    } else {
                        str9 = null;
                    }
                    i10 |= 128;
                    break;
                case 8:
                    C6186e0 c6186e06 = C6186e0.f48396a;
                    if (str != null) {
                        c6190g0 = new C6190g0(str);
                    } else {
                        c6190g0 = null;
                    }
                    C6190g0 c6190g012 = (C6190g0) c10.v(pluginGeneratedSerialDescriptor, 8, c6186e06, c6190g0);
                    if (c6190g012 != null) {
                        str = c6190g012.f48419a;
                    } else {
                        str = null;
                    }
                    i10 |= 256;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new i(i10, str2, str3, str4, str5, str6, str7, str8, str9, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f15395b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6190g0 c6190g0;
        C6190g0 c6190g02;
        C6190g0 c6190g03;
        C6190g0 c6190g04;
        i iVar = (i) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", iVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15395b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, iVar.f15396a, pluginGeneratedSerialDescriptor);
        c10.z(1, iVar.f15397b, pluginGeneratedSerialDescriptor);
        c10.z(2, iVar.f15398c, pluginGeneratedSerialDescriptor);
        C6186e0 c6186e0 = C6186e0.f48396a;
        c10.i(pluginGeneratedSerialDescriptor, 3, c6186e0, new C6190g0(iVar.f15399d));
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        C6190g0 c6190g05 = null;
        String str = iVar.f15400e;
        if (C10 || str != null) {
            if (str != null) {
                c6190g04 = new C6190g0(str);
            } else {
                c6190g04 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 4, c6186e0, c6190g04);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = iVar.f15401f;
        if (C11 || str2 != null) {
            if (str2 != null) {
                c6190g03 = new C6190g0(str2);
            } else {
                c6190g03 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 5, c6186e0, c6190g03);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str3 = iVar.f15402g;
        if (C12 || str3 != null) {
            if (str3 != null) {
                c6190g02 = new C6190g0(str3);
            } else {
                c6190g02 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 6, c6186e0, c6190g02);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        String str4 = iVar.f15403h;
        if (C13 || str4 != null) {
            if (str4 != null) {
                c6190g0 = new C6190g0(str4);
            } else {
                c6190g0 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 7, c6186e0, c6190g0);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        String str5 = iVar.f15404i;
        if (C14 || str5 != null) {
            if (str5 != null) {
                c6190g05 = new C6190g0(str5);
            }
            c10.q(pluginGeneratedSerialDescriptor, 8, c6186e0, c6190g05);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

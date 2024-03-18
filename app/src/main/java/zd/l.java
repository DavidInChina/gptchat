package zd;

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

/* loaded from: classes.dex */
public final class l implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final l f51979a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f51980b;

    /* JADX WARN: Type inference failed for: r0v0, types: [zd.l, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f51979a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.user.model.UserSettings", obj, 12);
        pluginGeneratedSerialDescriptor.k("historyDisabled", true);
        pluginGeneratedSerialDescriptor.k("languageCode", true);
        pluginGeneratedSerialDescriptor.k("nightMode", true);
        pluginGeneratedSerialDescriptor.k("seenDisclosures", true);
        pluginGeneratedSerialDescriptor.k("seenCustomInstructionsIntroduction", true);
        pluginGeneratedSerialDescriptor.k("seenVisionDisclosure", true);
        pluginGeneratedSerialDescriptor.k("seenMemoryDisclosure", true);
        pluginGeneratedSerialDescriptor.k("hasSeenVoiceDisclosure", true);
        pluginGeneratedSerialDescriptor.k("hasSeenVoiceIntro", true);
        pluginGeneratedSerialDescriptor.k("hasSeenVoiceSelection", true);
        pluginGeneratedSerialDescriptor.k("lastShownTooltipText", true);
        pluginGeneratedSerialDescriptor.k("hapticEnabled", true);
        f51980b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = n.f51981m;
        u0 u0Var = u0.f28491a;
        KSerializer U02 = A7.b.U0(u0Var);
        KSerializer kSerializer = kSerializerArr[2];
        KSerializer U03 = A7.b.U0(u0Var);
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{c2701g, U02, kSerializer, c2701g, c2701g, c2701g, c2701g, c2701g, c2701g, c2701g, U03, c2701g};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f51980b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = n.f51981m;
        String str = null;
        String str2 = null;
        d dVar = null;
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    z11 = c10.q(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str2);
                    i10 |= 2;
                    break;
                case 2:
                    dVar = (d) c10.n(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], dVar);
                    i10 |= 4;
                    break;
                case 3:
                    z12 = c10.q(pluginGeneratedSerialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    z13 = c10.q(pluginGeneratedSerialDescriptor, 4);
                    i10 |= 16;
                    break;
                case 5:
                    z14 = c10.q(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                case 6:
                    z15 = c10.q(pluginGeneratedSerialDescriptor, 6);
                    i10 |= 64;
                    break;
                case 7:
                    z16 = c10.q(pluginGeneratedSerialDescriptor, 7);
                    i10 |= 128;
                    break;
                case 8:
                    z17 = c10.q(pluginGeneratedSerialDescriptor, 8);
                    i10 |= 256;
                    break;
                case 9:
                    z18 = c10.q(pluginGeneratedSerialDescriptor, 9);
                    i10 |= 512;
                    break;
                case 10:
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 10, u0.f28491a, str);
                    i10 |= 1024;
                    break;
                case 11:
                    z19 = c10.q(pluginGeneratedSerialDescriptor, 11);
                    i10 |= 2048;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new n(i10, z11, str2, dVar, z12, z13, z14, z15, z16, z17, z18, str, z19);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f51980b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n nVar = (n) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", nVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f51980b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        m mVar = n.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = nVar.f51982a;
        if (C10 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 0, z10);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str = nVar.f51983b;
        if (C11 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        d dVar = nVar.f51984c;
        if (C12 || dVar != d.f51960Y) {
            c10.i(pluginGeneratedSerialDescriptor, 2, n.f51981m[2], dVar);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z11 = nVar.f51985d;
        if (C13 || z11) {
            c10.p(pluginGeneratedSerialDescriptor, 3, z11);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z12 = nVar.f51986e;
        if (C14 || z12) {
            c10.p(pluginGeneratedSerialDescriptor, 4, z12);
        }
        boolean C15 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z13 = nVar.f51987f;
        if (C15 || z13) {
            c10.p(pluginGeneratedSerialDescriptor, 5, z13);
        }
        boolean C16 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z14 = nVar.f51988g;
        if (C16 || z14) {
            c10.p(pluginGeneratedSerialDescriptor, 6, z14);
        }
        boolean C17 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z15 = nVar.f51989h;
        if (C17 || z15) {
            c10.p(pluginGeneratedSerialDescriptor, 7, z15);
        }
        boolean C18 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z16 = nVar.f51990i;
        if (C18 || z16) {
            c10.p(pluginGeneratedSerialDescriptor, 8, z16);
        }
        boolean C19 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z17 = nVar.f51991j;
        if (C19 || z17) {
            c10.p(pluginGeneratedSerialDescriptor, 9, z17);
        }
        boolean C20 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = nVar.f51992k;
        if (C20 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 10, u0.f28491a, str2);
        }
        boolean C21 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z18 = nVar.f51993l;
        if (C21 || !z18) {
            c10.p(pluginGeneratedSerialDescriptor, 11, z18);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

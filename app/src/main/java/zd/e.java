package zd;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import dh.u0;
import id.AbstractC3557B;
import java.util.Set;
import kf.x;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class e implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final e f51962a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f51963b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, zd.e, java.lang.Object] */
    static {
        ?? obj = new Object();
        f51962a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.user.model.RemoteUserSettings", obj, 8);
        pluginGeneratedSerialDescriptor.k("memory", true);
        pluginGeneratedSerialDescriptor.k("trainingAllowed", true);
        pluginGeneratedSerialDescriptor.k("voiceTrainingAllowed", true);
        pluginGeneratedSerialDescriptor.k("betaSettings", true);
        pluginGeneratedSerialDescriptor.k("voiceName", true);
        pluginGeneratedSerialDescriptor.k("voiceMainLanguage", true);
        pluginGeneratedSerialDescriptor.k("announcements", true);
        pluginGeneratedSerialDescriptor.k("eligibleAnnouncements", true);
        f51963b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = g.f51964i;
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{A7.b.U0(c2701g), A7.b.U0(c2701g), A7.b.U0(c2701g), A7.b.U0(C6841a.f51957a), A7.b.U0(kSerializerArr[4]), A7.b.U0(u0.f28491a), kSerializerArr[6], kSerializerArr[7]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f51963b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = g.f51964i;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        c cVar = null;
        q qVar = null;
        String str = null;
        Set set = null;
        Set set2 = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    bool = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 0, C2701g.f28450a, bool);
                    i10 |= 1;
                    break;
                case 1:
                    bool2 = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 1, C2701g.f28450a, bool2);
                    i10 |= 2;
                    break;
                case 2:
                    bool3 = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 2, C2701g.f28450a, bool3);
                    i10 |= 4;
                    break;
                case 3:
                    cVar = (c) c10.v(pluginGeneratedSerialDescriptor, 3, C6841a.f51957a, cVar);
                    i10 |= 8;
                    break;
                case 4:
                    qVar = (q) c10.v(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], qVar);
                    i10 |= 16;
                    break;
                case 5:
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 5, u0.f28491a, str);
                    i10 |= 32;
                    break;
                case 6:
                    set = (Set) c10.n(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], set);
                    i10 |= 64;
                    break;
                case 7:
                    set2 = (Set) c10.n(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], set2);
                    i10 |= 128;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new g(i10, bool, bool2, bool3, cVar, qVar, str, set, set2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f51963b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g gVar = (g) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", gVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f51963b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        f fVar = g.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool = gVar.f51965a;
        if (C10 || bool != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, C2701g.f28450a, bool);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool2 = gVar.f51966b;
        if (C11 || bool2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, C2701g.f28450a, bool2);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool3 = gVar.f51967c;
        if (C12 || bool3 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C2701g.f28450a, bool3);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        c cVar = gVar.f51968d;
        if (C13 || cVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, C6841a.f51957a, cVar);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = g.f51964i;
        q qVar = gVar.f51969e;
        if (C14 || qVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], qVar);
        }
        boolean C15 = c10.C(pluginGeneratedSerialDescriptor);
        String str = gVar.f51970f;
        if (C15 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 5, u0.f28491a, str);
        }
        boolean C16 = c10.C(pluginGeneratedSerialDescriptor);
        x xVar = x.f37485Y;
        Set set = gVar.f51971g;
        if (C16 || !AbstractC3557B.K(set, xVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], set);
        }
        boolean C17 = c10.C(pluginGeneratedSerialDescriptor);
        Set set2 = gVar.f51972h;
        if (C17 || !AbstractC3557B.K(set2, xVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], set2);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

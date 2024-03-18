package Zg;

import ah.C1992c;
import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class j implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final j f23753a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final AbstractC3957g f23754b = R4.b.C1(EnumC3958h.f36152Y, a.f23732j0);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor);
        j jVar = f23753a;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            int t10 = c10.t(jVar.getDescriptor());
            if (t10 != -1) {
                if (t10 == 0) {
                    i10 = c10.m(jVar.getDescriptor(), 0);
                    z10 = true;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                c10.b(descriptor);
                if (z10) {
                    return new Yg.i(i10);
                }
                throw new C1992c("months");
            }
        }
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) f23754b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Yg.i iVar = (Yg.i) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", iVar);
        SerialDescriptor descriptor = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor);
        c10.m(0, iVar.f22409c, f23753a.getDescriptor());
        c10.b(descriptor);
    }
}

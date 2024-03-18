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
public final class k implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final k f23755a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final AbstractC3957g f23756b = R4.b.C1(EnumC3958h.f36152Y, a.f23733k0);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor);
        k kVar = f23755a;
        long j6 = 0;
        boolean z10 = false;
        while (true) {
            int t10 = c10.t(kVar.getDescriptor());
            if (t10 != -1) {
                if (t10 == 0) {
                    j6 = c10.i(kVar.getDescriptor(), 0);
                    z10 = true;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                c10.b(descriptor);
                if (z10) {
                    return new Yg.k(j6);
                }
                throw new C1992c("nanoseconds");
            }
        }
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) f23756b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Yg.k kVar = (Yg.k) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", kVar);
        SerialDescriptor descriptor = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor);
        c10.B(f23755a.getDescriptor(), 0, kVar.f22410c);
        c10.b(descriptor);
    }
}

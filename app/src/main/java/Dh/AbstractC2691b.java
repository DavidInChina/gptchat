package dh;

import Df.AbstractC0405d;
import ah.AbstractC1991b;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: dh.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2691b implements KSerializer {
    public AbstractC1991b a(AbstractC2430a abstractC2430a, String str) {
        KSerializer kSerializer;
        wf.k kVar;
        AbstractC3557B.c0("decoder", abstractC2430a);
        gh.d a5 = abstractC2430a.a();
        AbstractC0405d c10 = c();
        a5.getClass();
        AbstractC3557B.c0("baseClass", c10);
        Map map = (Map) a5.f31636d.get(c10);
        AbstractC1991b abstractC1991b = null;
        if (map != null) {
            kSerializer = (KSerializer) map.get(str);
        } else {
            kSerializer = null;
        }
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer == null) {
            Object obj = a5.f31637e.get(c10);
            if (Ad.l.J0(1, obj)) {
                kVar = (wf.k) obj;
            } else {
                kVar = null;
            }
            if (kVar != null) {
                abstractC1991b = (AbstractC1991b) kVar.invoke(str);
            }
            return abstractC1991b;
        }
        return kSerializer;
    }

    public KSerializer b(Encoder encoder, Object obj) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", obj);
        return encoder.a().b(obj, c());
    }

    public abstract AbstractC0405d c();

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor);
        Object obj = null;
        String str = null;
        while (true) {
            int t10 = c10.t(getDescriptor());
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(t10);
                        throw new IllegalArgumentException(sb2.toString());
                    } else if (str != null) {
                        obj = c10.n(getDescriptor(), t10, R4.b.y0(this, c10, str), null);
                    } else {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                    }
                } else {
                    str = c10.r(getDescriptor(), t10);
                }
            } else if (obj != null) {
                c10.b(descriptor);
                return obj;
            } else {
                throw new IllegalArgumentException(R.a.r("Polymorphic value has not been read for class ", str).toString());
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", obj);
        KSerializer z02 = R4.b.z0(this, encoder, obj);
        SerialDescriptor descriptor = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor);
        c10.z(0, z02.getDescriptor().a(), getDescriptor());
        c10.i(getDescriptor(), 1, z02, obj);
        c10.b(descriptor);
    }
}

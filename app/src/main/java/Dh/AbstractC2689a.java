package dh;

import ch.AbstractC2430a;
import id.AbstractC3557B;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: dh.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2689a implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // ah.AbstractC1991b
    public Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        Object a5 = a();
        int b10 = b(a5);
        AbstractC2430a c10 = decoder.c(getDescriptor());
        while (true) {
            int t10 = c10.t(getDescriptor());
            if (t10 != -1) {
                f(c10, t10 + b10, a5, true);
            } else {
                c10.b(getDescriptor());
                return h(a5);
            }
        }
    }

    public abstract void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}

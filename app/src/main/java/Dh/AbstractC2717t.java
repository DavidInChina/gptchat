package dh;

import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: dh.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2717t extends AbstractC2689a {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f28488a;

    public AbstractC2717t(KSerializer kSerializer) {
        this.f28488a = kSerializer;
    }

    @Override // dh.AbstractC2689a
    public void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10) {
        i(obj, i10, abstractC2430a.n(getDescriptor(), i10, this.f28488a, null));
    }

    public abstract void i(Object obj, int i10, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        AbstractC3557B.c0("encoder", encoder);
        int d10 = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        AbstractC2431b s10 = encoder.s(descriptor, d10);
        Iterator c10 = c(obj);
        for (int i10 = 0; i10 < d10; i10++) {
            s10.i(getDescriptor(), i10, this.f28488a, c10.next());
        }
        s10.b(descriptor);
    }
}

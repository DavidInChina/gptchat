package dh;

import ch.AbstractC2431b;
import id.AbstractC3557B;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public abstract class l0 extends AbstractC2717t {

    /* renamed from: b  reason: collision with root package name */
    public final k0 f28464b;

    public l0(KSerializer kSerializer) {
        super(kSerializer);
        this.f28464b = new k0(kSerializer.getDescriptor());
    }

    @Override // dh.AbstractC2689a
    public final Object a() {
        return (AbstractC2708j0) g(j());
    }

    @Override // dh.AbstractC2689a
    public final int b(Object obj) {
        AbstractC2708j0 abstractC2708j0 = (AbstractC2708j0) obj;
        AbstractC3557B.c0("<this>", abstractC2708j0);
        return abstractC2708j0.d();
    }

    @Override // dh.AbstractC2689a
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // dh.AbstractC2689a, ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return e(decoder);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return this.f28464b;
    }

    @Override // dh.AbstractC2689a
    public final Object h(Object obj) {
        AbstractC2708j0 abstractC2708j0 = (AbstractC2708j0) obj;
        AbstractC3557B.c0("<this>", abstractC2708j0);
        return abstractC2708j0.a();
    }

    @Override // dh.AbstractC2717t
    public final void i(Object obj, int i10, Object obj2) {
        AbstractC3557B.c0("<this>", (AbstractC2708j0) obj);
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    public abstract Object j();

    public abstract void k(AbstractC2431b abstractC2431b, Object obj, int i10);

    @Override // dh.AbstractC2717t, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC3557B.c0("encoder", encoder);
        int d10 = d(obj);
        k0 k0Var = this.f28464b;
        AbstractC2431b s10 = encoder.s(k0Var, d10);
        k(s10, obj, d10);
        s10.b(k0Var);
    }
}

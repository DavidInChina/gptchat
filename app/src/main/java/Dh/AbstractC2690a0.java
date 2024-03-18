package dh;

import ah.AbstractC1991b;
import android.gov.nist.javax.sip.header.ParameterNames;
import ch.AbstractC2430a;
import eh.AbstractC2911k;
import fh.AbstractC3075b;
import fh.AbstractC3096w;
import id.AbstractC3557B;
import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import l8.AbstractC4344b;

/* renamed from: dh.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2690a0 implements Decoder, AbstractC2430a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f28433a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f28434b;

    @Override // ch.AbstractC2430a
    public final byte A(k0 k0Var, int i10) {
        AbstractC3557B.c0("descriptor", k0Var);
        return G(P(k0Var, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short B() {
        return M(Q());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float C() {
        return J(Q());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double D() {
        return I(Q());
    }

    @Override // ch.AbstractC2430a
    public final Decoder E(k0 k0Var, int i10) {
        AbstractC3557B.c0("descriptor", k0Var);
        return K(P(k0Var, i10), k0Var.i(i10));
    }

    public abstract boolean F(Object obj);

    public abstract byte G(Object obj);

    public abstract char H(Object obj);

    public abstract double I(Object obj);

    public abstract float J(Object obj);

    public abstract Decoder K(Object obj, SerialDescriptor serialDescriptor);

    public abstract long L(Object obj);

    public abstract short M(Object obj);

    public abstract String N(Object obj);

    public String O(SerialDescriptor serialDescriptor, int i10) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        return serialDescriptor.g(i10);
    }

    public final String P(SerialDescriptor serialDescriptor, int i10) {
        AbstractC3557B.c0("<this>", serialDescriptor);
        String O10 = O(serialDescriptor, i10);
        AbstractC3557B.c0("nestedName", O10);
        String str = (String) kf.t.p2(this.f28433a);
        return O10;
    }

    public final Object Q() {
        ArrayList arrayList = this.f28433a;
        Object remove = arrayList.remove(AbstractC4344b.u0(arrayList));
        this.f28434b = true;
        return remove;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean d() {
        return F(Q());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char e() {
        return H(Q());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int f(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("enumDescriptor", serialDescriptor);
        AbstractC3075b abstractC3075b = (AbstractC3075b) this;
        String str = (String) Q();
        AbstractC3557B.c0(ParameterNames.TAG, str);
        return AbstractC3096w.e(serialDescriptor, abstractC3075b.f30859c, abstractC3075b.T(str).r(), "");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract Object g(AbstractC1991b abstractC1991b);

    @Override // ch.AbstractC2430a
    public final char h(k0 k0Var, int i10) {
        AbstractC3557B.c0("descriptor", k0Var);
        return H(P(k0Var, i10));
    }

    @Override // ch.AbstractC2430a
    public final long i(SerialDescriptor serialDescriptor, int i10) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        return L(P(serialDescriptor, i10));
    }

    @Override // ch.AbstractC2430a
    public final short j(k0 k0Var, int i10) {
        AbstractC3557B.c0("descriptor", k0Var);
        return M(P(k0Var, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int l() {
        AbstractC3075b abstractC3075b = (AbstractC3075b) this;
        String str = (String) Q();
        AbstractC3557B.c0(ParameterNames.TAG, str);
        try {
            return AbstractC2911k.f(abstractC3075b.T(str));
        } catch (IllegalArgumentException unused) {
            abstractC3075b.V("int");
            throw null;
        }
    }

    @Override // ch.AbstractC2430a
    public final int m(SerialDescriptor serialDescriptor, int i10) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        String P = P(serialDescriptor, i10);
        AbstractC3075b abstractC3075b = (AbstractC3075b) this;
        try {
            return AbstractC2911k.f(abstractC3075b.T(P));
        } catch (IllegalArgumentException unused) {
            abstractC3075b.V("int");
            throw null;
        }
    }

    @Override // ch.AbstractC2430a
    public final Object n(SerialDescriptor serialDescriptor, int i10, AbstractC1991b abstractC1991b, Object obj) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        AbstractC3557B.c0("deserializer", abstractC1991b);
        String P = P(serialDescriptor, i10);
        v0 v0Var = new v0(this, abstractC1991b, obj, 1);
        this.f28433a.add(P);
        Object mo122invoke = v0Var.mo122invoke();
        if (!this.f28434b) {
            Q();
        }
        this.f28434b = false;
        return mo122invoke;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String o() {
        return N(Q());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long p() {
        return L(Q());
    }

    @Override // ch.AbstractC2430a
    public final boolean q(SerialDescriptor serialDescriptor, int i10) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        return F(P(serialDescriptor, i10));
    }

    @Override // ch.AbstractC2430a
    public final String r(SerialDescriptor serialDescriptor, int i10) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        return N(P(serialDescriptor, i10));
    }

    @Override // ch.AbstractC2430a
    public final Object v(SerialDescriptor serialDescriptor, int i10, KSerializer kSerializer, Object obj) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        AbstractC3557B.c0("deserializer", kSerializer);
        String P = P(serialDescriptor, i10);
        v0 v0Var = new v0(this, kSerializer, obj, 0);
        this.f28433a.add(P);
        Object mo122invoke = v0Var.mo122invoke();
        if (!this.f28434b) {
            Q();
        }
        this.f28434b = false;
        return mo122invoke;
    }

    @Override // ch.AbstractC2430a
    public final double x(SerialDescriptor serialDescriptor, int i10) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        return I(P(serialDescriptor, i10));
    }

    @Override // ch.AbstractC2430a
    public final float y(k0 k0Var, int i10) {
        AbstractC3557B.c0("descriptor", k0Var);
        return J(P(k0Var, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte z() {
        return G(Q());
    }
}

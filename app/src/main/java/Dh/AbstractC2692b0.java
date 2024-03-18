package dh;

import android.gov.nist.javax.sip.header.ParameterNames;
import ch.AbstractC2431b;
import eh.AbstractC2911k;
import eh.C2918r;
import fh.AbstractC3077d;
import fh.AbstractC3096w;
import fh.C3099z;
import id.AbstractC3557B;
import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import l8.AbstractC4344b;

/* renamed from: dh.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2692b0 implements Encoder, AbstractC2431b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f28435a = new ArrayList();

    @Override // ch.AbstractC2431b
    public final void A(k0 k0Var, int i10, float f6) {
        AbstractC3557B.c0("descriptor", k0Var);
        F(f6, H(k0Var, i10));
    }

    @Override // ch.AbstractC2431b
    public final void B(SerialDescriptor serialDescriptor, int i10, long j6) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        ((AbstractC3077d) this).K(H(serialDescriptor, i10), AbstractC2911k.a(Long.valueOf(j6)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void D(String str) {
        AbstractC3557B.c0("value", str);
        String str2 = (String) I();
        AbstractC3557B.c0(ParameterNames.TAG, str2);
        ((AbstractC3077d) this).K(str2, AbstractC2911k.b(str));
    }

    public abstract void E(Object obj, double d10);

    public abstract void F(float f6, Object obj);

    public abstract Encoder G(Object obj, SerialDescriptor serialDescriptor);

    public final String H(SerialDescriptor serialDescriptor, int i10) {
        String str;
        AbstractC3557B.c0("<this>", serialDescriptor);
        C3099z c3099z = (C3099z) this;
        switch (c3099z.f30903f) {
            case 2:
                str = String.valueOf(i10);
                break;
            default:
                str = AbstractC3096w.c(serialDescriptor, c3099z.f30865b, i10);
                break;
        }
        AbstractC3557B.c0("nestedName", str);
        String str2 = (String) kf.t.p2(this.f28435a);
        return str;
    }

    public final Object I() {
        ArrayList arrayList = this.f28435a;
        if (!arrayList.isEmpty()) {
            return arrayList.remove(AbstractC4344b.u0(arrayList));
        }
        throw new IllegalArgumentException("No tag in stack for requested element");
    }

    @Override // ch.AbstractC2431b
    public final void b(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        if (!this.f28435a.isEmpty()) {
            I();
        }
        AbstractC3077d abstractC3077d = (AbstractC3077d) this;
        abstractC3077d.f30866c.invoke(abstractC3077d.J());
    }

    @Override // ch.AbstractC2431b
    public final void d(k0 k0Var, int i10, byte b10) {
        AbstractC3557B.c0("descriptor", k0Var);
        ((AbstractC3077d) this).K(H(k0Var, i10), AbstractC2911k.a(Byte.valueOf(b10)));
    }

    @Override // ch.AbstractC2431b
    public final void f(k0 k0Var, int i10, char c10) {
        AbstractC3557B.c0("descriptor", k0Var);
        ((AbstractC3077d) this).K(H(k0Var, i10), AbstractC2911k.b(String.valueOf(c10)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void g(double d10) {
        E(I(), d10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void h(short s10) {
        String str = (String) I();
        AbstractC3557B.c0(ParameterNames.TAG, str);
        ((AbstractC3077d) this).K(str, AbstractC2911k.a(Short.valueOf(s10)));
    }

    @Override // ch.AbstractC2431b
    public final void i(SerialDescriptor serialDescriptor, int i10, KSerializer kSerializer, Object obj) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        AbstractC3557B.c0("serializer", kSerializer);
        this.f28435a.add(H(serialDescriptor, i10));
        w(kSerializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void j(byte b10) {
        String str = (String) I();
        AbstractC3557B.c0(ParameterNames.TAG, str);
        ((AbstractC3077d) this).K(str, AbstractC2911k.a(Byte.valueOf(b10)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void k(boolean z10) {
        String str = (String) I();
        AbstractC3557B.c0(ParameterNames.TAG, str);
        Boolean valueOf = Boolean.valueOf(z10);
        InlineClassDescriptor inlineClassDescriptor = AbstractC2911k.f29457a;
        ((AbstractC3077d) this).K(str, new C2918r(valueOf, false, null));
    }

    @Override // ch.AbstractC2431b
    public final void l(k0 k0Var, int i10, short s10) {
        AbstractC3557B.c0("descriptor", k0Var);
        ((AbstractC3077d) this).K(H(k0Var, i10), AbstractC2911k.a(Short.valueOf(s10)));
    }

    @Override // ch.AbstractC2431b
    public final void m(int i10, int i11, SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        ((AbstractC3077d) this).K(H(serialDescriptor, i10), AbstractC2911k.a(Integer.valueOf(i11)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void n(float f6) {
        F(f6, I());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void o(char c10) {
        String str = (String) I();
        AbstractC3557B.c0(ParameterNames.TAG, str);
        ((AbstractC3077d) this).K(str, AbstractC2911k.b(String.valueOf(c10)));
    }

    @Override // ch.AbstractC2431b
    public final void p(SerialDescriptor serialDescriptor, int i10, boolean z10) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        String H6 = H(serialDescriptor, i10);
        Boolean valueOf = Boolean.valueOf(z10);
        InlineClassDescriptor inlineClassDescriptor = AbstractC2911k.f29457a;
        ((AbstractC3077d) this).K(H6, new C2918r(valueOf, false, null));
    }

    @Override // ch.AbstractC2431b
    public final Encoder r(k0 k0Var, int i10) {
        AbstractC3557B.c0("descriptor", k0Var);
        return G(H(k0Var, i10), k0Var.i(i10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final AbstractC2431b s(SerialDescriptor serialDescriptor, int i10) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        return ((AbstractC3077d) this).c(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void t(SerialDescriptor serialDescriptor, int i10) {
        AbstractC3557B.c0("enumDescriptor", serialDescriptor);
        String str = (String) I();
        AbstractC3557B.c0(ParameterNames.TAG, str);
        ((AbstractC3077d) this).K(str, AbstractC2911k.b(serialDescriptor.g(i10)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void u(int i10) {
        String str = (String) I();
        AbstractC3557B.c0(ParameterNames.TAG, str);
        ((AbstractC3077d) this).K(str, AbstractC2911k.a(Integer.valueOf(i10)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract void w(KSerializer kSerializer, Object obj);

    @Override // ch.AbstractC2431b
    public final void x(SerialDescriptor serialDescriptor, int i10, double d10) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        E(H(serialDescriptor, i10), d10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void y(long j6) {
        String str = (String) I();
        AbstractC3557B.c0(ParameterNames.TAG, str);
        ((AbstractC3077d) this).K(str, AbstractC2911k.a(Long.valueOf(j6)));
    }

    @Override // ch.AbstractC2431b
    public final void z(int i10, String str, SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        AbstractC3557B.c0("value", str);
        ((AbstractC3077d) this).K(H(serialDescriptor, i10), AbstractC2911k.b(str));
    }
}

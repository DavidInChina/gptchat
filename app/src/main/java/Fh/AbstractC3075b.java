package fh;

import ah.AbstractC1991b;
import android.gov.nist.javax.sip.header.ParameterNames;
import bh.AbstractC2214d;
import bh.AbstractC2216f;
import bh.AbstractC2223m;
import bh.C2222l;
import bh.C2224n;
import ch.AbstractC2430a;
import dh.AbstractC2690a0;
import eh.AbstractC2904d;
import eh.AbstractC2910j;
import eh.AbstractC2911k;
import eh.C2909i;
import eh.C2918r;
import id.AbstractC3557B;
import java.util.NoSuchElementException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.JsonNull;

/* renamed from: fh.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3075b extends AbstractC2690a0 implements AbstractC2910j {

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC2904d f30859c;

    /* renamed from: d  reason: collision with root package name */
    public final C2909i f30860d;

    public AbstractC3075b(AbstractC2904d abstractC2904d) {
        this.f30859c = abstractC2904d;
        this.f30860d = abstractC2904d.f29416a;
    }

    @Override // dh.AbstractC2690a0
    public final boolean F(Object obj) {
        String str = (String) obj;
        AbstractC3557B.c0(ParameterNames.TAG, str);
        try {
            Boolean d10 = AbstractC2911k.d(T(str));
            if (d10 != null) {
                return d10.booleanValue();
            }
            V("boolean");
            throw null;
        } catch (IllegalArgumentException unused) {
            V("boolean");
            throw null;
        }
    }

    @Override // dh.AbstractC2690a0
    public final byte G(Object obj) {
        Byte b10;
        String str = (String) obj;
        AbstractC3557B.c0(ParameterNames.TAG, str);
        try {
            int f6 = AbstractC2911k.f(T(str));
            if (-128 <= f6 && f6 <= 127) {
                b10 = Byte.valueOf((byte) f6);
            } else {
                b10 = null;
            }
            if (b10 != null) {
                return b10.byteValue();
            }
            V("byte");
            throw null;
        } catch (IllegalArgumentException unused) {
            V("byte");
            throw null;
        }
    }

    @Override // dh.AbstractC2690a0
    public final char H(Object obj) {
        String str = (String) obj;
        AbstractC3557B.c0(ParameterNames.TAG, str);
        try {
            String r10 = T(str).r();
            AbstractC3557B.c0("<this>", r10);
            int length = r10.length();
            if (length != 0) {
                if (length == 1) {
                    return r10.charAt(0);
                }
                throw new IllegalArgumentException("Char sequence has more than one element.");
            }
            throw new NoSuchElementException("Char sequence is empty.");
        } catch (IllegalArgumentException unused) {
            V("char");
            throw null;
        }
    }

    @Override // dh.AbstractC2690a0
    public final double I(Object obj) {
        String str = (String) obj;
        AbstractC3557B.c0(ParameterNames.TAG, str);
        kotlinx.serialization.json.d T = T(str);
        try {
            InlineClassDescriptor inlineClassDescriptor = AbstractC2911k.f29457a;
            double parseDouble = Double.parseDouble(T.r());
            if (!this.f30859c.f29416a.f29451k && (Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                Double valueOf = Double.valueOf(parseDouble);
                String obj2 = S().toString();
                AbstractC3557B.c0("output", obj2);
                throw Bi.c.m(-1, Bi.c.P1(valueOf, str, obj2));
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            V("double");
            throw null;
        }
    }

    @Override // dh.AbstractC2690a0
    public final float J(Object obj) {
        String str = (String) obj;
        AbstractC3557B.c0(ParameterNames.TAG, str);
        kotlinx.serialization.json.d T = T(str);
        try {
            InlineClassDescriptor inlineClassDescriptor = AbstractC2911k.f29457a;
            float parseFloat = Float.parseFloat(T.r());
            if (!this.f30859c.f29416a.f29451k && (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                Float valueOf = Float.valueOf(parseFloat);
                String obj2 = S().toString();
                AbstractC3557B.c0("output", obj2);
                throw Bi.c.m(-1, Bi.c.P1(valueOf, str, obj2));
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            V("float");
            throw null;
        }
    }

    @Override // dh.AbstractC2690a0
    public final Decoder K(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        AbstractC3557B.c0(ParameterNames.TAG, str);
        AbstractC3557B.c0("inlineDescriptor", serialDescriptor);
        if (AbstractC3070M.a(serialDescriptor)) {
            return new C3090q(new C3071N(T(str).r()), this.f30859c);
        }
        this.f28433a.add(str);
        return this;
    }

    @Override // dh.AbstractC2690a0
    public final long L(Object obj) {
        String str = (String) obj;
        AbstractC3557B.c0(ParameterNames.TAG, str);
        kotlinx.serialization.json.d T = T(str);
        try {
            InlineClassDescriptor inlineClassDescriptor = AbstractC2911k.f29457a;
            try {
                return new C3071N(T.r()).i();
            } catch (C3091r e10) {
                throw new NumberFormatException(e10.getMessage());
            }
        } catch (IllegalArgumentException unused) {
            V("long");
            throw null;
        }
    }

    @Override // dh.AbstractC2690a0
    public final short M(Object obj) {
        Short sh2;
        String str = (String) obj;
        AbstractC3557B.c0(ParameterNames.TAG, str);
        try {
            int f6 = AbstractC2911k.f(T(str));
            if (-32768 <= f6 && f6 <= 32767) {
                sh2 = Short.valueOf((short) f6);
            } else {
                sh2 = null;
            }
            if (sh2 != null) {
                return sh2.shortValue();
            }
            V("short");
            throw null;
        } catch (IllegalArgumentException unused) {
            V("short");
            throw null;
        }
    }

    @Override // dh.AbstractC2690a0
    public final String N(Object obj) {
        C2918r c2918r;
        String str = (String) obj;
        AbstractC3557B.c0(ParameterNames.TAG, str);
        kotlinx.serialization.json.d T = T(str);
        if (!this.f30859c.f29416a.f29443c) {
            if (T instanceof C2918r) {
                c2918r = (C2918r) T;
            } else {
                c2918r = null;
            }
            if (c2918r != null) {
                if (!c2918r.f29470Y) {
                    throw Bi.c.n(android.gov.nist.core.a.A("String literal for key '", str, "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON."), S().toString(), -1);
                }
            } else {
                throw Bi.c.m(-1, "Unexpected 'null' literal when non-nullable string was expected");
            }
        }
        if (!(T instanceof JsonNull)) {
            return T.r();
        }
        throw Bi.c.n("Unexpected 'null' value instead of string literal", S().toString(), -1);
    }

    public abstract kotlinx.serialization.json.b R(String str);

    public final kotlinx.serialization.json.b S() {
        kotlinx.serialization.json.b R10;
        String str = (String) kf.t.p2(this.f28433a);
        if (str == null || (R10 = R(str)) == null) {
            return U();
        }
        return R10;
    }

    public final kotlinx.serialization.json.d T(String str) {
        kotlinx.serialization.json.d dVar;
        AbstractC3557B.c0(ParameterNames.TAG, str);
        kotlinx.serialization.json.b R10 = R(str);
        if (R10 instanceof kotlinx.serialization.json.d) {
            dVar = (kotlinx.serialization.json.d) R10;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        throw Bi.c.n("Expected JsonPrimitive at " + str + ", found " + R10, S().toString(), -1);
    }

    public abstract kotlinx.serialization.json.b U();

    public final void V(String str) {
        throw Bi.c.n(android.gov.nist.core.a.A("Failed to parse literal as '", str, "' value"), S().toString(), -1);
    }

    @Override // kotlinx.serialization.encoding.Decoder, ch.AbstractC2430a
    public final gh.d a() {
        return this.f30859c.f29417b;
    }

    public void b(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public AbstractC2430a c(SerialDescriptor serialDescriptor) {
        AbstractC2430a abstractC2430a;
        AbstractC3557B.c0("descriptor", serialDescriptor);
        kotlinx.serialization.json.b S = S();
        AbstractC2223m e10 = serialDescriptor.e();
        boolean K10 = AbstractC3557B.K(e10, C2224n.f26016b);
        AbstractC2904d abstractC2904d = this.f30859c;
        if (K10 || (e10 instanceof AbstractC2214d)) {
            if (S instanceof kotlinx.serialization.json.a) {
                abstractC2430a = new C3060C(abstractC2904d, (kotlinx.serialization.json.a) S);
            } else {
                StringBuilder sb2 = new StringBuilder("Expected ");
                kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                sb2.append(d10.b(kotlinx.serialization.json.a.class));
                sb2.append(" as the serialized body of ");
                sb2.append(serialDescriptor.a());
                sb2.append(", but had ");
                sb2.append(d10.b(S.getClass()));
                throw Bi.c.m(-1, sb2.toString());
            }
        } else if (AbstractC3557B.K(e10, C2224n.f26017c)) {
            SerialDescriptor Q = Ad.l.Q(serialDescriptor.i(0), abstractC2904d.f29417b);
            AbstractC2223m e11 = Q.e();
            if (!(e11 instanceof AbstractC2216f) && !AbstractC3557B.K(e11, C2222l.f26014a)) {
                if (abstractC2904d.f29416a.f29444d) {
                    if (S instanceof kotlinx.serialization.json.a) {
                        abstractC2430a = new C3060C(abstractC2904d, (kotlinx.serialization.json.a) S);
                    } else {
                        StringBuilder sb3 = new StringBuilder("Expected ");
                        kotlin.jvm.internal.D d11 = kotlin.jvm.internal.C.f37623a;
                        sb3.append(d11.b(kotlinx.serialization.json.a.class));
                        sb3.append(" as the serialized body of ");
                        sb3.append(serialDescriptor.a());
                        sb3.append(", but had ");
                        sb3.append(d11.b(S.getClass()));
                        throw Bi.c.m(-1, sb3.toString());
                    }
                } else {
                    throw Bi.c.l(Q);
                }
            } else if (S instanceof kotlinx.serialization.json.c) {
                abstractC2430a = new C3061D(abstractC2904d, (kotlinx.serialization.json.c) S);
            } else {
                StringBuilder sb4 = new StringBuilder("Expected ");
                kotlin.jvm.internal.D d12 = kotlin.jvm.internal.C.f37623a;
                sb4.append(d12.b(kotlinx.serialization.json.c.class));
                sb4.append(" as the serialized body of ");
                sb4.append(serialDescriptor.a());
                sb4.append(", but had ");
                sb4.append(d12.b(S.getClass()));
                throw Bi.c.m(-1, sb4.toString());
            }
        } else if (S instanceof kotlinx.serialization.json.c) {
            abstractC2430a = new C3059B(abstractC2904d, (kotlinx.serialization.json.c) S, null, null);
        } else {
            StringBuilder sb5 = new StringBuilder("Expected ");
            kotlin.jvm.internal.D d13 = kotlin.jvm.internal.C.f37623a;
            sb5.append(d13.b(kotlinx.serialization.json.c.class));
            sb5.append(" as the serialized body of ");
            sb5.append(serialDescriptor.a());
            sb5.append(", but had ");
            sb5.append(d13.b(S.getClass()));
            throw Bi.c.m(-1, sb5.toString());
        }
        return abstractC2430a;
    }

    @Override // dh.AbstractC2690a0, kotlinx.serialization.encoding.Decoder
    public final Object g(AbstractC1991b abstractC1991b) {
        AbstractC3557B.c0("deserializer", abstractC1991b);
        return P4.a.H(this, abstractC1991b);
    }

    @Override // eh.AbstractC2910j
    public final kotlinx.serialization.json.b k() {
        return S();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean s() {
        return !(S() instanceof JsonNull);
    }

    @Override // eh.AbstractC2910j
    public final AbstractC2904d u() {
        return this.f30859c;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder w(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        if (kf.t.p2(this.f28433a) != null) {
            return K(Q(), serialDescriptor);
        }
        return new C3098y(this.f30859c, U()).w(serialDescriptor);
    }
}

package fh;

import android.gov.nist.javax.sip.header.ParameterNames;
import bh.AbstractC2214d;
import bh.AbstractC2216f;
import bh.AbstractC2223m;
import bh.C2222l;
import bh.C2224n;
import ch.AbstractC2431b;
import dh.AbstractC2691b;
import dh.AbstractC2692b0;
import eh.AbstractC2904d;
import eh.AbstractC2911k;
import eh.AbstractC2916p;
import eh.C2909i;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;

/* renamed from: fh.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3077d extends AbstractC2692b0 implements AbstractC2916p {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC2904d f30865b;

    /* renamed from: c  reason: collision with root package name */
    public final wf.k f30866c;

    /* renamed from: d  reason: collision with root package name */
    public final C2909i f30867d;

    /* renamed from: e  reason: collision with root package name */
    public String f30868e;

    public AbstractC3077d(AbstractC2904d abstractC2904d, wf.k kVar) {
        this.f30865b = abstractC2904d;
        this.f30866c = kVar;
        this.f30867d = abstractC2904d.f29416a;
    }

    @Override // ch.AbstractC2431b
    public final boolean C(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        return this.f30867d.f29441a;
    }

    @Override // dh.AbstractC2692b0
    public final void E(Object obj, double d10) {
        String str = (String) obj;
        AbstractC3557B.c0(ParameterNames.TAG, str);
        K(str, AbstractC2911k.a(Double.valueOf(d10)));
        if (!this.f30867d.f29451k) {
            if (Double.isInfinite(d10) || Double.isNaN(d10)) {
                Double valueOf = Double.valueOf(d10);
                String obj2 = J().toString();
                AbstractC3557B.c0("output", obj2);
                throw new C3094u(Bi.c.P1(valueOf, str, obj2));
            }
        }
    }

    @Override // dh.AbstractC2692b0
    public final void F(float f6, Object obj) {
        String str = (String) obj;
        AbstractC3557B.c0(ParameterNames.TAG, str);
        K(str, AbstractC2911k.a(Float.valueOf(f6)));
        if (!this.f30867d.f29451k) {
            if (Float.isInfinite(f6) || Float.isNaN(f6)) {
                Float valueOf = Float.valueOf(f6);
                String obj2 = J().toString();
                AbstractC3557B.c0("output", obj2);
                throw new C3094u(Bi.c.P1(valueOf, str, obj2));
            }
        }
    }

    @Override // dh.AbstractC2692b0
    public final Encoder G(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        AbstractC3557B.c0(ParameterNames.TAG, str);
        AbstractC3557B.c0("inlineDescriptor", serialDescriptor);
        if (AbstractC3070M.a(serialDescriptor)) {
            return new C3076c(this, str);
        }
        if (serialDescriptor.isInline() && AbstractC3557B.K(serialDescriptor, AbstractC2911k.f29457a)) {
            return new C3076c(this, str, serialDescriptor);
        }
        this.f28435a.add(str);
        return this;
    }

    public abstract kotlinx.serialization.json.b J();

    public abstract void K(String str, kotlinx.serialization.json.b bVar);

    @Override // kotlinx.serialization.encoding.Encoder
    public final gh.d a() {
        return this.f30865b.f29417b;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [fh.z, fh.E] */
    @Override // kotlinx.serialization.encoding.Encoder
    public final AbstractC2431b c(SerialDescriptor serialDescriptor) {
        wf.k kVar;
        C3099z c3099z;
        AbstractC3557B.c0("descriptor", serialDescriptor);
        if (kf.t.p2(this.f28435a) == null) {
            kVar = this.f30866c;
        } else {
            kVar = new Xf.f(26, this);
        }
        AbstractC2223m e10 = serialDescriptor.e();
        boolean K10 = AbstractC3557B.K(e10, C2224n.f26016b);
        AbstractC2904d abstractC2904d = this.f30865b;
        if (K10 || (e10 instanceof AbstractC2214d)) {
            c3099z = new C3099z(abstractC2904d, kVar, 2);
        } else if (AbstractC3557B.K(e10, C2224n.f26017c)) {
            SerialDescriptor Q = Ad.l.Q(serialDescriptor.i(0), abstractC2904d.f29417b);
            AbstractC2223m e11 = Q.e();
            if (!(e11 instanceof AbstractC2216f) && !AbstractC3557B.K(e11, C2222l.f26014a)) {
                if (abstractC2904d.f29416a.f29444d) {
                    c3099z = new C3099z(abstractC2904d, kVar, 2);
                } else {
                    throw Bi.c.l(Q);
                }
            } else {
                AbstractC3557B.c0("nodeConsumer", kVar);
                ?? c3099z2 = new C3099z(abstractC2904d, kVar, 1);
                c3099z2.f30807i = true;
                c3099z = c3099z2;
            }
        } else {
            c3099z = new C3099z(abstractC2904d, kVar, 1);
        }
        String str = this.f30868e;
        if (str != null) {
            c3099z.K(str, AbstractC2911k.b(serialDescriptor.a()));
            this.f30868e = null;
        }
        return c3099z;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void e() {
        String str = (String) kf.t.p2(this.f28435a);
        if (str == null) {
            this.f30866c.invoke(JsonNull.INSTANCE);
        } else {
            K(str, JsonNull.INSTANCE);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder v(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        if (kf.t.p2(this.f28435a) != null) {
            return G(I(), serialDescriptor);
        }
        return new C3099z(this.f30865b, this.f30866c, 0).v(serialDescriptor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r0.f29456p != eh.EnumC2901a.f29409Y) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (id.AbstractC3557B.K(r0, bh.C2224n.f26018d) == false) goto L29;
     */
    @Override // dh.AbstractC2692b0, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(KSerializer kSerializer, Object obj) {
        String str;
        AbstractC3557B.c0("serializer", kSerializer);
        Object p22 = kf.t.p2(this.f28435a);
        AbstractC2904d abstractC2904d = this.f30865b;
        if (p22 == null) {
            SerialDescriptor Q = Ad.l.Q(kSerializer.getDescriptor(), abstractC2904d.f29417b);
            if ((Q.e() instanceof AbstractC2216f) || Q.e() == C2222l.f26014a) {
                new C3099z(abstractC2904d, this.f30866c, 0).w(kSerializer, obj);
                return;
            }
        }
        C2909i c2909i = abstractC2904d.f29416a;
        if (c2909i.f29449i) {
            kSerializer.serialize(this, obj);
            return;
        }
        boolean z10 = kSerializer instanceof AbstractC2691b;
        if (!z10) {
            int ordinal = c2909i.f29456p.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new RuntimeException();
                    }
                } else {
                    AbstractC2223m e10 = kSerializer.getDescriptor().e();
                    if (!AbstractC3557B.K(e10, C2224n.f26015a)) {
                    }
                    str = P4.a.x(kSerializer.getDescriptor(), abstractC2904d);
                }
            }
            str = null;
        }
        if (z10) {
            AbstractC2691b abstractC2691b = (AbstractC2691b) kSerializer;
            if (obj != null) {
                KSerializer z02 = R4.b.z0(abstractC2691b, this, obj);
                if (str != null) {
                    P4.a.l(kSerializer, z02, str);
                }
                P4.a.t(z02.getDescriptor().e());
                kSerializer = z02;
            } else {
                throw new IllegalArgumentException(("Value for serializer " + kSerializer.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
        }
        if (str != null) {
            this.f30868e = str;
        }
        kSerializer.serialize(this, obj);
    }
}

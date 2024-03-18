package fh;

import Z1.t0;
import android.gov.nist.javax.sip.header.ParameterNames;
import bh.AbstractC2214d;
import bh.C2222l;
import ch.AbstractC2430a;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import dh.AbstractC2704h0;
import eh.AbstractC2904d;
import eh.AbstractC2911k;
import eh.AbstractC2923w;
import eh.C2909i;
import eh.C2921u;
import hg.C3431j;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kf.AbstractC4268D;
import kf.AbstractC4273I;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;

/* renamed from: fh.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3059B extends AbstractC3075b {

    /* renamed from: e  reason: collision with root package name */
    public final kotlinx.serialization.json.c f30794e;

    /* renamed from: f  reason: collision with root package name */
    public final String f30795f;

    /* renamed from: g  reason: collision with root package name */
    public final SerialDescriptor f30796g;

    /* renamed from: h  reason: collision with root package name */
    public int f30797h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f30798i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3059B(AbstractC2904d abstractC2904d, kotlinx.serialization.json.c cVar, String str, SerialDescriptor serialDescriptor) {
        super(abstractC2904d);
        AbstractC3557B.c0("json", abstractC2904d);
        AbstractC3557B.c0("value", cVar);
        this.f30794e = cVar;
        this.f30795f = str;
        this.f30796g = serialDescriptor;
    }

    @Override // dh.AbstractC2690a0
    public String O(SerialDescriptor serialDescriptor, int i10) {
        String str;
        Object obj;
        AbstractC3557B.c0("descriptor", serialDescriptor);
        AbstractC2904d abstractC2904d = this.f30859c;
        AbstractC2923w g10 = AbstractC3096w.g(serialDescriptor, abstractC2904d);
        String g11 = serialDescriptor.g(i10);
        if (g10 == null) {
            if (!this.f30860d.f29452l) {
                return g11;
            }
            if (U().f37662Y.keySet().contains(g11)) {
                return g11;
            }
        }
        Map b10 = AbstractC3096w.b(serialDescriptor, abstractC2904d);
        Iterator it = U().f37662Y.keySet().iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                Integer num = (Integer) b10.get((String) obj);
                if (num != null && num.intValue() == i10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return str2;
        }
        if (g10 != null) {
            str = ((C2921u) g10).a(g11, serialDescriptor);
        }
        if (str != null) {
            return str;
        }
        return g11;
    }

    @Override // fh.AbstractC3075b
    public kotlinx.serialization.json.b R(String str) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        return (kotlinx.serialization.json.b) AbstractC4268D.Z0(str, U());
    }

    /* renamed from: W */
    public kotlinx.serialization.json.c U() {
        return this.f30794e;
    }

    @Override // fh.AbstractC3075b, ch.AbstractC2430a
    public void b(SerialDescriptor serialDescriptor) {
        Set set;
        Object obj;
        AbstractC3557B.c0("descriptor", serialDescriptor);
        C2909i c2909i = this.f30860d;
        if (!c2909i.f29442b && !(serialDescriptor.e() instanceof AbstractC2214d)) {
            AbstractC2904d abstractC2904d = this.f30859c;
            AbstractC2923w g10 = AbstractC3096w.g(serialDescriptor, abstractC2904d);
            if (g10 == null && !c2909i.f29452l) {
                set = AbstractC2704h0.a(serialDescriptor);
            } else if (g10 != null) {
                set = AbstractC3096w.b(serialDescriptor, abstractC2904d).keySet();
            } else {
                Set a5 = AbstractC2704h0.a(serialDescriptor);
                C3431j c3431j = AbstractC3096w.f30899a;
                t0 t0Var = abstractC2904d.f29418c;
                t0Var.getClass();
                Map map = (Map) t0Var.f23111a.get(serialDescriptor);
                Set set2 = null;
                if (map != null) {
                    obj = map.get(c3431j);
                } else {
                    obj = null;
                }
                if (obj == null) {
                    obj = null;
                }
                Map map2 = (Map) obj;
                if (map2 != null) {
                    set2 = map2.keySet();
                }
                if (set2 == null) {
                    set2 = kf.x.f37485Y;
                }
                set = AbstractC4273I.u2(a5, set2);
            }
            for (String str : U().f37662Y.keySet()) {
                if (!set.contains(str) && !AbstractC3557B.K(str, this.f30795f)) {
                    String cVar = U().toString();
                    AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                    StringBuilder s10 = android.gov.nist.core.a.s("Encountered an unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                    s10.append((Object) Bi.c.q1(-1, cVar));
                    throw Bi.c.m(-1, s10.toString());
                }
            }
        }
    }

    @Override // fh.AbstractC3075b, kotlinx.serialization.encoding.Decoder
    public final AbstractC2430a c(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        SerialDescriptor serialDescriptor2 = this.f30796g;
        if (serialDescriptor == serialDescriptor2) {
            kotlinx.serialization.json.b S = S();
            if (S instanceof kotlinx.serialization.json.c) {
                String str = this.f30795f;
                return new C3059B(this.f30859c, (kotlinx.serialization.json.c) S, str, serialDescriptor2);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
            sb2.append(d10.b(kotlinx.serialization.json.c.class));
            sb2.append(" as the serialized body of ");
            sb2.append(serialDescriptor2.a());
            sb2.append(", but had ");
            sb2.append(d10.b(S.getClass()));
            throw Bi.c.m(-1, sb2.toString());
        }
        return super.c(serialDescriptor);
    }

    @Override // fh.AbstractC3075b, kotlinx.serialization.encoding.Decoder
    public final boolean s() {
        if (!this.f30798i && super.s()) {
            return true;
        }
        return false;
    }

    @Override // ch.AbstractC2430a
    public int t(SerialDescriptor serialDescriptor) {
        kotlinx.serialization.json.d dVar;
        AbstractC3557B.c0("descriptor", serialDescriptor);
        while (this.f30797h < serialDescriptor.f()) {
            int i10 = this.f30797h;
            this.f30797h = i10 + 1;
            String P = P(serialDescriptor, i10);
            boolean z10 = true;
            int i11 = this.f30797h - 1;
            this.f30798i = false;
            boolean containsKey = U().containsKey(P);
            AbstractC2904d abstractC2904d = this.f30859c;
            if (!containsKey) {
                if (abstractC2904d.f29416a.f29446f || serialDescriptor.j(i11) || !serialDescriptor.i(i11).c()) {
                    z10 = false;
                }
                this.f30798i = z10;
                if (!z10) {
                    continue;
                }
            }
            if (this.f30860d.f29448h && serialDescriptor.j(i11)) {
                SerialDescriptor i12 = serialDescriptor.i(i11);
                if (i12.c() || !(R(P) instanceof JsonNull)) {
                    if (AbstractC3557B.K(i12.e(), C2222l.f26014a) && (!i12.c() || !(R(P) instanceof JsonNull))) {
                        kotlinx.serialization.json.b R10 = R(P);
                        String str = null;
                        if (R10 instanceof kotlinx.serialization.json.d) {
                            dVar = (kotlinx.serialization.json.d) R10;
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            str = AbstractC2911k.e(dVar);
                        }
                        if (str != null && AbstractC3096w.d(i12, abstractC2904d, str) == -3) {
                        }
                    }
                }
            }
            return i11;
        }
        return -1;
    }
}

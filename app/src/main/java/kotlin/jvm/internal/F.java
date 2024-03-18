package kotlin.jvm.internal;

import Df.AbstractC0405d;
import Df.AbstractC0406e;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import zc.C6821H;

/* loaded from: classes.dex */
public final class F implements Df.w {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC0406e f37624Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f37625Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f37626h0 = 0;

    public F(AbstractC0405d abstractC0405d, List list) {
        AbstractC3557B.c0("classifier", abstractC0405d);
        AbstractC3557B.c0("arguments", list);
        this.f37624Y = abstractC0405d;
        this.f37625Z = list;
    }

    @Override // Df.w
    public final boolean a() {
        if ((this.f37626h0 & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // Df.w
    public final List c() {
        return this.f37625Z;
    }

    @Override // Df.w
    public final AbstractC0406e e() {
        return this.f37624Y;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof F) {
            F f6 = (F) obj;
            if (AbstractC3557B.K(this.f37624Y, f6.f37624Y) && AbstractC3557B.K(this.f37625Z, f6.f37625Z) && AbstractC3557B.K(null, null) && this.f37626h0 == f6.f37626h0) {
                return true;
            }
        }
        return false;
    }

    public final String f(boolean z10) {
        AbstractC0405d abstractC0405d;
        String str;
        String str2;
        AbstractC0406e abstractC0406e = this.f37624Y;
        Class cls = null;
        if (abstractC0406e instanceof AbstractC0405d) {
            abstractC0405d = (AbstractC0405d) abstractC0406e;
        } else {
            abstractC0405d = null;
        }
        if (abstractC0405d != null) {
            cls = R4.b.k1(abstractC0405d);
        }
        if (cls == null) {
            str = abstractC0406e.toString();
        } else if ((this.f37626h0 & 4) != 0) {
            str = "kotlin.Nothing";
        } else if (cls.isArray()) {
            if (AbstractC3557B.K(cls, boolean[].class)) {
                str = "kotlin.BooleanArray";
            } else if (AbstractC3557B.K(cls, char[].class)) {
                str = "kotlin.CharArray";
            } else if (AbstractC3557B.K(cls, byte[].class)) {
                str = "kotlin.ByteArray";
            } else if (AbstractC3557B.K(cls, short[].class)) {
                str = "kotlin.ShortArray";
            } else if (AbstractC3557B.K(cls, int[].class)) {
                str = "kotlin.IntArray";
            } else if (AbstractC3557B.K(cls, float[].class)) {
                str = "kotlin.FloatArray";
            } else if (AbstractC3557B.K(cls, long[].class)) {
                str = "kotlin.LongArray";
            } else if (AbstractC3557B.K(cls, double[].class)) {
                str = "kotlin.DoubleArray";
            } else {
                str = "kotlin.Array";
            }
        } else if (z10 && cls.isPrimitive()) {
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.reflect.KClass<*>", abstractC0406e);
            str = R4.b.l1((AbstractC0405d) abstractC0406e).getName();
        } else {
            str = cls.getName();
        }
        String str3 = "";
        if (this.f37625Z.isEmpty()) {
            str2 = str3;
        } else {
            str2 = kf.t.m2(this.f37625Z, ", ", Separators.LESS_THAN, Separators.GREATER_THAN, new C6821H(24, this), 24);
        }
        if (a()) {
            str3 = Separators.QUESTION;
        }
        return android.gov.nist.core.a.j(str, str2, str3);
    }

    public final int hashCode() {
        return AbstractC4194d.s(this.f37625Z, this.f37624Y.hashCode() * 31, 31) + this.f37626h0;
    }

    public final String toString() {
        return f(false) + " (Kotlin reflection is not available)";
    }
}

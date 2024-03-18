package dh;

import bh.AbstractC2223m;
import bh.C2224n;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public abstract class W implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public final String f28426a;

    /* renamed from: b  reason: collision with root package name */
    public final SerialDescriptor f28427b;

    /* renamed from: c  reason: collision with root package name */
    public final SerialDescriptor f28428c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28429d = 2;

    public W(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f28426a = str;
        this.f28427b = serialDescriptor;
        this.f28428c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f28426a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC3557B.c0("name", str);
        Integer W12 = Lg.m.W1(str);
        if (W12 != null) {
            return W12.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2223m e() {
        return C2224n.f26017c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        if (AbstractC3557B.K(this.f28426a, w10.f28426a) && AbstractC3557B.K(this.f28427b, w10.f28427b) && AbstractC3557B.K(this.f28428c, w10.f28428c)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f28429d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i10) {
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return kf.v.f37483Y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i10) {
        if (i10 >= 0) {
            return kf.v.f37483Y;
        }
        throw new IllegalArgumentException(R.a.t(android.gov.nist.core.a.q("Illegal index ", i10, ", "), this.f28426a, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        int hashCode = this.f28427b.hashCode();
        return this.f28428c.hashCode() + ((hashCode + (this.f28426a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 != 0) {
                if (i11 == 1) {
                    return this.f28428c;
                }
                throw new IllegalStateException("Unreached".toString());
            }
            return this.f28427b;
        }
        throw new IllegalArgumentException(R.a.t(android.gov.nist.core.a.q("Illegal index ", i10, ", "), this.f28426a, " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(R.a.t(android.gov.nist.core.a.q("Illegal index ", i10, ", "), this.f28426a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f28426a + '(' + this.f28427b + ", " + this.f28428c + ')';
    }
}

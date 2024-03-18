package dh;

import bh.AbstractC2223m;
import bh.C2224n;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public abstract class O implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public final SerialDescriptor f28412a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28413b = 1;

    public O(SerialDescriptor serialDescriptor) {
        this.f28412a = serialDescriptor;
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
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2223m e() {
        return C2224n.f26016b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        if (AbstractC3557B.K(this.f28412a, o10.f28412a) && AbstractC3557B.K(a(), o10.a())) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f28413b;
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
        StringBuilder q10 = android.gov.nist.core.a.q("Illegal index ", i10, ", ");
        q10.append(a());
        q10.append(" expects only non-negative indices");
        throw new IllegalArgumentException(q10.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f28412a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i10) {
        if (i10 >= 0) {
            return this.f28412a;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Illegal index ", i10, ", ");
        q10.append(a());
        q10.append(" expects only non-negative indices");
        throw new IllegalArgumentException(q10.toString().toString());
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
        StringBuilder q10 = android.gov.nist.core.a.q("Illegal index ", i10, ", ");
        q10.append(a());
        q10.append(" expects only non-negative indices");
        throw new IllegalArgumentException(q10.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f28412a + ')';
    }
}

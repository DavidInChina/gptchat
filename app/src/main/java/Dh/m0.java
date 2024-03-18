package dh;

import bh.AbstractC2216f;
import bh.AbstractC2223m;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public final class m0 implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public final String f28466a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC2216f f28467b;

    public m0(String str, AbstractC2216f abstractC2216f) {
        this.f28466a = str;
        this.f28467b = abstractC2216f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f28466a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC3557B.c0("name", str);
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2223m e() {
        return this.f28467b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (AbstractC3557B.K(this.f28466a, m0Var.f28466a)) {
            if (AbstractC3557B.K(this.f28467b, m0Var.f28467b)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return kf.v.f37483Y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f28467b.hashCode() * 31) + this.f28466a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("PrimitiveDescriptor("), this.f28466a, ')');
    }
}

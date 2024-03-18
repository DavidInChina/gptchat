package dh;

import bh.AbstractC2223m;
import id.AbstractC3557B;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class p0 implements SerialDescriptor, AbstractC2710l {

    /* renamed from: a  reason: collision with root package name */
    public final SerialDescriptor f28476a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28477b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f28478c;

    public p0(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("original", serialDescriptor);
        this.f28476a = serialDescriptor;
        this.f28477b = serialDescriptor.a() + '?';
        this.f28478c = AbstractC2704h0.a(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f28477b;
    }

    @Override // dh.AbstractC2710l
    public final Set b() {
        return this.f28478c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC3557B.c0("name", str);
        return this.f28476a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2223m e() {
        return this.f28476a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        if (AbstractC3557B.K(this.f28476a, ((p0) obj).f28476a)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f28476a.f();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i10) {
        return this.f28476a.g(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f28476a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i10) {
        return this.f28476a.h(i10);
    }

    public final int hashCode() {
        return this.f28476a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i10) {
        return this.f28476a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f28476a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i10) {
        return this.f28476a.j(i10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f28476a);
        sb2.append('?');
        return sb2.toString();
    }
}

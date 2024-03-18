package bh;

import Df.AbstractC0405d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: bh.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2212b implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public final SerialDescriptor f25981a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0405d f25982b;

    /* renamed from: c  reason: collision with root package name */
    public final String f25983c;

    public C2212b(C2217g c2217g, AbstractC0405d abstractC0405d) {
        AbstractC3557B.c0("kClass", abstractC0405d);
        this.f25981a = c2217g;
        this.f25982b = abstractC0405d;
        this.f25983c = c2217g.f25995a + '<' + abstractC0405d.o() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f25983c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return this.f25981a.c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC3557B.c0("name", str);
        return this.f25981a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2223m e() {
        return this.f25981a.e();
    }

    public final boolean equals(Object obj) {
        C2212b c2212b;
        if (obj instanceof C2212b) {
            c2212b = (C2212b) obj;
        } else {
            c2212b = null;
        }
        if (c2212b == null || !AbstractC3557B.K(this.f25981a, c2212b.f25981a) || !AbstractC3557B.K(c2212b.f25982b, this.f25982b)) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f25981a.f();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i10) {
        return this.f25981a.g(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f25981a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i10) {
        return this.f25981a.h(i10);
    }

    public final int hashCode() {
        return this.f25983c.hashCode() + (this.f25982b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i10) {
        return this.f25981a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f25981a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i10) {
        return this.f25981a.j(i10);
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f25982b + ", original: " + this.f25981a + ')';
    }
}

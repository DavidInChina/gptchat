package dh;

import android.gov.nist.core.Separators;
import bh.AbstractC2223m;
import bh.C2218h;
import bh.C2219i;
import bh.C2222l;
import e4.C2799g;
import id.AbstractC3557B;
import jf.C3963m;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: dh.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2675A extends PluginGeneratedSerialDescriptor {

    /* renamed from: l  reason: collision with root package name */
    public final C2222l f28372l = C2222l.f26014a;

    /* renamed from: m  reason: collision with root package name */
    public final C3963m f28373m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2675A(String str, int i10) {
        super(str, null, i10);
        AbstractC3557B.c0("name", str);
        this.f28373m = R4.b.D1(new C2799g(i10, str, this));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2223m e() {
        return this.f28372l;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (serialDescriptor.e() != C2222l.f26014a) {
            return false;
        }
        if (AbstractC3557B.K(this.f37649a, serialDescriptor.a()) && AbstractC3557B.K(AbstractC2704h0.a(this), AbstractC2704h0.a(serialDescriptor))) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        int i10;
        int hashCode = this.f37649a.hashCode();
        int i11 = 1;
        C2218h c2218h = new C2218h(this, 1);
        while (c2218h.hasNext()) {
            int i12 = i11 * 31;
            String str = (String) c2218h.next();
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            i11 = i12 + i10;
        }
        return (hashCode * 31) + i11;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i10) {
        return ((SerialDescriptor[]) this.f28373m.getValue())[i10];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final String toString() {
        return kf.t.m2(new C2219i(this, 1), ", ", android.gov.nist.core.a.n(new StringBuilder(), this.f37649a, '('), Separators.RPAREN, null, 56);
    }
}

package eh;

import fh.AbstractC3072O;
import id.AbstractC3557B;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: eh.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2918r extends kotlinx.serialization.json.d {

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f29470Y;

    /* renamed from: Z  reason: collision with root package name */
    public final SerialDescriptor f29471Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f29472h0;

    public C2918r(Object obj, boolean z10, SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("body", obj);
        this.f29470Y = z10;
        this.f29471Z = serialDescriptor;
        this.f29472h0 = obj.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2918r.class != obj.getClass()) {
            return false;
        }
        C2918r c2918r = (C2918r) obj;
        if (this.f29470Y == c2918r.f29470Y && AbstractC3557B.K(this.f29472h0, c2918r.f29472h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f29470Y) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.f29472h0.hashCode() + (i10 * 31);
    }

    @Override // kotlinx.serialization.json.d
    public final String r() {
        return this.f29472h0;
    }

    @Override // kotlinx.serialization.json.d
    public final boolean s() {
        return this.f29470Y;
    }

    @Override // kotlinx.serialization.json.d
    public final String toString() {
        String str = this.f29472h0;
        if (this.f29470Y) {
            StringBuilder sb2 = new StringBuilder();
            AbstractC3072O.a(str, sb2);
            String sb3 = sb2.toString();
            AbstractC3557B.b0("toString(...)", sb3);
            return sb3;
        }
        return str;
    }
}

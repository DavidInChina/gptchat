package Kg;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class r implements k, c {

    /* renamed from: a  reason: collision with root package name */
    public final k f9847a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9848b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9849c;

    public r(k kVar, int i10, int i11) {
        AbstractC3557B.c0("sequence", kVar);
        this.f9847a = kVar;
        this.f9848b = i10;
        this.f9849c = i11;
        if (i10 >= 0) {
            if (i11 >= 0) {
                if (i11 >= i10) {
                    return;
                }
                throw new IllegalArgumentException(AbstractC2469q0.i("endIndex should be not less than startIndex, but was ", i11, " < ", i10).toString());
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("endIndex should be non-negative, but is ", i11).toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("startIndex should be non-negative, but is ", i10).toString());
    }

    @Override // Kg.c
    public final k a(int i10) {
        int i11 = this.f9849c;
        int i12 = this.f9848b;
        if (i10 >= i11 - i12) {
            return this;
        }
        return new r(this.f9847a, i12, i10 + i12);
    }

    @Override // Kg.c
    public final k b(int i10) {
        int i11 = this.f9849c;
        int i12 = this.f9848b;
        if (i10 >= i11 - i12) {
            return d.f9815a;
        }
        return new r(this.f9847a, i12 + i10, i11);
    }

    @Override // Kg.k
    public final Iterator iterator() {
        return new i(this);
    }
}

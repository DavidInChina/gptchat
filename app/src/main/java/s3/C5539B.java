package s3;

import android.os.Bundle;
import id.AbstractC3557B;

/* renamed from: s3.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5539B implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC5540C f45208Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Bundle f45209Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f45210h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f45211i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f45212j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f45213k0;

    public C5539B(AbstractC5540C abstractC5540C, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
        AbstractC3557B.c0("destination", abstractC5540C);
        this.f45208Y = abstractC5540C;
        this.f45209Z = bundle;
        this.f45210h0 = z10;
        this.f45211i0 = i10;
        this.f45212j0 = z11;
        this.f45213k0 = i11;
    }

    /* renamed from: a */
    public final int compareTo(C5539B c5539b) {
        AbstractC3557B.c0("other", c5539b);
        boolean z10 = c5539b.f45210h0;
        boolean z11 = this.f45210h0;
        if (z11 && !z10) {
            return 1;
        }
        if (!z11 && z10) {
            return -1;
        }
        int i10 = this.f45211i0 - c5539b.f45211i0;
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        Bundle bundle = c5539b.f45209Z;
        Bundle bundle2 = this.f45209Z;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            AbstractC3557B.Z(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z12 = c5539b.f45212j0;
        boolean z13 = this.f45212j0;
        if (z13 && !z12) {
            return 1;
        }
        if (!z13 && z12) {
            return -1;
        }
        return this.f45213k0 - c5539b.f45213k0;
    }
}

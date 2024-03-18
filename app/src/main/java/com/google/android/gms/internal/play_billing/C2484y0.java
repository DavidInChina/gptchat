package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.y0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2484y0 implements AbstractC2463n0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2481x f26992a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26993b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f26994c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26995d;

    public C2484y0(Q q10, String str, Object[] objArr) {
        this.f26992a = q10;
        this.f26993b = str;
        this.f26994c = objArr;
        char charAt = str.charAt(0);
        if (charAt < '\ud800') {
            this.f26995d = charAt;
            return;
        }
        int i10 = charAt & '\u1fff';
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 >= '\ud800') {
                i10 |= (charAt2 & '\u1fff') << i11;
                i11 += 13;
                i12 = i13;
            } else {
                this.f26995d = i10 | (charAt2 << i11);
                return;
            }
        }
    }

    public final AbstractC2481x a() {
        return this.f26992a;
    }

    public final int b() {
        int i10 = this.f26995d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    public final String c() {
        return this.f26993b;
    }

    public final Object[] d() {
        return this.f26994c;
    }
}

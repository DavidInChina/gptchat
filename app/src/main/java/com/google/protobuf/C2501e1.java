package com.google.protobuf;

/* renamed from: com.google.protobuf.e1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2501e1 implements J0 {

    /* renamed from: a  reason: collision with root package name */
    public final M0 f27540a;

    /* renamed from: b  reason: collision with root package name */
    public final String f27541b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f27542c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27543d;

    public C2501e1(M0 m02, String str, Object[] objArr) {
        this.f27540a = m02;
        this.f27541b = str;
        this.f27542c = objArr;
        char charAt = str.charAt(0);
        if (charAt < '\ud800') {
            this.f27543d = charAt;
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
                this.f27543d = i10 | (charAt2 << i11);
                return;
            }
        }
    }

    public final M0 a() {
        return this.f27540a;
    }

    public final Object[] b() {
        return this.f27542c;
    }

    public final String c() {
        return this.f27541b;
    }

    public final int d() {
        if ((this.f27543d & 1) == 1) {
            return 1;
        }
        return 2;
    }
}

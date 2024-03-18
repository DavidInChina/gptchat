package Q1;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public int f14351a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final A f14352b;

    /* renamed from: c  reason: collision with root package name */
    public A f14353c;

    /* renamed from: d  reason: collision with root package name */
    public A f14354d;

    /* renamed from: e  reason: collision with root package name */
    public int f14355e;

    /* renamed from: f  reason: collision with root package name */
    public int f14356f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f14357g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f14358h;

    public v(A a5, boolean z10, int[] iArr) {
        this.f14352b = a5;
        this.f14353c = a5;
        this.f14357g = z10;
        this.f14358h = iArr;
    }

    public final void a() {
        this.f14351a = 1;
        this.f14353c = this.f14352b;
        this.f14356f = 0;
    }

    public final boolean b() {
        int[] iArr;
        R1.a c10 = this.f14353c.f14299b.c();
        int a5 = c10.a(6);
        if ((a5 != 0 && ((ByteBuffer) c10.f15023d).get(a5 + c10.f15020a) != 0) || this.f14355e == 65039) {
            return true;
        }
        if (this.f14357g && ((iArr = this.f14358h) == null || Arrays.binarySearch(iArr, this.f14353c.f14299b.a(0)) < 0)) {
            return true;
        }
        return false;
    }
}

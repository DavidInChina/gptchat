package v0;

import java.util.ArrayList;
import java.util.List;
import r0.N;

/* renamed from: v0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5952e {

    /* renamed from: a  reason: collision with root package name */
    public final String f46927a;

    /* renamed from: b  reason: collision with root package name */
    public final float f46928b;

    /* renamed from: c  reason: collision with root package name */
    public final float f46929c;

    /* renamed from: d  reason: collision with root package name */
    public final float f46930d;

    /* renamed from: e  reason: collision with root package name */
    public final float f46931e;

    /* renamed from: f  reason: collision with root package name */
    public final long f46932f;

    /* renamed from: g  reason: collision with root package name */
    public final int f46933g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f46934h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f46935i;

    /* renamed from: j  reason: collision with root package name */
    public final C5951d f46936j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f46937k;

    public C5952e(String str, float f6, float f10, float f11, float f12, long j6, int i10, boolean z10, int i11) {
        String str2;
        long j10;
        int i12;
        boolean z11;
        if ((i11 & 1) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        if ((i11 & 32) != 0) {
            j10 = r0.r.f44263k;
        } else {
            j10 = j6;
        }
        if ((i11 & 64) != 0) {
            i12 = 5;
        } else {
            i12 = i10;
        }
        if ((i11 & 128) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        this.f46927a = str2;
        this.f46928b = f6;
        this.f46929c = f10;
        this.f46930d = f11;
        this.f46931e = f12;
        this.f46932f = j10;
        this.f46933g = i12;
        this.f46934h = z11;
        ArrayList arrayList = new ArrayList();
        this.f46935i = arrayList;
        C5951d c5951d = new C5951d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f46936j = c5951d;
        arrayList.add(c5951d);
    }

    public static void b(C5952e c5952e, ArrayList arrayList, int i10, N n10, N n11, float f6, int i11, int i12, float f10) {
        c5952e.e();
        ArrayList arrayList2 = c5952e.f46935i;
        ((C5951d) arrayList2.get(arrayList2.size() - 1)).f46926j.add(new C5947K("", arrayList, i10, n10, 1.0f, n11, 1.0f, f6, i11, i12, f10, 0.0f, 1.0f, 0.0f));
    }

    public final void a(String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, List list) {
        e();
        this.f46935i.add(new C5951d(str, f6, f10, f11, f12, f13, f14, f15, list, 512));
    }

    public final C5953f c() {
        e();
        while (this.f46935i.size() > 1) {
            d();
        }
        C5951d c5951d = this.f46936j;
        C5953f c5953f = new C5953f(this.f46927a, this.f46928b, this.f46929c, this.f46930d, this.f46931e, new C5943G(c5951d.f46917a, c5951d.f46918b, c5951d.f46919c, c5951d.f46920d, c5951d.f46921e, c5951d.f46922f, c5951d.f46923g, c5951d.f46924h, c5951d.f46925i, c5951d.f46926j), this.f46932f, this.f46933g, this.f46934h);
        this.f46937k = true;
        return c5953f;
    }

    public final void d() {
        e();
        ArrayList arrayList = this.f46935i;
        C5951d c5951d = (C5951d) arrayList.remove(arrayList.size() - 1);
        ((C5951d) arrayList.get(arrayList.size() - 1)).f46926j.add(new C5943G(c5951d.f46917a, c5951d.f46918b, c5951d.f46919c, c5951d.f46920d, c5951d.f46921e, c5951d.f46922f, c5951d.f46923g, c5951d.f46924h, c5951d.f46925i, c5951d.f46926j));
    }

    public final void e() {
        if (!this.f46937k) {
            return;
        }
        throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
    }
}

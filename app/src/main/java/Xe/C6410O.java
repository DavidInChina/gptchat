package xe;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jf.C3963m;

/* renamed from: xe.O  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6410O {

    /* renamed from: a  reason: collision with root package name */
    public final C6408M f49858a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49859b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49860c;

    /* renamed from: d  reason: collision with root package name */
    public final List f49861d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49862e;

    /* renamed from: f  reason: collision with root package name */
    public final String f49863f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f49864g;

    /* renamed from: h  reason: collision with root package name */
    public final String f49865h;

    /* renamed from: i  reason: collision with root package name */
    public final C3963m f49866i;

    /* renamed from: j  reason: collision with root package name */
    public final C3963m f49867j;

    /* renamed from: k  reason: collision with root package name */
    public final C3963m f49868k;

    /* renamed from: l  reason: collision with root package name */
    public final C3963m f49869l;

    /* renamed from: m  reason: collision with root package name */
    public final C3963m f49870m;

    public C6410O(C6408M c6408m, String str, int i10, ArrayList arrayList, AbstractC6401F abstractC6401F, String str2, String str3, String str4, boolean z10, String str5) {
        AbstractC3557B.c0("protocol", c6408m);
        AbstractC3557B.c0("host", str);
        AbstractC3557B.c0("parameters", abstractC6401F);
        this.f49858a = c6408m;
        this.f49859b = str;
        this.f49860c = i10;
        this.f49861d = arrayList;
        this.f49862e = str3;
        this.f49863f = str4;
        this.f49864g = z10;
        this.f49865h = str5;
        if ((i10 >= 0 && i10 < 65536) || i10 == 0) {
            this.f49866i = R4.b.D1(new C6409N(this, 2));
            this.f49867j = R4.b.D1(new C6409N(this, 4));
            R4.b.D1(new C6409N(this, 3));
            this.f49868k = R4.b.D1(new C6409N(this, 5));
            this.f49869l = R4.b.D1(new C6409N(this, 1));
            this.f49870m = R4.b.D1(new C6409N(this, 0));
            return;
        }
        throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6410O.class == obj.getClass() && AbstractC3557B.K(this.f49865h, ((C6410O) obj).f49865h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49865h.hashCode();
    }

    public final String toString() {
        return this.f49865h;
    }
}

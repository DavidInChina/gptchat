package B4;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List f1856a;

    /* renamed from: b  reason: collision with root package name */
    public final char f1857b;

    /* renamed from: c  reason: collision with root package name */
    public final double f1858c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1859d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1860e;

    public d(ArrayList arrayList, char c10, double d10, String str, String str2) {
        this.f1856a = arrayList;
        this.f1857b = c10;
        this.f1858c = d10;
        this.f1859d = str;
        this.f1860e = str2;
    }

    public static int a(char c10, String str, String str2) {
        return str2.hashCode() + E9.f.v(str, c10 * 31, 31);
    }

    public final int hashCode() {
        return a(this.f1857b, this.f1860e, this.f1859d);
    }
}

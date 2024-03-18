package x3;

import id.AbstractC3557B;
import java.util.Set;
import lf.C4442g;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final p f48692a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f48693b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f48694c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f48695d;

    public m(p pVar, int[] iArr, String[] strArr) {
        boolean z10;
        Set set;
        this.f48692a = pVar;
        this.f48693b = iArr;
        this.f48694c = strArr;
        if (strArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            set = R4.b.W1(strArr[0]);
        } else {
            set = kf.x.f37485Y;
        }
        this.f48695d = set;
        if (iArr.length == strArr.length) {
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void a(Set set) {
        AbstractC3557B.c0("invalidatedTablesIds", set);
        int[] iArr = this.f48693b;
        int length = iArr.length;
        Set set2 = kf.x.f37485Y;
        if (length != 0) {
            int i10 = 0;
            if (length != 1) {
                C4442g c4442g = new C4442g();
                int length2 = iArr.length;
                int i11 = 0;
                while (i10 < length2) {
                    int i12 = i11 + 1;
                    if (set.contains(Integer.valueOf(iArr[i10]))) {
                        c4442g.add(this.f48694c[i11]);
                    }
                    i10++;
                    i11 = i12;
                }
                set2 = R4.b.K(c4442g);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                set2 = this.f48695d;
            }
        }
        if (!set2.isEmpty()) {
            this.f48692a.a(set2);
        }
    }
}

package w2;

import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f47696a;

    /* renamed from: b  reason: collision with root package name */
    public final String f47697b;

    /* renamed from: c  reason: collision with root package name */
    public final TreeSet f47698c = new TreeSet();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f47699d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public p f47700e;

    public l(int i10, String str, p pVar) {
        this.f47696a = i10;
        this.f47697b = str;
        this.f47700e = pVar;
    }

    public final boolean a(long j6, long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47699d;
            if (i10 >= arrayList.size()) {
                return false;
            }
            k kVar = (k) arrayList.get(i10);
            long j11 = kVar.f47695b;
            int i11 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
            long j12 = kVar.f47694a;
            if (i11 == 0) {
                if (j6 >= j12) {
                    return true;
                }
            } else if (j10 != -1 && j12 <= j6 && j6 + j10 <= j12 + j11) {
                return true;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f47696a == lVar.f47696a && this.f47697b.equals(lVar.f47697b) && this.f47698c.equals(lVar.f47698c) && this.f47700e.equals(lVar.f47700e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47700e.hashCode() + E9.f.v(this.f47697b, this.f47696a * 31, 31);
    }
}

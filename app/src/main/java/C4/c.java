package C4;

import Z.AbstractC1734s;
import g3.AbstractC3162e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kf.t;
import y4.i;
import y4.m;

/* loaded from: classes2.dex */
public final class c implements f, AbstractC3162e {

    /* renamed from: Y  reason: collision with root package name */
    public final List f2667Y;

    public c(int i10, List list) {
        if (i10 != 2) {
            this.f2667Y = list;
        } else {
            this.f2667Y = new ArrayList(list == null ? new ArrayList(0) : list);
        }
    }

    @Override // g3.AbstractC3162e
    public int a(long j6) {
        if (j6 < 0) {
            return 0;
        }
        return -1;
    }

    @Override // g3.AbstractC3162e
    public long b(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        return 0L;
    }

    @Override // g3.AbstractC3162e
    public List c(long j6) {
        if (j6 >= 0) {
            return this.f2667Y;
        }
        return Collections.emptyList();
    }

    @Override // g3.AbstractC3162e
    public int d() {
        return 1;
    }

    public void e(int i10) {
        List list = this.f2667Y;
        if ((!list.isEmpty()) && (((Number) list.get(0)).intValue() == i10 || ((Number) list.get(list.size() - 1)).intValue() == i10)) {
            return;
        }
        int size = list.size();
        list.add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) list.get(i11)).intValue();
            if (i10 <= intValue) {
                break;
            }
            list.set(size, Integer.valueOf(intValue));
            size = i11;
        }
        list.set(size, Integer.valueOf(i10));
    }

    public int f() {
        int intValue;
        List list = this.f2667Y;
        if (list.size() > 0) {
            int intValue2 = ((Number) list.get(0)).intValue();
            while ((!list.isEmpty()) && ((Number) list.get(0)).intValue() == intValue2) {
                list.set(0, t.o2(list));
                list.remove(list.size() - 1);
                int size = list.size();
                int size2 = list.size() >>> 1;
                int i10 = 0;
                while (i10 < size2) {
                    int intValue3 = ((Number) list.get(i10)).intValue();
                    int i11 = (i10 + 1) * 2;
                    int i12 = i11 - 1;
                    int intValue4 = ((Number) list.get(i12)).intValue();
                    if (i11 < size && (intValue = ((Number) list.get(i11)).intValue()) > intValue4) {
                        if (intValue > intValue3) {
                            list.set(i10, Integer.valueOf(intValue));
                            list.set(i11, Integer.valueOf(intValue3));
                            i10 = i11;
                        }
                    } else if (intValue4 > intValue3) {
                        list.set(i10, Integer.valueOf(intValue4));
                        list.set(i12, Integer.valueOf(intValue3));
                        i10 = i12;
                    }
                }
            }
            return intValue2;
        }
        AbstractC1734s.j("Set is empty".toString());
        throw null;
    }

    @Override // C4.f
    public boolean r() {
        if (this.f2667Y.size() != 1 || !((J4.a) this.f2667Y.get(0)).c()) {
            return false;
        }
        return true;
    }

    @Override // C4.f
    public y4.e s() {
        if (((J4.a) this.f2667Y.get(0)).c()) {
            return new i(1, this.f2667Y);
        }
        return new m(this.f2667Y);
    }

    @Override // C4.f
    public List t() {
        return this.f2667Y;
    }

    public c(List list) {
        this.f2667Y = list;
    }

    public c() {
        this.f2667Y = new ArrayList();
    }
}

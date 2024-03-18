package w3;

import androidx.recyclerview.widget.RecyclerView;
import h1.C3299f;
import java.util.ArrayList;

/* renamed from: w3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6095b {

    /* renamed from: d  reason: collision with root package name */
    public final C6087C f47829d;

    /* renamed from: a  reason: collision with root package name */
    public final C3299f f47826a = new C3299f(30, 1);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f47827b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f47828c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final C.b f47830e = new C.b(2, this);

    public C6095b(C6087C c6087c) {
        this.f47829d = c6087c;
    }

    public final boolean a(int i10) {
        ArrayList arrayList = this.f47828c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C6094a c6094a = (C6094a) arrayList.get(i11);
            int i12 = c6094a.f47820a;
            if (i12 == 8) {
                if (f(c6094a.f47823d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = c6094a.f47821b;
                int i14 = c6094a.f47823d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f47828c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f47829d.a((C6094a) arrayList.get(i10));
        }
        l(arrayList);
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f47827b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C6094a c6094a = (C6094a) arrayList.get(i10);
            int i11 = c6094a.f47820a;
            C6087C c6087c = this.f47829d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            c6087c.a(c6094a);
                            c6087c.e(c6094a.f47821b, c6094a.f47823d);
                        }
                    } else {
                        c6087c.a(c6094a);
                        c6087c.c(c6094a.f47821b, c6094a.f47822c, c6094a.f47823d);
                    }
                } else {
                    c6087c.a(c6094a);
                    int i12 = c6094a.f47821b;
                    int i13 = c6094a.f47823d;
                    RecyclerView recyclerView = c6087c.f47739a;
                    recyclerView.O(i12, i13, true);
                    recyclerView.f25458j1 = true;
                    recyclerView.g1.f47780c += i13;
                }
            } else {
                c6087c.a(c6094a);
                c6087c.d(c6094a.f47821b, c6094a.f47823d);
            }
        }
        l(arrayList);
    }

    public final void d(C6094a c6094a) {
        int i10;
        int i11 = c6094a.f47820a;
        if (i11 != 1 && i11 != 8) {
            int m10 = m(c6094a.f47821b, i11);
            int i12 = c6094a.f47821b;
            int i13 = c6094a.f47820a;
            if (i13 != 2) {
                if (i13 == 4) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + c6094a);
                }
            } else {
                i10 = 0;
            }
            int i14 = 1;
            for (int i15 = 1; i15 < c6094a.f47823d; i15++) {
                int m11 = m((i10 * i15) + c6094a.f47821b, c6094a.f47820a);
                int i16 = c6094a.f47820a;
                if (i16 == 2 ? m11 == m10 : !(i16 != 4 || m11 != m10 + 1)) {
                    i14++;
                } else {
                    C6094a h10 = h(c6094a.f47822c, i16, m10, i14);
                    e(h10, i12);
                    h10.f47822c = null;
                    this.f47826a.b(h10);
                    if (c6094a.f47820a == 4) {
                        i12 += i14;
                    }
                    i14 = 1;
                    m10 = m11;
                }
            }
            Object obj = c6094a.f47822c;
            c6094a.f47822c = null;
            this.f47826a.b(c6094a);
            if (i14 > 0) {
                C6094a h11 = h(obj, c6094a.f47820a, m10, i14);
                e(h11, i12);
                h11.f47822c = null;
                this.f47826a.b(h11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void e(C6094a c6094a, int i10) {
        C6087C c6087c = this.f47829d;
        c6087c.a(c6094a);
        int i11 = c6094a.f47820a;
        if (i11 != 2) {
            if (i11 == 4) {
                c6087c.c(i10, c6094a.f47822c, c6094a.f47823d);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = c6094a.f47823d;
        RecyclerView recyclerView = c6087c.f47739a;
        recyclerView.O(i10, i12, true);
        recyclerView.f25458j1 = true;
        recyclerView.g1.f47780c += i12;
    }

    public final int f(int i10, int i11) {
        ArrayList arrayList = this.f47828c;
        int size = arrayList.size();
        while (i11 < size) {
            C6094a c6094a = (C6094a) arrayList.get(i11);
            int i12 = c6094a.f47820a;
            if (i12 == 8) {
                int i13 = c6094a.f47821b;
                if (i13 == i10) {
                    i10 = c6094a.f47823d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (c6094a.f47823d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = c6094a.f47821b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = c6094a.f47823d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += c6094a.f47823d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        if (this.f47827b.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [w3.a, java.lang.Object] */
    public final C6094a h(Object obj, int i10, int i11, int i12) {
        C6094a c6094a = (C6094a) this.f47826a.a();
        if (c6094a == null) {
            ?? obj2 = new Object();
            obj2.f47820a = i10;
            obj2.f47821b = i11;
            obj2.f47823d = i12;
            obj2.f47822c = obj;
            return obj2;
        }
        c6094a.f47820a = i10;
        c6094a.f47821b = i11;
        c6094a.f47823d = i12;
        c6094a.f47822c = obj;
        return c6094a;
    }

    public final void i(C6094a c6094a) {
        this.f47828c.add(c6094a);
        int i10 = c6094a.f47820a;
        C6087C c6087c = this.f47829d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        c6087c.e(c6094a.f47821b, c6094a.f47823d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + c6094a);
                }
                c6087c.c(c6094a.f47821b, c6094a.f47822c, c6094a.f47823d);
                return;
            }
            int i11 = c6094a.f47821b;
            int i12 = c6094a.f47823d;
            RecyclerView recyclerView = c6087c.f47739a;
            recyclerView.O(i11, i12, false);
            recyclerView.f25458j1 = true;
            return;
        }
        c6087c.d(c6094a.f47821b, c6094a.f47823d);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        char c10;
        char c11;
        boolean z10;
        C6094a c6094a;
        int i10;
        int i11;
        C6094a c6094a2;
        boolean z11;
        boolean z12;
        C6094a c6094a3;
        int i12;
        ArrayList arrayList = this.f47827b;
        C.b bVar = this.f47830e;
        bVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z13 = false;
            while (true) {
                c10 = '\uffff';
                if (size >= 0) {
                    if (((C6094a) arrayList.get(size)).f47820a == 8) {
                        if (z13) {
                            break;
                        }
                    } else {
                        z13 = true;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (size == -1) {
                break;
            }
            int i13 = size + 1;
            C6094a c6094a4 = (C6094a) arrayList.get(size);
            C6094a c6094a5 = (C6094a) arrayList.get(i13);
            int i14 = c6094a5.f47820a;
            if (i14 != 1) {
                Object obj = bVar.f2435Z;
                if (i14 != 2) {
                    if (i14 == 4) {
                        int i15 = c6094a4.f47823d;
                        int i16 = c6094a5.f47821b;
                        if (i15 < i16) {
                            c6094a5.f47821b = i16 - 1;
                        } else {
                            int i17 = c6094a5.f47823d;
                            if (i15 < i16 + i17) {
                                c6094a5.f47823d = i17 - 1;
                                c6094a = ((C6095b) obj).h(c6094a5.f47822c, 4, c6094a4.f47821b, 1);
                                i10 = c6094a4.f47821b;
                                i11 = c6094a5.f47821b;
                                if (i10 > i11) {
                                    c6094a5.f47821b = i11 + 1;
                                } else {
                                    int i18 = i11 + c6094a5.f47823d;
                                    if (i10 < i18) {
                                        int i19 = i18 - i10;
                                        c6094a2 = ((C6095b) obj).h(c6094a5.f47822c, 4, i10 + 1, i19);
                                        c6094a5.f47823d -= i19;
                                        arrayList.set(i13, c6094a4);
                                        if (c6094a5.f47823d > 0) {
                                            arrayList.set(size, c6094a5);
                                        } else {
                                            arrayList.remove(size);
                                            C6095b c6095b = (C6095b) obj;
                                            c6095b.getClass();
                                            c6094a5.f47822c = null;
                                            c6095b.f47826a.b(c6094a5);
                                        }
                                        if (c6094a != null) {
                                            arrayList.add(size, c6094a);
                                        }
                                        if (c6094a2 != null) {
                                            arrayList.add(size, c6094a2);
                                        }
                                    }
                                }
                                c6094a2 = null;
                                arrayList.set(i13, c6094a4);
                                if (c6094a5.f47823d > 0) {
                                }
                                if (c6094a != null) {
                                }
                                if (c6094a2 != null) {
                                }
                            }
                        }
                        c6094a = null;
                        i10 = c6094a4.f47821b;
                        i11 = c6094a5.f47821b;
                        if (i10 > i11) {
                        }
                        c6094a2 = null;
                        arrayList.set(i13, c6094a4);
                        if (c6094a5.f47823d > 0) {
                        }
                        if (c6094a != null) {
                        }
                        if (c6094a2 != null) {
                        }
                    }
                } else {
                    int i20 = c6094a4.f47821b;
                    int i21 = c6094a4.f47823d;
                    if (i20 < i21) {
                        if (c6094a5.f47821b == i20 && c6094a5.f47823d == i21 - i20) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z11 = false;
                    } else if (c6094a5.f47821b == i21 + 1 && c6094a5.f47823d == i20 - i21) {
                        z12 = true;
                        z11 = true;
                    } else {
                        z11 = true;
                        z12 = false;
                    }
                    int i22 = c6094a5.f47821b;
                    if (i21 < i22) {
                        c6094a5.f47821b = i22 - 1;
                    } else {
                        int i23 = c6094a5.f47823d;
                        if (i21 < i22 + i23) {
                            c6094a5.f47823d = i23 - 1;
                            c6094a4.f47820a = 2;
                            c6094a4.f47823d = 1;
                            if (c6094a5.f47823d == 0) {
                                arrayList.remove(i13);
                                C6095b c6095b2 = (C6095b) obj;
                                c6095b2.getClass();
                                c6094a5.f47822c = null;
                                c6095b2.f47826a.b(c6094a5);
                            }
                        }
                    }
                    int i24 = c6094a4.f47821b;
                    int i25 = c6094a5.f47821b;
                    if (i24 <= i25) {
                        c6094a5.f47821b = i25 + 1;
                    } else {
                        int i26 = i25 + c6094a5.f47823d;
                        if (i24 < i26) {
                            c6094a3 = ((C6095b) obj).h(null, 2, i24 + 1, i26 - i24);
                            c6094a5.f47823d = c6094a4.f47821b - c6094a5.f47821b;
                            if (!z12) {
                                arrayList.set(size, c6094a5);
                                arrayList.remove(i13);
                                C6095b c6095b3 = (C6095b) obj;
                                c6095b3.getClass();
                                c6094a4.f47822c = null;
                                c6095b3.f47826a.b(c6094a4);
                            } else {
                                if (z11) {
                                    if (c6094a3 != null) {
                                        int i27 = c6094a4.f47821b;
                                        if (i27 > c6094a3.f47821b) {
                                            c6094a4.f47821b = i27 - c6094a3.f47823d;
                                        }
                                        int i28 = c6094a4.f47823d;
                                        if (i28 > c6094a3.f47821b) {
                                            c6094a4.f47823d = i28 - c6094a3.f47823d;
                                        }
                                    }
                                    int i29 = c6094a4.f47821b;
                                    if (i29 > c6094a5.f47821b) {
                                        c6094a4.f47821b = i29 - c6094a5.f47823d;
                                    }
                                    int i30 = c6094a4.f47823d;
                                    if (i30 > c6094a5.f47821b) {
                                        c6094a4.f47823d = i30 - c6094a5.f47823d;
                                    }
                                } else {
                                    if (c6094a3 != null) {
                                        int i31 = c6094a4.f47821b;
                                        if (i31 >= c6094a3.f47821b) {
                                            c6094a4.f47821b = i31 - c6094a3.f47823d;
                                        }
                                        int i32 = c6094a4.f47823d;
                                        if (i32 >= c6094a3.f47821b) {
                                            c6094a4.f47823d = i32 - c6094a3.f47823d;
                                        }
                                    }
                                    int i33 = c6094a4.f47821b;
                                    if (i33 >= c6094a5.f47821b) {
                                        c6094a4.f47821b = i33 - c6094a5.f47823d;
                                    }
                                    int i34 = c6094a4.f47823d;
                                    if (i34 >= c6094a5.f47821b) {
                                        c6094a4.f47823d = i34 - c6094a5.f47823d;
                                    }
                                }
                                arrayList.set(size, c6094a5);
                                if (c6094a4.f47821b != c6094a4.f47823d) {
                                    arrayList.set(i13, c6094a4);
                                } else {
                                    arrayList.remove(i13);
                                }
                                if (c6094a3 != null) {
                                    arrayList.add(size, c6094a3);
                                }
                            }
                        }
                    }
                    c6094a3 = null;
                    if (!z12) {
                    }
                }
            } else {
                int i35 = c6094a4.f47823d;
                int i36 = c6094a5.f47821b;
                if (i35 < i36) {
                    i12 = -1;
                } else {
                    i12 = 0;
                }
                int i37 = c6094a4.f47821b;
                if (i37 < i36) {
                    i12++;
                }
                if (i36 <= i37) {
                    c6094a4.f47821b = i37 + c6094a5.f47823d;
                }
                int i38 = c6094a5.f47821b;
                if (i38 <= i35) {
                    c6094a4.f47823d = i35 + c6094a5.f47823d;
                }
                c6094a5.f47821b = i38 + i12;
                arrayList.set(size, c6094a5);
                arrayList.set(i13, c6094a4);
            }
        }
        int size2 = arrayList.size();
        int i39 = 0;
        while (i39 < size2) {
            C6094a c6094a6 = (C6094a) arrayList.get(i39);
            int i40 = c6094a6.f47820a;
            if (i40 != 1) {
                C6087C c6087c = this.f47829d;
                if (i40 != 2) {
                    if (i40 != 4) {
                        if (i40 == 8) {
                            i(c6094a6);
                        }
                    } else {
                        int i41 = c6094a6.f47821b;
                        int i42 = c6094a6.f47823d + i41;
                        int i43 = i41;
                        int i44 = 0;
                        while (i41 < i42) {
                            if (c6087c.b(i41) == null && !a(i41)) {
                                if (c10 == 1) {
                                    i(h(c6094a6.f47822c, 4, i43, i44));
                                    i43 = i41;
                                    i44 = 0;
                                }
                                c10 = 0;
                            } else {
                                if (c10 == 0) {
                                    d(h(c6094a6.f47822c, 4, i43, i44));
                                    i43 = i41;
                                    i44 = 0;
                                }
                                c10 = 1;
                            }
                            i44++;
                            i41++;
                        }
                        if (i44 != c6094a6.f47823d) {
                            Object obj2 = c6094a6.f47822c;
                            c6094a6.f47822c = null;
                            this.f47826a.b(c6094a6);
                            c6094a6 = h(obj2, 4, i43, i44);
                        }
                        if (c10 == 0) {
                            d(c6094a6);
                        } else {
                            i(c6094a6);
                        }
                    }
                } else {
                    int i45 = c6094a6.f47821b;
                    int i46 = c6094a6.f47823d + i45;
                    int i47 = i45;
                    int i48 = 0;
                    char c12 = '\uffff';
                    while (i47 < i46) {
                        if (c6087c.b(i47) == null && !a(i47)) {
                            if (c12 == 1) {
                                i(h(null, 2, i45, i48));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c11 = 0;
                        } else {
                            if (c12 == 0) {
                                d(h(null, 2, i45, i48));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c11 = 1;
                        }
                        if (z10) {
                            i47 -= i48;
                            i46 -= i48;
                            i48 = 1;
                        } else {
                            i48++;
                        }
                        i47++;
                        c12 = c11;
                    }
                    if (i48 != c6094a6.f47823d) {
                        c6094a6.f47822c = null;
                        this.f47826a.b(c6094a6);
                        c6094a6 = h(null, 2, i45, i48);
                    }
                    if (c12 == 0) {
                        d(c6094a6);
                    } else {
                        i(c6094a6);
                    }
                }
            } else {
                i(c6094a6);
            }
            i39++;
            c10 = '\uffff';
        }
        arrayList.clear();
    }

    public final void k(C6094a c6094a) {
        c6094a.f47822c = null;
        this.f47826a.b(c6094a);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k((C6094a) arrayList.get(i10));
        }
        arrayList.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        ArrayList arrayList = this.f47828c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C6094a c6094a = (C6094a) arrayList.get(size);
            int i14 = c6094a.f47820a;
            if (i14 == 8) {
                int i15 = c6094a.f47821b;
                int i16 = c6094a.f47823d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 >= i13 && i10 <= i12) {
                    if (i13 == i15) {
                        if (i11 == 1) {
                            c6094a.f47823d = i16 + 1;
                        } else if (i11 == 2) {
                            c6094a.f47823d = i16 - 1;
                        }
                        i10++;
                    } else {
                        if (i11 == 1) {
                            c6094a.f47821b = i15 + 1;
                        } else if (i11 == 2) {
                            c6094a.f47821b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        c6094a.f47821b = i15 + 1;
                        c6094a.f47823d = i16 + 1;
                    } else if (i11 == 2) {
                        c6094a.f47821b = i15 - 1;
                        c6094a.f47823d = i16 - 1;
                    }
                }
            } else {
                int i17 = c6094a.f47821b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= c6094a.f47823d;
                    } else if (i14 == 2) {
                        i10 += c6094a.f47823d;
                    }
                } else if (i11 == 1) {
                    c6094a.f47821b = i17 + 1;
                } else if (i11 == 2) {
                    c6094a.f47821b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C6094a c6094a2 = (C6094a) arrayList.get(size2);
            if (c6094a2.f47820a == 8) {
                int i18 = c6094a2.f47823d;
                if (i18 == c6094a2.f47821b || i18 < 0) {
                    arrayList.remove(size2);
                    k(c6094a2);
                }
            } else if (c6094a2.f47823d <= 0) {
                arrayList.remove(size2);
                k(c6094a2);
            }
        }
        return i10;
    }
}

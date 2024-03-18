package N0;

import com.google.android.gms.internal.play_billing.N;
import java.util.ArrayList;
import java.util.List;

/* renamed from: N0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044c implements Appendable {

    /* renamed from: Y  reason: collision with root package name */
    public final StringBuilder f12503Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f12504Z;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f12505h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f12506i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f12507j0;

    public /* synthetic */ C1044c() {
        this(16);
    }

    public final void a(y yVar, int i10, int i11) {
        this.f12504Z.add(new C1043b(yVar, i10, i11, null, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        ?? r82;
        ?? r12;
        boolean z10 = charSequence instanceof C1046e;
        StringBuilder sb2 = this.f12503Y;
        if (z10) {
            C1046e c1046e = (C1046e) charSequence;
            int length = sb2.length();
            sb2.append((CharSequence) c1046e.f12512Y, i10, i11);
            List b10 = AbstractC1047f.b(c1046e, i10, i11);
            if (b10 != null) {
                int size = b10.size();
                for (int i12 = 0; i12 < size; i12++) {
                    C1045d c1045d = (C1045d) b10.get(i12);
                    a((y) c1045d.f12508a, c1045d.f12509b + length, c1045d.f12510c + length);
                }
            }
            List list = null;
            String str = c1046e.f12512Y;
            if (i10 == i11 || (r82 = c1046e.f12514h0) == 0) {
                r82 = 0;
            } else if (i10 != 0 || i11 < str.length()) {
                ArrayList arrayList = new ArrayList(r82.size());
                int size2 = r82.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    Object obj = r82.get(i13);
                    C1045d c1045d2 = (C1045d) obj;
                    if (AbstractC1047f.c(i10, i11, c1045d2.f12509b, c1045d2.f12510c)) {
                        arrayList.add(obj);
                    }
                }
                r82 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    C1045d c1045d3 = (C1045d) arrayList.get(i14);
                    r82.add(new C1045d(c1045d3.f12508a, N.p(c1045d3.f12509b, i10, i11) - i10, N.p(c1045d3.f12510c, i10, i11) - i10));
                }
            }
            if (r82 != 0) {
                int size4 = r82.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    C1045d c1045d4 = (C1045d) r82.get(i15);
                    this.f12505h0.add(new C1043b((p) c1045d4.f12508a, length + c1045d4.f12509b, length + c1045d4.f12510c, null, 8));
                }
            }
            if (i10 != i11 && (r12 = c1046e.f12515i0) != 0) {
                if (i10 != 0 || i11 < str.length()) {
                    ArrayList arrayList2 = new ArrayList(r12.size());
                    int size5 = r12.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        Object obj2 = r12.get(i16);
                        C1045d c1045d5 = (C1045d) obj2;
                        if (AbstractC1047f.c(i10, i11, c1045d5.f12509b, c1045d5.f12510c)) {
                            arrayList2.add(obj2);
                        }
                    }
                    r12 = new ArrayList(arrayList2.size());
                    int size6 = arrayList2.size();
                    for (int i17 = 0; i17 < size6; i17++) {
                        C1045d c1045d6 = (C1045d) arrayList2.get(i17);
                        r12.add(new C1045d(N.p(c1045d6.f12509b, i10, i11) - i10, N.p(c1045d6.f12510c, i10, i11) - i10, c1045d6.f12508a, c1045d6.f12511d));
                    }
                }
                list = r12;
            }
            if (list != null) {
                int size7 = list.size();
                for (int i18 = 0; i18 < size7; i18++) {
                    C1045d c1045d7 = (C1045d) list.get(i18);
                    this.f12506i0.add(new C1043b(c1045d7.f12509b + length, c1045d7.f12510c + length, c1045d7.f12508a, c1045d7.f12511d));
                }
            }
        } else {
            sb2.append(charSequence, i10, i11);
        }
        return this;
    }

    public final void b(C1046e c1046e) {
        StringBuilder sb2 = this.f12503Y;
        int length = sb2.length();
        sb2.append(c1046e.f12512Y);
        List list = c1046e.f12513Z;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1045d c1045d = (C1045d) list.get(i10);
                a((y) c1045d.f12508a, c1045d.f12509b + length, c1045d.f12510c + length);
            }
        }
        List list2 = c1046e.f12514h0;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C1045d c1045d2 = (C1045d) list2.get(i11);
                this.f12505h0.add(new C1043b((p) c1045d2.f12508a, length + c1045d2.f12509b, length + c1045d2.f12510c, null, 8));
            }
        }
        List list3 = c1046e.f12515i0;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                C1045d c1045d3 = (C1045d) list3.get(i12);
                this.f12506i0.add(new C1043b(c1045d3.f12509b + length, c1045d3.f12510c + length, c1045d3.f12508a, c1045d3.f12511d));
            }
        }
    }

    public final void c(String str) {
        this.f12503Y.append(str);
    }

    public final void d() {
        ArrayList arrayList = this.f12507j0;
        if (!arrayList.isEmpty()) {
            ((C1043b) arrayList.remove(arrayList.size() - 1)).f12501c = this.f12503Y.length();
            return;
        }
        throw new IllegalStateException("Nothing to pop.".toString());
    }

    public final void e(int i10) {
        ArrayList arrayList = this.f12507j0;
        if (i10 < arrayList.size()) {
            while (arrayList.size() - 1 >= i10) {
                d();
            }
            return;
        }
        throw new IllegalStateException((i10 + " should be less than " + arrayList.size()).toString());
    }

    public final int f(String str, String str2) {
        C1043b c1043b = new C1043b(str2, this.f12503Y.length(), 0, str, 4);
        ArrayList arrayList = this.f12507j0;
        arrayList.add(c1043b);
        this.f12506i0.add(c1043b);
        return arrayList.size() - 1;
    }

    public final int g(p pVar) {
        C1043b c1043b = new C1043b(pVar, this.f12503Y.length(), 0, null, 12);
        ArrayList arrayList = this.f12507j0;
        arrayList.add(c1043b);
        this.f12505h0.add(c1043b);
        return arrayList.size() - 1;
    }

    public final int h(y yVar) {
        C1043b c1043b = new C1043b(yVar, this.f12503Y.length(), 0, null, 12);
        ArrayList arrayList = this.f12507j0;
        arrayList.add(c1043b);
        this.f12504Z.add(c1043b);
        return arrayList.size() - 1;
    }

    public final C1046e i() {
        StringBuilder sb2 = this.f12503Y;
        String sb3 = sb2.toString();
        ArrayList arrayList = this.f12504Z;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((C1043b) arrayList.get(i10)).a(sb2.length()));
        }
        ArrayList arrayList3 = null;
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        ArrayList arrayList4 = this.f12505h0;
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int size2 = arrayList4.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList5.add(((C1043b) arrayList4.get(i11)).a(sb2.length()));
        }
        if (arrayList5.isEmpty()) {
            arrayList5 = null;
        }
        ArrayList arrayList6 = this.f12506i0;
        ArrayList arrayList7 = new ArrayList(arrayList6.size());
        int size3 = arrayList6.size();
        for (int i12 = 0; i12 < size3; i12++) {
            arrayList7.add(((C1043b) arrayList6.get(i12)).a(sb2.length()));
        }
        if (!arrayList7.isEmpty()) {
            arrayList3 = arrayList7;
        }
        return new C1046e(sb3, arrayList2, arrayList5, arrayList3);
    }

    public C1044c(int i10) {
        this.f12503Y = new StringBuilder(i10);
        this.f12504Z = new ArrayList();
        this.f12505h0 = new ArrayList();
        this.f12506i0 = new ArrayList();
        this.f12507j0 = new ArrayList();
    }

    public C1044c(C1046e c1046e) {
        this();
        b(c1046e);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C1046e) {
            b((C1046e) charSequence);
        } else {
            this.f12503Y.append(charSequence);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) {
        this.f12503Y.append(c10);
        return this;
    }
}

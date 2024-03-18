package si;

import K4.J;
import Q3.j;
import java.util.ArrayList;
import java.util.List;
import ri.c;
import ti.f;
import ti.l;
import wi.s;
import wi.w;
import xi.d;

/* loaded from: classes2.dex */
public final class b extends yi.a {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f45600b;

    /* renamed from: c  reason: collision with root package name */
    public final List f45601c;

    /* renamed from: a  reason: collision with root package name */
    public final ri.a f45599a = new s();

    /* renamed from: d  reason: collision with root package name */
    public boolean f45602d = true;

    /* JADX WARN: Type inference failed for: r0v0, types: [wi.s, ri.a] */
    public b(ArrayList arrayList, d dVar) {
        ArrayList arrayList2 = new ArrayList();
        this.f45600b = arrayList2;
        this.f45601c = arrayList;
        arrayList2.add(dVar);
    }

    public static ArrayList k(d dVar) {
        CharSequence charSequence = dVar.f50076a;
        int e02 = J.e0(0, charSequence.length(), charSequence);
        int length = charSequence.length();
        if (charSequence.charAt(e02) == '|') {
            e02++;
            length = J.f0(charSequence.length() - 1, e02, charSequence) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i10 = e02;
        while (e02 < length) {
            char charAt = charSequence.charAt(e02);
            if (charAt != '\\') {
                if (charAt != '|') {
                    sb2.append(charAt);
                } else {
                    arrayList.add(new d(sb2.toString(), dVar.a(i10, e02).f50077b));
                    sb2.setLength(0);
                    i10 = e02 + 1;
                }
            } else {
                int i11 = e02 + 1;
                if (i11 < length && charSequence.charAt(i11) == '|') {
                    sb2.append('|');
                    e02 = i11;
                } else {
                    sb2.append('\\');
                }
            }
            e02++;
        }
        if (sb2.length() > 0) {
            arrayList.add(new d(sb2.toString(), dVar.a(i10, dVar.f50076a.length()).f50077b));
        }
        return arrayList;
    }

    @Override // yi.a
    public final void a(d dVar) {
        this.f45600b.add(dVar);
    }

    @Override // yi.a
    public final boolean d() {
        return this.f45602d;
    }

    @Override // yi.a
    public final wi.a f() {
        return this.f45599a;
    }

    @Override // yi.a
    public final void h(l lVar) {
        w wVar;
        w wVar2;
        d dVar;
        ri.a aVar = this.f45599a;
        List d10 = aVar.d();
        if (!d10.isEmpty()) {
            wVar = (w) d10.get(0);
        } else {
            wVar = null;
        }
        s sVar = new s();
        if (wVar != null) {
            sVar.b(wVar);
        }
        aVar.c(sVar);
        s sVar2 = new s();
        sVar2.g(sVar.d());
        sVar.c(sVar2);
        ArrayList arrayList = this.f45600b;
        ArrayList k10 = k((d) arrayList.get(0));
        int size = k10.size();
        for (int i10 = 0; i10 < size; i10++) {
            ri.d j6 = j((d) k10.get(i10), i10, lVar);
            j6.f44999g = true;
            sVar2.c(j6);
        }
        s sVar3 = null;
        for (int i11 = 2; i11 < arrayList.size(); i11++) {
            d dVar2 = (d) arrayList.get(i11);
            if (i11 < d10.size()) {
                wVar2 = (w) d10.get(i11);
            } else {
                wVar2 = null;
            }
            ArrayList k11 = k(dVar2);
            s sVar4 = new s();
            if (wVar2 != null) {
                sVar4.b(wVar2);
            }
            for (int i12 = 0; i12 < size; i12++) {
                if (i12 < k11.size()) {
                    dVar = (d) k11.get(i12);
                } else {
                    dVar = new d("", null);
                }
                sVar4.c(j(dVar, i12, lVar));
            }
            if (sVar3 == null) {
                sVar3 = new s();
                aVar.c(sVar3);
            }
            sVar3.c(sVar4);
            sVar3.b(wVar2);
        }
    }

    @Override // yi.a
    public final ti.a i(yi.d dVar) {
        f fVar = (f) dVar;
        CharSequence charSequence = fVar.f46257a.f50076a;
        int s10 = J.s('|', fVar.f46262f, charSequence);
        if (s10 == -1) {
            return null;
        }
        if (s10 == fVar.f46262f && J.e0(s10 + 1, charSequence.length(), charSequence) == charSequence.length()) {
            this.f45602d = false;
            return null;
        }
        return ti.a.a(fVar.f46259c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [wi.s, ri.d] */
    public final ri.d j(d dVar, int i10, l lVar) {
        ?? sVar = new s();
        w wVar = dVar.f50077b;
        if (wVar != null) {
            sVar.b(wVar);
        }
        List list = this.f45601c;
        if (i10 < list.size()) {
            sVar.f45000h = (c) list.get(i10);
        }
        CharSequence charSequence = dVar.f50076a;
        int e02 = J.e0(0, charSequence.length(), charSequence);
        d a5 = dVar.a(e02, J.f0(charSequence.length() - 1, e02, charSequence) + 1);
        j jVar = new j(6);
        jVar.f14418b.add(a5);
        lVar.e(jVar, sVar);
        return sVar;
    }
}

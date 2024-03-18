package si;

import K4.J;
import S4.o;
import java.util.ArrayList;
import java.util.List;
import ti.c;
import ti.f;
import yi.d;

/* loaded from: classes2.dex */
public final class a extends yi.b {
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r9 == false) goto L17;
     */
    @Override // yi.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c a(d dVar, o oVar) {
        boolean z10;
        boolean z11;
        ri.c cVar;
        List list = oVar.m().f14418b;
        if (list.size() == 1 && J.s('|', 0, ((xi.d) list.get(0)).f50076a) != -1) {
            f fVar = (f) dVar;
            xi.d dVar2 = fVar.f46257a;
            xi.d a5 = dVar2.a(fVar.f46259c, dVar2.f50076a.length());
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            boolean z12 = false;
            int i11 = 0;
            while (true) {
                CharSequence charSequence = a5.f50076a;
                if (i10 < charSequence.length()) {
                    char charAt = charSequence.charAt(i10);
                    if (charAt != '\t' && charAt != ' ') {
                        if (charAt != '-' && charAt != ':') {
                            if (charAt != '|') {
                                break;
                            }
                            i10++;
                            i11++;
                            if (i11 > 1) {
                                break;
                            }
                            z12 = true;
                        } else if (i11 == 0 && !arrayList.isEmpty()) {
                            break;
                        } else {
                            if (charAt == ':') {
                                i10++;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            boolean z13 = false;
                            while (i10 < charSequence.length() && charSequence.charAt(i10) == '-') {
                                i10++;
                                z13 = true;
                            }
                            if (!z13) {
                                break;
                            }
                            if (i10 < charSequence.length() && charSequence.charAt(i10) == ':') {
                                i10++;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z10 && z11) {
                                cVar = ri.c.f44996Z;
                            } else if (z10) {
                                cVar = ri.c.f44995Y;
                            } else if (z11) {
                                cVar = ri.c.f44997h0;
                            } else {
                                cVar = null;
                            }
                            arrayList.add(cVar);
                            i11 = 0;
                        }
                    } else {
                        i10++;
                    }
                }
            }
            arrayList = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                xi.d dVar3 = (xi.d) list.get(0);
                if (arrayList.size() >= b.k(dVar3).size()) {
                    c cVar2 = new c(new b(arrayList, dVar3));
                    cVar2.f46243b = fVar.f46259c;
                    cVar2.f46245d = true;
                    return cVar2;
                }
            }
        }
        return null;
    }
}

package ui;

import Q3.j;
import androidx.datastore.preferences.protobuf.r0;
import java.util.List;
import wi.s;
import wi.y;

/* loaded from: classes.dex */
public abstract class e implements zi.a {

    /* renamed from: a  reason: collision with root package name */
    public final char f46821a;

    public e(char c10) {
        this.f46821a = c10;
    }

    @Override // zi.a
    public final char a() {
        return this.f46821a;
    }

    @Override // zi.a
    public final int b() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [wi.s, wi.g] */
    /* JADX WARN: Type inference failed for: r2v4, types: [wi.s, wi.x] */
    @Override // zi.a
    public final int c(ti.d dVar, ti.d dVar2) {
        s sVar;
        if (dVar.f46250e || dVar2.f46249d) {
            int i10 = dVar2.f46248c;
            if (i10 % 3 != 0 && (dVar.f46248c + i10) % 3 == 0) {
                return 0;
            }
        }
        List list = dVar.f46246a;
        int size = list.size();
        List list2 = dVar2.f46246a;
        char c10 = this.f46821a;
        int i11 = 2;
        if (size >= 2 && list2.size() >= 2) {
            ?? sVar2 = new s();
            sVar2.f48619g = String.valueOf(c10) + c10;
            sVar = sVar2;
        } else {
            String valueOf = String.valueOf(c10);
            ?? sVar3 = new s();
            sVar3.f48591g = valueOf;
            i11 = 1;
            sVar = sVar3;
        }
        j jVar = new j(5);
        jVar.b(dVar.b(i11));
        y yVar = (y) list.get(list.size() - 1);
        r0 r0Var = new r0(yVar.f48612e, (y) list2.get(0), 0);
        while (r0Var.hasNext()) {
            s sVar4 = (s) r0Var.next();
            sVar.c(sVar4);
            jVar.a(sVar4.d());
        }
        jVar.b(dVar2.a(i11));
        sVar.g(jVar.f());
        yVar.e(sVar);
        return i11;
    }

    @Override // zi.a
    public final char d() {
        return this.f46821a;
    }
}
